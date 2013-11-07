/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author schereja
 */
public class Lab3 {

    public static void main(String[] args) {
        int lineCounter = 1;
        int counter = 1;
        int RECORD = 2;
        String REGEX = "^[1-9][1-9][1-9][1-9][1-9]";
        String filePath = "src" + File.separatorChar + "lab1.txt";
        File data = new File(filePath);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();

            while (line != null) {

                if (counter == RECORD) {
                    
                    if (lineCounter == 1) {
                        
                        lineCounter++;
                    } else if (lineCounter == 2) {
                        lineCounter++;
                    } else if (lineCounter == 3) {
                        lineCounter++;
                    } else if (lineCounter == 4) {
                        System.out.print("City/State/Zip Code: " + line);
                        lineCounter++;
                    } else if (lineCounter == 5) {
                        
                        lineCounter++;
                    } else if (lineCounter == 6) {
                       
                    }

                }

                if (line.matches(REGEX)) {
                    counter++;
                }
            
                    line = in.readLine();// strips out any carriage return chars
            
                

            }

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }
}
