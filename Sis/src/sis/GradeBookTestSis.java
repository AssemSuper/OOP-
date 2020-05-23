package sis;
import java.util.Scanner;

import newStudent.newStudent;

import java.util.Arrays;

public class GradeBookTestSis {
	public static void main(String[] args ) 
	{
		
		int [] gradesArray= {87,69,89,85};//{new newStudent("A","54") };//{87,69,89,85};
		GradeBookSis data= new GradeBookSis("OOP",gradesArray);
		
		data.displayMessage();
		data.displayGradeReport();
		newStudent student = new newStudent("oop","gh");
		System.out.println(Arrays.toString(gradesArray));
		
		
		/*Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = in.nextInt();
		int [] myArray = new int[length];
		      System.out.println("Enter the elements of the array:");

		      for(int i=0; i<myArray.length; i++ ) {
		         myArray[i] = in.nextInt();
		      }

		      System.out.println(myArray);*/
		   }
}


