package edu.kh.variable.ex;

public class PrintEx1 {

	public static void main(String[] args) {
		
		/* System.out == (이클립스 기준)console 창
		 * 
		 * System.out.print();
		 *  -> () 내의 값을 출력 (출력 후 줄 바꿈 X)
		 *  
		 * System.out.println();
		 *  -> () 내의 값을 출력 (출력 후 줄 바꿈 ㅇ) 
		 *  -> *줄 바꾸고 출력 x 출력 후 줄 바꿈
		 * 
		 * 
		 * Sysytem.out.printf("", 변수|값);
		 *  - 정해진 형식(패턴)에 맞게 문자열을 출력하는 구문
		 * 
		 *  - 첫 번째 매개변수 "" 
		 *   -- 패턴이 적용된 문자열 작성
		 *   -- 패턴 종류
		 *   
		 *   %d : 정수   		(byte, short, int, long)
		 *   %c : 문자 			(char)
		 *   %s : 문자열 		(String)
		 *   %b : 논리형 		(boolean)
		 *   %f : 실수형		(float/double)
		 *   
		 *   양수    : 오른쪽 정렬
		 *   음수(-) : 왼쪽 정렬
		 *   
		 *   %.숫자f : 소수점 아래 몇째 자리 까지 표시할 지 지정(지정된 자리 아래에서 반올림 처리)
		 *   
		 *   %숫자d  : 정수가 출력된 칸을 숫자 만큼 확보한다.
		 *   	ex) %6d  : ㅁㅁㅁㅁㅁㅁ
		 *          %-6d : ㅁㅁㅁㅁㅁㅁ
		 *          
		 *          
		 *          
		 *  - 두번째 매개변수
		 *   -- 첫번째 매개변수 문자열 중 패턴에 들어갈 변수|값을 순서대로 작성.
		 *   
		 * */
		
		
		System.out.print("이름 : " );
		System.out.print("강찬혁" );
		System.out.println("입니다." );
		System.out.println("오늘도 재밌는 자바공부");
		
		
		System.out.println(); // 줄만 바꿈
		
		// printf 사용법
		String name = "홍길동";
		int age = 30 ;
		double height = 178.35;
		char gender = '남';
		boolean JavaStudy = true;
		
		// 홍길동은 30대 남성으로 키는 178.4cm이고 자바 공부 여부 : true
		System.out.printf("%s은 %d세 %c성으로 키는 %.1fcm이고, 자바 공부 여부 : %b",
							name, age, gender, height, gender, JavaStudy);
		
		System.out.println("\n -----------------------------------------------");
		
		// 20240129 홍길동 		   10000 원 입금
		// 20240130 아파트관리비  120000 원 출금 
		// 20240131 식자재마트      3000 원 출금 
		
		// \n == 개행 문자(줄바꿈)
		System.out.printf("%8s %-6s    %7d 원  %s \n", 
							"20240129", "홍길동", 10000, "입금");
		
		System.out.printf("%8s %-6s %7d 원  %s \n", 
				"20240130", "아파트관리비", 120000, "출금");
		
		System.out.printf("%8s %-6s  %7d 원  %s \n", 
				"20240131", "식자재마트", 3000, "출금");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
