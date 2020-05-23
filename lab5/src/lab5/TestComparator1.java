package lab5;
import java.util.Collection;
import java.util.Date;
import java.util.Vector;

public class TestComparator1 {
	public static void main(String arg[]) {
		Vector <Manager>  maga=new Vector <Manager>();
		Manager m= new Manager("Almaz",20.5,new Date(),"jiw" );
		Manager m5= new Manager("Alem",3002.2,new Date(),"jiw" );
		maga.add(m);
		maga.add(m5);
		Collection.sort(maga);
		
		
	}

}
