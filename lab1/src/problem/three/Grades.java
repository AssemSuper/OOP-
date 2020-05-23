package problem.three;

import java.util.Scanner;
public class Grades
{ public static void main(String args[]) 
		//throws java.io.IOException
	 {
	Scanner input = new Scanner(System.in);
double grade ;

System.out.print("Enter your number ");
//grade = (double ) System.in.read(); // read a char from the keyboard
grade=input.nextDouble();
if(grade>=95 && grade<=100) 
	System.out.println(" A ");
else if(grade>=90 && grade<=94) { 
	System.out.println("A-");
	} else if(grade>=85 && grade<=89) {
	System.out.println("B+");
	}
else if(grade>=80 && grade<=84) {
	System.out.println("B");
	}
else if(grade>=75 && grade<=79) {
	System.out.println("B-");
	}
else if(grade>=70 && grade<75) {
	System.out.println("C+");
	}
else if(grade>=65 && grade<70) {
	System.out.println("C");
	}
else if( grade>=60 && grade<65) {
	System.out.println("C-");
	}
else if( grade>=55 && grade<60) {
	System.out.println("D+");
	}
else if( grade>=50 && grade<55) {
	System.out.println("D");
	}
else if( grade>=0 && grade<50) {
	System.out.println("F");
	}
else {System.out.println("Wrong enterance");
}
}
}
