import java.util.Scanner;

import lab4.Admin;
import lab4.Manager;
import lab4.Teacher;
import lab4.TechGuy;
import java.util.Date;
import java.util.Scanner;
public class RegistrationOfUser {
	public static void updateUser(Admin admin) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a kind of user");
		String kind =sc.nextLine();
		System.out.println("Enter a name of user");
		String name=sc.nextLine();
		System.out.println("Enter a surname");
		String surname=sc.nextLine();
		int salary;
		if(kind.equals("Student")){
			System.out.println("Enter your department:");
			String department=sc.nextLine();
			//Student  student=new  Student()
			admin.addUsers(student);
			}
		if(kind.equals("Admin")) {
			//Admin a =new Admin();
			admin.addUsers(a);
		}
		if(kind.equals("Teacher")) {
			Teacher teacher = new Teacher(firstName, lastName, kind, salary, hireDate);
			admin.addUser(teacher);
			
		}
		if(kind.equals("TechGuy")) {
			TechGuy techguy= new TechGuy( firstName, lastName, kind, salary, hireDate);
			admin.addUser(techguy);
		}
		if(kind.equals("Manager")) {
			Manager manager= new Manager( firstName, lastName, kind, salary, hireDate);
			admin.addUser(manager);
		}
		
		
	}


}
