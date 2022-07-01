package task01.chuklee.com;

public class Main {
    
    public static void main(String[] args) {
       

        if (args.length > 0) {
            int i = 0;
            while (i < args.length) {
                if (args[0].endsWith(".csv") && args[1].endsWith(".txt")) {
                    System.out.println("Merging files " + args[0] + args[1]);
                }
                    
                else 
                    System.out.println("Please enter files to merge.");
                    
                
               
            }
        }
        System.out.println(s);
    }
}
