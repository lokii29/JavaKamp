
public class InsructorManager extends UserManager {

	public void addNewLesson() 
	{
		System.out.println("Yeni ders eklendi");
		
	}
	@Override
	public void add(User user) 
	{
		System.out.println(user.getFirstName()+" Eklendi");
	}
	@Override
	public void delete(User user) 
	{
		System.out.println(user.getFirstName()+" Silindi");
	}
	@Override
	public void update(User user) 
	{
		System.out.println(user.getFirstName()+" Güncellendi");
	}
}
