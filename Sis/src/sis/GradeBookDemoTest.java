package sis;
import java.util.Scanner;

public class GradeBookDemoTest 
{
	public static void main(String args[]) 
	{
		//Scanner input=new Scanner(System.in);
		GradeBookDemo myGradeBook1= new GradeBookDemo("Object orientated programming");
		//GradeBookDemo myGradeBook2= new GradeBookDemo("Java");
		//System.out.printf("Initial course name is:%s\n\n",myGradeBook1.getCourseName());
		//System.out.printf("myGradeBook1 course name is:%s \n\n",myGradeBook2.getCourseName());
		//System.out.println("Please enter the course name");
		//String nameOfCourse=input.nextLine();
		//myGradeBook.setCourseName(nameOfCourse);
		
		//myGradeBook.displayMessage();
		myGradeBook1.displayMessage();
		myGradeBook1.determineAverageOfClass();
	}
	

}
