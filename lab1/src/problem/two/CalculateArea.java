package problem.two;

import java.util.Scanner;

public class CalculateArea {
	public static void main (String agrs[]) {
	Scanner input = new Scanner (System.in);
	int a;
	int area;
	int perimeter;
	int diagonal;
	
	a=input.nextInt();
	area=a*a;
	perimeter=4*a;
	diagonal=(int) (Math.sqrt(2)*a);
	System.out.println("area "+area+" perimeter "+perimeter+" diagonal "+diagonal);

}}
