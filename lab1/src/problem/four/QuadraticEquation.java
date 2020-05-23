package problem.four;

import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) 
	{
			
		Scanner input=new Scanner (System.in);
		int a,b,c;
		double D = 0;
		double x1,x2;
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
		D= b*b-4*a*c;
		
		x1=(-b+Math.sqrt(D))/(2*a);
		x2=(-b-Math.sqrt(D))/(2*a);
		
		
		if (D==0) {System.out.println(-b/(2*a));}
		else if (D<0)  {System.out.println("This eq does not have roots");}
		else {
			String s = x1 + " " + x2;
			System.out.println(s);
		}
		

	}
	
	
}





