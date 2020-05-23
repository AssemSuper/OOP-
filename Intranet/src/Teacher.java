import java.util.*;
import java.io.Serializable;
public class Teacher extends Employee implements Serializable{
	public Teacher(String firstName,String lastName,String kind,double salary,Date hireDate) {
		super(firstName,lastName,"Teacher",salary,hireDate);
		}
	private Vector<Discipline> course= new Vector<Discipline>();
	private HashMap<Discipline,Vector<File>> files =new HashMap<Discipline,Vector<File>>();
	private HashMap<Discipline,TreeSet<Student>> s= new HashMap<Discipline,TreeSet<Student>>();
	
	public void viewCourse() {
		
	}
	public void addFiles(File files) {
		
	}
	public boolean putMarks(int marks,Student student ) {
		return false;
	}
	public void  checkAttendance(HashMap<Discipline,TreeSet<Student>> listOfStudents) {
	
	}
	public void addCourse(Discipline course) {
		this.course.addElement(course);
		
	}
	public Vector<Discipline> getCourse(){
		return course; 
	}
	public HashMap<Discipline,Vector<File>> getFiles(){
		return files;
		
	}
	public void setFiles(HashMap<Discipline,Vector<File>> files) {
		this.files=files;
		
	}
	public void setStudent(HashMap<Discipline,TreeSet<Student>> s) {
		this.s=s;
	}
	public HashMap<Discipline,TreeSet<Student>> getStudent(){
		return s;
	}
	public int hashCode() {
		if (course==null) return 0;
		return 17+31*course.hashCode();
		//if(files==null) return 0;
		//return 17+31*files.hashCode();
		//if(s==null) return 0;
		//return 17+31*s.hashCode();
		
		
	}

	public boolean equals(Object o) {
		if(o==this) return true;
		if(!(o instanceof Teacher)) return false;
		Teacher t = (Teacher) o;
		return super.equals(o);
	}
		
				
		
	
	public String toString() {
		return "Teacher"+firstName+"hired date"+hireDate;
		
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
