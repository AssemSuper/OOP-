
import java.util.Scanner;

public class square {
	public static void main (String agrs[]) {
	Scanner input= new Scanner (System.in);
	int a;
	int area;
	int perimeter;
	int diagonal;
	
	a=input.nextInt();
	area=a*a;
	perimeter=4*a;
	diagonal=Math.srqt(2)*a;
	System.out.println(area,perimeter,diagonal);

}}
