package task02.chuklee.com;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client 
{
    public static void main(String[] args)
    throws IOException{ 
        {   
            

            System.out.println("Connecting to port 80");
            // Create new socket with IP address and port number
            Socket sock = new Socket("68.183.239.26", 80);
            System.out.println("Connected!");
    
            // Create Output and Input streams
            OutputStream os = sock.getOutputStream();
            InputStream is = sock.getInputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            ObjectInputStream ois = new ObjectInputStream(is);

            // Read request from server
            String response = ois.readUTF();
            System.out.printf("Server: %s\n", response);
            
            String[] response2 = response.split(" ");
            String requestid = response2[0];
            String integerlist = response2[1];

            float sum = 0;

            for(int i = 0; i < integerlist.length() ; i++){
                sum = sum + integerlist;
            }

            // Calculate Average
            float average = sum/integerlist.length();
            
            // Write back to server
            oos.writeUTF(requestid);
            oos.writeUTF("Daryl Goh Da Hui");
            oos.writeUTF("goh.daryl@gmail.com");
            oos.writeFloat(average);
               
            while (true) {
                if (true) {
                    boolean newresponse = ois.readBoolean();
                    System.out.println("SUCCESS");
                    break;
                }
                System.out.println("FAILED");
                ois.readUTF();
                sock.close();
                
           }

           is.close();
           os.close();
               }

        }
        
    }

