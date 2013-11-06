/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author schereja
 */
public class Lab1_1 {
    public static void main(String[] args) throws IOException {
        String filePath = "src" + File.separatorChar + "lab1.txt";
        File data = new File(filePath);
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
        
//        boolean append = true;   
	 

//	  PrintWriter out = new PrintWriter(
//						new BufferedWriter(
//						new FileWriter(data, append)));
	  
	
//	  out.println("John" + "Smith");
//          out.println("1234" + "W Nile Street");
//          out.println("Westbrook, " + "AK"+ "93045");
//	  out.close();
	
    }
    
}
