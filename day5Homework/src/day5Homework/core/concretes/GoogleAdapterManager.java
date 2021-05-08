package day5Homework.core.concretes;

import day5Homework.core.abstracts.LoginService;
import day5Homework.googleMicroService.GoogleLoginManager;

public class GoogleAdapterManager implements LoginService {

	@Override
	public boolean login(String email, String password) {

		GoogleLoginManager googleLoginManager = new GoogleLoginManager();
		googleLoginManager.login(email, password);

		return true;

	}

}
