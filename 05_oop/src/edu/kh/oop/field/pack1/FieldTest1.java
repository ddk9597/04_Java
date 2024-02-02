package edu.kh.oop.field.pack1;

public class FieldTest1 {

	// 필드 : 객체의 속성을 나타냄
    //	       == 멤버 변수
	
	// *[필드의 작성법]*
	// [] : 생략 가능
	// [접근제한자] [예약어] 자료형 변수명 [= 초기값];
	
	// 접근제한자별 필드 선언 ;
	public int publicValue 		 = 10;
	protected int protectedValue = 20;
	int defaultValue 			 = 30;
	private int privateValue 	 = 40;
	
	// 모든 접근제한자가 같은 클래스 내부에 있기 때문에 오류 없음
	public void method1() {
		
		System.out.println(publicValue);
		System.out.println(protectedValue);
		System.out.println(defaultValue);
		System.out.println(privateValue);
	}
	
}
