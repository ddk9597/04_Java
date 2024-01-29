package edu.kh.variable.ex;

public class VariableEx2 {
	
	
	public static void main(String[] args) { // 메인 메서드 프로그램 실행
		
		/* *** 컴퓨터의 값 처리 원칙 **
		 * 
		 * - 같은 자료형끼리 연산, 결과도 같은 자료형이 나와야 한다.
		 * 
		 * 
		 * ** 형변환 **
		 * 
		 * - 다른 자료형 끼리 연산하는 경우 자료형을 맞게 변환
		 * 
		 * **** 자동 형변환 ****
		 * 
		 * - 연산 시 값의 범위가 작은 자료형을 값의 범위가 큰 자료형으로 변환
		 * 
		 * */

		// 자동형변환 확인 1
		
	int 	num1 = 9;			 // 9
	long 	num2 = 10_000_000_000L; // 1백억
		
	// int result1 = num1 + num2 ; // int + long 는 int가 long으로 변환되어 수행. 결과도 long 으로 산출. 
								   // 따라서 long을 int형 변수(result1)에 대입하려 해서 오류가 발생함.
	
	long result1 = num1 + num2 ;
	
	System.out.println("result1 : " + result1);
	
	// 자동형변환 확인 2
	int num3 = 300;
	double num4 = 12.34; // 자동형변환 : int -> double // 합산 시 : double 300 + double 12.34 = double 312.34 
	double result2 = num3 + num4;
	
	System.out.println("resutl2 : " + result2);
	
	// 자동 형변환 확인 3
	// 바이트 크기 가 큰 것으로 바꾸는 것이 아니라 표현할 수 있는 범위가 큰 값으로 바뀐다.
	
	long num5 = 20L ;
	float num6 = 3.14f;
	
	double result3 = num5 + num6; // 1.   long(8byte), float(4byte) 이지만 float가 표현 할 수 있는 범위가 더 큼.
								  // 2.   따라서 (long)20 -> (float)20.0f / (float)3.14f는 그대로.
								  // 3.   이 값을 double에 넣을 수 있는 이유는 double 이 표현 범위가 가장 크기 때문에 가능하다.
								  // 4.   최종적으로 2.에서 바뀌었던 자료형이 아래와 같다시 double로 바뀌게 됨
								  // 4-1. (float)20.0f -> (double)20.0 / (float)3.14f -> (double)3.14 
	
	System.out.println("result3 : " + result3); 
	// 참고 - double, float는 실수를 근사치로 표현한 자료형으로 정확하지 않음(부동소수점의 문제)
	// 은행처럼 숫자에 민감한 프로젝트에서는 double, float 자료형 쓰지 않음. 
	
	
	
	
	
	}

}
