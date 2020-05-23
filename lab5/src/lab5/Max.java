package lab5;

 class Max {
	 // Return maximum of two objects
	 public static Comparable max(Comparable o1, 
			 Comparable o2) {
		 if (o1.compareTo(o2)>0) return o1;
		 else return o2;
		 
		 
	 }
	 

}
 public interface Comparable{
	int  compareTo(Object o)
	 {}
 }

 interface Educated{
	 int PUPIL=0;
	 int BACHELOR=1;
	 int MASTER=3;
	 int PHD=4;
	 void setEducationLevel(int level) {
		 int getEducationLevel();
	 }
 }
 class Employee implements Comparable() {
	 
 }
 public int comparedTo(Object otherObject) {
	 Employee o=(Employee) otherObject;
	 if (salary>o.salary) return -1;
	 if (salary<o.salary) return 1;
	  return 0;
 }
 Vector <Employee> staff=new Vector <Employee>();
 staff.add(new Employee("Vasya","Pupkin",3000));
 staff.add(new Employee("Ivan","Ivanov",2000));
 Collection.sort(staff);