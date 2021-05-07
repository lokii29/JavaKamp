package odev5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import odev5.dataAccess.abstracts.UserDao;
import odev5.entities.concretes.User;

public class UserHibernateDao implements UserDao {
   
    List<User> userList;
    
    public UserHibernateDao() 
    { 
     userList = new ArrayList<User>();	
    }
	@Override
	public void add(User user) {
		
		this.userList.add(user);
		System.out.println("Hibernate ile eklendi." +  user.getFirstName() +" " + user.getLastName()) ;
	}

	@Override
	public void update(User user) {
		
		System.out.println("Guncellendi ");
	}

	@Override
	public void delete(User user) {
		this.userList.remove(user);
		System.out.println("Hibernate ile silindi." +  user.getFirstName() +" " + user.getLastName()) ;
		
	}

	@Override
	public User get(int id) {
		 
		for (User user : userList) {
			if(user.getId()==id) 
			{
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.userList;
	}

}
