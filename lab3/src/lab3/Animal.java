package lab3;

public class Animal {
	public int move( int velocity,int time ) {
		return velocity*time;
	}
	public String sleepingPattern() {
		return "I sleep";
	}
}
	
/*public class Animal {
	public int sleep( int notSleepingHours ) {
		return 24-notSleepingHours;
	}
	public String breathing() {
		return "I can breath";
	}
}*/
	//{String name;
	//public Animal() {
		//name="no_name_yet";}
	//public Animal(String initialName)
	//{this.name=initialName;
		
	//}
	
	/*public String toString() 
{		return "I am "+ name;
	
}
}
class Dog extends Animal
{	private int id;
	public Dog() 
	{
	super();
	id =0;

	}
	public Dog(String initialName,int id ) 
	{
		super(initialName);
		this.id=id;
	}
	public String toString()
	{
	return super.toString()+"in zoo";
			
	}
	}*/
