package task01.chuklee.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


    public class Replace {

        void replace(String stringToReplace, String replaceWith) throws IOException {

            String line = "";

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\daryl\\src\\sdfassessment\\task01\\thankyou.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\daryl\\src\\sdfassessment\\task01\\thankyou.txt"));
            
        
            while ((line = br.readLine()) != null) {
                
                if (line.contains(stringToReplace))
                    line = line.replace(stringToReplace, replaceWith);
                        bw.write(line);
                        bw.newLine();
                    }
                br.close();
                bw.close();
            } 
        
        
        }


    

    

