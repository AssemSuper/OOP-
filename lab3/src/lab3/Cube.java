package lab3;

public class Cube extends Shape {
	private int a=1;
	public Cube(int a) {
		this.a=a;
	}
public double volume() {
	return Math.pow(a, 3);
	
}
public double surfaceArea() {
	return 6*Math.pow(a,2);
}
}
