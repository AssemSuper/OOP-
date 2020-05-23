package lab4;

public class Instructor {
	private String  firstName;
	private String lastName,department,email;
	public Instructor(String firstName,String lastName,String department,String email) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.department=department;
		this.email=email;
	}
	public Instructor() {
		
	}
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLasttName(String lastName) {
		this.lastName=lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setDepartment(String department) {
		this.department=department ;
	}
	public String getDepartment() {
		return department;
	}
	public void setEmail(String email) {
		this.email=email ;
	}
	public String getEmail() {
		return email;
	}
	public String toString() {
		return String.format("First name is %s and last name is %s,department is %s and email is %s",firstName,lastName,department,email);
	}
	public boolean equals(Object o) {
		//if (o==null) return false;
		//if (o==this) return true;
		Instructor i = (Instructor) o;
		return i.getFirstName().equals(lastName);
	}
	

}
