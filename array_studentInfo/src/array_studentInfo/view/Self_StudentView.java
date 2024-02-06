package array_studentInfo.view;

import java.util.Scanner;

import array_studentInfo.dto.Self_Student;
import array_studentInfo.service.Self_StudentService;

// 입력, 출력을 담당하는 클래스(객체의 속성, 기능 정의)
public class Self_StudentView {

	// 필드(객체의 속성, 멤버변수)
	
	// static 있는 필드 == 클래스 변수
	// static 없는 필드 == 멤버(인스턴스) 변수
	
	private Scanner sc = new Scanner(System.in); 
	// Scanner. import 필요한 클래스 중 하나로 System.in을 통해 입력한 데이터를 읽어옴
	
	private Self_StudentService service = new Self_StudentService();
	// 사용자 직접 지정한 클래스. 여기서는 Self_StudentService 의 기능 import 하는데 사용
	
	/**
	 *  메뉴 표시 기능
	 */
	public void displayMenu() {
		
		int menu = 0; // 메뉴 번호 입력 받을 변수 선언 및 초기화
		
		do { // do while문으로 무조건 한번 출력하게 함
			System.out.println("\n----- 학생 관리 프로그램 -----");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 1명 정보 조회(인덱스)");
			System.out.println("4. 학생 이름으로 조회"); // 동명이인 X
			System.out.println("5. 학생 정보 수정(인덱스)");
			
			System.out.println("6. 학생 1명 점수 조회(점수, 합계, 평균)");
			System.out.println("7. 평균 최고점, 최저점 학생");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt(); // 입력 받은 숫자를 menu로 대입
			
			// 입력 받는 숫자(menu)에 따라 switch 문 실행
			switch(menu) { // 각 기능 실행 후 break 로 반복문 강제 종료
			case 1 : addStudent(); break; 
			case 2 : break;
			case 3 : break;
			case 4 : break;
			case 5 : break;
			case 6 : break;
			case 7 : break;
			case 0 : System.out.println(" 프로그램 종료 "); break;
			default : System.out.println("잘못 입력");
			}
			
			
		} while (menu != 0);
	} 
	
	// case 1 기능
	
	/** 학생 추가 화면
	 *  학번, 이름, 성별을 입력 받아
	 *  Self_StudentService의 studentList 배열에 추가
	 */
	private void addStudent() {
		System.out.println("\n --------- Add Student List --------");
		
		// 학생 입력 받기
		System.out.print("학번 : ");
		String studentNumber = sc.next();
		
		System.out.print("이름 :");
		String studentName = sc.next();
		
		System.out.print("성별 : ");
		// 성별 : 1글자 char 데이터 타입
		// charAt(n) -> 문자열의 n번째 글자 가져와 대입한다(0부터 시작함, 띄어쓰기도(공백) 센다)
		char gender = sc.next().toUpperCase().charAt(0);
		
		// Self_StudentService에서 학생 추가 기능(메서드) 호출후 결과 반환 받기
		boolean result = service.addStudent(new Self_Student(studentNumber, studentName, gender));
		
		if(result) {
			System.out.println(studentName + "학생이 추가 되었습니다");
		}
	}
	
	
	
	
	
	
	
	// case 2 기능
	// case 3 기능
	// case 4 기능
	// case 5 기능
	// case 6 기능
	// case 7 기능
	
}
