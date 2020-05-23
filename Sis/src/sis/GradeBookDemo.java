package sis;
import java.util.Scanner;
public class GradeBookDemo {
	//public void displayMessage(String courseName) {
		//System.out.printf("Welcome to the grade book for\n%s!\n",courseName);
	private String courseName;
	// constructor
	public GradeBookDemo(String name) 
	{
		courseName=name;
	}
	public void setCourseName(String name) 
	{
		courseName=name;
	}
	public String getCourseName() 
	{return courseName;}
	public void displayMessage() 
	{
		System.out.printf("Welcome to the grade book for\n%s\n",getCourseName());
	}
	public void determineAverageOfClass() 
	{	Scanner input=new Scanner(System.in);
		int total=0;
		int average;
		int grade;
		int gradeCounter=1;
		while (gradeCounter<=10) 
		{	System.out.println("Enter a number:");
			grade=input.nextInt();
			total=total+grade;
			gradeCounter=gradeCounter+1;}
			average=total/10;
			System.out.printf("\nThe total of 10 is %d",total );
			System.out.printf("\nThe avarage of 10 is %d\n",average );
		}
	}
	


