package pksoft;
import java.net.*;
import java.io.*;

public class ClientSocket {

	public static void main(String args[]) { 
		try { // trying to be happen something wrong
			
		String ip ="localhost"; // making ip address
		
		int port = 9999; // making port
		
		Socket s = new Socket(ip, port); // passing port and ip to the sockets
		
		String str ="First Name: Purushottam"; // creating String data
		
		OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
		// OutputStreamWriter helps to pass output to the server sockets
		
		PrintWriter out = new PrintWriter(os); // this is important to print
		
		os.write(str); // this helps to write to Server Socket
		
        os.flush(); // this is important for flush();
        
        os.close(); // this is important to close();
        
		}catch(Exception e) { // if anything goes wrong 
			// this happens
			System.out.println("Something is not right on Client Server...");
		}
	}
}
