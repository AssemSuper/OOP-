package sis2;

public class Parallel extends Circuit{
	Circuit c;
	Circuit d; 
	public Parallel(Circuit c, Circuit d) {
		this.c=c;
		this.d=d;
		
	}
	@Override
	public double getResistance() {
		// TODO Auto-generated method stub
		return 1 / ((1 / c.getResistance()) + 1 / (d.getResistance()));
	}
	@Override
	public double getPotentialDiff() {
		// TODO Auto-generated method stub
		return c.getPotentialDiff();
	}
	@Override
	public void applyPotentialDiff(double V) {
		
		// TODO Auto-generated method stub
		c.applyPotentialDiff(V);
		d.applyPotentialDiff(V);
	}

}
