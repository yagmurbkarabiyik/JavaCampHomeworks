package day3Homework;

public class Main {

	public static void main(String[] args) {

		User user = new User();
        user.setId(1);
        user.setUserFirstName("Mustafa");
        user.setUserLastName("Turan");
        user.setUserNumber("44");
        
        
        
        Instructor instructor = new Instructor();
        instructor.setId(2);
        instructor.setUserFirstName("Yağmur");
        instructor.setUserLastName("Karabıyık");
        instructor.setUserNumber("03");
        instructor.setInstructorLesson("Java");
        instructor.setInstructorNumber("");
        
        
        Student student = new Student();
        student.setId(3);
        student.setStudentNumber("95");
        student.setUserFirstName("Onur");
        student.setUserLastName("Karabıyık");
        student.setUserNumber("56");
        
        
        Student student2 = new Student();
        student2.setId(4);
        student2.setStudentNumber("5");
        student2.setUserFirstName("Ecrin");
        student2.setUserLastName("Turan");
        student2.setUserNumber("54");
        
        System.out.println(user.getUserFirstName() + user.getUserLastName());
        System.out.println("***********************************************");
        
       
        		
       UserManager userManager = new UserManager();
       userManager.add(user);
       userManager.delete(user);
       
       
       InstructorManager instructorManager = new InstructorManager();
       instructorManager.courseInformation(instructor);
       
        
        
        
	}

}
