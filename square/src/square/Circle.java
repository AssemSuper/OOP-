package square;
//midterm preparation
public class Circle {
	private  int radius=0;
	 public int getRadius() {
		return radius;
		}
	public void setRadius(int radius) {
		radius =radius;
		
	}
	public int findArea() {
		return (int) ((double) Math.PI*radius*radius);
	}

}
