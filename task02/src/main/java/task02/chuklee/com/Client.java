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
    public static void main( String[] args )
    throws IOException{ 
        {   
            

            System.out.println("Connecting to localhost at port 80");
            Socket sock = new Socket("68.183.239.26", 80);
            System.out.println("Connected ...");
    
        
            OutputStream os = sock.getOutputStream();
            InputStream is = sock.getInputStream();
            ObjectOutputStream oos = new ObjectOutputStream(os);
            ObjectInputStream ois = new ObjectInputStream(is);

            String response = ois.readUTF();
            System.out.printf("Server %s\n", response);
            
            String[] response2 = response.split(" ");
            String response3 = response2[1];

           
            }

            
    
            
    
        
            is.close();
            os.close();
    
        
            sock.close();
        }
        
    }}

