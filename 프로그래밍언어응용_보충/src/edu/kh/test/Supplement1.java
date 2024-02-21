package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/* 10회만 반복하며 
 * List에 과일 이름을 추가하고, 
 * 반복이 종료되면 List에 저장된 모든 과일을 출력하는 코드를 작성하였으나 오류 발생 및 정상 수행되지 않았다.
 * 요구사항과 소스 코드를 분석하여 원인(문제점 + 발생 원인), 조치 내용(해결 방법)을 작성하시오.
 *
 * 요구 사항
 * 1. 같은 이름의 과일이 List에 존재하지 않을 때만 추가
 * 2. 같은 이름의 과일이 존재하면 "OOO - 삭제" List에서 제거
 * 3. 10회가 반복되지 않았어도 "END" 입력 시 "입력 종료"가 출력 되면서 반복 종료
 * 
 */
public class Supplement1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<String> fruitsList = new ArrayList<String>();
		
		for(int i=1 ; i<=10 ; i++) { // i<10 -> i<=10 
			
			System.out.print(i+"번째 과일 입력 : ");
			String input = sc.next();
			if(input.equals("END") ) { // 기본 자료형은 비교 연산자 사용, 아니면.equals()
				System.out.println("입력 종료"); // + 종료조건이 추가조건보다 뒤에 있으면 추가 후 종료됨. 종료조건을 선순위로 옮겨야 한다.
				break;
			}
			
			if(!fruitsList.contains(input) ) { // 23번 줄 fruitsList = null -> new ArrayList<String>(); 으로 수정
				fruitsList.add(input); // if 문 수행 시 continue로 인해 다음 반복으로 바로 넘어가서 에러 발생 -> 둘의 순서를 바꿔라
				continue;
			}
			
			
			int index = fruitsList.indexOf(input); 
			fruitsList.remove(index);
			System.out.println(input + " - 삭제");
		}
		
		
		System.out.println("-----------------------");
		for(int i=0 ; i<fruitsList.size(); i++) { // 배열의 길이를 구하는 코드 잘못 작성 : length -> size()
			System.out.println(fruitsList.get(i) ); 	// fruitList는 배열이 아닌 collection. fruitsList.get(i) 로 수정
		}
		
	}
}
