
public class UserManager {

	public void add(User user) 
	{
		System.out.println(user.getFirstName()+" Eklendi");
	}
	public void delete(User user) 
	{
		System.out.println(user.getFirstName()+" Silindi");
	}
	public void update(User user) 
	{
		System.out.println(user.getFirstName()+" Güncellendi");
	}
	
	
}
