package oop.basic;

import edu.kh.oop.basic.Account;

public class Self_AccountRun {
    
    public static void main(String[]args){

        Self_Account s1 = new Self_Account();

        // 간접접근 기능을 이용한 값 세팅
        String name1 = s1.getName();
        System.out.println(name1);

        s1.setName("고길동");
        s1.setAccountNum("1234-1234-1234");
        s1.setPassword("1q2w3e4r!");

        Self_Account s2 = new Self_Account();
        s2.setName("김둘리");
        s2.setAccountNum("1111-2222-3333-4444");
        s2.setPassword("1234!!");

        // 각 계좌 입금하기
        s1.deposit(10000000L);
        s1.deposit(5000000L);

        s2.deposit(50000L);
        s2.deposit(30000L);

        // 각 계좌 출금
        s1.withdrawl("1q2w3", 30000);     // 비번 불일치 
        s1.withdrawl("1q2w3e4r!", 300000000); // 잔액 부족
        s1.withdrawl("1q2w3e4r!", 30000);    // 정상 처리


        s2.withdrawl("1q2w3e4r", 30000);     // 비번 불일치 
        s2.withdrawl("1234!!", 30000000); // 잔액 부족
        s2.withdrawl("1234!!", 30000);    // 정상 처리



    }
}
