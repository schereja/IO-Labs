package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author schereja
 */
public class Lab2 {

    public static void main(String[] args) {
        int lineCounter = 1;
        int counter = 1;
        int RECORD = 3;
        String LINE1 = "Name: ";
        String LINE2 = "Address: ";
        String LINE3 = "City/State/Zip: ";
        String SPACE = " ";
        String REGEX = "^[1-9][1-9][1-9][1-9][1-9]";
        String filePath = "src" + File.separatorChar + "lab1.txt";
        String ENDOFRECORDS = "Sorry there are only " + counter + " records";
        File data = new File(filePath);
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            while (line != null) {
                //try{
                if (counter == RECORD) {
                    if (lineCounter == 1) {
                        System.out.print(LINE1 + line + " ");
                        lineCounter++;
                    } else if (lineCounter == 2) {
                        System.out.println(line);
                        lineCounter++;
                    } else if (lineCounter == 3) {
                        System.out.println(LINE2 + line);
                        lineCounter++;
                    } else if (lineCounter == 4) {
                        System.out.print(LINE3 + line);
                        lineCounter++;
                    } else if (lineCounter == 5) {
                        System.out.print(SPACE + line);
                        lineCounter++;
                    } else if (lineCounter == 6) {
                        System.out.println(SPACE + line);
                    }
                }
                //catch(){
                //    System.out.println(ENDOFRECORDS);
                // }
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
