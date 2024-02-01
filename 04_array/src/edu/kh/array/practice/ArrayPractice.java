package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	
	/** 
	 * 실습문제 1
	 */
	public void practice1() {

		// 길이가 9인 배열을 선언 및 할당하고,
		int[] arr = new int[9];
		
		// 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	/** <pre>
	 * [실습문제3]
	 * 사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 
	 * 1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
	 * </pre>
	 */
	
	public void practice03() {
		System.out.print("양의 정수 : ");
		int len = sc.nextInt();
		
	//		1)     2)    3)
		int [] arr = new int[len];
		
		// 1) Stack 영역에 int[]를 참조하기 위한 참조형 변수 arr 선언
		
		// 2) Heap 영역에 입력받은 len 만큼의 길이를 가지는 int[] 생성
		// -> 주소가 할당됨
		
		// 3) 생성된 배열의 주소를 arr 변수에 대입해서 참조할 수 있는 형태로 만듦
		
		// len == arr.length
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = i + 1;
			System.out.println(arr[i] + " ");
		}
				
	}
	
	/** <pre>
	 * [실습문제4]
	 * 정수 5개를 입력 받아 배열을 초기화 하고 
	 * 검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	 * 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	 * </pre>
	 */
	public void practice4() {
		
		int[] arr = new int[5];
		
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.printf("입력 %d :", i);
			arr[i] = sc.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int searchValue = sc.nextInt();
		
		// 배열 검색
		for(int i=0 ; i < arr.length ; i ++) {
			
			// i 번째 인덱스 요소의 값이  serchValue와 같은 경우
			if(arr[i] == searchValue) {
				System.out.println("인덱스 : " + i);
				return;
				
			}
		}
		// 검색할 값이 배열 내에 존재하지 않는다
		// == for 문 수행 중 return 구문이 수행되지 않음
		// -> for문 다음 코드가 수행된다.
		System.out.println("일치하는 값이 존재하지 않습니다.");
	}
	
	/**
	 * 실습 문제 5
	 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	 * 배열의 크기만큼 사용자가 직접 값을 입려학여
	 * 각각의 인덱스 값을 초기화 하시오.
	 * 그리고 배열 전체 값을 나열하고 
	 * 각 인덱스에 저장된 값들의 합을 출력하세요.
	 */
	public void practice5() {
		System.out.print("정수 : ");
		int len = sc.nextInt();
		
		int [] arr = new int[len]; // len 만큼의 인덱스 가진 배열 선언
		
		for(int i = 0 ; i < arr.length ; i ++) { // 배열 요소 순차 접근
			System.out.printf("배열 %d 번째 인덱스에 넣을 값 : " , i);
			arr[i] = sc.nextInt()	;
		}
		
		int sum = 0 ; // 합계 누적용 변수 
					  // 선언 후 사용하기 전에 초기화 필수!!
		
		
		// 배열 요소 하나씩 출력
		for(int i=0; i < arr.length ; i ++) {
			System.out.println(arr[i] + " ");
			
			sum += arr[i]; // sum = sum + arr[i];
			
		}
		
		System.out.println("\n 총 합 :" + sum);
	}
	
	
	/**
	 * 주민등록번호를 입력 받아 char 배열에 저장 후 출력하세요
	 * 단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요
	 */
	public void practice6() {
		
		// 주민등록 번호 저장할 char 배열 생성
		char[] arr = new char[14]; // 주민번호 14자리
		
		System.out.println(" 주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
//		문자열.length() : 문자열의 길이를 반환하는 메서드
//		배열.length : 배열 길이 반환하는 필드
		
//		int len = input.length();
//		효율적인 게산을 위해 길이 변수 따로 저장함
		for(int i=0, len = input.length(); i < len ; i ++) {
			
			// 성별 부분 전 까지는 그대로 배열에 대입
			if(i < 8) arr[i] = input.charAt(i);
			
			// 성별 부분 넘어가면 모두 * 대입
			else arr[i] = '*';
			
		}
		
		for(int i = 0 ; i < arr.length ; i ++) {
			System.out.print(arr[i]);
		}
	}
	
	
	/** <pre>
	 * [실습문제7]
	 * 3이상인 홀수를 입력 받아 배열의 중간까지는 
	 * 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 
	 * 출력하세요.
	 * 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 
	 * “다시 입력하세요”를 출력하고 다시 정수를 받도록 하세요. 
	 * </pre>
	 */
	public void practice7() {
		
		// while문으로 조건에 맞는 수가 입력 될 때 까지 반복
		// + break
		
		// 배열 요소에 대입되는 숫자는 count 값을 ++, -- 를 이용해 제어
		
		int len = 0;
		
		while(true) { // 무한 루프
									// 3 이상의 홀수가 입력될 때 까지 무한 반복
			
			System.out.print("3이상 홀수인 정수 : ");
			len = sc.nextInt();
			
			// 입력 받은 정수가 3 이상의 홀수인 경우 반복 종료
			if(len >= 3  && len % 2 == 1) {
				break;
			}
			
			// if문 수행 X == 3 이상이 아니거나 짝수인 경우
			System.out.println("다시 입력하세요.");
		}
		
		
		// 입력 받은 정수 크기 만큼의 배열 선언, 할당
		int[] arr = new int[len];
		
		int count = 0; // arr 배열 요소에 대입될 수
		
		for(int i=0 ; i<len ; i++) {
			// 배열 길이 절반 이하인 경우 증가, 이후인 경우 감소
			if(i <= len / 2) 	count++;
			else						 	count--;
			
			arr[i] = count; // count 값 배열 요소에 대입
		}
		
		// Arrays.toString(배열명) 
		// - 배열 내 요소를 "[1,2,3]" 형식의 문자열로 만들어 반환
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	/**<pre>
	 * [실습문제8]
	 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
	 * </pre>
	 */
	public void practice8() {
		
		int[] randoms = new int[10];
		
		String str = ""; // 빈 문자열
		
		for(int i=0 ; i<randoms.length ; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
		}
		
		System.out.println("발생한 난수 : " + str);
		
	}
	
	
	
	/**<pre>
	 * [실습문제9]
	 * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	 * 1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
	 * + 최대값/최소값 구하기
	 * </pre>
	 */
	public void practice9() {
		
		int[] randoms = new int[10];
		
		String str = ""; // 빈 문자열
		
		int max = 0; // 최대값 저장용 변수
		int min = 0; // 최소값 저장할 변수
		
		for(int i=0 ; i<randoms.length ; i++) {
			
			randoms[i] = (int)(Math.random() * 10 + 1);
			str += randoms[i] + " ";
			
			if(i == 0) { // 첫 반복인 경우 -> 첫 번째 난수를 비교 기준으로 삼음
				max = randoms[i];
				min = randoms[i];
				continue; // 다음 반복으로 이동
			}
			// 첫 반복이 아닌 경우
			
			if(randoms[i] > max) max = randoms[i];
			if(randoms[i] > min) max = randoms[i];
			
			
		}
		
		System.out.println("발생한 난수 : " + str);
		System.out.println(" 최대값 : " + max);
		System.out.println(" 최소값 : " + min);
		
	}
	
// 	실습문제 10
//	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
//	중복된 값이 없이!!
	
	
	public static void practice10() {
		
		int[] randoms = new int[10]	;
		String str = "" ;// 빈 문자열
		
		// 난수 생성용 for 문 + 중복제거
		for(int i=0 ; i<randoms.length ; i++) {
			randoms[i] = (int)(Math.random() * 10 + 1);
			
			// ** 중복검사 방법 **
			// 현재 인덱스에 대입된 난수와 같은 값이 
			// 앞 인덱스에 존재하면
			// 다시현재 인덱스에 새로운 난수를 생성해서 대입한다
			// 중복이 없을 때 까지 계속해서 반복
			
			// 현재 인덱스 앞쪽 까지만 순차 접근하는 for문
			for(int x = 0 ; x < i ; x ++) {
				
				// 현재 인덱스에 저장된 값과(지금 발생한 난수와)
				// 앞쪽 인덱스에 저장된 값(이전에 발생한 난수가)
				// 같을 경우 "중복"으로 판단한다!!
				if(randoms[i] == randoms[x]) {
					i -- ; // 바깥 for문의 i값 증가를 막아서 
						   // 현재 index 번째 요소에 다시 새로운 난수를 대입하게 함
					
					break; // 중복을 발견했으니 추가적인 검사는 필요 없음
				
					
				}
				
			}
			
		}
		
		
		
		// 출력 구문 만들기용 for문
		for(int i=0 ; i<randoms.length ; i++) {
			str += randoms[i] + " ";
		}
		
		System.out.println("발생한 난수 : " + str);
		
	}
		
		// 로또번호 만들기
		// 1 ~ 45 
		// 오름차순 
		// 중복 없는 숫자
		
		public void practice11() {
			
			// 1. 크기가 6인 정수형 배열
			int[] lotto = new int[6];
			
			// 2. 1 ~ 45 사이 중복 없는 난수로 lotto 배열 요소 초기화
			for(int i = 0 ; i<lotto.length ; i++ ) {
				
				lotto[i] = (int)(Math.random() * 45 + 1);
				
				for(int x=0 ; x < i ; x ++) {
					if(lotto[i] == lotto[x]) {
						i -- ;
						break;
					}
					
				}
			}
			
			// 3. 오름차순 정렬
			for(int i = 0; i < lotto.length -1 ; i ++) { // 칸 지정(비교 주체)
				
				for(int x = i+1 ; x < lotto.length ; x ++) {// 비교 대상
					
					// 주체 > 대상 : 오름차순
					// 주체 < 대상 : 내림차순
					
					if(lotto[i] > lotto[x]) { // 주체가 대상보다 크면 교체(swap)
											  // 부등호 방향으로 오름차순, 내림차순 정렬 가능
						
						int temp = lotto[i];
						
						lotto[i] = lotto[x] ;
						lotto[x] = temp ;
						
					}
					
				}
				
			}
			
//			3. 오름차순 다른 방법
//			자바에서 만들어서 제공해주는 배열 오름차순 정렬 기능
			Arrays.sort(lotto);
			
			
			
			// 결과 출력
			System.out.println(Arrays.toString(lotto));
			
			
		}
		
		
	
		
		
		
		
		
		
		
		
	} // 문서 전체 감싸는 }
	
	
	


	
	
	
	
