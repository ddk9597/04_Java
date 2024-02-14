package edu.kh.exception.pack1.run;

import edu.kh.exception.pack1.model.ExceptionHandlingService1;

public class ExceptionHandlingRun1 {
	
	public static void main(String[] args) {
		
		ExceptionHandlingService1 method = new ExceptionHandlingService1();
		
		System.out.println("---------- 1번 메서드 입니다 --------");
		method.method1();
		
		System.out.println("---------- 2번 메서드 입니다 --------");
		method.method2();
		
		System.out.println("---------- 3번 메서드 입니다 --------");
		method.method3();
		
		System.out.println("---------- 4번 메서드 입니다 --------");
		method.method4();
		
		System.out.println("---------- 5번 메서드 입니다 --------");
		method.method5();
		
	}

}
