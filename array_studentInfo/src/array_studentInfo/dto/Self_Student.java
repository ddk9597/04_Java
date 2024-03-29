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
	
	// student info getter 
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getHtml() {
		return html;
	}

	public void setHtml(int html) {
		this.html = html;
	}

	public int getCss() {
		return css;
	}

	public void setCss(int css) {
		this.css = css;
	}

	public int getJs() {
		return js;
	}

	public void setJs(int js) {
		this.js = js;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public String getStudentNumber() {
		return studentNumber;
	}
	
	public String toString() {
		return String.format("%s / %c / %s \n HTML : %d / Css : %d / JS :%d / JavaScript : %d",
				studentNumber, gender, name, html, css, js, java);
	}
	
	
	
	
}
