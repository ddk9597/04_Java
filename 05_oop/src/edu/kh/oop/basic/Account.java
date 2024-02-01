package edu.kh.oop.basic;

/**
 * 계좌 class
 * 
 */
public class Account {
	
	// [캡슐화]
	// - 객체의 속성(필드) 직접 접근을 제한하는것이 원칙임
	
	// - 직접 접근을 제한하기 위해서 모든 필드에 private 키워드 작성
	//   (private : 현재 객체만 접근 가능한 사적인, 개인적인)
	
	// - 속성에 직접 접근을 할 수 없으므로 대신 간접 접근을 할 수 있는 기능을 작성해야함
	
	// 속성(값)
	private String name; 		// 예금주
	private String accountNum;  // 계좌번호
	private long   balance;		// 계좌 잔액
	private String password;	// 비밀번호
	
	// * 매개변수 == 전달받아온 값을 저장하는 변수(사물함) *
	
	// name 변수에 값을 세팅하는 간접 접근 기능
	
	public void setName(/*매개변수 작성*/ String inputName) {
		
		// 매개변수 String inputName
		// -> String 타입의 데이터를 전달 받아 저장할 변수
		
		name = inputName;
	}
	
	// name 변수의 값을 돌려보내주는 간접 접근 기능 
	
	// void : 없다. 반환할 값이 없다. 라는 뜻
	// 반환할 값이 있이 있을 경우 그 값의 자료형 작성(반환형)
	public String getName() {
		
		return name;
		
	}
	
	/* this : 현재 객체를 지칭 */
	
	// accountNum 값 세팅하는 간접 접근 기능
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	// accountNumber 값을 반환하는 간접 접근 기능
	public String getAccountNum() {
		
		return accountNum;
		
	}
	
	
	// password 값 세팅하는 간접 접근 기능
	public void setPassword(/* 매개변수 작성 */String password) {
		this.password = password;
	}
	
	// balance 값을 반환하는 간접 접근 기능
	public long getBalance() {
		return balance;
	}
	
	// 입금 기능
	
	/**
	 *  전달받은 금액을 balance에 누적한 후 
	 *  현재 잔액을 콘솔에 출력
	 */
	public void deposit(long amount) {
		balance += amount;
		System.out.println(name + "의 현재 잔액 : " + balance);
		
	}
	
	// 출금 기능
	// 비밀번호와 출금할 금액을 전달 받아와 
	// 조건에 맞으면 잔액에서 차감 후 현재 잔액 출력
	
	// 조건 1. 비밀번호가 일치하지 않으면 "비밀번호 불일치" 출력
	// 조건 2. 출금할 금액이 잔액보다 크면 " 잔액부족 " 출력
	
//	@param pw : 전달된 비밀번호
//	@param amount : 출금할 금액
	
	public void withdrawl(String pw, long amount) {
	
//		자바에서 
//		기본 자료형 비교는 ==
//		객체(참조형) 비교는 A.equals(B) 
		
//		현재 계좌 비밀번호와 (password)
//		전달 받은 비밀번호가 (pw)가 같을 경우 true/다르면 false
		if(!password.equals(pw)) { // 다를 경우
			System.out.println("비밀번호 불일치");
			return; // 메서드 종료 -> 호출한 곳으로 돌아감
			
		}
	
//		출금할 금액이 잔액보다 큰 경우
		if(amount > balance) {
			System.out.println("잔액부족");
			return;
		}
		
//		잔액을 출금할 금액 만큼 차감
		balance -= amount;
		
//		잔액 출력
		System.out.printf("%s계좌에서 %d 원 출금 \n", accountNum, amount);
		System.out.println(name + "의 현재잔액 : " + balance);
		
	}
	
	
	
}
