package lab4;
import java.io.BufferedReader;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;

public class Grade {
	private static String getScore(String line ) {
		String[] arr =line.split(" ");
		return arr[arr.length-1];
	}
	public static void main(String [] args) { 
		try {
		//File fi= new File("C:\\Users\\Assem\\Desktop\\scores.txt");
		BufferedReader in = new BufferedReader(new FileReader("scores.txt"));
		String line =in.readLine();
		HashSet<Integer> set= new HashSet<Integer>();
		int average = 0;
		while(line!=null) {
			set.add(Integer.parseInt(getScore(line)));
			average= average+Integer.parseInt(getScore(line));
		}
		in.close();
		BufferedWriter file= new BufferedWriter(new FileWriter(("grade.txt"),true));
		file.write("Average-"+average/set.size()+"\n");
		file.write("Minimum-"+Collections.max(set)+"\n");
		file.write("Maximum-"+Collections.min(set)+"\n");
		file.close();
		
		}catch(FileNotFoundException f) {
			System.out.println("File not found");
			
		}catch(IOException o) {
			System.out.println("File can't found");
			
		}catch(NoSuchElementException not) {
			System.out.println("No such element");// getMessage? read about it
			
		}
		
	
	
		
}

}
//BufferedReader bf=new BufferedReader(InputStreamReader(System.in));
//BufferedReader bf=new=BufferedReader(FileReader("filename"));
//StringTokenizer st= new StringTokenizer("a*b*c*|d","*|",true);
//while(st.hasMoreToken()){System.out.println(st.nextToken()}