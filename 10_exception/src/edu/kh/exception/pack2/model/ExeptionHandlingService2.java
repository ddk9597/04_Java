package edu.kh.exception.pack2.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandlingService2 {

	private Scanner sc = new Scanner(System.in);
	
	
	/* finally : 마지막에 반드시 수행하는 구문
	 * 
	 * - try 구문에서 예외 발생 여부와 관계 없이 
	 * 	 무조건 수행해야 하는 구문을 작성
	 * 
	 * - 작성 방법
	 * 	 1. try ~ catch ~ finally
	 *   2. try ~ finally -> 다른 예외처리 방법이 동원되었을 때
	 * 
	 * */
	
	
	/** finally 확인하기
	 * 
	 */
	public void method1() {
		System.out.println("1. 정상수행 / 2. 강제 예외 발생 ");
		
		int input = sc.nextInt();
		
		try {
			if(input == 1) System.out.println("정상 수행");
			else		   throw new RuntimeException(); 
						   // 예외 객체 생성후 throw 로 던짐
			
		} catch(Exception e) { // 발생하는 모든 자식 예외 잡아서 처리(다형성 업캐스팅 적용)
			
			System.out.println("캐치문 수행됨");
			
		} finally {
			
			// try 예외 발생 여부 관계 없이 try종료 후 마지막에 무조건 수행
			
			System.out.println(" ******* 무조건 수행 ****** ");
		}
	}
	
	
	/** finally 사용 예시 (언제 사용하는지?)
	 * 
	 *  - Java 프로그램 - 외부 프로그램/장치 연결을 끊을 때 주로 사용
	 *  
	 *  + 연결 : Java - 외부 프로그램/장치를 연결해 주는 실 전화기
	 *   		 실 전화기는 heap 메모리에 남아 자리를 차지함
	 *   		 이 실 전화기를 정리하기 위해 finally를 사용
	 *   		
	 * 
	 */
	public void method2() {
	
		// Scanner : 외부 장치(주로 키보드)와 연결하는 객체
		Scanner scan = new Scanner(System.in);
		System.out.println(" 정수 입력 ");
		
		// Resource leak: 'scan' is never closed
		// -> 프로그램 수행 후  scan이 메모리에 남아 있어 
		// 메모리 누수(쓸데 없는 메모리 차지)발생
		
		// [해결 방법] Scanner를 close(메모리 반환)하기
		// -> 코드에서 예외가 발생 하던 말던 무조건 close 수행 필수!
		// ---> finally가 이 코드를 수행하는 부합함!
		
		
		try {
			int input = scan.nextInt();
			
			System.out.println("입력한 정수 * 10 : " + (input * 10) );
			
		} catch(InputMismatchException e) {
			System.out.println(" 잘못 입력함 ");
			
		} finally {
			if(scan != null) {
				scan.close();
			}
		}
		
	}
}
