package edu.kh.oop.basic;

public class AccountRun {

 public static void main(String[] args) {
	
	 // Account 객체 생성
	 
	 Account a1 = new Account(); // new : Heap 메모리에 저장 공간 확보
	 
	 // private를 적용한 변수(필드)는 외부에서 보이지 않음(캡슐화 정보 은닉)
	 
//	 a1.accountNum = "1";
//	 a1.name = "홍길동";
//	 a1.balance;
//	 a1.passwrod;
	 
//	 간접 접근 기능을 이용하여 값을 세팅
	 a1.setName("신형만");
	 
	 // 간접 접근 기능을 이용해서 객체의 속성을 얻어와 출력
	 
	 String name1 = a1.getName();
	 System.out.println(name1);
	 
	 a1.setAccountNum("1111-22-3333");
	 a1.setPassword("7890");
	 
	 Account a2 = new Account();
	 a2.setName("신짱아");
	 a2.setAccountNum("1111-33-1234");
	 a2.setPassword("4989");

	 // 각 계좌에 입금
	 a1.deposit(1000000L);
	 a1.deposit(2345L);
	 
	 a2.deposit(50000L);
	 a2.deposit(30000L);
	 
	 // 각 계좌에 출금
	 a1.withdrawl("1234", 2000000); // 비번 불일치
	 a1.withdrawl("7890", 2000000); // 잔액 부족
	 a1.withdrawl("7890", 50000);	// 정상 처리
	 
	 // 각 계좌에 출금
	 a2.withdrawl("1234", 2000000); // 비번 불일치
	 a2.withdrawl("7890", 2000000); // 잔액 부족
	 a2.withdrawl("4989", 50000);	// 정상 처리
	 
	 
 	}
	
}
