package newStudent;

import java.util.Scanner;

public class newStudentTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name:");
		
		String name = in.next();
		System.out.println("Enter your id :");
		String id = in.next();
		
		newStudent student = new newStudent(name, id);
		System.out.println(student.accessName());
		System.out.println(student.accessId());
		student.incrementYearOfStudy();
		System.out.println(student.yearOfStudy);
	}
	
}