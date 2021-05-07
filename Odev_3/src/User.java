
public class User {

	private int Id;
	private String FirstName;
	private String LastName;
	private String Email;
	private String UserName;
	
	public User() {
		
		
	}
	
	
	public User(int id, String firstName, String lastName, String email, String userName) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		UserName = userName;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	
	
}
