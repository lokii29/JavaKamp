package odev5.businnes.concretes;




import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import odev5.businnes.abstracts.UserService;
import odev5.core.concretes.AutManager;
import odev5.dataAccess.concretes.UserHibernateDao;
import odev5.entities.concretes.User;

public class UserManager implements UserService {
	private static final String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	 
	public static boolean isEmailValid(String emailInput) {
	Pattern pattern = Pattern.compile(EMAIL_PATTERN,
	Pattern.CASE_INSENSITIVE);
	return pattern.matcher(emailInput).find();
	}
	
   int minName = 2;
   int minPassword =6;
   List<User>  userList = new ArrayList<User>();
   
   
   UserHibernateDao dao = new UserHibernateDao();
   AutManager autManager = new AutManager();
   
   
	@Override
	public void add(User user) {
		if(user.getFirstName().length()<minName &&user.getLastName().length()<minName
				&& user.getPassword().length()<minPassword) {
			
			System.out.println("En az 2 karakter girilmesi gerekmektedir."
					+ " ve parola en az 6 karakter olmalidir. ");
			return;
		}
		
		for (User userr : dao.getAll()) {
			
			if(userr.geteMail()==user.geteMail()) {
				
				System.out.println("Bu mail daha önce kullanildi");
				return;
			}
		}
		
		if(UserManager.isEmailValid(EMAIL_PATTERN)==false) 
		{
			System.out.println("Geçersiz Eposta Girildi.");
			return;
		}
		
		dao.add(user);
		autManager.send(user.geteMail());
		autManager.tiklama();
	}

   
	@Override
	public void logIn(String eMail, String password) {
		for (User user : dao.getAll()) {
			
			if(user.geteMail()==eMail && user.getPassword()==password) 
			{
				
				System.out.println("Giris basarili ");
				return;
			}
		}
		System.out.println("Giris basarili");
		
		
	}

}
