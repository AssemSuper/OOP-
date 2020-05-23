package lab3;

public class TestShape {
	public static void main(String args[])
	{
		Cylinder c= new Cylinder(4.5,6);
		
		Sphere   s=  new Sphere(4);
		System.out.println(c.volume());
		System.out.println(c.surfaceArea());
		System.out.println(s.volume());
		System.out.println(s.surfaceArea());
	
		
		
		
		
	}

}
