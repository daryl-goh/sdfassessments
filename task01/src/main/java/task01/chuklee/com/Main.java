package task01.chuklee.com;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        if (args.length > 0) {
            int i = 0;
            while (i < args.length) {
                if (args[0].endsWith(".csv") && args[1].endsWith(".txt")) {
                    System.out.println("Merging files " + args[0] + args[1]);
                }
                    
                else 
                    System.out.println("Please enter files to merge.");}

                  
       
        Replace f = new Replace();
        f.replace("__address__", "@@@@");
        f.replace("__first_name__", "@@@@");
        f.replace("__years__", "@@@@");
        
    }}
    
}
