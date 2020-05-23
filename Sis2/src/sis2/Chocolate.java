package sis2;

public class Chocolate implements Comparable {
	private Integer weights;
	String name;
	public Chocolate(Integer weights, String name) {
		this.weights=weights;
		this.name=name;
		
	}
	public String toString() {
		
		return String.format("Cholate weight is %d and it\'s name ",weights,name);
	}
	public void  displayChocolate() {
		System.out.println("This is a weight "+ weights );
		System.out.println("This is a name of chocolate"+name);
	}
	
	@Override
	public int compareTo(Object  otherObject) {
		Chocolate other= (Chocolate) otherObject;
		if(weights>other.weights) return 1;
		if(weights<other.weights) return -1;
		return 0;
	}
	public void setWeights( int weights) {
		this.weights=weights;
		
	}
	public int getWeights() {
		return  weights;
	}
	
	

}
