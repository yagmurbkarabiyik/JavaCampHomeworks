package dayTwoHomework;

public class Course {

	
	public Course(int id, String courseName, String description, String instructorName, int completeRate) {
	
		this.completeRate = completeRate;
        this.id = id;
        this.description = description;
        this.instructorName = instructorName;
        this.courseName = courseName;
        
	}
	
	int id;
	String courseName;
	String description;
	String instructorName;
	int completeRate;
	String categoryName;
	
	
	
}
