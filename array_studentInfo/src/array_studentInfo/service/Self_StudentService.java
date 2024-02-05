package array_studentInfo.service;

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
		
		
	}
	
}
