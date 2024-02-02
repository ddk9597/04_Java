package edu.kh.oop.method;

public class Student {

	// 필드
	public static String schoolName = "KH대학교";
	
	public static final int MIN_VAlUE = 0;
	public static final int MAX_VALUE = 0;
	
	
	private String name;			// 이름
	private String studentNumber;	// 학번
	private char   gender ;			// 성별
	private int    java;			// java 역량
	private int    html;			// HTML 역량
	
	// 생성자
	
	// 생성자 작성 규칙 : 반환값 없고 클래스명과 동일하게
	public Student() {} // 기본 생성자
	
	// 매개변수 생성자(오버로딩 적용됨)
	public Student(String name, String studentNumber, char gender) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender = gender;
				
	}
	
	// 메서드
	
	// setter
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setJava(int java) {
		this.java = java;
	}
	
	public void setHTML(int html) {
		this.html = html;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getJava() {
		return java;
	}
	
	public int getHtml() {
		return html;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// public class Student



















