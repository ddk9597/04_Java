package edu.kh.inheritance.run;

import edu.kh.inheritance.model.dto.Child01;
import edu.kh.inheritance.model.dto.Parent;
import edu.kh.inheritance.model.dto2.Child02;

public class TestRun {

	public static void main(String[] args) {
		
		// 부모 객체 Parent 생성
		
		Parent p1 = new Parent(); // 기본 생성자
		Parent p2 = new Parent("김", "서울시 어딘가", 2000, "G80");
		
		System.out.println("-------------------------------------");
		Child01 c1 = new Child01(); // 자식1 기본 생성자
		
		
		// Child1  자식의 기능
		c1.setComputer("삼성 갤럭시북4");
		
		// Child1 내부에 생성된 Parent의 기능
		String str1 = c1.inform();
		System.out.println("str1 : " + str1);
		
		// Child1 자식의 기능
		String str2 = c1.informChild01();
		System.out.println("str2 : " + str2);
		
		
		System.out.println("----------------------------------");
		
		// Child1 매개 변수 생성자를 이용해서 객체 생성
		Child01 c2 = new Child01("2024 LG GRAM");
		String str3 = c2.informChild01();
		System.out.println("str3 : " + str3);
		
		System.out.println(" ----------------------- ");
		// child02 객체 생성( 매개 변수 생성자 이용)
		Child02 c3 = new Child02("최", "경기도 부천시", 999999, "벤츠", "아이폰200");
		
		String str4 = c3.informChild02();
		System.out.println("str4 : "+ str4);
		
		System.out.println(" ------------------------- ");
		System.out.println(" ------------------------- ");
		System.out.println(" ------------------------- ");

		System.out.println("\n[상속을 이용하여 공통된 규약 설정하기]\n");
		// Parent - Child01 
		//		 ㄴ Child02
		
		// Parent 를 상속 받은 Child01, Child02는 서로 비슷한 모양을 띄게 된다
		// 같은 부모를 상속 받았으니까 그렇다고 둘이 형제는 아님.
		
		// Parent에 코드를 추가하면 어떻게 될까? 둘 다 공통으로 적용되겠지
		
		Child01 ch1 = new Child01();
		Child02 ch2 = new Child02();
		
		ch1.testMethod();
		ch2.testMethod();
		// 부모에 코드 추가하면 모든 자식에게도 코드가 추가된다.
		// 부모의 코드를 수정하면 모든 자식에게도 수정된 코드가 적용된다.
		
		// 오버라이딩 확인하기
		System.out.println("---- 오버라이딩 ----");
		System.out.println(ch1.introduce());
		System.out.println(ch2.introduce());
		
		System.out.println(" ------------- to String 오버라이딩() -------------");
		
		System.out.println(p1.toString());
		System.out.println(ch1.toString());
		System.out.println(ch2.toString());
// 		오버라이딩 전
//		edu.kh.inheritance.model.dto.Parent@67b64c45
//		edu.kh.inheritance.model.dto.Child01@4411d970
//		edu.kh.inheritance.model.dto2.Child02@6442b0a
		
//		Parent 오버라이딩 후
//		Overriding 된 Parent의 toString을 Child01, Child02가 상속받음
//		Parent.toString() : 강 / 서울시 강동구 길동138 / 100000000 / gv90
//		Parent.toString() : 강 / 서울시 강동구 길동138 / 100000000 / gv90
//		Parent.toString() : 강 / 서울시 강동구 길동138 / 100000000 / gv90
		
	}
	
	
	
	
	
}
