package lab4;
import java.io.Serializable;
public class Course implements Serializable {
	private String courseTitle;
	 Textbook text;
	 Instructor instructor;
	public Course(String courseTitle,Textbook text,Instructor instuctor) {
		
		this.courseTitle=courseTitle;
		this.text= text;
		this.instructor= instructor;
		
		
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle=courseTitle;
		
	}
	public String getCourseTitle() {
		return courseTitle;
	}

	public String toString() {
		return "Course title:"+courseTitle+"textbook is "+text+"Instructor is "+instructor;
	}
	public boolean equals(Object o) {
		Course ob=(Course) o;
		return ob.getCourseTitle().equals(courseTitle);
	}
}
