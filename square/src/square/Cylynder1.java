package square;
// midterm preparation
public class Cylynder1 extends Circle {
	private int length=0;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length=length;
		
	}
	public double findVolume() {
		return super.findArea()*length;
	}

}
