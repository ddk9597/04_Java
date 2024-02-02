package edu.kh.oop.cls.pack2;

import edu.kh.oop.basic.Account;
import edu.kh.oop.basic.Nation;

public class OtherClassTestRun2 {

	public static void main(String[] args) {
		
		// 1. public class 인 Nation 과 Account  클래스를 이용해서 객체 생성
		
		Nation n1 = new Nation();
		Account a1 = new Account();
		
		// -> 문제 없음(import잘됨)
		
		// 2.(default) 클래스인 ClassTest1 클래스 이용한 객체 생성
		
//		ClassTest1 c1 = new CalssTest1();
		
		// 다른 패키지에 존재하는 deafault 클래스는 import(외부 접근)불가함.
		// default 접근 제한자는 다른 패키지에서 접근 불가함. 같은 패키지 내에서만 사용 가능
		
		
	}
	
}
