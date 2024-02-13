package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import edu.kh.collection.pack2.model.dtd.Person;

public class MapService {

	/* Map : 특정 키워드(Key)를 입력하면
	 *       해당되는 상세한 값(Value)를 얻을 수 있는 컬렉션 객체
	 * 
	 * - K:V 형식으로 구성
	 * 
	 * - K:V 한 쌍을 "Entry" 라고 부름
	 * 
	 * - Key : 키워드 역할(== 변수명)
	 * 1) 중복 X
	 *  -> 중복되는 Key 입력 시 Value를 덮어씌움
	 *  -> Key 역할의 객체는 hashCode(), equals() 오버라이딩 필수!
	 *  
	 * 2) 순서 유지 X (단, LinkedHashMap 제외)
	 * 
	 * * Key만 묶어서 보면 Set과 같은 특징을 지니고 있음!
	 *  -> Map.keySet() / Map.EntrySet() 제공
	 * 
	 * 
	 * Value : 키워드에 해당하는 상세한 값
	 * 
	 * - Key로 인해서 모든 Value가 구분됨
	 *  -> Map.get(Key) / Map.remove(Key) 형태로 사용
	 * 
	 */
	
	public void method1() {
		
		// HashMap 생성
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// 1. V put(K k, V v) : Map에 추가
		// - Map에 추가 시
		//   중복되는 Key가 없으면 null
		//   중복되는 Key가 있으면 이전 Value 반환
		
		System.out.println( map.put(1, "에그마요") );
		System.out.println( map.put(2, "로티세리바베큐") );
		System.out.println( map.put(3, "스테이크앤치즈") );
		System.out.println( map.put(3, "스파이시쉬림프") ); // 3 중복
		
		System.out.println(map);
		
		
		// 2. V get(K k) : Key에 해당되는 Value 반환
		//								 일치하는 Key가 없으면 null 반환
		System.out.println("----------------------------------");
		System.out.println( map.get(1) ); // 에그마요
		System.out.println( map.get(0) ); // null
		
		String temp1 = map.get(2); // "로티세리바베큐"
		System.out.println(temp1);
		
		
		
		// 3. int size() : Map에 저장된 Entry(K:V)의 개수
		System.out.println("size : " + map.size()); // 3
		
		
		// 4.  V remove(K k) :
		// - Key가 일치하는 Entry를 제거
		// - 일치하는 Key가 있다면 Value, 없다면 null 반환
		
		System.out.println("---------------------------------");
		System.out.println("remove(2) : " + map.remove(2));
		System.out.println("remove(5) : " + map.remove(5));
		
		System.out.println();
		
		
		// 5. void clear() : 모든 Entry 삭제
		
		// 6. boolean isEmpty() : 비어 있는지 확인
		
		System.out.println("clear() 전 isEmpty :" + map.isEmpty());
		map.clear();
		System.out.println("clear() 후 isEmpty :" + map.isEmpty());
	}
	
	/** 
	 * Map(Entry) 순차 접근 하기 1
	 * 
	 * Map.keyset 이용하기
	 * 
	 */
	public void method2() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원"		, "서울시 중구");
		map.put("집"		, "서울시 강동구");
		map.put("롯데타워"	, "서울시 송파구");
		map.put("63빌딩"	, "서울시 영등포구");
		
		// Set<K> Map.keySet() : 
		// - Map 에 Key만 반환해서 Set 형태로 반환
		Set<String> set = map.keySet();
		System.out.println("keySet : " + set);
		
		// 향상된 for문 + Set 
		System.out.println(" \n === 향상된 for 문 2번 메서드 입니다");
		for( String key : set ) {
			System.out.printf("%-10s : %s \n", key, map.get(key));
		}
		
		
	}
	
	
	/** 
	 *  
	 *  Map(Entry) 순차 접근 하기 2
	 *  
	 *  - Map.entrySett() 이용하기
	 * 
	 */
	public void method3() {
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("학원"		, "서울시 중구");
		map.put("집"		, "서울시 강동구");
		map.put("롯데타워"	, "서울시 송파구");
		map.put("63빌딩"	, "서울시 영등포구");
		
		Set<Entry<String, String>> entrySet = map.entrySet();
		
		// 향상된 for 문 + EntrySet
		for( Entry<String, String> entry : entrySet) {
			// entry.getKey : Key 만 얻어오기
			// entry.getValue : Value 만 얻어오기
			System.out.printf("key : %s , value : %s \n", entry.getKey(), entry.getValue());
		}
		
	}
	
	/**
	 *  Map 활용하기 - DTO 대체하기
	 *  - 서로 다른 데이터를 한 번에 묶어서 관리해야 하는 경우
	 */
	public void method4() {
		
		Person p1 = new Person("홍길동", 25, '남');
		p1.setName("홍실동");
		p1.setAge(25);
		p1.setGender('남');
		
		System.out.printf(" 이름 : %s, 나이: %d, 성별 : %c" , p1.getName(), p1.getAge(), p1.getGender());
		
		System.out.println(" ------------------ ");
		
		// DTO 대신 Map 활용하기
		// -> Key는 무조건 String을 활용하는게 Best
		
		// - Value의 타입이 모두 다름
		// 	-> Object를 부모 타입 참조 변수로 활용
		//  	--> 다형성(업캐스팅, 동적 바인딩)
		
		Map<String, Object> p2 = new HashMap<String, Object>();
		
		p2.put("name", "한지우");
		p2.put("age", 30);			// int -> Integer 변환
		p2.put("gender", '남');		// char -> Character 변환
		
		// 데이터 얻어오기
		System.out.printf(" 이름 : %s, 나이: %d, 성별 : %c \n" , p2.get("name"), p2.get("age"), p2.get("gender"));
		
	}	
	
}
