package SchoolSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AthleticStudent extends Student {
	protected String favSport;
	private int hours;
	
	AthleticStudent(String name, int ageGrade, String recommendation, String fav) {
		super(name, ageGrade, recommendation);
		favSport = fav;
	}
	
	public String getInfo() {
		return ("This student's name is " + name + ". They are in the " + ageGrade + " grade, and their favorite sport is " + favSport);
	}
	public String chooseElective() {
		ArrayList<String> athleticElectives = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		String choice;
		athleticElectives.add("Advanced PE");
		athleticElectives.add("Basketball");
		athleticElectives.add("Soccer");
		athleticElectives.add("Football");
		athleticElectives.add("Hockey");
		athleticElectives.add("Tennis");
		System.out.println("Please choose one elective from the list: ");
		for(String s: athleticElectives) {
			System.out.println(s);
		}
		choice = scanner.nextLine();
		if(athleticElectives.contains(choice)) {
			return (choice + " is your chosen elective for this school year. Thank you!");
		}
		else {
			System.out.println("This isn't a valid choice. Please choose again: ");
			chooseElective();
		}
		return "";
		
	}
	
	
	public int getHours() {
		return hours;
	}
	
	
	public void practicing() {
		System.out.println(name + " is practicing for a match! Support them at their match coming up soon!");
		hours += 2;
	}
}
