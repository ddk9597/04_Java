package polymorPhism_study.service;

import polymorPhism_study.dto.Drum;
import polymorPhism_study.dto.Guitar;
import polymorPhism_study.dto.Instrument;

public class PolyServiceStudy {

	// 다형성 1. 업캐스팅 확인(자식-> 부모로)
	public void method1() {
		Instrument i1 = new Drum();
		Instrument i2 = new Guitar();
		
		// 부모 기능 호출 가능함, 자식 기능은 호출 불가능함.
		i1.setGreatestPlayer("the DDK");
		i2.setGreatestPlayer("frok_");
		
		System.out.println("위대한 드러머 : " + i1.getGreatestPlayer());
		System.out.println("위대한 기타리스트 : " + i2.getGreatestPlayer());
	}
	
	// 다형성2. 다운캐스팅
	// 다형성1에서 업캐스팅된 부모타입 참조변수를 자식 타입으로 강제 형변환
	// -> 자식 객체를 참조하도록 변경
	
	public void method2() {
		Instrument i1 = new Drum();
		Instrument i2 = new Guitar();
		
		// 강제 형변환을 통한 다운캐스팅
		String Band1 = ((Drum)i1).getBand();   // i1 의 자료형 Instrument -> Drum 강제 변환
		String Band2 = ((Guitar)i2).getBand(); // i2 의 자료형 Instrument -> Guitar 강제 변환
		
		Drum D1 = (Drum)i1;
		Guitar G1 = (Guitar)i2;
		
		i1.setBand("Talmo Boy");
		i2.setBand("Nuke Trash Boys");
		
		System.out.println("i1 소속 밴드 : " + i1.getBand());
		System.out.println("i2 소속 밴드 : " + i2.getBand());
	}
	
	// 다형성 3 정적 바인딩
	// 컴파일 단계에서 호출되는 메서드가 어떤 클래스의 메서드와 연결되는지 결정
	public void method3() {
		
		Instrument I1 = new Instrument();
		
		I1.setCountry("South Korea");
		
		Drum D1 = new Drum();
		D1.setCountry("방구석");
		
		System.out.println("Instrument 의 값 country 수정 : " + I1.getCountry());
		System.out.println("Instrument 의 값 band 수정 : " + I1.getBand());
		System.out.println("Drum 의 값 setCountry 수정 : " + D1.getCountry());
	}
	
	// 다형성 4 동적 바인딩
	// 프로그램 실행 중 호출되는 메서드를 참조하는 객체의 오버라이딩된 메서드로 연결
	// 부모 타입 참조 변수에 업캐스팅된 자식 객체 대입
	// -> 부모 타입이 참조하는 객체는 실제로는 자식 타입 객체
	// -> 오버라이딩된 메서드 호출 시 실제 참조하고 있는 자식 타입 객체가 우선권을 가짐
	public void method4() {
		// 업캐스팅
		// 참조변수가 부모 타입이니까 부모 부분의 메서드 호출함
		// 그러나 호출된 메서드는 Instrumetn.toString()메서드가 아닌
		// Drum.toString()이 호출됨 == 동적 바인딩
		Instrument I1 = new Drum("the DDk", "Talmo Boy", "방구석", true, "Just Mumbling");
		System.out.println(I1.toString());
		
		
	}
	
	// 객체배열 + 업캐스팅 + 동적 바인딩
	public void method5() {
		// 부모타입의 참조변수로 이루어진 객체 배열 생성
		Instrument[] arr = new Instrument[3];
		
		arr[0] = new Instrument("God", "inYourHeart", "everyWhere", false);
		arr[1] = new Drum("the DDK", "Talmo Boy", "everyWhere", true, "justMimble");
		arr[2] = new Guitar("fro_k", "Nuke boys", "대한민국", false, "AddictedChan");
		
		// 향상된 for문 반복문으로 자식 인덱스에 업캐스팅 적용하기
		// 
		for(Instrument i:arr) {
			System.out.println(i.toString());
			
		}
		
		
	}
	
	public void method6(){
			
		Instrument Instrument = new Instrument("신", "어디서나", "어디에나", false); 
		Drum Drum = new Drum("찬혁", null, null, false, null);
		Guitar Guitar = new Guitar("fro_k", null, null, false, null);

		printToString(Instrument);
		printToString(Drum);
		printToString(Guitar);

	}

	public void printToString(Instrument i){

		System.out.println("전달 받은 객체의 toString() 출력");

		// 실제 참조하는 객체가 자식 객체이면
		// 자식 객체의 오버라이딩된 toString() ghcnf(동적바인딩)
		System.out.println(i.toString());
	}
	
	// 다형성 7. 반환형에 업캐스팅 적용
	public void method7(){
		printToString(createInstrument(1));
		printToString(createInstrument(2));
		printToString(createInstrument(3));
	}
	
	public Instrument createInstrument(int num){
		if(num==1){
			return new Instrument();
		}

		if(num ==2 ){
			return new Drum();
		}

		return new Guitar();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
