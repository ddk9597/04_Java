package edu.kh.oop.method;

import java.util.Scanner;

// 기능 제공 클래스

public class StudentService {
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * 메인 메뉴 화면
	 */
	public void displayMenu() {
		
		int input = 0; // scanner로 입력받은 메뉴 번호 저장할 변수
		
		// 학생 객체를 참조할 참조형 변수
		Student std1 = new Student("홍길동", "111234", '남');
		Student std2 = null;
		
		// do{}while() 최소 1회 이상 반복함
		do {
			// """ """ : 여러 줄에 걸친 텍스트 반환
			System.out.println("""

===== 학생 관리 프로그램 =====

1. 학생 등록 
2. 학생 정보 확인
3. 학생 이름 수정
4. Java 공부하기
5. HTML 공부하기
6. Java 역량 비교하기
7. HTML 역량 비교하기
0. 프로그램 종료
				
			""");
			
			System.out.println(" 메뉴 선택 >>");
			input = sc.nextInt();
			
			switch(input) {
			
			// 학생 정보 등록
			case 1: 
				
				System.out.println("학생을 등록할 변수 선택(1 : std1 / 2 : std2)");
				int select = sc.nextInt();
				if(select == 1) std1 = createStudent();
				else			std2 = createStudent();
				break;
			
			// 학생 정보 확인
			case 2: 
				
				System.out.println("정보를 조회할 학생 확인(1/2)");
				
				String text = null; // 학생 정보가 담긴 문자열을 저장할 변수
				if(sc.nextInt() ==1 ) text = studentInform(std1);
				else				  text = studentInform(std2);
				
				System.out.println(text); // 반환된 결과 출력
				
				break;
			
			// 이름 수정
			case 3: 
				System.out.println("이름을 수정할 학생 선택(1/2)");
				
				if(sc.nextInt()==1) updateStudentName(std1);
				else updateStudentName(std2);
				
				break;
				
				
			// 자바 역량 수정
			case 4: 
				System.out.println("자바 역량 수정할 학생 선택(1/2)");
				
				if(sc.nextInt() ==1 ) updateJava(std1);
				else 				  updateJava(std2);
				
				break;
			
			// html 역량 수정
			case 5: 
				System.out.println("HTML 역량 수정할 학생 선택(1/2)");
				
				if(sc.nextInt() ==1 ) updateHTML(std1);
				else updateHTML(std1);
				
				break;
				
			// Java 점수 비교	
			case 6: 
				
				String result = compareJava(std1, std2);
				System.out.println(result);
				
				break;
			
			// Html 점수 비교
			case 7: 
			
				String result1 = compareHtml(std1, std2);
				System.out.println(result1);
			
				break;
				
			// 프로그램 종료
			case 0: System.out.println("===== 프로그램 종료 ====="); break;
			default : 
			}
			
		}while (input != 0);
		
	}
	
	/** case1 기능 
	 * 학생 정보를 입력받아 생성된 Student 객체를 반환
	 * @return 생성된 Student 객체 주소 
	 */
	private Student createStudent() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학번 : ");
		String studentNumber = sc.next();
		
		System.out.println("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		// sc.next()로 입력 받은 문자열 중 0번 인덱스 번째 문자 하나를 
		// 반환 받아 gender 변수에 저장
		
		// Student 객체를 생성한 후 그 주소를 호출한 곳으로 반환
		return new Student(name, studentNumber, gender);
	}

	/** case2
	 *  
	 *  매개변수로 전달 받은 학생 객체의 정보를
	 *  문자열로 만들어서 반환
	 *  
	 * @param s : std1 또는 std2(학생 객체 참조 주소) 
	 * @return 학생 정보가 작성된 문자열
	 */
	private String studentInform(Student s) {
		
		// String.format("패턴", 변수)
		// 패턴 모양의 문자열을 반환하는 String 메서드
		// printf는 패턴 모양의 문자열을 출력!
		
										//   java / html
		// KH 대학교 / 123123 / 남 / 홍길동 / 0   / 0
		return String.format("%s/ \n 학번 : %s \n / "
				+ "이름 : %s \n / 성별 : %c \n "
				+ "/ java등급 : %d \n / html 등급 : %d", 
				Student.schoolName, s.getStudentNumber(),s.getName(), s.getGender(), 
				 s.getJava(), s.getHtml());

		
	}
	
	/** 매개변수로 전달 받은 학생 객체의 이름 수정
	 * @param s : std1 / std2 (학생 객체 주소)
	 */
	private void updateStudentName(Student s) {
		
		System.out.println("수정할 학생 이름 : ");
		String newName = sc.next();
		
		String beforeName = s.getName(); // 이전 이름
		s.setName(newName);				 // 새 이름 세팅
		
		
		// 학생 이름이 수정되었습니다.
		// 홍길동 -> 홍길길
		System.out.println(" 학생 이름이 수정되었습니다");
		System.out.printf(" %s -> %s \n", beforeName, newName);
	}
	
	
	
	/** Java 역량이 얼마나 증가 또는 감소했는지 정수로 입력 받고
	 * 학생의 Java 역량을 수정
	 * 단, 수정된 Java 역량은 최댓값(100), 최소값(0) 범위를 넘어가지 못하게 한다.
	 * 
	 * ex) Java 역량이 120 -> 100 으로 표시
	 * ex) Java 역량이 -30 -> 0 으로 표시
	 * 
	 * @param s : std1 또는 std2 (학생 객체 주소)
	 */
	private void updateJava(Student s) {
		
		System.out.println("Java 역량 변동값 정수로 입력");
		int before = s.getJava();
		int input = sc.nextInt();
		
		s.setJava(s.getJava() + input); // 입력받은 점수 이전 점수에 증감시키기
		
		if(s.getJava() > Student.MAX_VALUE) s.setJava(Student.MAX_VALUE); 
		
		if(s.getJava() < Student.MIN_VALUE) s.setJava(Student.MIN_VALUE); 
		
		
		System.out.println("Java 역량 수정 완료");
		System.out.printf("%d -> %d (%d)\n", before, s.getJava(), input);
		
		// [결과출력 예시]
		// Java 역량 수정 완료
		// 70 -> 80 (10)
		
		// [결과출력 예시]
		// Java 역량 수정 완료
		// 70 -> 30 (-40)
		
		// [결과출력 예시]
		// Java 역량 수정 완료
		// 50 -> 100 (100) // 최대 값 범위 초과 x, 
		
		// 늘어난 역량은 그대로 출력하되 최대, 최소값만 제한
		
	}
	
	
	
	
	/** HTML 역량이 얼마나 증가 또는 감소했는지 정수로 입력 받고
	 * 학생의 Java 역량을 수정
	 * @param s
	 */
	private void updateHTML(Student u) {
		
		System.out.println("HTML 변동 값 정수로 입력");
		int before = u.getHtml();
		int input = sc.nextInt();
		
		u.setHtml(u.getHtml() + input);
		if(u.getHtml() > Student.MAX_VALUE) {u.setHtml(Student.MAX_VALUE);}
		if(u.getHtml() < Student.MIN_VALUE) {u.setHtml(Student.MIN_VALUE);}
		
		System.out.println("Html 역량 수정 완료");
		System.out.printf("%d -> %d (%d)\n", before, u.getHtml(), input);
		
	}
	
	/** 매개 변수로 전달 받은 두 Student의 Java 점수 비교
	 * @param s1 
	 * @param s2
	 * @return 결과 문자열
	 */
	private String compareJava(Student s1, Student s2) {
		
		// 전달 받은 s1이 참조하는 Student 객체가 없을 경우
		if(s1 == null) {
			System.out.println();
			return "첫 번째 학생이 등록되지 않았습니다." ;
		}
		
		if(s2 == null) {
			System.out.println();
			return "두 번째 학생이 등록되지 않았습니다." ;
		}
		
		String result = String.format("%s : %d / %s : %d \n",s1.getName(), s1.getJava(), 
				s2.getName(), s2.getJava());
		
		// 두 학생의 점수 비교
		if(s1.getJava() > s2.getJava() ) {
			return result + s1.getName() + " 의 점수가 더 높습니다" ;
		}
		
		if(s1.getJava() < s2.getJava()) {
			return result + s2.getName() + "의 점수가 더 높습니다" ;
		}
		
		else return result + "점수가 같습니다";
		
		
	}
	
	private String compareHtml(Student s1, Student s2) {
		
		if(s1 == null) {
			System.out.println();
			return "첫번째 학생이 없어요";
		}
		
		if(s2 == null) {
			System.out.println();
			return "두번째 학생이 없어요";
		}
		
		String result1 = String.format("%s : %d / %s : %d \n", s1.getName(), s1.getHtml()
															, s2.getName(), s2.getHtml());
		
		if(s1.getHtml() > s2.getHtml() ) {
			return result1 + s1.getName() + "의 점수가 더 높습니다" ;
		}
		
		if(s1.getHtml() < s2.getHtml() ) {
			return result1 + s2.getName() + "의 점수가 더 높습니다" ;
		}
		
		else return result1 + "점수가 같습니다";
		
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
