package lab5;

import lab5.MinMax.innerClass;

public class TestMinMax {
	public static void main(String args[]) {
		
		int a[]= {0,8,-3,30};
		
		innerClass n= MinMax.minMax(a);
		
		System.out.println("maximum value  "+n.largestValue);
		System.out.println("minimmum value "+n.lowestValue);
		//arr.minMax();
	}

}
