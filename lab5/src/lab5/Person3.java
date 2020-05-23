package lab5;

public class Person3 {
	protected  String name;
	public Person3(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public String  toString() {
		return "Person name is "+name ;
		}
	public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null || o.getClass()!=getClass()) return false;
		Person3 p= (Person3) o;
		return name.equals(p.name);
		
	}

}
