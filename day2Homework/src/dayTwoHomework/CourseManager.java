package dayTwoHomework;

public class CourseManager {
	public void addToCourse(Course course) {
		System.out.println(" Kursa katýldýnýz : " + course.courseName);
	}
	
	public void changeCourseName(Course course, String name) {
		course.courseName = name;
		System.out.println(" Yeni kurs ismi : " + name);
	}

}
