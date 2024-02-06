package dto;

public class Study_Parent extends Object{
	
	public String lastName = "강";
	//후손 클래스도 사용 가능한 접근제한자 protected
	protected String address = "강동구 어딘가"; 
	// 클래스 내에서만 사용 가능한 접근제한자 private
	private int money = 30000;
	private String car = "FancyCar";
	
	// 기본 생성자
	public Study_Parent() {
		System.out.println("기본 생성자로 Study부모 객체 생성됨");
	}
	
	// 매개변수 생성자
	public Study_Parent(String lastName, String address, int money, String car) {
		this.lastName = lastName;
		this.address  = address;
		this.money 	  = money;
		this.car	  = car;
		
		System.out.println("매개변수 생성자로 Study 부모 객체 생성됨");
	}

	// 접근제한자 private 객체에 대한 getter setter
	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	// 현제 객체의 필드를 문자열로 반환한느 메서드
	public String inform() {
		return String.format("%s / %s / %s / %s", lastName, address, money, car);
	}
	
	// 공통 규약(코드) 추가 및 수정
	public void testMethod() {
		System.out.println("부모에게 추가한 메서드 입니다");
	}
	
	public String intriduce() {
		return "Study Parent 입니다." ;
	}
	
	public String toString() {
		return String.format("Study_Parent.toString() : %s/ %s /%s/ %s", lastName, address, money, car);
	}
	
	
		
	
		

}
