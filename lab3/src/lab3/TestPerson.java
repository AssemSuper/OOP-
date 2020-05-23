package lab3;
import java.util.*;
public class TestPerson {
public static void main(String args[]) {
	Vector<Person> people=new Vector<Person>();
	people.add(new Student("Sara","ave","sja",4,5));
	people.add(new Person("Sara","ave"));
	people.add(new Staff("Sara","ave","sja",4));
	for (Person p:people )
		System.out.println(p);
}

}
