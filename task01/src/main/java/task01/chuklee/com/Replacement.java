package task01.chuklee.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

    public class Replacement {{

        File log= new File("log.txt");
        String search = "__first_name__";
        String replacement = "Sherlock";
        try {
        FileReader fr = new FileReader(log);
        String s;
        
            BufferedReader br = new BufferedReader(fr);

            while ((s = br.readLine()) != null) {
                s.replaceAll(search, replacement);
            
    }
}
catch(Exception e) {
    e.printStackTrace();
}

        }}


    

    

