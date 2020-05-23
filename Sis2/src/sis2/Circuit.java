package sis2;

public  abstract class Circuit {
	//int V;
	//int R;
	public abstract double getResistance();
	public abstract double getPotentialDiff();
	public abstract void applyPotentialDiff(double V);
	
	public double getPower() {
		return (getPotentialDiff()*getPotentialDiff()) / getResistance();
	}
	
	public double getCurrent() {
		//int I;
		//I= V/R;
		return getPotentialDiff()/getResistance();
		
	}
	
	

}
