package lab5;

import java.util.Comparator;

public class NameComparator implements Comparator <Employee1>{

	@Override
	public int compare(Employee1 e1, Employee1 e2) {
		String str0= e1.getName();
		
		String str1= e2.getName();
		return str0.compareTo(str1);
	}

}
