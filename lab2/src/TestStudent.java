import java.util.Scanner;

class TestStudent {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.next();
		String id = in.next();
		
		Student student = new Student(name, id);
		System.out.println(student.accessName());
		System.out.println(student.accessId());
		student.incrementYearOfStudy();
		System.out.println(student.yearOfStudy);
	}
	
}