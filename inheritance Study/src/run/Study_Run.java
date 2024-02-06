package run;

import dto.Study_Child01;
import dto.Study_Parent;
import dto2.Study_Child02;

public class Study_Run {

	public static void main(String[] args) {
		// 부모 객체 생성
		Study_Parent sp1 = new Study_Parent();
		Study_Parent sp2 = new Study_Parent("초이", "서울", 50000, "인력거");
		
		System.out.println(" ----------------- 구분선 ------------- ");
		Study_Child01 sc1 = new Study_Child01(); //1자식 기본생성자
		
		sc1.setComputer("삼성 갤럭시 북");
		
		String str1 = sc1.inform();
		System.out.println("str1 : " + str1);
		
		String str2 = sc1.informStudy_Child01();
		System.out.println("1번자식의 기능 추가\nstr2 : " + str2);
		
		System.out.println("-------------------------");
		
		// Study_Child01 매개 변수 생성자를 이용해서 객체 생성
		Study_Child01 sc2 = new Study_Child01("Lg gram");
		String str3 = sc2.informStudy_Child01();
		System.out.println("str3 : " + str3);
		
		System.out.println(" ----------------------------- ");
		
		// Study_Child02 매개 변수 생성자를 이용해서 객체 생성
		Study_Child02 sc3 = new Study_Child02("김", "함경북도", 50000,"대포동","아이폰 500");
		String str4 = sc3.informChild02();
		System.out.println("str4 : "+ str4);
	}
}
