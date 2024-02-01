package edu.kh.oop.basic;

// 클래스 : 객체가 가져야 할 속성(값), 기능(메서드)를 
// 			글(코드)로 작성해둔 문서(설계도)
// 			== 객체를 정의한 것




/**
 *  국민 객체를 만들기 위한 클래스
 */

public class Nation {
	
	// *** 속성(값)을 기록할 수 있는 공간 = 변수 ***
	
	String	 name; 		// 이름
	int 	 age;		// 나이
	char	 gender; 	// 성별
	String 	 idNum;		// 주민번호
	String   tel;		// 전화번호
	String	 address; 	// 주소
	
	//  *** 기능 ***
	
	public void speakKorean() {
		
		System.out.println("기-힇 한국어 가능");{
			
		}
	}
		
	public void welfare() {
		
		System.out.println("제공하는 복지를 누릴 수 있음");{
			
		}
		
	}
	
	public void 납세의무() {
		
		// 만 19세 이상 성인만 세금을 내는 경우
		
		
		
		if(age>=19) {
			System.out.printf("%s님은 세금 납부 대상자 입니다 \n", name);
		}else {
			System.out.printf("%s님은 %d세 미성년자로 납부 대상자가 아닙니다. \n", name, age);
		}
		
		
	}
	
	public void introduce() {
	
		System.out.printf("이름은 %s 이고, %d세 %c성 입니다\n", name, age, gender);
	}
	
	
}
	


