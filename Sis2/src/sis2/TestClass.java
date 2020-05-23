package sis2;

public class TestClass {
	public static void  main(String args[]) {
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor (6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a,b);
		Circuit g = new Parallel(c,d);
		Circuit h = new Series(g,e);
		Circuit i = new Parallel(h,f);
		double R = i.getResistance();
		System.out.print(f.getResistance());	
		System.out.println();
		System.out.print(f.getPotentialDiff());
		System.out.println();
		System.out.print(g.getResistance());
		System.out.println();
		System.out.print(g.getPotentialDiff());
				
	}

}
