package edu.kh.variable.ex; // 패키지 지우지 말 것

public class VariabelEx1 {

	public static void main(String[] args) { //외부에서 자바 파일 실행 시 필요한 문자열 넣기
	
	// 변수 : 메모리에 값을 저장하기 위한 공간
	// 		  이 때 저장되는 값이 변할 수 있어 변수라고 한다.
	
	// 자료형(data type)
	// - 변수 또는 값의 크기와 형식
	
	/* **** 자바의 기본 자료형( Java Primitive Types) ******
	 * 
	 * [논리형]
	 *  boolean  	(1byte)		- true/false 만 저장할 수 있다.
	 *  
	 * [정수형]
	 *  byte		(1byte) 	
	 *  short		(2byte)
	 *  int			(4byte)		* 정수 기본형 *
	 *  long		(8byte)		- 숫자 뒤에 L 붙여야 한다.
	 * 
	 * [실수형]
	 *  float		(4byte)		- 숫자 뒤에 f 
	 *  double		(8byte)		* 실수 기본형 * 
	 *  
	 * [문자형]
	 * 	char		(2byte)		- 문자 하나, 문자 양 옆에 ''
	 * 
	 * */
	
	
	// 변수 선언하기 : 메모리에 공간 할당.
	boolean isTrue; // 뜻 : 메모리에 boolean(1byte) 저장 공간 할당하고 그 공간을 isTrue 라고 부르겠다.

	double number1 = 12; // 뜻 : 메모리에 double(8byte, 실수 기본형) 저장 공간 할당하고 그 공간을 number1 이라고 부르겠다.

	// 값 대입 : 변수에 값을 집어 넣는 것. 이미 값이 있는 변수에 대입하면 덮어쓰기가 된다.
	
	isTrue = false;

	System.out.println("isTrue: " + isTrue);
	System.out.println("number1: " + number1);
	
	// 변수 선언 + 초기화 + 값의 범위 확인
	int number2 = 2100000000; // 21억. 오류 안남
	long number3 = 2200000000L; // 22억. int 범위를 초과하여 오류 난다. 
								// 해결방법 : int보다 범위가 큰 자료형으로 변경.
								// 자료형을 long, 숫자 뒤에 'L' 리터럴 표기법 추가
	
	// 'L' 같은 리터럴 표기법은 컴퓨터가 자료형을 구분하기 위한 기호일 뿐 
	// 출력 시 보여지지는 않는다. 
	
	System.out.println("number2 : " + number2);
	System.out.println("number3 : " + number3);
	
	/* 다른 리터럴 표기법 확인*/
	char 	temp1 = '가';
	float 	temp2 = 1.23f;
	double 	temp3 = 3.14;
	
	System.out.println("tmep1 : " + temp1);
	System.out.println("tmep2 : " + temp2);
	System.out.println("tmep3 : " + temp3);
	
	/* String (문자열) */
	
	// - 기본 자료형이 아닌 객체
	// - String을 저장하는 변수는 객체 대신 주소를 저장(참조). 참조형 이라고 한다.
	// - 저장된 주소에 위치한 객체를 참조
	
	// - String의 리터럴 표기법은 쌍따옴표("")
	
	String str1 = "쌍따옴표가 String 리터럴 표기법";
	
	System.out.println("str1 : " + str1);
	
	// 형변환(casting)
	/* 왜 필요한가?
	 * 컴퓨터의 데이터 처리 원칙
	 * - 같은 종류 자료형만 대입 가능
	 * - 같은 종류 자료형만 계산 가능
	 * - 계산의결과도 같은 종류의 값이 나와야 함
	 *   -> 이러한 원칙이 지켜지지 않은 경우에 형변환이 필요함
	 *   
	 * 
	 * */
	
	
	
	
	}
}
