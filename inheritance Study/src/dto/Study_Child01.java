package dto;

public class Study_Child01 extends Study_Parent{

	private String computer;
	
	public Study_Child01() {
		super(); // 부모 생성자 호출하는 생성자
		System.out.println("1번자식 생성자로 생성됨");
	}
	
	// 매개변수 생성자
	public Study_Child01(String computer) {
		super("황", "서울 길동", 100000, "고급세단");
		this.computer = computer;
		System.out.println("1번 자식 매개변수 생성자로 생성됨");
	}

	// private String computer getter / setter
	
	public String getComputer() {
		return computer;
	}

	public void setComputer(String computer) {
		this.computer = computer;
	}
	
	public String informStudy_Child01() {
		
		return String.format("%s / %s / %d / %s / %s", lastName, address, getMoney(), getCar(), computer);
		
	}
	
	
	
	
	
	
}
