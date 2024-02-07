package edu.kh.poly.pack2.model.dto;

public class Doggo extends Animal{
	// The type Doggo must implement the inherited abstract method Animal.sleep()
	// Doggo 유형은 상속된 추상 메서드 Animal.sleep()을 구현해야 합니다
	
	// 추상 클래스를 상속 받은 경우
	// -> 부모 클래스에 작성된 추상 메서드를 "반드시 모두 오버라이딩" 해야한다!
	// -> 오버라이딩 강제화
	
	// 필드
	private boolean longTail; // 긴 꼬리
	
	// 기본 생성자
	public Doggo() {
		super();
	}
	
	// 매개변수 생성자
	public Doggo(String type, boolean longTail) {
		super(type);
		this.longTail = longTail;
	}
	
	@Override
	public void eat() {
		System.out.println("엎드려서 입만 이용해서 밥을 먹는다");
	}

	@Override
	public void sleep() {
		System.out.println("대개 배를 바닥에 붙이고 눈을 감은 채 잠을 잔다");
	}
	
	// boolean getter
	public boolean isLongTail() {
		return longTail;
	}

	// boolean setter
	public void setLongTail(boolean longTail) {
		this.longTail = longTail;
	}

	@Override
	public String toString() {
		
		return super.toString() + "/ 긴 꼬리 여부" + longTail;
		
	}

}
