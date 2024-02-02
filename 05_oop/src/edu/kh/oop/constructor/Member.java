package edu.kh.oop.constructor;


/* 오버로딩(overLoading : 과적)
 * 
 * 한 클래스 내에 동일한 이름의 메서드를 여러 개 작성하는 기법
 *  
 * 같은 이름의 메서드가 수행하는 기능은 기본적으로 같으나
 * 전달 받은 매개 변수에 따라서 조금씩 동작이 달라야 하는 경우
 * 상황별로 정의
 * 
 * 
 * - 오버로딩의 조건
 * 1) 메서드 이름은 같아야 한다
 * 2) 매개 변수는 개수, 타입, 순서가 하나라도 달라야 한다
 * 
 * 
 * 
 * 
 * */


public class Member {

	// 필드 (== 멤버변수)
	// - 클래스 변수 : static이 붙은 변수
	//	 -> static 메모리에 할당될 때 클래스.변수명으로 할당되기 때문
	
	// - 인스턴스 변수 : static이 없는 변수
	//	 -> 인스턴스(객체)가 생성될 때 heap 메모리에 할당되기 때문
	
	private String memberId;	// 아이디
	private String memberPw;	// 비밀번호
	private String memberName;  // 이름
	private int memberAge;	// 나이
	
	
	// 생성자 만들기
	// 생성자 : 객체 생성 시 필드 초기화 + 특정 기능 수행하는 일종의 메서드
	// 작성 규칙
	// 1) 반환형 없음
	// 2) 생성자 이름은 클래스 이름과 동일하게
	
	
	/**
	 * 기본생성자 
	 *  - 매개변수가 없음
	 *  - 생성자가 하나도 작성되지 않은 경우 컴파일러가 자동으로 추가 
	 */
	public Member() {
		
		System.out.println("[기본] 생성자로 Member 객체 생성됨");
		
		memberId = 	 " Id를 입력해 주세요 " ;
		memberPw = 	 " Pw를 입력해 주세요 " ;
		memberName = " 이름을 입력해 주세요 " ;
		
	}
	
	/** 매개변수 생성자 **/
	// 객체 생성시 매개변수로 전달된 값을
	// 생성된 객체의 필드에 초기화하는 용도의 생성자
	// [작성법]
	// - 생성자 작성 방식 + 매개변수
	
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		
		System.out.println("[매개변수] 생성자로 객체 생성됨");
		
		// 생성자 안의 this. == 생성되고 있는 객체
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 기능(메서드)
	// setter : 전달 받은 매개변수로 현재 객체의 필드를 초기화
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	// getter : 현재 객체를 외부에서 불러올수 있게 하는 기능
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPw() {
		return memberPw;
	}
	public String getMemberName() {
		return memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	
	
	/**
	 *  현재 객체의 필드 값을 한번에 출력
	 */
	public void inform() {
		System.out.println(" \n---------------------- ");
		System.out.println("memberId : " + memberId);
		System.out.println("memberPw : " + memberPw);
		System.out.println("memberName : " + memberName);
		System.out.println("memberAge : " + memberAge);
		System.out.println(" -----------------------\n");
	}
	
	
	
}
