package day5Homework.business.concretes;

import day5Homework.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public boolean verification(String email) {
		System.out.println(email + " doðrulamasý tamamlandý.");
		return true;
		
	}

}
