package sis2;

public class Person2 {
	private String lastName;
	private String firstName;
	private int age;
	public Person2(String lastName,String firstName,int age) {
		this.lastName=lastName;
		this.firstName=firstName;
		this.age=age;
	}

	public void displayPerson() {
		System.out.println("last name "+lastName);
		System.out.println("first name "+firstName);
		System.out.println("age "+age);
	}
	public String getLastName() {
		return lastName;
	}
	
}
