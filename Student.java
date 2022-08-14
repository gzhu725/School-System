package SchoolSystem;

public abstract class Student {
	protected String name; 
	protected int ageGrade;
	protected String recommendation;
	
	Student(String name, int ageGrade, String recommendation) {
		this.name = name;
		this.ageGrade = ageGrade;
		this.recommendation = recommendation;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return ageGrade;
	}

	
	public String getRecommendation() {
		return recommendation;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public void setAge(int age) {
		this.ageGrade = age;
	}
	
	public void setRecommendation(String rec) {
		recommendation = rec;
	}

	public abstract String getInfo();
	public abstract String chooseElective();
	//what are they doing afterschool basically
	
}

