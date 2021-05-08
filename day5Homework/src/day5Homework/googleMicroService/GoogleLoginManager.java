package day5Homework.googleMicroService;

public class GoogleLoginManager {

	public void login (String email, String password) {
		if(email.isEmpty() || password.isEmpty()) {
			System.out.println("Giriþ baþarýsýz. ");
		}
		else {
			System.out.println("Google ile giriþ yapýldý. ");
		}
	}
}
