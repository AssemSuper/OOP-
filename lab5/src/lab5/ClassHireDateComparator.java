package lab5;
import java.util.Comparator;
import java.util.Date;

public class ClassHireDateComparator implements Comparator <Employee1> {
	public int compare(Employee1 ob1, Employee1 ob2) {
		Date d1= ob1.getYear();
		Date d2= ob2.getYear();
		return d1.compareTo(d2);
	}

}

