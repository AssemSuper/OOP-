package lab4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Collections;
import java.util.StringTokenizer;

public class Scores {
	public static void  main(String args[]) {
		
	
try {
	BufferedReader bf=new BufferedReader(new FileReader("C:\\Users\\Assem\\Desktop\\scores.txt"));
	String line= bf.readLine();
	String name;
	int scores;
	HashMap<Integer,String> students  = new HashMap<>();
	
	while(line!=null) {
		StringTokenizer st = new StringTokenizer(line," ");
		name=st.nextToken()+" "+st.nextToken();
		scores=Integer.parseInt(st.nextToken());
		students.put(scores,name);
	}
	bf.close();
	int bestScore=Collections.max(students.keySet());
	BufferedWriter bw=new BufferedWriter(new FileWriter("grade.txt"));
	for (Integer grades:students.keySet()) {
		if (grades>=bestScore-10) {
			System.out.println(students.get(grades)+"-\"A\"\n");
		}
		if (grades>=bestScore-20) {
			System.out.println(students.get(grades)+"-\"B\"\n");
		}
		if (grades>=bestScore-30) {
			System.out.println(students.get(grades)+"-\"C\"\n");
		}
		if (grades>=bestScore-40) {
			System.out.println(students.get(grades)+"-\"D\"\n");
		}
		else {
			System.out.println("-\"F\"");
			
		}
		bw.close();
	}
	
	}catch(FileNotFoundException fe) {
		System.out.println("No such file");
	}catch(IOException io) {
		System.out.println("Could't read");
	}
	}
	}