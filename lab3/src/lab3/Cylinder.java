package lab3;

public class Cylinder  extends Shape{
	private double radius=1;
	private double height=1;
	//Constructors 
	public Cylinder(double radius,double height) 
	{
		this.radius=radius;
		this.height=height;
	}
	public Cylinder() {
		
	}
	public double volume() {
		return Math.PI*Math.pow(radius, 2)*height;
	}
	public double surfaceArea() {
		return 2*Math.PI*radius*radius;
	}

}
