package SchoolSystem;
import java.util.Scanner;
import java.util.ArrayList;
public class SchoolSystemTester {
	static ArrayList<Teacher> teachers = new ArrayList<Teacher>(); 
	static ArrayList<Student> students = new ArrayList<Student>();
	public static void main(String[] args) {
		System.out.println("Welcome to Pink County High School School System!");
		Scanner scanner  = new Scanner(System.in);
		int answer; 
		ArrayList<Student> bioRoster = new ArrayList<Student>();
		ArrayList<Student> engRoster = new ArrayList<Student>();
		ArrayList<Student> mathRoster = new ArrayList<Student>();
		ArrayList<Student> histRoster = new ArrayList<Student>();
		ArrayList<Student> calcRoster = new ArrayList<Student>();
		Teacher a = new Teacher("Bob Smith", "Biology", bioRoster );
		Teacher b = new Teacher("Jane Rust", "English", engRoster);
		Teacher c = new Teacher("Patricia Stall", "Algebra", mathRoster);
		Teacher d = new Teacher("Stanley Marshall", "World History", histRoster);
		Teacher e = new Teacher("Trent Hart", "Calculus", calcRoster);
		teachers.add(a);
		teachers.add(b);
		teachers.add(c);
		teachers.add(d);
		teachers.add(e);
		AcademicStudent john = new AcademicStudent("John Doe", 9, null, "Calculus");
		AcademicStudent teddy = new AcademicStudent("Teddy Roosevelt", 11, null, "World History");
		AthleticStudent mary = new AthleticStudent("Mary Jones", 10, null, "Field hockey");
		AthleticStudent lakshmi = new AthleticStudent("Lakshmi Gupta", 12, null, "Soccer");
		a.addToRoster(lakshmi);
		b.addToRoster(teddy);
		students.add(john);
		students.add(teddy);
		students.add(mary);
		students.add(lakshmi);
		do {
		System.out.println("Please put a number 1-4");
		System.out.println("1: Read about the school");
		System.out.println("2: View all teachers (teacher directory)");
		System.out.println("3: Log in");
		System.out.println("4: Exit");
		
		
		answer = scanner.nextInt();
		
		if(answer == 1) {
			System.out.println("Welcome to Pink County High School. We have a total of 2000 students.\nEach student chooses whether"
					+ " they want to be focused academically or athletically each school year.\nYou can check a "
					+ "student's recommendation, classes they enrolled in, "
					+ "and their feedback from their teachers.\n");
		}
		else if(answer == 2) {
			for(Teacher t: teachers) {
				System.out.println(t.getInfo());
				
			}
		}
		else if(answer == 3) {
			loginSystem();
		}
		else if(answer == 4) {
			System.out.println("Thanks for visiting our system. Goodbye!");
		}
		else {
			System.out.println("Invalid input.");
		}
			
	}while(!(answer == 4));
	
	}

	public static void loginSystem() {
		Scanner s = new Scanner(System.in);
		String answer;
		do {
		System.out.println("Are you a teacher or a student? ");
		answer = s.nextLine();
		if(!(answer.equalsIgnoreCase("teacher") || answer.equalsIgnoreCase("student"))) {
			System.out.println("Please put in either teacher or student.");
		}
		}while(!(answer.equalsIgnoreCase("teacher") || answer.equalsIgnoreCase("student")));
		if(answer.equalsIgnoreCase("teacher")) {
			System.out.println("Please enter your name: ");
			String teacherName = s.nextLine();
			for(Teacher t: teachers) {
				if(t.getName().equalsIgnoreCase(teacherName)) {
					System.out.println("Welcome, " + t.getName() + ". What would you like to do?");
					System.out.println("1: Get your roster ");
					System.out.println("2: Add a student to roster ");
					System.out.println("3: Set recommendation for a student");
					System.out.println("4: Go back");
					int choice = s.nextInt();
					s.nextLine();
					if(choice == 1) {
						t.printRoster();
					}
					else if (choice == 2) {
						System.out.println("Please enter a student name: ");
						String studentName = s.nextLine();
						for(Student st: students) {
							String currentName = st.getName();
							if(currentName.equalsIgnoreCase(studentName)) {
								t.addToRoster(st);
								System.out.println("Your roster is the following: ");
								t.printRoster();
								
							}
						}
					}
					else if(choice == 3) {
						System.out.println("Please enter student name: ");
						String studentName = s.nextLine();
						for(Student st: students) {
							if(st.getName().equalsIgnoreCase(studentName)) {
								System.out.println("Please write recommendation/comments for this student: ");
								String recommendation = s.nextLine();
								st.setRecommendation(recommendation);
							}
						}
						
					}
					else if(choice == 4) {
						break;
					}
				}
				
			}
			//teacher case
			
		
		}
		else if (answer.equalsIgnoreCase("student")) {
			System.out.println("Please enter your name: ");
			String studentName = s.nextLine();
			for(Student st: students) {
				if(st.getName().equalsIgnoreCase(studentName)) {
					System.out.println("Welcome, " + st.getName() + ". What would you like to do? ");
					System.out.println("1: Get your info");
					System.out.println("2: Choose your elective");
					System.out.println("3: Go back");
					int choice = s.nextInt();
					s.nextLine();
					if(choice == 1) {
					System.out.println(	st.getInfo());
					}
					else if (choice == 2) {
						System.out.println(st.chooseElective());
					}
					else if (choice == 3) {
						break;
					}
					
				}
			}
			
		}
		else {
			System.out.println("Invalid answer. Please try again");
		}
		}
	}

	

