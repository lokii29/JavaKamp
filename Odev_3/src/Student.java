
public class Student extends User {

    private	String Lesson;
    private int StudentId;
    
    public Student() {
    	
    }
    
    
    
	public Student(String lesson, int studentId) {
		super();
		Lesson = lesson;
		StudentId = studentId;
	}
	
	public String getLesson() {
		return Lesson;
	}
	public void setLesson(String lesson) {
		Lesson = lesson;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
}
