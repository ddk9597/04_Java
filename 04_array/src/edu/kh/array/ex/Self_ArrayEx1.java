package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Self_ArrayEx1 {

	// 필드 스캐너 선언
	Scanner sc = new Scanner(System.in);
	
	// Java 배열 : 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	/* 생성된 배열의 요소는 index로 구분
	 * 생성된 배열을 활용하려면 참조형 변수를 이용함
	 * 
	 * 참조형변수
	 *  - 주소를 자정하는 변수
	 *  - 변수 사용 시 주소로 찾아가 그곳의 배열, 객체를 참조한다
	 *  - 기본 자료형 8개를 제외한 나머지는 모두 참조형 변수임
	 *  
	 * */
	
	/*
	 * 배열 선언, 할당, 초기화
	 * */
	public void self_method1() {
		// 변수 선언
		int num; // stack 영역에 저장할 변수 선언
		
		// 배열 선언
		int [] arr; // stack에 int[] 자료형을 참조할 변수 생성(주소 저장)
					// 그 변수(주소)의 이름을 arr로 지정
		
		// 배열 할당
		arr = new int[4];
					// Heap 영역에 int 4개 배열 할당 후
					// 생성된 배열 주솔르 arr 변수에 대입 -> arr(주소) 이용해서 배열 참조 가능
		
		// 배열 초기화
		// 0 대입되어 있는지 확인
		System.out.println("초기화 전! :" + Arrays.toString(arr)); 
		// 0 대입되어 있음
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		
		System.out.println("초기화 후! :" + Arrays.toString(arr)); 
		// 초기화한 값 대입되어 있음
	}
	
	/**
	 * 배열 선언 동시에 초기화
	 */
	public void self_method2() {
		
		String[] subjects = {"01 Java", "02 HTML", "03 css", "04 js"};
//		subject 배열의 요소 값을 역순으로 출력하기
		for(int i = 3 ; i >= 0 ; i --){
			System.out.printf("subjects[%d] : %s \n", i, subjects[i]);
		}

		}
	
	/**
	 *  입력받은 길이 만큼의 배열을 생성한 후 
	 *  모든 인덱스 요소에 0부터 배열 길이 미만의 난수를 대입
	 *  입력받은 값으로 배열 길이
	 *  난수 대입
	 */
	public void self_method4() {
		
		// 길이 입력받기
		System.out.print("배열 길이 : ");
		int len = sc.nextInt()	;
		
		// 배열 생성 및 배열의 길이 = len으로 초기화
		int randomArr[] = new int[len];
		
		// 모든 인덱스 요소에 0부터 배열 길이 미만의 난수 대입
		for(int i = 0 ; i < randomArr.length ; i ++) {
			randomArr[i] = (int) (Math.random() * len); // int로 강제형변환
//													왜?    Math.random(); 기본형 : double
			
					
		}
		System.out.println(randomArr);
		System.out.println(Arrays.toString(randomArr));
		
		
	}
	
	
	
	
	
	
	}
	
	
	

