package day5Homework.googleMicroService;

public class GoogleLoginManager {

	public void login (String email, String password) {
		if(email.isEmpty() || password.isEmpty()) {
			System.out.println("Giri� ba�ar�s�z. ");
		}
		else {
			System.out.println("Google ile giri� yap�ld�. ");
		}
	}
}
