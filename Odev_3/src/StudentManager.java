
public class StudentManager extends UserManager{
 
	public void addLesson(String lesson) 
	{
		System.out.println(lesson+ " dersi eklendi");
		
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
