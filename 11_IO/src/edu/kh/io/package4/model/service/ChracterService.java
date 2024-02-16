package edu.kh.io.package4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ChracterService {

	/* 문자 기반 Stream
	 * 
	 * - 2 byte 문자(char) 단위로 입/출력하는 스트림
	 * 
	 * - Reader(입력), Writer(출력) 최상위 인터페이스 존재
	 * 
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 시 데이터 전달(주소창에 사이트 주소 적기)
	 * 		ex) 주소창에 사이트 주소 적으면
	 * 			호스팅 데이터(HTML, Css) 전달
	 * 
	 * */
	
	/** 문자 기반 파일 읽어오기
	 *  + 보조 스트림 Bufffered 사용
	 *  
	 * 
	 */
	public void fileinput() {
		
		FileReader fr = null; 		// 문자 기반 파일 입력 스트림
		BufferedReader br = null;   // 문자 기반 보조스트림
		
		try {
			// 문자 기반 스트림 생성
			fr = new FileReader("\\io_test\\노래가사2.txt");
			
			// 보조 스트림 생성
			br = new BufferedReader(fr);
			
			// ++ br.readLine(); 		// 한 줄씩 읽어오기
			
			String line = null; // 한 줄을 읽고 저장할 변수
			
			while(true) {
				line = br.readLine();
				if(line == null) { // 더 이상 읽어올 내용이 없을 때
					break;
				} 
				
				System.out.println(line);  // 읽어온 내용이 있다면 콘솔에 출력
			}
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
		} finally {
			// 사용 완료된 스트림 객체를 메모리 반환(제거, 닫기)
			
			// 보조 스트림만 close() 해도 연결된 기반 스트림도 같이 close();
			
			try {
				if(br != null) br.close();
				
			} catch (IOException e) {
				e.printStackTrace();
				
			} 
			
			
		}
		
	}
	
	/** 문자 기반 파일 출력
	 *  + 보조 스트림 Buffered 이용
	 * 
	 */
	public void fileOutput() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("믿기지 않겠지만");
		sb.append("오늘은 금요일이다");
		sb.append("시간 아주 빨리감;");
		sb.append("Like Hnadle Breaked 8t truck;;");
		
		String content = sb.toString();
		
		// content에 저장된 문자열을
		// "\\io_test\\출력테스트.txt 파일로 출력하기
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("\\io_test\\출력테스트.txt"); // 파일과 출력 스트림 연결
			bw = new BufferedWriter(fw); // 버퍼를 활용해 성능 향상
			
			bw.write(content); // content에 저장된 내용을 
							   // 연결된 file에 출력 하는 구문
			
//			bw.flush();
			System.out.println("출력 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				
				// close 구문 안에 flush()가 내장되어 있음!!
				// flush() 와 함께 써도 됨
				if(bw != null) bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
}
