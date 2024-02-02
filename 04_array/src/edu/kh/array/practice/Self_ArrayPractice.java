package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Self_ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	/**
	 * 문1. 길이가 9인 배열을 선언 및 할당하고
	 * 1~9를 반복문을 이용하여
	 * 순서대로 배열의 각 인덱스 요소에 대입하시오.
	 */
	public void self_practice1() {
		
		// 길이가 9인 배열 선언 및 배열 길이 할당
		int[]arr1 = new int[9];
		
		// for문을 이용하여 1~9 각 인덱스에 순차적으로 대입
		for(int i = 0 ; i <= arr1.length-1 ; i ++) {
			arr1[i] = i + 1 ;
			
		}
		System.out.println(Arrays.toString(arr1));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
