package sis;
import newStudent.*;
import java.util.Scanner;

public class GradeBook 
{	private int[] grades;
	public void displayMessage() 
{
		System.out.println("Welcome to the grade book for CS101 Object-oriented Programming and Design!");
	
}
	public void inputGrades()
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Please,input grades for students:");
		System.out.println ("how many number you want to put in the pot?");
        int num = input.nextInt();
        int numbers[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println ("number" + i + ":");
            numbers[i] = input.nextInt();
        }

        for (int temp : numbers){
            System.out.print (temp + "\t");
        }
        System.out.println(numbers);
	}
	public void displayReport() 
	{
		outputGrades();
	}

}
