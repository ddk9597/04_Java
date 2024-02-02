package edu.kh.oop.constructor;

public class MemberRun {

	public static void main(String[] args) {
		
		// 회원 객체 생성
		// 기본생성자를 이용해서 만들어라
		Member member1 = new Member();
		
		// null : 참조하는 객체가 없다
		//   (저장된 주소가 없다)
		member1.inform();
		
		// member1이 참조하는 Member 객체의 필드값을 세팅
		member1.setMemberId("member01");
		member1.setMemberPw("pass01");
		member1.setMemberName("김회원");
		member1.setMemberAge(29);
		
		// 새로운 Member객체 생성 후 필드 값 세팅
		Member member2 = new Member(); // 기본 생성자 이용
		member2.setMemberId("ddk9595");
		member2.setMemberPw("1q2w3e4r!");
		member2.setMemberName("김민철");
		member2.setMemberAge(31);
		
		System.out.println("[member1]");
		member1.inform();
		
		System.out.println("[member1]");
		member2.inform();
		
		// --------------------------------------
		// 매개 변수 생성자를 이용해서 Member 객체 생성
		// -> 코드 길이 감소
		Member member3 = new Member("testId", "testPw", "nameTest", 20);
		System.out.println("[member3]");
		member3.inform();
		
		
		
	}
}
