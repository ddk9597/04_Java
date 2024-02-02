package edu.kh.oop.field.pack2;

import edu.kh.oop.field.pack1.FieldTest1;

public class FieldRun2 extends FieldTest1 {
// extends FieldTest1 -> FiledTest1을 상속 받게 하는 구문
	
	public void method1() {
		
		System.out.println( protectedValue ); 
		
		// 다른 패키지이지만 상속받았으므로 가능함
		// protected 접근 제한자를 작성한 필드에 접근 가능함!
		
	}
	
	
	public static void main(String[]args) {
			
		// FieldTest1 객체 생성
		
		FieldTest1 f1 = new FieldTest1();
		
		System.out.println(f1.publicValue);
		// 어디서든 가능
		
//		System.out.println(f1.protectedValue);
		// protected : 같은 패키지 + 상속만 가능
		
//		System.out.println(f1.defaultValue);
		// 같은 패키지 내에서만 가능
		
//		System.out.println(f1.privateValue);
		// 같은 클래스 내에서만 가능
	}
	
	
	
}
