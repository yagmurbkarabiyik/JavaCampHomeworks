package day5Homework.business.concretes;

import java.util.ArrayList;
import java.util.regex.Pattern;

import day5Homework.business.abstracts.UserService;
import day5Homework.business.abstracts.VerificationService;
import day5Homework.core.abstracts.LoginService;
import day5Homework.dataAccess.abstracts.UserDao;
import day5Homework.entities.concretes.User;
import day5Homework.googleMicroService.GoogleLoginManager;

public class UserManager implements UserService {
	
	private LoginService loginService;
	private UserDao userDao;
	private VerificationService verificationService;
	private ArrayList<String> emailList = new ArrayList<String>();
	private ArrayList<String> passwordList = new ArrayList<String>();

	public static boolean isEmailValid(String email) {
		final Pattern EMAILREGEX = Pattern.compile(
				"[a-z0-9!#$%&'*+/=?^{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_{|}~-]+)@(?:[a-z0-9](?:[a-z0-9-][a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
				Pattern.CASE_INSENSITIVE);

		return EMAILREGEX.matcher(email).matches();

	}
	public static boolean isEmailValidOnClick() {
		return true;
		
	}
	public UserManager(UserDao userDao, VerificationService verificationService, LoginService loginService) {
		super();
		this.userDao = userDao;
		this.verificationService = verificationService;
		this.loginService = loginService;
	}

	@Override
	public void register(User user) {
		if (emailList.contains(user.getEmail())) {
			System.out.println("Girmiþ olduðunuz e-posta adresi sisteme kayýtlýdýr. ");
			return;

		}

		if (user.getPassword().length() < 6) {
			System.out.println("Paralo en az 6 karakterden oluþmalýdýr. ");
			return;

		}

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr. ");
			return;

		}

		if (isEmailValid(user.getEmail()) != true) {
			System.out.println("Lütfen geçerli bir e-posta adresi giriniz. ");
			return;

		} 
		
		else {
			System.out.println(user.getEmail() + " doðrulama e-postasý gönderilmiþtir. ");
			if(isEmailValidOnClick() != true) {
				System.out.println("Lütfen e-postanýzý doðrulayýnýz. ");
			}
			else {
				verificationService.verification(user.getEmail());
				System.out.println("Sisteme baþarýyla kayýt oldunuz. ");
				userDao.add(user);
				emailList.add(user.getEmail());
				passwordList.add(user.getPassword());
				
			}
		}
	}

	@Override
	public void login(String email, String password) {

		if(emailList.contains(email) && passwordList.contains(password)){
			System.out.println("Sisteme giriþ yapýldý. ");
			return;
			
			
		}
		else {
			System.out.println("E-posta veya parolanýz yanlýþ. ");
		}
	}

	@Override
	public boolean loginWithGoogle(String email, String password) {
		
		if(!loginService.login(email, password)) {
			System.out.println("Google bilgileriniz onaylanmadý. ");
			return false;
			
		}
		else {
			return true;
		}
	}

}
