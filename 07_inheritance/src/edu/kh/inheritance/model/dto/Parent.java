package edu.kh.inheritance.model.dto;

// Object 클래스
// - 모든 클래스의 최상위 부모
// - class 선언부에 상속 구문이 하나도 작성되지 않으면
//	 컴파일러가 extends Object 구문을 추가해 준다!!!

public class Parent /* extends Object */{

	public String lastName = "강";
	protected String address = "서울시 강동구 길동138";
	
	private int money = 100_000_000;
	private String car = "gv90";
	
	// 기본 생성자
	public Parent() {
		System.out.println("기본 생성자로 부모 객체 생성됨");
	}
	
	// 매개변수 생성자
	public Parent(String lastName, String address, int money, String car) {
		this.lastName = lastName;
		this.address = address;
		this.money = money;
		this.car = car;
		
		System.out.println("매개변수 생성자로 부모 객체 생성됨");
	}
	
	// private로 선언된 객체에 대한 getter setter
	// money getter. setter
	
	// money getter
	public int getMoney() {
		return money;
	}
	// money setter
	public void setMoney(int money) {
		this.money = money;
	}
	
	// car getter
	public String getCar() {
		return car;
	}
	
	// car setter
	public void setCar(String car) {
		this.car = car;
	}
	
	// 현재 객체의 필드를 문자열로 반환하는 메서드
	public String inform() { // 문자열로 반환하기 때문에 입력 값의 자료형은 모두 %s로 설정
		return String.format("%s / %s / %s / %s", lastName, address, money, car);
	}
	
	// 공통된 규약(코드) 추가/수정
	public void testMethod() {
		System.out.println("부모에게 메서드 추가함");
	}
	
	/* 오버라이딩 (Overriding) : 위에 올라탐. 덮어쓰기 
	 * 부모 메서드 위에 자식 메서드가 올라탐 
	 *  == 부모 메서드를 자식이 덮어씌움 
	 *  == 재정의 
	 *  */
	
	// Over   : 위에 있음, 넘어서다.
	// riding : 타다 
	// 부모로부터 상속된 메서드를 덮어쓰는 것
	// + super 참조 변수 확인 하기
	
	public String introduce() {
		return "Parent 입니다";
	}
	
	// 반환형 클래스명.메서드명
	// String Object.toString()
	// - 객체의 필드를 문자열로 표현하기 위해서 사용하는 메서드
	// - Object에 정의된 toString을 오버라이딩 해서 사용
	
	@Override
	public String toString() {
		return String.format("Parent.toString() : %s / %s / %s / %s", lastName, address, money, car);
	}
	
}
