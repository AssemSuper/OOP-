package lab5;
import java.util.Comparator;
import java.util.Date;

public class hireDateComparator implements Comparator<Manager> {

	@Override
	public int compare(Manager m1, Manager m2) {
		// TODO Auto-generated method stub
		Date  date1= m1.getYear();
		Date date2=m2.getYear();
		return 0;
	}
	
	
	

}
