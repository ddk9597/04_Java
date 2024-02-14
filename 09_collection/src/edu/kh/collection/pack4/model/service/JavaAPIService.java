package edu.kh.collection.pack4.model.service;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIService {
	
	
	
	/*
	 *  Wrapper Class
	 *  
	 *  Wrap : 감싸다. 포장하다.
	 *  
	 *  - 기본 자료형(8가지)을 객체(속성,기능)로 감싸는 클래스
	 *  
	 *  - 기본 자료형의 객체화
	 * 
	 * 		->  컬렉션처럼 객체만 취급하는 상황에서 
	 * 			기본 자료형도 취급 가능한 형태로 바꾸기 위해
	 * 
	 *  
	 *  Unboxing    <--> Boxing
	 *  
	 *  boolean 	<--> Booelan
	 *  byte		<--> Byte
	 *  short		<--> Short
	 *  int			<--> Integer
	 *  long		<--> Long
	 *  float		<--> Float
	 *  double		<--> Double
	 *  char		<--> Character
	 *  			
	 *  ** Boxing, Unboxing을 자동으로 수행되도록 구현되어 있음
	 *  -> Auto Boxing, Auto Unboxing
	 *  
	 *  + Wrapper Class를 이용해 객체화 되었을 대 추가적인 필드, 기능을 제공함
	 *  
	 * */
	
	/**
	 *  Auto Boxing, Auto Unboxing
	 */
	public void method1() {
		
		int num1 = 100;
//		int wrap1 = wrap Integer(num1); // 삭제 예정인 방법. 쓰면 안된다.
		
		Integer wrap1 = num1; // 컴파일러가 Auto Boxing을 수행 코드 추가.
							  // (int) num1 -> (Integer) num1
		
		int num2 = wrap1.intValue(); // 정수 값 반환 (추천하지 않는 방법)
		
		int num3 = wrap1; // 컴파일러가 Auto Unboxing 수행 코드 추가
							// (Integer)wrap1 -> (int) wrap1에 저장된 값
		
		long num4 = 10000000L;
		Long wrap2 = num4; // 오토박싱
		
		long num5 = wrap2; // 오토언박싱
		
		// Integer 객체만 저장하는 List
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(1000); // (int)1000 -> (Integer) 1000 / Auto Boxing
		list.add(2000);
		list.add(3000);
		
		// pring 구문 내에서 Wrapper 클래스로 만든 객체를 참조할 때
		// .toString() 호출하는 것이 아닌
		// Auto Unboxing을 진행해서 기본 자료형으로 변경한다!!!
		System.out.println(list.get(0) + list.get(1) + list.get(2) );
	}
	
	/** Wrapper Class가 제공하는 필드, 메서드
	 *  -> 대부분이 Static!!!
	 *  	-> Static : 정적 메모리 영역. 한번 고정되면 프로그램 실행 내내 유지됨
	 *  	-> 클래스명.필드명 / 클래스명.메서드명() 사용
	 * 
	 */
	public void method2() {
		
		// byte 뿐 만 아니라 정수형, 실수형 모두 공통으로 사용 가능함
		System.out.println("byte의 용량 : " + Byte.BYTES + "바이트");  // 1. 1바이트
		System.out.println("byte의 용량 : " + Byte.SIZE + "비트");   // 8. 비트
		System.out.println("byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("byte의 최소값 : " + Byte.MIN_VALUE);
		
		// 실수형만 사용 가능한 것들(더블, 플로트)
		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		
		System.out.println(Float.NaN);
		
		// boolean(논리형)은 treu, false 뿐 박에 없음
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		
//		System.out.println(Character.BYTES);
		// ---------------------------------------------------------
		
		System.out.println("-------------------------------------");
		System.out.println("[String -> 기본 자료형 변환]");
		
		// HTML 연결 시(요청 데이터 처리) 많이 사용
		// ->  HTML에 관련된 모든 값은 String
		// 단, char(Character)는 별도로 존재하지 않음
		
		byte b = Byte.parseByte("1");
		short s = Short.parseShort("2");
		int i = Integer.parseInt("3"); // 중요
		long l = Long.parseLong("4"); // 중요
		float f = Float.parseFloat("0.1");
		double d = Double.parseDouble("0.2"); // 중요
		boolean bool = Boolean.parseBoolean("true");
		
		System.out.println("변환 확인");

		
		System.out.println("-------------------------------------");
		System.out.println("[기본 자료형 -> String 변환]");
		
		int test1 = 400;
		String change1 = Integer.valueOf(test1).toString();
		
		int test2 = 400;
		String change2 = Integer.valueOf(test1).toString();
	
		// String 이어쓰기를 이용한 방법
		// 코드는 짧으나 효율이 좋지 못함
		long test3 = 12345678910L;
		String change3 = test3 + ""; // 이어쓰기되면서 하나의 String 으로 변환
									// String + String -> 이어쓰기
				
				
	
	}	
	
	/** String 의 불변성(변하지 않는 성질 == 상수)
	 *  객체가 생성되면 그 값을 변경할 수 없고
	 *  수정된 값은 새로운 String 객체를 생성하여 표현함
	 * 
	 */
	public void method3() {
	
		// identityHashCode -> 주소값을 이용해서 만든 해시코드(식별번호)
				// -> 같은 객체에 저장된 값이 변했다면 주소는 일정해야 한다!
				// -> identityHashCode도 일정해야된다!
		
		String str = "hello";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str += " world";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str += " !!!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		// identityHashCode 가 전부 다른 값 이 나왔다
		// -> str이 참조하고 있는 객체가 변하고 있다!
		// -> 새로운 String 객체개 생성됨
		
				
	}
	
	/** String 리터럴("")로 생성된 객체 활용
	 * 
	 *  - 동일한 리터럴을 이용해 String 객체를 생성한 경우
	 *    추가적으로 객체를 생성하지 않고
	 *    기존에 존재하는 String 객체의 주소를 반환(재활용)
	 *    
	 *    이미 있는 동일한 글자로 String 객체를 생성하면 
	 *    새로 할당하는 것이 아닌 주소만 가져다 쓴다
	 * 	
	 */
	public void method4() {
		String temp1 = "Hello!!"; // 0x400 주소 생성
		String temp2 = "Hello!!"; // 0x400 주소 반환 받음
		
		System.out.println("저장된 값 비교 : " + temp1.equals(temp2));
		System.out.println("주소 비교 : " + (temp1 == temp2));
	}
	
	/** 사용자(개발자)가 관리하는 String 객체 생성
	 * 	- "" 리터럴로 생성된 String -> JVM 관리(String Pool)
	 * 	- new 연산자로 생성된 String -> 사용자 관리(Heap)
	 * 
	 */
	public void method5() {
		
		String temp1 = "qwer"; // String 리터럴로 생성
		String temp2 = new String("qwer"); // new 연산자로 생성
		String temp3 = new String("qwer"); // new 연산자로 생성
		
		System.out.println("temp1 : " + System.identityHashCode(temp1));
		System.out.println("temp2 : " + System.identityHashCode(temp2));
		System.out.println("temp3 : " + System.identityHashCode(temp3));
		
		// 셋 모두 주소가 다름 -> 동일한 String 리터럴 재활용하지 않음 
		// -> 전부 다른 객체
	}
	
	
	/** StringBuilder / StringBuffer 클래스
	 * 
	 * - String의 불변성 문제를 해결한 클래스
	 * - -> 가변성(mutable)
	 * 
	 * - 기본 16글자 저장할 크기로 생성됨
	 * 	 저장되는 문자열의 길이에 따라 크기가 증가/ 감소
	 * 		-> 마음대로 문자열 수정, 삭제 가능!
	 *  	-> 수정, 삭제를 해도 추가적인 객체 생성이 없어 효율 좋음
	 * 
	 * 
	 * - StringBuilder : Thread Safe 미제공(비동기, 추천)
	 * - StringBuffer : Thread Safe  제공  ( 동기). 멀티 스레드 환경에서 추천
	 * 
	 *  + Thread Safe : 여러 스레드(프로그램 기본 실행 단위)가 
	 *  				동시에 공유된 자원에 접근하더라도
	 *  				프로그램이 정확하게 동작하는 것
	 */
	public void method6() {
		
		// StringBuilder 객체 생성
		StringBuilder sb = new StringBuilder();
		
		// StringBuilder 객체에 문자열을 쌓아 나가는 방식으로 사용
		// append : 뒤에 추가, insert : 앞에 추가
		
		sb.append("오늘 점심은 ");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("마라탕이다");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.insert(0, "2월 14일 "); // 0번 인덱스에 삽입 == 제일 앞에 추가
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		// 주소 값이 모두 동일하다 -> 참조하는 객체가 변하지 않음
		// 객체 내에 값만 수정되고 있음 -> 가변성!
		
		// StringBuilder -> String 변환
		String temp = sb.toString(); // 객체에 저장된 필드를 문자열로 반환
		
		// String[] 문자열.split("구분자")
		// - 문자열을 "구분자" 를 기준으로 쪼개어 String[] 로 반환
		
		// 띄어쓰기를 기준으로 각 String 을 나누어 배열로 만들자
		String[] arr = temp.split(" "); 
		
		for(String str : arr) {
			System.out.println(str);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
