
package lab1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author schereja
 */
public class Lab1_2 {
    public static void main(String[] args) {
        int lineCounter = 1;
        int counter = 1;
        int RECORD = 1;
        String REGEX = "^[1-9][1-9][1-9][1-9][1-9]";
        String filePath = "src" + File.separatorChar + "lab1.txt";
        File data = new File(filePath);
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
           
	   while(line != null){
               
                  if(counter == RECORD){
                      if(lineCounter == 1){
                      System.out.print("Name: " + line + " ");
                      lineCounter++;
                      } else if (lineCounter == 2){
                          System.out.println(line);
                          lineCounter++;
                      } else if (lineCounter == 3){
                          System.out.println("Address: " + line);
                          lineCounter++;
                      } else if (lineCounter == 4){
                          System.out.print("City/State/Zip Code: " + line);
                          lineCounter++;
                      } else if (lineCounter == 5){
                          System.out.print(" " + line);
                          lineCounter++;
                      } else if (lineCounter == 6){
                          System.out.println(" " + line);
                      }
                     
                  }
		  
                  if(line.matches(REGEX)){
                      counter++;
                  }
		  line = in.readLine();// strips out any carriage return chars
                  
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
}}

