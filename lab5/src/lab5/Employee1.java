package lab5;
import java.util.*;
public class Employee1 extends Person3 implements java.lang.Comparable<Employee1>,Cloneable {
	double salary;
	Date hireDate;
	int year;
	String insuranceNumber;
	public Employee1(String name,double salary,Date hireDate,String insuranceNumber) {
		super(name);
		this.salary=salary;
		this.hireDate=hireDate;
		//this.year=year;
		this.insuranceNumber=insuranceNumber;
	}
	public void setSalary(double salary) {
		this.salary=salary;
		}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int  bonus) {
		salary+=bonus;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public Date getYear() {
		return hireDate;
	}
	public void setInsurenceNumber(String insuranceNumber) {
		this.insuranceNumber=insuranceNumber;
	}
	public String getInsuranceNumber() {
		return insuranceNumber;
	}
	
	public String toString() {
		return "My salary is "+salary+"My insurance number "+insuranceNumber+"year"+year+"name"+name;
		}
	public boolean equals(Object o) {
		if(o==this) return true;
		if(o==null|| o.getClass()!=this.getClass()) return false;
		Employee1 e= (Employee1) o;
		return insuranceNumber.equals(e.insuranceNumber);
		
	}

	public Employee1 clone() throws 
								CloneNotSupportedException{
		Employee1 cloned= (Employee1) super.clone();
		cloned.hireDate= (Date) hireDate.clone();
		return cloned;
	}
	@Override
	public int compareTo(Employee1 other) {
		if (salary>other.salary) return 1;
		if (salary<other.salary) return -1;
		return 0;
	}

}
