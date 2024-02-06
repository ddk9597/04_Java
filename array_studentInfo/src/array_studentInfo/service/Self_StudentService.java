package array_studentInfo.service;

import java.util.Random;

import array_studentInfo.dto.Self_Student;

// 기능 제공 클래스. 입력 출력 제외 나머지 기능 구현
// -> 로직(if, for 등)을 잉요한 데이터 가공 및 저장
public class Self_StudentService {
	
	// 학생 모음 배열 (studentList)추가
	private Self_Student[] studentList = new Self_Student[10];
	
	// 기본 생성자로 StudentService 생성
	public Self_StudentService() {
		// 학생 배열(studentList)에 샘플 학생 3명 추가
		// studentList[] 의 자료형 : studentList[]
		// studentList[0] 의 자료형 : student
		
		studentList[0] = new Self_Student("24001", "강찬혁", 'M');
		studentList[1] = new Self_Student("24002", "박세리", 'F');
		studentList[2] = new Self_Student("24003", "최삼식", 'M');
		
		// 난수 생성으로 샘플 학생 점수 초기화
		Random random = new Random();
		
		for(int i=0 ; i<studentList.length; i ++) {
			if(studentList[i] == null) break;
			
			// random.nextInt(101) : 0 이상 101 미만 정수형 난수 생성
			studentList[i].setHtml(random.nextInt(101));
			studentList[i].setCss(random.nextInt(101));
			studentList[i].setJs(random.nextInt(101));
			studentList[i].setJava(random.nextInt(101));
		}
	}

	public boolean addStudent(Self_Student self_Student) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
