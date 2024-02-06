package edu.kh.inheritance.model.dto;

// 상속 : 부모의 코드를 물려 받아 자식이 자신의 것처럼 사용하는 것;

// 상속 키워드 : extends(확장하다) -> 부모 코드를 물려 받아 자식의 전체 크기가 늘어남;

public class Child01 extends Parent {
	
	// 필드
	private String computer;
	
	// 생성자
	// 기본 생성자
	public Child01() {
		
		/* super() : super 생성자 / 부모 생성자*/
		// - 자식 객체 생성 시 부모 생성자를 호출하는 생성자
		
		// - super 생성자는 항상 자식 생성자 첫 줄에 써야함!!
		super();
		
		System.out.println("Child01 기본 생성자로 생성됨");
	}
	
	// 매개변수 생성자
	public Child01(String computer) {
		
		super("황", "경기도 남양주시", 500000000, "포르쉐");
		this.computer = computer;
		System.out.println("Child01 매개변수 생성자로 생성됨");
	}
	// getter setter alt shift s -> r
	
	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}
	
	// Child01의 필드 + 물려받은 필드 문자열로 만들어 반환함
	public String informChild01() {
		
		return String.format("%s / %s/ %d/ %s/ %s", lastName, address, getMoney(), getCar(), computer);// 접근제한자 private으로 생성된 money, car는 간접접근으로
	}
	
	// 부모로부터 상속 받은 introduce 메서드 오버라이딩 하기(재정의)
	public String introduce() {
		return "Child01 입니다";
	}
	
	// Object -> Parent 오버라이딩한 toString을 또 Overriding 하기
	
	@Override
	public String toString() {
		return super.toString() + "\nChild01 to String : " + computer;
		
	}
	
	
}
