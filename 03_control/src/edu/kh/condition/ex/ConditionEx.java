package edu.kh.condition.ex;

import java.util.Scanner;

/**
 *  조건문 기능용 클래스
 */
public class ConditionEx {

	// 필드 (객체의 속성 == 객체가 가지고 있는 값/변수)
	Scanner sc = new Scanner(System.in); 
	
	/**
	 *  if 문을 이용하여 
	 *  나이를 입력받아 
	 *  19세 이상 : 성인
	 *  19세 미만 : 성인이 아닙니다
	 *  
	 */
	public void method1() {
		System.out.print("나이 입력 :");
		int age = sc.nextInt();
		
		if(age > 18) { System.out.println("성인");}
		else { System.out.println("성인이 아닙니다");}
	}
	
	
	/**
	 *  나이를 입력 받아 14세 미만이면 어린이
	 *  13세 초과, 19세 미만 : 청소년
	 *  18세 초과 : 성인
	 */
	public void method2() {
		
		String result;
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age < 14) 			result = "어린이 입니다.";
		else if (age < 19 )	 	result = "청소년 입니다";
		else 					result = "성인 입니다";
		
		System.out.println(result);
		
	}
	
	/**
	 * 달(월)을 입력받아 해당 계절 출력하기
	 * 
	 * <ul>
	 * 		<li> 봄 	: 3, 4, 5</li>
	 * 		<li> 여름	: 6, 7, 8</li>
	 * 		<li> 가을	: 9, 10, 11</li>
	 * 		<li> 겨울 	: 12, 1, 2</li>
	 * 		<li> 그 외 	: 잘봇입력</li>
	 * </ul>
	 */
	public void method3 () {
		
		String result ;
		System.out.print(" 달을 입력하세요 : ");
		int month = sc.nextInt() ;
		
 		if(2 < month && month < 6) result = "봄" ;
 		else if (5 < month && month < 9 ) result = "여름" ;
 		else if (8 < month && month < 12 ) result = "가을" ;
 		else if ( 1 == month || 2 == month || 12 == month ) result = "겨울" ;
 		else  result = "잘못된 입력" ;
 		
 		System.out.println(result + "입니다.");
		
	}
	
	/**
	 *  생각하는 순서를 바꿈
	 */
	public void method3a () {
			
			String result ;
			System.out.print(" 달을 입력하세요 : ");
			int month = sc.nextInt() ;
			
	 		if(1 < month || month > 12) result = "잘못된 입력" ;
	 		else if (3 <= month && month <= 5 ) result = "봄" ;
	 		else if (6 <= month && month <= 8 ) result = "여름" ;
	 		else if (9 <= month && month <= 11 ) result = "가을" ;
	 		else  result = "겨울" ;
	 		
	 		System.out.println(result + "입니다.");
	}
	
	/**
	 *  생각하는 순서를 바꿈 + 코드 효율 생각(잘못된 메서드를 중간에 종료)
	 */
	public void method3b () {
			
			String result ;
			System.out.print(" 달을 입력하세요 : ");
			int month = sc.nextInt() ;
			
	 		if(1 < month || month > 12) {System.out.println("잘못된 입력");
	 		return ;}
	 		
	 		if (3 <= month && month <= 5 ) result = "봄" ;
	 		else if (6 <= month && month <= 8 ) result = "여름" ;
	 		else if (9 <= month && month <= 11 ) result = "가을" ;
	 		else  result = "겨울" ;
	 		
	 		System.out.println(result + "입니다.");
	}
	
	public void method3c () {
		String result ;
		System.out.print(" 달을 입력하세요 : ");
		int month = sc.nextInt() ;
		
		switch(month) {
		// case 3 : case 4 : case 5 : result = "봄" ; break ;
		case 3, 4, 5 	: result = "봄" ; break ;
		case 6, 7, 8 	: result = "여름" ; break ;
		case 9, 10, 11 	: result = "가을" ; break ;
		case 1, 2, 12 	: result = "겨울" ; break ;
		default 		: result = "잘못입력" ;
		
		}
		System.out.print(result);
	}
	
	/**
	 * P/F 판별하기
	 * <pre>	
	 * 	중간고사, 기말고사, 과제점수를 입력 받아
	 * 	총점 60점 이상일 경우 pass, 아니면 fail
	 *  총점 산출 방법
	 * 	- 중간고사 (40%)
	 * 	- 기말고사 (50%)
	 * 	- 과제	   (10%)
	 *  - 각각 100점 만점
	 *  
	 *  + pass인 경우
	 *  90점 이상 : A
	 *  80점 이상 : B
	 *  70점 이상 : C
	 *  60점 이상 : D
	 * </pre>	
	 */
	
	public void method4 () {
		
		// 중간고사
		System.out.println("중간고사 점수를 입력하세요");
		int midTest = sc.nextInt();
		
		// 점수 입력 범위 제한하기
		while (midTest < 0 || midTest > 100) {
		    System.out.println("올바른 중간고사 점수를 입력하세요");
		    midTest = sc.nextInt(); }
		
		// 기말고사
		System.out.println("기말고사 점수를 입력하세요");
		int lastTest = sc.nextInt();
		
		while (lastTest < 0 || lastTest > 100) {
		    System.out.println("올바른 기말고사 점수를 입력하세요");
		    lastTest = sc.nextInt(); }
		
		// 과제
		System.out.println("과제 점수를 입력하세요");
		int workTest = sc.nextInt();
		
		while (workTest < 0 || workTest > 100) {
		    System.out.println("올바른 과제 점수를 입력하세요");
		    workTest = sc.nextInt(); }
			
		// 각 점수 비율에 맞게 계산
		double total = (midTest * 0.4) + (lastTest * 0.5) + (workTest * 0.1);
		
		// PASS/FAIL 여부 계산
		String result = "";
		
		// 변수에 아무런 값도 대입되지 않은 경우 사용 불가능(에러)
		// 해결 1) 모든 경우에 변수에 값을 대입
		// 해결 2) 변수 선언 시 특정한 값으로 초기화 진행
		//			-> 숫자 : 0, String : null, boolean : false
		// 			   이외의 객체는 null
		
		if (total>= 60) {result = "PASS";}
		else 			{result = "FAIL";} 
		
		// grade 계산
		String grade = "";
		
		if(total >= 90) 	 {grade = "A";}
		else if(total >= 80) {grade = "B";}
		else if(total >= 70) {grade = "C";}
		else if(total >= 60) {grade = "D";}
		else 				 {grade = "F";}
		
		// switch 문으로 만들기
		// switch문 매개변수로는 정수, 문자열, 문자만 가능
		if(total >= 60) {
			switch( (int)(total / 10) ) {
			case 9 : result = "A"; break;
			case 8 : result = "B"; break;
			case 7 : result = "C"; break;
			case 6 : result = "D"; break;
			
			}
		}
		
		System.out.println("중간고사 : " + midTest + "점, 기말고사 : " + lastTest + "점, 과제 : " + workTest + "점");
		System.out.println("결과 : " + result + ", 점수 합계 : " + total + "점, 등급 : " + grade);
		
	}

	
	/**
	 *  국 영 수 사 과 점수 입력 받아
	 *  과락 40점 미만 FAIL
	 *  평균 60점 미만 FAIL
	 *  
	 *  과락 없고 평균 60 이상 인 경우 PASS
	 *  
	 *  [출력 예시]
	 *  
	 *  1) 40점 미만 과목이 존재하는 경우 : 
	 *  FAIL [40점 미만 과목 : 해당 과목 표시]
	 *  
	 *  2) 평균 60점 미만인 경우
	 *  FAIL [평균 점수 : 50.4 (평균 미달)]
	 *  
	 *  3) PASS인 경우
	 *  PASS [ 평균 점수 : 83.4 / 100 ]
	 *  
	 */
	public void method5() {
		System.out.print("국어 점수를 입력하세요 :");
		int kor = sc.nextInt();
		
		// 점수 입력 범위 제한하기
		while (kor < 0 || kor > 100) {
		    System.out.print("올바른 점수를 입력하세요 :");
		    kor = sc.nextInt(); }
		
		System.out.print("영어 점수를 입력하세요 :");
		int eng = sc.nextInt();
		
		while (eng < 0 || eng > 100) {
		    System.out.print("올바른 점수를 입력하세요 :");
		    eng = sc.nextInt(); }
				
		System.out.print("수학 점수를 입력하세요 :");
		int math = sc.nextInt();

		while (math < 0 || math > 100) {
		    System.out.print("올바른 점수를 입력하세요 :");
		    math = sc.nextInt(); }		
				
		System.out.print("사회 탐구 점수를 입력하세요 :");
		int sociology = sc.nextInt();

		while (sociology < 0 || sociology > 100) {
		    System.out.print("올바른 점수를 입력하세요 :");
		    sociology = sc.nextInt(); }
				
		System.out.print("과학 탐구 점수를 입력하세요 :");
		int sci = sc.nextInt();

		while (sci < 0 || sci > 100) {
		    System.out.print("올바른 점수를 입력하세요 :");
		    sci = sc.nextInt(); }
		
		
		
		// 40점 미만 과목이 존재하는 경우
		boolean failedSubject = false; 
		
		// 평균점수 선언 및 초기화
		double avr = (kor + eng + math + sociology + sci) / 5.0 ;
		
		switch(0) {
		case 0 :
			if(kor 		 < 40 ) 
			{System.out.println("FAIL, 40점 미만 과목 : 국어 ");failedSubject = true;} 
		case 1 :
			if(eng 		 < 40 ) 
			{System.out.println("FAIL, 40점 미만 과목 : 영어 "); failedSubject = true; }
		case 2 :	
			if(math 	 < 40 ) 
			{System.out.println("FAIL, 40점 미만 과목 : 수학 "); failedSubject = true;}
		case 3 :	
			if(sociology < 40 ) 
			{System.out.println("FAIL, 40점 미만 과목 : 사회 "); failedSubject = true;}
		case 4 :	
			if(sci 		 < 40 ) 
			{System.out.println("FAIL, 40점 미만 과목 : 과학 "); failedSubject = true;}
			break;
		default : break;
		}
		
			// 평균점수에 따른 Pass/Fail 여부 결정하기
		
			if(!failedSubject && avr >= 60 ) {
				System.out.println("PASS, 평균 점수 : " + avr );
			} else {System.out.println("FAIL, 평균 점수 : " + avr);}
			
	
		
		
	}
	
	
	// 강사님 방법
	
	public void method6() {
		System.out.print("점수 입력(국어 영어 수학 사회 과학) : ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		int soc = sc.nextInt();
		int sci = sc.nextInt();
		
		boolean flag = false;
		String result = "";
		
		// if 문은 T,F 결과 관계 없이 계속 수행한다. if-else 문과 차이
		if(kor < 40) { result += "국어 "; flag = true; }
		if(eng < 40) { result += "영어 "; flag = true; }
		if(mat < 40) { result += "수학 "; flag = true; }
		if(soc < 40) { result += "사회 "; flag = true; }
		if(sci < 40) { result += "과학 "; flag = true; }
		
		if(flag) {
			System.out.printf("FAIL [40점 미만 과목 : %s] \n", result);
			return;
		}
		
		int sum = kor + mat + eng + soc + sci;
		double avg = sum / 5.0;
		
		if(avg < 60.0) {
			System.out.printf("FAIL [점수 : %.1f (평균 미달)] \n", avg);
			return;
		}
		
		System.out.printf("PASS [점수 : %.1f / 만점 : 100] \n", avg);
	}
	
	
	
	
	
	// 점수 입력 과락 연습하기
	
	public void method7() {
		
		String checkInput = "올바른 값을 입력하세요.";
		
		System.out.print("국어 점수를 입력하세요 :");
		int kor = sc.nextInt();
		while(kor < 0 || kor > 100) { System.out.println(checkInput); 
		kor = sc.nextInt(); }
		
		System.out.print("영어 점수를 입력하세요 :");
		int eng = sc.nextInt();
		while(eng < 0 || eng > 100) {System.out.println(checkInput);
		eng = sc.nextInt();}
		
		System.out.print("수학 점수를 입력하세요 :");
		int mat = sc.nextInt();
		while(mat < 0 || mat > 100) { System.out.println(checkInput);
		mat = sc.nextInt();}
		
		System.out.print("사회 점수를 입력하세요 :");
		int soc = sc.nextInt();
		while(soc < 0 || soc > 100) { System.out.println(checkInput);
		soc = sc.nextInt();}
		
		System.out.print("과학 점수를 입력하세요 :");
		int sci = sc.nextInt();
		while(sci < 0 || sci > 100) { System.out.println(checkInput);
		sci = sc.nextInt();}
		
		// 과락 존재하는 경우
		
		String result = "";
		boolean flag = false;
		
		switch(0) {
		case 0 : if (kor < 40) { result += "국어 "; flag = true;}
		case 1 : if (eng < 40) { result += "영어 "; flag = true;}
		case 2 : if (mat < 40) { result += "수학 "; flag = true;}
		case 3 : if (soc < 40) { result += "사회 "; flag = true;}
		case 4 : if (sci < 40) { result += "과학 "; flag = true;}
		break;
		default : break;
		}
		
		if(flag) {
		System.out.printf("FAIL, 40 점 미만 과목 : %s", result );
		return;
		}
		
		// 평균 계산
		double avr = (kor + eng + mat + soc + sci) / 5.0 ;
		
		if(avr<60) {
			System.out.printf("FAIL, 평균 점수 %.1f: ", avr);
		}else {
			System.out.printf("PASS, 평균 점수 %.1f: ", avr);
		}
		
		
	}
	
	
	
}





