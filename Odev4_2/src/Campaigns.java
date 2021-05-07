
public class Campaigns {
 private int id;
 private String name;
 private int indirimYuzdesi;
 
 public Campaigns() {
	 
 }
 
public Campaigns(int id, String name, int indirimYuzdesi) {
	
	this.id = id;
	this.name = name;
	this.indirimYuzdesi = indirimYuzdesi;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getIndirimYuzdesi() {
	return indirimYuzdesi;
}

public void setIndirimYuzdesi(int indirimYuzdesi) {
	this.indirimYuzdesi = indirimYuzdesi;
}
}
