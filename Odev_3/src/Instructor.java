
public class Instructor extends User {

	private String FieldLesson;
	private int InstructorId;
	
	public Instructor() {
		
		
	}
	
	
	public Instructor(String fieldLesson, int instructorId) {
		super();
		FieldLesson = fieldLesson;
		InstructorId = instructorId;
	}
	
	public String getFieldLesson() {
		return FieldLesson;
	}
	public void setFieldLesson(String fieldLesson) {
		FieldLesson = fieldLesson;
	}
	public int getInstructorId() {
		return InstructorId;
	}
	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}
	
	
}
