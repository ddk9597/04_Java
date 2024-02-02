package edu.kh.oop.field.pack3;

public class Korean {
	
	/* 필드 작성 */
	
	public static int nationalCode = 82; // 국가 코드
	//static이 붙은 필드는 프로그램 실행 시 
	//static(정적) 메모리 영역에 할당된다
	
	/* static 필드 앞에 public 작성 이유
	 * -> 어디든지 누구든지 공유할 수 있도록 하는 것이 목적이기 때문에
	 * */
	
	// static + final / final + static
	public static final String ANCESTOR = "단군 할아버지";
	
	
	private String name;  // 이름
	private String idNum; // 주민번호
	
	// 초기화 블럭
	// - 객체 생성 시 필드를 {} 내부의 값으로 초기화
	{
		name = "김길동";
		idNum = "123456-1234567" ;
	}
	
	// static 초기화 블럭
	// -> static이 붙어있는 구문은 프로그램 실행 시 1회만 읽음
	// -> korean 객체가 100만번 생성되어도 처음 1회만 읽는다
	static{
		nationalCode = 10;
	}
	
	/* 메서드(기능) 작성 */
	// private 이므로 간접 접근 기능 작성
	
	public void setName(String name) {
		this.name = name;
		
		// 매개 변수로 전달 받은 name을 
		// 현재 객체의 name 필드에 대입
		
	}
	
	public void setId(String idNum) {
		this.idNum = idNum;
	}
	
	// 반환형 String : 메서드 종료 시 String 객체 반환
	public String getName() {
		return name;
	}
	
	public String geId() {
		return idNum;
	}
	
	
}
