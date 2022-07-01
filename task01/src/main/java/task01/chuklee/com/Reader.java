package task01.chuklee.com;

import java.io.BufferedReader;
import java.io.FileReader;

public class Reader 
{
    public static void main( String[] args ) {
        String line = "";
        

        try {


        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\daryl\\src\\sdfassessment\\task01\\thankyou.csv"));

        while ((line = br.readLine()) != null) {
            String[] variable = line.split(",");


            System.out.println("A = " + variable[0] + " B = " + variable[1] + " C = " + variable[2] );

        }


        }

        catch(Exception e) {
            e.printStackTrace();
        }

       
        
        }
    
}


