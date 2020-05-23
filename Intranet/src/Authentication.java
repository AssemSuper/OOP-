import java.util.*;
public class Authentication {
	public static int login() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter login");
		String in=sc.nextLine();
		int id=Integer.parseInt(in);
		if(Database.users.contains(id)==false || Database.users.get(id)==null) {
			System.out.println("Wrong login");
			return -1;
			}
		User us=Database.users.get(id);
		System.out.println("Enter your passoword,please");
		String input =sc.nextLine();
		String let=input;
		if(let.equals(us.password)){
			return id;
		}
		System.out.println("Incorrect password");
		return -1;
		
		
		
	}

}
