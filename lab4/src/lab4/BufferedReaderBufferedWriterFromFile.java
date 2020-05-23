package lab4;
import java.io.*;
public class BufferedReaderBufferedWriterFromFile {
	public static void main(String args[]) {
		try {
			BufferedReader in= new BufferedReader(new FileReader("a.in"));
			BufferedWriter out= new BufferedWriter(new FileWriter("a.out"));
			// get line
			String line=in.readLine();
			//while not end file .. keep reading and displaying  file
			while(line!= null) {
				System.out.println("Read a line");
				System.out.println(line);
				out.write("copied: "+line+"\n");
				line=in.readLine();
			}
			// close stream 
			in.close();
			out.close();
		}
		catch(FileNotFoundException fi) {
			System.out.println("File not found");
		}catch(IOException io) {
			System.out.println("Can't read from file");
		}
		
	}

}
