import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;
public class Serverx {
	
	public static void main(String a[]) throws IOException {
		
			ServerSocket s=new ServerSocket(4556);
			System.out.println("Server is ready waiting for client");
			
			Socket sr=s.accept();
			
			System.out.println("Client request granted");
			
			FileInputStream fr=new FileInputStream("D:\\study\\DB\\Lab 4\\Lab 04 Database.docx");
			byte b[]=new byte[3000];
			fr.read(b,0,b.length);
			OutputStream os=sr.getOutputStream();
	
			os.write(b,0,b.length);
			
				
			
		
	}
}
