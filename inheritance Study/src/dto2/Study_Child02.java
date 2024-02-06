package dto2;

import dto.Study_Parent;

public class Study_Child02 extends Study_Parent {

	private String smartPhone;
	
	public Study_Child02() {
		
		System.out.println("Study_Child02 기본 생성자");
		
	}
	
	public Study_Child02(String lastName, String address, int money, String car, String smartPhone) {
		
		super(lastName, address, money, car);
		this.smartPhone = smartPhone;
		
		System.out.println("Study Child02 매개변수 생성자로 객체 생성함");
		
	}

	public String getSmartPhone() {
		return smartPhone;
	}

	public void setSmartPhone(String smartPhone) {
		this.smartPhone = smartPhone;
	}
	
	public String informChild02() {
		return inform() + "/" + smartPhone;
	}
	
}
