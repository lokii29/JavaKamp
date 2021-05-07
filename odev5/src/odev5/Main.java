package odev5;

import odev5.businnes.concretes.UserManager;
import odev5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.seteMail("asdfg@gmail.com");
		user.setFirstName("Ahmet");
		user.setLastName("Mehmet");
		user.setId(1);
		user.setPassword("adsfg");
		

	UserManager manager = new UserManager();	
	manager.add(user);	
	
	
	}

}
