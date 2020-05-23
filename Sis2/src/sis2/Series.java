package sis2;

public class Series extends Circuit {
	Circuit a;
	Circuit b;
	public Series(Circuit a, Circuit b){
		this.a=a;
		this.b=b;
		
	}
	

	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return a.getResistance()+b.getResistance();
		}
	
	
	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return a.getPotentialDiff()+b.getPotentialDiff();
	}
	@Override//setPotentialDiff
	public void applyPotentialDiff(double V) {
		// TODO Auto-generated method stub
		double I = V / getResistance();
		a.applyPotentialDiff(I*getResistance());
		b.applyPotentialDiff(I*getResistance());
		
		
	}

}
