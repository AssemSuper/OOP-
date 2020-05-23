package newStudent;


public class newStudent {
	String  name;
	String  id;
	double yearOfStudy=1;
	public newStudent(String i,String j){
		name=i;
		id=j;
	}
	String accessName (){
		return name;
	}
	String accessId(){
		return id;
	}
	public void  incrementYearOfStudy() {
		yearOfStudy++;
	}
	public String getName() {return name;}
	public void setName(String name) {this.name=name;}
}