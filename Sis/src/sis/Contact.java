package sis;

public class Contact implements Comparable  {
	private String phoneNumber;
	private String name;
	Integer num;
	
	public Contact(String phoneNumber,String name ) {
		this.phoneNumber=phoneNumber;
		this.name=name;
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phoneNumber) {
		this.phoneNumber=phoneNumber;
		
	}
	public Sting getPhone() {
		return phoneNumber;
	}
	public String toString() {
		return "name is "+name+phoneNumber+"number ";
	}
	public boolean equals(Object o) {
		if(o==this ) return true;
		if (o==null || o.getClass()!=this.getClass()) return false;
		Contact c=(Contact) o;
		return name.equals(c.name);
	}
	public int compareTo(Object object ) {
		Contact contact=(Contact) object;
		if(contact.num>num)  return 1;
		if(contact.num<num) return -1;
		return 0;
		
	}
	
}