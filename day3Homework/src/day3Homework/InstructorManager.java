package day3Homework;

public class InstructorManager extends UserManager {
	public void courseInformation (Instructor instructor) {
		System.out.println(instructor.getInstructorLesson() + "kursu" + instructor.getUserFirstName() + instructor.getUserLastName() + "tarafýndan verilmektedir.");
	}
	
	

}
