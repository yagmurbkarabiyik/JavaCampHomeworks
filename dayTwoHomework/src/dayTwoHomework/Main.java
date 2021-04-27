package dayTwoHomework;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "Java Course", "Kursumuz iki ay sürecektir", "Engin Demiroð", 74);

		Course course2 = new Course(2, "C# Course", "Kursumuz üç ay sürecektir", "Engin Demiroð", 27);

		Course course3 = new Course(3, "C Course", "Kursumuz iki ay sürecektir", "Engin Demiroð", 85);

		Course[] courses = { course1, course2, course3 };

		for (Course course : courses) {
			System.out.println(course.courseName + " - %" + course.completeRate);

		}

		System.out.println("***************************");

		CourseManager courseManager = new CourseManager();

		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.changeCourseName(course2, "Java & React");

		System.out.println("***************************");

		Category category = new Category(5, "Programlama");

		Category[] categories = { category };

		for (Category category2 : categories) {
			System.out.println(category2.categoryName);

		}
		System.out.println("***************************");
		
		CategoryManager categoryManager = new CategoryManager();
        categoryManager.addCategory("Teknoloji");
        
        categoryManager.changeCategoryName( "Yazýlým",category);

	}

	

}
