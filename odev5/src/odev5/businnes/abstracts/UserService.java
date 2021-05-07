package odev5.businnes.abstracts;

import odev5.entities.concretes.User;

public interface UserService {
 void add(User user);
 void logIn(String eMail, String password);
}
