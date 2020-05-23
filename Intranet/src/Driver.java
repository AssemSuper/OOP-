import java.io.File;
import java.io.IOException;
import java.util.*;
public class Driver {
	public static void save() {
		Database.serStudent();
		Database.serDiscipline();
	}
	public static boolean showStudent() {
		if(Database.users.size()==0) {
			System.out.println("No student yet..");
			return false;
		}
		for(int i=0;i<DataBase.users.size();i++)
			System.out.println(i+1+")"+Database.users.get(i));
		return true;
	}
	public static boolean showDisciplines() {
		if(DataBase.course.size()==0) {
			System.out.println("No course yet..");
			return false;
		}
		for(int i=0;i<Database.course.size();i++) {
			System.out.printn(i+1+")"+Database.course.get(i));
			return true;
		}
		public static void main(String args[])  throws IOException,ClassNotFoundException{
			
			Scanner in= new Scanner(System.in);
			if(new File("disciplines").exists()) {Database.desCourses();}
			if(new File("students").exists()) {Database.desStudent();}
			try {
				System.out.println("Welcome!");
				menu:while(true) {
					System.out.println("What do you want to do?");
					System.out.println("\n 1) Add student \n 2) add course \n 3) add course to a student \n 4) view student \n 5) exit");
					int choice=in.nextInt();
					if(choice==1) {
						addStudent:while(true){
							System.out.println("Enter name:");
							Database.students.add(new Student(in.next()));
							System.out.println("Student added!");
							System.out.println("\n 1 Add another student \n 2) Return back \n 3) Exit");
							choice= in.nextInt();
							if(choice==1) continue addStudent;
							if(choice==2) continue menu;
							if(choice==5) {System.out.println("Bye!!!");
							save();
							break menu;}
							break;
							
							
							}
						
					}
					else if(choice==2) {
						addDicipline:while(true) {
							System.out.println("Enter a name of discipline");
							Database.discipline.add( new Discipline(in.next()));
							System.out.println("Discipline added");
							System.out.println("\n 1) Add another course\n 2)Return back \n 3) Exit");
							choice=in.nextInt();
							if(choice==1) continue addDiscipline;
							if(choice==2) continue menu;
							if(choice==3) {System.out.println("Bye");}
							save();
							break menu;
							break;
							
						}}
					else if(choice==3) {
						addDisciplineToStudent:while(true) {
							System.out.println("Choose studentthat you want to add discipline(Enter a number)");
							if(!showStudent()) continue menu;
							Student s= Database.student.get(in.nextInt()-1);
							System.out.println("Please,choose a course(Enter a number)");
							if(!showDiscipline()) continue menu;
							int i=in.nextInt()-1;
							s.discipline.add(Database.discipline.get(i));
							System.out.println("Discipline"+Database.discipline.get(i)+"added to"+s.name);
							System.out.println("\n 1) Add another discipline to some student \n 2)Return back \n 3) Exit");
							choice=in.nextInt();
							if(choice==1) continue addDisciplineToStudent;
							if(choice==2) continue menu;
							if(choice==3 ) {System.out.println("Buy");}
							save();
							break;
							
							
							
							}}
					else if(choice==4) {
						if(!showStudent()) continue menu;
						System.out.println("\n 1) return back\n 2)exit");
						choice=in.nextInt();
						if(choice==1) continue menu;
						if(choice==2) {System.out.println("Bye");}
						save();
						break;
						
					}
					
					
					else if(choice==5) {
						System.out.println("Buy");
						save();
						break;
						
						
					}
					
					
					
					catch (Exception e) {
						System.out.println("Something bad happened ...\n Saving resourses");
						e.printStackTrace();
						save();
					}
					}
					
					
				
		
		
	


