package day3Homework;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getUserFirstName() + user.getUserLastName() + "eklendi!");
	}
	
    
	public void update(User user) {
		System.out.println(user.getUserFirstName() + user.getUserLastName() + "güncellendi!");
	}
	
	public void delete(User user) {
		System.out.println(user.getUserFirstName() + user.getUserLastName() + "silindi!");
	}
}
