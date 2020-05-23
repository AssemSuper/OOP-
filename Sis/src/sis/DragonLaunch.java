package sis;

import java.util.Vector;

public class DragonLaunch {
	public static   Vector <Object> people = new Vector <Object>(50);
	static void   kidnap(Person p) 
	{
		people.add(p);
		}
	  static boolean   willDragonEatOrNot() 
	  {
		  int p=0; 
		  for(int i=0;i<people.size();i++) 
		  {if (people.get(i).toString()=="B") 
		  {
		  p++;
		  }
		  if (people.get(i).toString()=="G" && p>0) 
		  {
			  p--;
		  }
		  
		  }
		  return p!=0;}
	  public static void main(String args[]) 
	  {
		  Person eat= new Person('B');
		  Person eat1= new Person('G');
		  DragonLaunch.kidnap(eat1);
		  DragonLaunch.kidnap(eat);
		  DragonLaunch.kidnap(eat);
		  DragonLaunch.kidnap(eat1);
		  
		  System.out.println(DragonLaunch.willDragonEatOrNot());
		  
	  }

}
