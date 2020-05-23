package lab4;
import java.io.*;
public class BufferedReaderAndPrintWriterExample {
	public static void main(String args[]) {
		try{
			BufferedReader st1= new BufferedReader(new InputStreamReader(System.in));
			PrintWriter p= new PrintWriter(new OutputStreamWriter(System.out),true);
			PrintWriter pwt=new PrintWriter(new FileWriter("a.out"));
			// get line 
			String line=st1.readLine();
			// wile not end of file keep reading and displaying
			while(!line.equals("q")) {
				p.println("Read line");
				p.println(line);
				pwt.println(line);
				line=st1.readLine();
				
				}
			st1.close();
			p.close();
			pwt.close();
			
		   }
				catch(IOException ioe) {
					System.out.println("Can't read!");
				}
	}
	

}
