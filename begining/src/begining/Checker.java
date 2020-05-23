package begining;
import java.util.Scanner;
public class Checker {
	public static void main(String [] args) {
		FirstProgram o=new FirstProgram();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a and b:");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(o.sumOfTwoDigits(a,b));
		
	}

}
