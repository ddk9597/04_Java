package edu.kh.poly.pack2.model.dto;

// abstract class(추상 클래스)
// - 추상 메서드를 포함하고 있는 클래스
// - 미완성인 부분을 포함하고 있기 때문에 객체로 생성하는 것이 불가능함

public abstract class Animal {
	
	// 동물의 공통된 필드 / 메서드 작성
	private String type; // 종(포유류, 양서류, 갑각류 등..)
	
	// 기본 생성자
	public Animal() {}
	
	// 매개변수 생성자
	public Animal(String type) {
		this.type = type;
	}

	// getter / setter
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
	
	// 모든 동물이 가지고 있는 기능 -> 먹고 자기
	// 죄다 먹고 자는데 그 방법들이 각양각색으로 지금 당장 하나로 정의내리기 어려움
	// -> 부모 클래스 Animal에서 eat(), sleep() 을 정의 할 수 없음
	// -> Animal을 상속 받는 자식 클래스에서 
	//	  각자에게 맞춰 재정의(Override) 하도록 강제화 시킴
	
	// abastract(추상)
	// abstract 메서드 : 추상 메서드
	// 					-> 코드를 정의하는 {}가 없다!!
	public abstract void eat();
	
	public abstract void sleep();
	
	// class  선언부에도 abstract를 추가해 줘야 한다!
	
	
}
