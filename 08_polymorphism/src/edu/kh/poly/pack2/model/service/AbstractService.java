package edu.kh.poly.pack2.model.service;

import edu.kh.poly.pack2.model.dto.Animal;
import edu.kh.poly.pack2.model.dto.Doggo;
import edu.kh.poly.pack2.model.dto.Snake;

public class AbstractService {

	
	/**
	 *  추상 클래스는 정말 객체로 못만들까? -> 못만든단다
	 */
	public void method1() {
		
//		Animal dog = new Animal();
		// error : Cannot instantiate the type Animal
		// -> 추상 클래스 Animal을 이용해서 객체 생성이 불가능하다
		
	}
	
	/**
	 *  추상 클래스를 상속 받은 클래스를 이용해 객체 생성
	 *   + 다형성(업캐스팅, 동적 바인딩) + 객체 배열
	 */
	public void method2() {
		
		/* 추상 클래스는 객체 생성은 안되지만
		 * 부모 타입의 참조 변수 역할은 할 수 있다.
		 * 
		 *  -> 동적 바인딩으로 인해
		 *     자식 객체 내 부모 추상 메서드가 호출될 일은 절대로 없음
		 *     (컴파일 오류 발생 x)
		 * */
		
		Animal a1 = new Doggo("포유류", false);
		Animal a2 = new Snake("파충류", true);
		
		Animal a3 = new Doggo("포유류", true);
		Animal a4 = new Snake("파충류", false);
		
//		Animal[] arr = new Animal[4]; // Animal 참조변수 4칸짜리 배열 만듬
		Animal[] arr = {a1, a2, a3, a4}; // 배열 생성과 동시에 초기화
		
		// 향상된 for문 + 동적 바인딩 + print 구문의 특징
		for( Animal a : arr) {
			
			System.out.println(" ------------------------- ");
			
			// 아래 구문들 모두 동적 바인딩 수행
			
			System.out.println(a);
			// Object.toString() 목적 : 객체를 문자열로 표현
			// 						== 객체의 필드를 모두 모아 하나의 문자열로 반환
			
			// print() 구문에 참조변수를 작성하면 자동으로 toString()메서드를 호출 하도록 되어 있다!
			a.eat();
			a.sleep();
		}
		
		
		
		
		
		
	}
	
}
