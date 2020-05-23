package sis2;

public class Resistor extends Circuit {
	private double resistance;
	private double potentialDifference;
	public Resistor(double resistance) {
		this.resistance=resistance;
	}
	public void setResistance(double resistance) {
		this.resistance=resistance;
	}
	
	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return resistance;
	}
	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return potentialDifference;
	}
	@Override
	public void applyPotentialDiff(double V) {
		// TODO Auto-generated method stub
		potentialDifference=V;
		
	}
}
