import java.util.Scanner;
public class savings {
	private static final int Interest = 0;
	public static double initialBalance=100;
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n;
		double interest=0.1;
		System.out.println("Enter a number");
		n=input.nextInt();
		double saving = initialBalance + n*interest;
		System.out.println(saving);
		
	}
	

	
	
	
	
	
			
	

}
