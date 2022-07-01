package task01.chuklee.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

    // Create Replace
    public class Replace {

        void replace(String replaceThis, String toReplace) throws IOException {

            String line = "";

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\daryl\\src\\sdfassessment\\task01\\thankyou.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\daryl\\src\\sdfassessment\\task01\\thankyou.txt"));
            
        
            while ((line = br.readLine()) != null) {
                
                if (line.contains(replaceThis))
                    line = line.replace(replaceThis, toReplace);
                        bw.write(line);
                        bw.newLine();
                    }
                br.close();
                bw.close();
            } 
        
        
        }


    

    

