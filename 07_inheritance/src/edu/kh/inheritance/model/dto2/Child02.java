package edu.kh.inheritance.model.dto2;

import edu.kh.inheritance.model.dto.Parent;

// final 클래스 -> 상속 불가함
// 상속이 불가하므로 당연히 오버라이딩도 안됨
// 제공되는 클래스 그대로 사용해야 하는 경우
// ex) String


public final class Child02 extends Parent{

	private String smartPhone;
	
	
	public Child02() {
//		super();
		// super() 생성자 미작성 시 컴파일러가 자동으로 추가!
		
		System.out.println("Child2 기본 생성자");
	}
	
	
	// 매개 변수 생성자(부모 필드 + 자식 필드)
	public Child02(String lastName, String address, int money, String car, String smartPhone) {
		
		// 전달 받은 매개 변수 5개 중 4개는
		// Child2 내부에 생성된 Parent에 초기화 되어야되는 값
		
		// -> Parent의 매개변수 생성자 호출
		super(lastName, address, money, car);
		this.smartPhone = smartPhone;
		
		System.out.println("Child02 매개변수 생성자로 객체 생성함");
		
	}


	public String getSmartPhone() {
		return smartPhone;
	}


	public void setSmartPhone(String smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	// 부모 메서드 inform + 자식 필드 내용
	// -> 중복되는 코드를 제거해서 코드 길이를 감소시킴
	// == 코드의 재사용성이 늘어남
	public String informChild02() {
		return inform() + "/" + smartPhone;
	}
	
	// 부모로부터 상속 받은 introduce 메서드 오버라이딩 하기(재정의)
	// + 오버라이딩이 잘 되고 있는지 컴파일러에게 검사해달라고 하기( @Override )
	// ( @ == Annotation(어노테이션))
	
	@Override
	public String introduce() { // 반환형을 int로 쓰니까 부모 코드와 다르다고 오류 발생
		
		// super. : 부모 부분 참조 변수 / super참조 변수
		return "Child02 입니다 " + super.introduce();
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nChild02 to String : " + smartPhone;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
