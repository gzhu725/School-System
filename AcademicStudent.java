package SchoolSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AcademicStudent extends Student {
	protected String favoriteAcademicTopic;
	private int studyTime;
	AcademicStudent(String name, int ageGrade, String recommendation, String fav) {
		super(name, ageGrade, recommendation);
		favoriteAcademicTopic = fav;
	}
	
	public String getInfo() {
		return ("This student's name is " + name + ". They are in the " + ageGrade + " grade. Their favorite subject is " + favoriteAcademicTopic);
	}
	public String chooseElective() {
		ArrayList<String> academicElectives = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String choice;
		academicElectives.add("Introduction to Computer Science");
		academicElectives.add("Public Speaking");
		academicElectives.add("Religious Studies");
		academicElectives.add("Spanish");
		academicElectives.add("French");
		academicElectives.add("Creative Writing");
		System.out.println("Please choose one elective from the list: ");
		for(String s: academicElectives) {
			System.out.println(s);
		}
		choice = scanner.nextLine();
		if(academicElectives.contains(choice)) {
			return (choice + " is your chosen elective for this school year. Thank you!");
		}
		else {
			System.out.println("This isn't a valid choice. Please choose again: ");
			chooseElective();
		}
		return "";
		
	}
	
	public void study() {
		System.out.println(name + " is studying for their upcoming test. Don't disturb!");
		studyTime +=2;
	}
	
	public int getStudyTime() {
		return studyTime;
	}
	

}
