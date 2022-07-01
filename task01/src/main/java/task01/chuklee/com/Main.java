package task01.chuklee.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        // Ensure arguments have the right format
        if (args.length > 0) {
            int i = 0;
            while (i < args.length) {
                if (args[0].endsWith(".csv") && args[1].endsWith(".txt")) {
                    System.out.println("Merging files " + args[0] + args[1]);
                }
                    
                else 
                    System.out.println("Please enter files to merge.");}

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\daryl\\src\\sdfassessment\\task01\\thankyou.csv"));     
        
        String line = "";
        // Break down variables in Excel using Split method     
        while ((line = br.readLine()) != null) {
            String[] variable = line.split(",");
            
        }         

                
        Replace merge = new Replace();
        // Call Replace Method and pass string arrays to replace template
        merge.replace("__address__", variable[2]);
        merge.replace("__first_name__", variable[0]);
        merge.replace("__years__", variable[3]);
        
    }}
    
}
