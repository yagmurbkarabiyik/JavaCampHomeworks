package day5Homework;

import day5Homework.business.abstracts.UserService;
import day5Homework.business.concretes.UserManager;
import day5Homework.business.concretes.VerificationManager;
import day5Homework.core.concretes.GoogleAdapterManager;
import day5Homework.dataAccess.concretes.HibernateUserDao;
import day5Homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		user.setId(1);
		user.setFirstName("Yaðmur");
		user.setLastName("Karabýyýk");
		user.setEmail("abcdef@gmail.com");
		user.setPassword("845120");
		
		
		User user1 = new User();
		user1.setId(2);
		user1.setFirstName("Mustafa");
		user1.setLastName("Turan");
		user1.setEmail("abcdf@gmail.com");
		user1.setPassword("854120");
		
		
		UserService userService = new UserManager(new HibernateUserDao(), new VerificationManager(), new GoogleAdapterManager());
		userService.register(user);
		System.out.println("**********************************************");
		userService.register(user1);
		System.out.println("**********************************************");
		
		userService.login(user.getEmail(), user.getPassword());
		System.out.println("**********************************************");

		userService.loginWithGoogle(user.getEmail(), user.getPassword());
		
	}

}
