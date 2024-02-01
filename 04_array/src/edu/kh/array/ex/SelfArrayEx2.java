package edu.kh.array.ex;

import java.util.Arrays;

public class SelfArrayEx2 {

	/**
	 *  얕은 복사 : 주소만 복사.
	 *  참조형 변수에 저장객체의 주소값만 가져와 복사함
	 */
	public void self_method1() {
		int[] arr1 = {100,200,300,400};
		int[] arr2 = arr1;
	}
	
	/**
	 * 깊은 복사 : 새 배열을 만들어 index를 복사함
	 * 값을 똑같이 복사한 배열이나 객체를 생성 하여 복제함
	 */
	public void self_method2() {
		
		int[] arr1 = {10,20,30,40};
		int[] arr2 = new int [arr1.length]; 
		int[] arr3 = new int [arr1.length]; // 길이는 복사함
		
		// 깊은 복사 방법 1 - for문 이용
		for(int i = 0 ; i == arr1.length -1 ; i ++) {
			arr2[i] = arr1[i];
		}
		
		// 깊은 복사 방법 2 - System.arraycopy(); 이용하기
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
//		System.arraycopy(원본, 원본 출발 인덱스, 복사할 대상, 붙여넣을 인덱스 위치, 붙여넣을 인덱스 길이)
		
	}
	
	
	/**
	 *  2차원 배열 : 1차원 배열 참조 변수의 묶음
	 */
	public void self_method3() {
//		2차원 배열 선언
		
//		2차원 배열 초기화
		
//		방법1. 선언과 동시에 초기화
		
		int[][] arr1 = {
				{1,2,3},
				{11,12,13},
				{21,22,23}
		};
		System.out.printf("선언과 동시에 초기화 : " + Arrays.deepToString(arr1));
		System.out.println();
		// 1차원 배열의 경우 Arrays.toStirng();으로 배열 출력 가능하나
		// 2차원 이상 배열은 Arrays.deepToStirng();으로 출력해야함.
		
		// 방법2. 배열 선언 후 index 초기화
				
		int[][]arr2 = new int [2][3] ; // 3칸짜리 1차원배열 2개 묶은 2차원 배열 
		arr2[0][0] = 10;
		arr2[0][1] = 20;
		arr2[0][2] = 30;
		
		arr2[1][0] = 100;
		arr2[1][1] = 200;
		arr2[1][2] = 300;
		
		// 2차원 배열 내 모든 요소 순차 접근 : 2중for문
		// arr1.length == 행의 개수(1차원 배열 참조 변수의 개수)
		System.out.println("순차접근으로 초기화 :");
		
		for(int row = 0; row <= arr2.length-1 ; row ++) {
			for(int col = 0 ; col <= arr2[0].length -1 ;col ++) {
				System.out.print(arr2[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
	
	
}
