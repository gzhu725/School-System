package SchoolSystem;
import java.util.ArrayList;



public class Teacher {
	private String name;
	private String subject;
	private ArrayList<Student> roster;
	
	Teacher(String name, String subject, ArrayList<Student> roster) {
		this.name = name;
		this.subject = subject;
		this.roster = roster;
	}
	 
	public String getInfo() {
		return ("Teacher name: " + name + "\nSubject: " + subject + "\n");
	}
	
	public void printRoster() {
		for(int i = 0 ; i<roster.size(); i++) {
			System.out.println("Student " + (int)(i + 1) + ": " + roster.get(i).getName());
		}
	}

	
	public void addToRoster(Student student) {
		roster.add(student);
	}
	
	public String getName() {
		return name;
	}
	
}

/*
idea dump: 
	Give the school a name
	School has teacher
	School has student
	EACH student has a :
		name
		grade (age)
		grade (score)
		recommendation for next course
	TWO KINDS OF STUDENTS; ACADEMIC ORIENTED, ATHLETIC ORIENTED (inheritance)
	
	EACH teacher has a :
		name
		subject(s) they teach
		number of students per class

testing out the system:
	you can add students to your class roster (arraylist probably)
	give your students feedback: report
	give your students midterm and final grades! 


finally get the info of each student
	grade, report, feedback....
	

*/