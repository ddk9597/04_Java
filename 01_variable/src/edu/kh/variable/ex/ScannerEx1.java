package edu.kh.variable.ex;

// import : 다른 패키지에 존재하는 클래스 가져오기
import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		/* Scanner 클래스
		 * 
		 * - 사용자로부터 입력을 받기 위해 Java에서 제공하는 클래스
		 * 
		 * - Java.util 패키지에 존재  //package : 다른 나라
		 * 	 -> import 구문 작성 필요 // import : 수입
		 * 
		 * - Scanner.next();		: 단어(String) 1개 입력.
		 * 							  공백 문자 입력 시 입력 종료.
		 * 
		 * - Scanner.nextLine();	: 문자열(String) 1개 입력
		 * 							  엔터(개행문자) 입력 시 종료
		 * 
		 * - Scanner.nextInt();  	: int형 정수 1개 입력
		 * - Scanner.nextLong(); 	: long형 정수 1개 입력
		 * - Scanner.nextDouble(); 	: 실수 1개 입력
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		// Scanner 사용하기
		
		// 1. 클래스 위에 import 하는 구문 작성
		
		// 2. import 한 Scanner 클래스를 이용해서 Scanner 객체 생성
		
		// * System.in : (이클립스) 키보드
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 1 : ");
		int num1 = sc.nextInt(); // 다음 입력된 정수를 얻어와 num1에 대입
		
		System.out.print("정수입력 2 : ");
		int num2 = sc.nextInt(); // 다음 입력된 정수를 얻어와 num2에 대입
		
		System.out.println("실수 입력 : ");
		double num3 = sc.nextDouble(); // 다음 입력된 실수를 얻어와 num3에 대입
		
		System.out.println("단어 입력(2개) : "); // 사과 바나나  
		String word1 = sc.next();
		String word2 = sc.next();
		
		// **************************************
		// - next() / nextInt() / nextDouble() 등을 작성한 이후에
		//   nextLine()을 작성해야되는 상황이 오면
		//   nextLine() 구문을 미리 한 번 작성하기
				
		sc.nextLine();
		
		// Scanner 사용 시 
		// 입력 되는 값이 Scanner의 입력 버퍼라는 곳에 저장된 후
		// nextInt() 면 버퍼에 저장된 값 중 정수만 추출
		// -> 이 때 정수와 같이 입력된 엔터가 버퍼에 남아있게된다.
		
		// 이 후 nextLine() 해석 시
		// 버퍼에서 다음 엔터까지 읽어오는 작업이수행되는데
		// 버퍼에 남아있던 엔터를 읽어오기 때문에 아무것도 입력 못함
		
		// [해결 방법]
		// nextLine()을 한번 호출 해서 남아있던 엔터를 빼버림(제거)
		
		// **************************************
		
		
		System.out.println("문장 입력 : ");
		String str = sc.nextLine();
		
		System.out.printf("%d,\t\t %d, \n %f, %s, %s, %s \\ \' \" \n", 
				num1, num2, num3, word1, word2, str);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
