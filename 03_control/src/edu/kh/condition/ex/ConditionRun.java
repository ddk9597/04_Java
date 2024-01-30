package edu.kh.condition.ex; 

// 같은 패키지에 존재하는 클래스는 import 안해도 된다.

/**
 *  조건문 실행용 클래스
 */
public class ConditionRun {
	public static void main(String [] args) {
		ConditionEx ex = new ConditionEx() ;
		
		// ex.method1();
//		ex.method2();
//		ex.method3();
//		ex.method3a();
//		ex.method3b();
//		ex.method3c();
//		ex.method4();
//		ex.method5();
//		ex.method6();
		ex.method7();
	}
}
//
///**
// *  국 영 수 사 과 점수 입력 받아
// *  과락 40점 미만 FAIL
// *  평균 60점 미만 FAIL
// *  
// *  과락 없고 평균 60 이상 인 경우 PASS
// *  
// *  [출력 예시]
// *  
// *  1) 40점 미만 과목이 존재하는 경우 : 
// *  FAIL [40점 미만 과목 : 해당 과목 표시]
// *  
// *  2) 평균 60점 미만인 경우
// *  FAIL [평균 점수 : 50.4 (평균 미달)]
// *  
// *  3) PASS인 경우
// *  PASS [ 평균 점수 : 83.4 / 100 ]
// *  
// */
//public void method5() {
//	System.out.print("국어 점수를 입력하세요 :");
//	int kor = sc.nextInt();
//	
//	// 점수 입력 범위 제한하기
//	while (kor < 0 || kor > 100) {
//	    System.out.print("올바른 점수를 입력하세요 :");
//	    kor = sc.nextInt(); }
//	
//	System.out.print("영어 점수를 입력하세요 :");
//	int eng = sc.nextInt();
//	
//	while (eng < 0 || eng > 100) {
//	    System.out.print("올바른 점수를 입력하세요 :");
//	    eng = sc.nextInt(); }
//			
//	System.out.print("수학 점수를 입력하세요 :");
//	int math = sc.nextInt();
//
//	while (math < 0 || math > 100) {
//	    System.out.print("올바른 점수를 입력하세요 :");
//	    math = sc.nextInt(); }		
//			
//	System.out.print("사회 탐구 점수를 입력하세요 :");
//	int sociology = sc.nextInt();
//
//	while (sociology < 0 || sociology > 100) {
//	    System.out.print("올바른 점수를 입력하세요 :");
//	    sociology = sc.nextInt(); }
//			
//	System.out.print("과학 탐구 점수를 입력하세요 :");
//	int sci = sc.nextInt();
//
//	while (sci < 0 || sci > 100) {
//	    System.out.print("올바른 점수를 입력하세요 :");
//	    sci = sc.nextInt(); }
//	
//	
//	
//	// 40점 미만 과목이 존재하는 경우
//	boolean failedSubject = false; 
//	
//	// 평균점수 선언 및 초기화
//	double avr = (kor + eng + math + sociology + sci) / 5.0 ;
//	
//	switch(0) {
//	case 0 :
//		if(kor 		 < 40 ) 
//		{System.out.println("FAIL, 40점 미만 과목 : 국어 ");failedSubject = true;} 
//	case 1 :
//		if(eng 		 < 40 ) 
//		{System.out.println("FAIL, 40점 미만 과목 : 영어 "); failedSubject = true; }
//	case 2 :	
//		if(math 	 < 40 ) 
//		{System.out.println("FAIL, 40점 미만 과목 : 수학 "); failedSubject = true;}
//	case 3 :	
//		if(sociology < 40 ) 
//		{System.out.println("FAIL, 40점 미만 과목 : 사회 "); failedSubject = true;}
//	case 4 :	
//		if(sci 		 < 40 ) 
//		{System.out.println("FAIL, 40점 미만 과목 : 과학 "); failedSubject = true;}
//		break;
//	default : break;
//	}
//	
//		// 평균점수에 따른 Pass/Fail 여부 결정하기
//	
//		if(!failedSubject && avr >= 60 ) {
//			System.out.println("PASS, 평균 점수 : " + avr );
//		} else {System.out.println("FAIL, 평균 점수 : " + avr);}
//		
//
//	
//	
//}

