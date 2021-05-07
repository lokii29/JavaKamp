
public class Gamer {
	 private int id;
	 private String firstName;
	 private String lastName;
	 private String kimlikNo;
	 private int birthday;
	 
	 public Gamer() {
		 
	 }
	 
	public Gamer(int id, String firstName, String lastName, String kimlikNo, int birthday) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.kimlikNo = kimlikNo;
		this.birthday = birthday;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getKimlikNo() {
		return kimlikNo;
	}
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
}
