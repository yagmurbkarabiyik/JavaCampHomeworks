package day5Homework.business.abstracts;

import day5Homework.entities.concretes.User;

public interface UserService {

	public void register(User user);
	public void login(String email, String password);
	public boolean loginWithGoogle(String email, String password);
	
	
	
}
