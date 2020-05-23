package lab5;
import java.util.Collections;
import java.util.Date;
import java.util.Vector;
public class TestCompare {
	public static void main(String args[]) {
		
		Manager adam = new Manager("Alem", 7000, new Date(), "Pd00");
		Manager john = new Manager("Jania", 3000, new Date(), "Pd01");
		Manager james = new Manager("Arman", 4000, new Date(), "Pd002");
		james.setBonus(50);
		Vector<Manager> managers = new Vector<Manager>();
		managers.add(adam);
		managers.add(john);
		managers.add(james);
		Collections.sort(managers);
		System.out.println(managers.toString());
		
			}

}
