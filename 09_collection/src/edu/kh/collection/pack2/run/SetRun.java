package edu.kh.collection.pack2.run;

import edu.kh.collection.pack2.model.service.SetService;

public class SetRun {
	public static void main(String[] args) {
		SetService service = new SetService();
		
		service.method1();
		
		System.out.println("\n ----- 2번 기능입니다 ----- \n");
		service.method2();
		
		System.out.println("\n ----- 3번 기능입니다 ----- \n");
		service.method3();
		
		System.out.println("\n ----- 4번 기능입니다 ----- \n");
		service.method4();
		
		
		System.out.println("\n ----- 로또번호 생성 기능입니다 ----- \n");
		service.lottoNumberGenerator();
		
		System.out.println("\n ----- 진화된 로또번호 생성 기능입니다 ----- \n");
		service.evolvedLottoNumberGenerator();
	}
}
