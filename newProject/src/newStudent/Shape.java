package newStudent;
import java.util.Vector;
abstract class Shape { 
	enum Color{RED,BLACK}
	public Vector<Shape> shapes;
	private Color color;
	private Point anchor;
	public void move (int dx,int dy) {
		anchor.x+=dx;anchor.y+=dy;}
	
	public void draw() 
	{
		
	}
	

}
abstract class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x=x; this.y=y;
	}
	public void move (int dx,int dy) {
		x+=dx;y+=dy;
		plot();
	}
	public abstract void plot();
	class ColoredPoint extends Point{
		private int color1;
		public ColoredPoint(int x, int y, int color1) {
			super(x,y);
			this.color1=color1;
			public void plot() 
			{}
			
		}
	}
} 
class Square extends Shape{
	
	
	
}
