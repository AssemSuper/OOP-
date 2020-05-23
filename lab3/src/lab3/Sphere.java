package lab3;

public class Sphere extends Shape{
	private int radius=1;
	
	public Sphere(int radius) {
		this.radius=radius;
		}
		
	public double volume() {
		return (4*Math.PI*Math.pow(radius,3))/3;
	}
	public double surfaceArea() {
		return 4*Math.PI*Math.pow(radius, 2);
	}

}
