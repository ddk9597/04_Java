package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayEx2 {

	/**
	 * 얕은 복사 : 주소만 복사
	 * 객체의 주소값만 가져와 참조형 변수에 저장하고 
	 * 
	 */
	public void method1() {
		int[] arr1 = {100,200,300,400};
		
		int[] arr2 = arr1;
		
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
		// 서로 다른 변수를 이용해서 값 변경
		arr1[0] = 1234;
		arr2[1] = 9876;
		
		System.out.println("----------------------------------");
		
		// 얕은 복사 (같은 주소 참조) 상태이기 때문에 
		// arr1, arr2 모두 출력 시 같은 결과임
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("arr2 : " + Arrays.toString(arr2));
		
	}
	
	
	
	
	
	
	
}
