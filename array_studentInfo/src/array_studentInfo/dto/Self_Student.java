package array_studentInfo.dto;

// DTO : Data Transfer Object 값 전달용 객체
public class Self_Student {
	private String studentNumber;
	private String name;
	private char gender;
	private int html;
	private int css;
	private int js;
	private int java;
	
	// 매개변수 생성자
	public Self_Student(String studentNumber, String name, char gender) {
		this.studentNumber = studentNumber;
		this.name = name;
		this.gender = gender;
		
	}
	
}
