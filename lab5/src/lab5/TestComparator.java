package lab5;
import java.util.Date;
import java.util.Vector;
import java.util.Collection;
import java.util.Collections;
public class TestComparator {
	public static void main(String args[]) {
		Vector <Employee1> worker= new Vector<Employee1>();
		Employee1 em1= new Employee1("Almaz",20.5,new Date(),"jiw" );
		Employee1 em2 = new Employee1("Sara",300.5,new Date(),"qwer");
		worker.add(em1);
		worker.add(em2);
		Collections.sort(worker);
	} 
	//, new NameComparator()

}
