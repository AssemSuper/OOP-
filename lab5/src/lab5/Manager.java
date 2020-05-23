package lab5;
import java.util.Vector;
import java.util.Date;

public class Manager extends Employee1 implements Comparable,Clonable{
	int bonus;

	public Manager(String name, double salary, Date hireDate , String insuranceNumber) {
		super(name, salary, hireDate, insuranceNumber);
		// TODO Auto-generated constructor stub
	}
	private Vector <Employee1> employees = new Vector <Employee1>();
	
	public String toString() {
		return String.format("%s Our employees -%s\n", super.toString(),employees.toString());
	}
	
	public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null || o.getClass()!=this.getClass()) return false;
		Manager m1=(Manager) o;
		return super.equals(m1)&&employees.equals(m1.employees);
	}
	
	public void addEmployee(Employee1 e) {
		employees.addElement(e);
		super.setSalary(10);
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
		salary += bonus;
	}
	
	public int compareTo(Object o) {
		Manager other=(Manager) o;
		if(salary<other.salary) return 1;
		if (salary>other.salary) return-1;
		if(bonus>other.bonus) return 1;
		if (bonus>other.bonus) return -1;
		return 0;
	}
	public Manager clone() throws
								CloneNotSupportedException{
			Manager man= (Manager) super.clone();
			man.hireDate= (Date) hireDate.clone();
			return man;
		}
	
	
	
	
	

}
