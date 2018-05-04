package pksoft;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class SerSocket {
	public static void main (String[] args) throws Exception {// this throwsexception
		
		System.out.println("Connecting...");
		// ServerSocket is important to make  socket to established connections
		ServerSocket ss1 = new ServerSocket(9999);// creating
		// end of ServerSocket
		
		System.out.println("ServerSocket is waiting for Client to Connect with....");
// now making socket for client to accept
		
		Socket s = ss1.accept();
		// this is important too
		System.out.println("Client is now Online!");
		// BufferedReader is important read and write Bytes into String formats
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		// creating var as br and passing as a new param new InputStreamReader();
		
		String str = br.readLine();
		// this helps to read lines from client as a String
		
System.out.printf("%s", str);
// Displaying message to the  output stream

	}
	

}
