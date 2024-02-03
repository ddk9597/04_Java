package oop.basic;

public class Self_Account {

	
		
		
		// private 설정, 간접접근 구문(setter/getter)으로 접근 가능
		private String name; 		 // 이름
		private String accountNum;   // 계좌번호
		private String password;     // 비밀번호
		private long   balance;		 // 잔액
		
		// private의 간접접근 구문
		// setter
		public void setName(String inputName) {
			name = inputName;
		}
		
		// getter
		public String getName() {
			return name;
		}
		
		// 계좌명 setter 메서드 
		public void setAccountNum(String inputAccountNum) {
			this.accountNum = inputAccountNum;
		}
		
		// 계좌명 getter 메서드
		public String getAccountNum() {
			return accountNum;
		}
		
		// 비밀번호 setter 메서드
		public void setPassword(String password) {
			this.password = password;
		}

		// 비밀번호 getter
		public String getPassword(){
			return password;
		}
		
		// 잔액 getter 메서드
		public long getBalance(){
			return balance;
		}
		
		// 입금 기능

		public void deposit(long amount){
			balance += amount;
			System.out.println(name + "의 현재 잔액 : " + balance);
		}
		
		// 출금 기능
		// 비밀번호, 출금할 금액 전달 받음
		// 조건에서 맞으면 잔액에서 차감 후 현재 잔액 출력

		// 비밀번호 불일치 시 " 비밀번호 불일치 출력"
		// 출금할 금액이 잔액보다 크면 잔액부족 출력

		public void withdrawl(String pw, long amount){ // 비밀번호와 금액 가져옴
			
			if(!password.equals(pw)){
				System.out.println("비밀번호 불일치");
				return;
			}

			if(amount > balance){
				System.out.println("잔액이 부족합니다");
				return ;
			}

			else{ // 전부 맞을 경우 적용 후 잔액 표기
				balance -= amount ;
				System.out.printf(" %s의 계좌에서 %d 원 출금\n", accountNum , amount);
				System.out.println(name + "의 현재 잔액 : " + balance);
			}
			
			
			
			
		}

		
		
	}
	
	
	
	
	

