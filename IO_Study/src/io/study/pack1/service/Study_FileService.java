package io.study.pack1.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Study_FileService {
	
	Scanner sc = new Scanner(System.in);
	/* File class 
	 * 
	 * - 파일, 폴더(디렉토리)를 관리하는 클래스
	 * - 파일, 폴더(디렉토리) 존재 유무 관계 없이 
	 * - 없으면 없는대로, 있으면 있는대로 관리함
	 * 
	 * - 기능 : 파일생성, 제거, 이름, 크기, 마지막 수정일, 존재여부 등의 기능 제공
	 * 
	 * File Class Methods
	 * 
	 * 1.  boolean 	mkdir()  : 폴더(디렉토리) 생성
	 * 2.  boolean 	mkdirs() : 경로상의 모든 폴더 (디렉토리) 생성
	 * 3.  boolean 	createNewFile() : 파일 생성
	 * 4.  boolean 	delete() : 파일/디렉토리 삭제
	 * 5.  String  	getName() : 파일 이름 반환
	 * 6.  String 	parent() : 파일이 저장된 디렉토리 반환
	 * 7.  String 	getPath() : 전체 경로 반환
	 * 8.  boolean 	isFile 	 : 현재 File 객체가 관리하는게 파일이면 true, 디렉토리면 false
	 * 9.  boolean 	isDirectory : 현재 File 객체가 관리하는게 디렉토리면 true, 파일이면 false
	 * 10. long 	length() : 파일 크기 반환
	 * 11. long 	lastModified() : 파일 마지막 수정일을 ms 단위로 반환
	 * 12. String[] list() : 디렉토리 내 파일 목록을 String[] 배열로 반환 -> 이름만 반환
	 * 13. File[] 	listFiles() : 디렉토리 내 파일 목록을 File[] 배열로 반환 -> File 클래스의 메서드 적용 가능
	 * 
	 * 
	 * */
	
	/** File 클래스로 객체 생성
	 * + 폴더가 존재하지 않으면 폴더 생성
	 * 
	 */
	public void method1() {
		
		// 제일 앞에 위치한 "/" : 최상위 폴더( == root, 절대 경로의 기준점)을 나타냄
		
		File directory = new File("\\Users\\user1\\Desktop\\IO 연습");
		System.out.println(" 존재 여부 확인 : " + directory.exists() );
		
		// 폴더가 없을 경우 폴더 생성
		if( !directory.exists() ) {
			
			// 폴더 모두 생성
			directory.mkdirs();
			System.out.println( directory.getName() );
			System.out.println( directory.getPath() );
			
		}
		
	}
	
	
	/**
	 *  지정한 디렉토리 내 파일 없을 경우 파일 생성 여부 확인
	 *  1. 디렉토리 지정
	 *  2. 파일 유무 여부 판별
	 *  3. 파일 없으면 생성할지 물어보기
	 *  4. "1" 입력 시 파일 생성, "2" 입력 시 종료
	 */
	public void method2() {
		
		// 1. 디렉토리 지정 파일 객체 생성
		File file = new File("\\Users\\user1\\Desktop\\IO 연습\\파일생성연습.txt");
		
		
		try {
			if(!file.exists() ) {
				System.out.println(" 파일을 생성하시겠습니까 ? \n 1. yes \n 2. no");
				int input = sc.nextInt();
				if (input ==1 ) {
					file.createNewFile();
					System.out.println(file.getName() + " 파일이 생성되었습니다.");
				} else {
					System.out.println("파일 생성이 취소되었습니다.");
				}
			}
			
		} catch(IOException e ) {
			e.printStackTrace(); // e.printStackTrace() : 예외 정보 + 예외가 발생한 위치까지의 메서드 추적
		}
		
	}
	
	/** File 클래스 제공 메서드 활용하여 내부 파일 검색하기
	 *  
	 */
	public void method3() {
		
		// 파일 객체 생성
		File directory = new File("\\Users\\user1\\Desktop\\IO 연습");
		
		// 지정된 디렉토리에 있는 모든 파일/디렉토리를 File[] 형태로 얻어오기
		// listFiles() 메서드 활용
		File[] files = directory.listFiles();
		
		// 향상된 for 문 -> for( 요소 저장 변수 : 배열이나 컬렉션)
		for (File f : files) { // 타입 : File, 변수명 : f
			// 파일명 얻어오기
			String fileName = f.getName();
			
			// 마지막으로 수정한 날짜 얻어오기
			// lastModified() 메서드 활용
			long lastModified = f.lastModified();
			
			// 날짜를 보기 좋게 바꾸기
			// SimpleDateFormat 이용
			SimpleDateFormat sdf = new SimpleDateFormat(" 최종수정일시 : yyyy.MM.dd a h시 mm분 ss초");
			String date = sdf.format(lastModified);
			
			
			// 파일 유형
			String type = null;
			if( f.isFile()) type = "파일임";
			else 			type = "폴더임";
			
			// 파일 크기
			String size = f.length() + "B"; // B : 바이트 단위의 크기로 표현
			if(f.isDirectory() ) size = ""; // 폴더일 경우 빈 문자열로 바꿈
			
			String result = String.format(" 이름 : %-15s %-35s %-5s %5s", fileName, date, type, size);
			System.out.println(result);
			
		}
		
	}
	
}
