
public class Main {

	public static void main(String[] args) {

      Student student = new Student();
      Student student2 = new Student();
		
		student.setId(1);
		student.setFirstName("Lokman");
		student.setLastName("Ileri");
		student.setEmail("abc@gmail.com");
		student.setLesson("Kimya");
		student.setUserName("lokmanileri");
		
		student2.setId(2);
		student2.setFirstName("Ali");
		student2.setLastName("Veli");
		student2.setEmail("abcc@gmail.com");
		student2.setLesson("Fizik");
		student.setUserName("aliveli");
		
		Instructor instructor = new Instructor();
		
		instructor.setId(3);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("aabc@gmail.com");
		instructor.setInstructorId(1);
		instructor.setFieldLesson("Yazilim");
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.delete(student2);
		userManager.update(instructor);
		
		StudentManager studentManager= new StudentManager();
		studentManager.addLesson("Matematik");
		studentManager.add(student);
		studentManager.delete(student);
		studentManager.update(student);
		
		InsructorManager instructorManager = new InsructorManager();
		instructorManager.addNewLesson();
		instructorManager.add(instructor);
		instructorManager.delete(instructor);
		instructorManager.update(instructor);
		
		
		
		

	}

}
