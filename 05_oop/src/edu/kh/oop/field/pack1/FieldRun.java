package edu.kh.oop.field.pack1;

public class FieldRun {

	public static void main(String[] args) {
		
		// FieldTest1 객체 생성
		FieldTest1 f1 = new FieldTest1();
		
		System.out.println(f1.publicValue);		// 어디든 접근 가능
		System.out.println(f1.protectedValue);  // 같은 패키지내 접근 가능
		System.out.println(f1.defaultValue);  	// 같은 패키지내 접근 가능
//		System.out.println(f1.privateValue); 	
		// private는 다른 클래스에서 접근 불가로 오류 발생
		
		
	}
	
}
