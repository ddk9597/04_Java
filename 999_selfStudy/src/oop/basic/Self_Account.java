package oop.basic;

public class Self_Account {

	
	public class Account {
		
		
		// private 설정, 간접접근 구문(setter/getter)으로 접근 가능
		private String name; 		 // 이름
		private String accountNum;   // 계좌번호
		private String password;     // 비밀번호
		private long   balance;		 // 잔액
		
		// 이름 간접접근 구문
		// setter
		public void setName(String inputName) {
			name = inputName;
		}
		
		// getter
		public String getName() {
			return name;
		}
		
		// 계좌명 setter
		public void setAccountNum(String inputAccountNum) {
			this.accountNum = inputAccountNum;
	
		}
		
		// 계좌명 getter
		public String getAcocuntNum() {
			return accountNum;
		}
		
		// 비밀번호
		public void setPassword(String password) {
			
			
			
		}
		
		
		
		// 잔액
		
		
		
		
	}
	
	
	
	
	
}
