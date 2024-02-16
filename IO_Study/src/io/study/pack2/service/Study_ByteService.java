package io.study.pack2.service;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Study_ByteService {

	/* Stream : Java 에서 데이터가 이동하는 통로
	 *  - 기본적으로 단방향
	 *  
	 *  Byte 기반 Stream 
	 *  - 1바이트 단위로 데이터 입출력하는 Stream
	 *  - 모든 파일 형태 입출력 가능하나 속도가 조금 느림
	 *  
	 * 
	 * 
	 * */
	
	/** Byte기반 파일 출력
	 *  
	 */
	public void method1() {
		
		// FileOutputStream 참조변수 선언
		FileOutputStream fos = null;
		
		try {
			// new FileOutputStream("경로") : 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동생성
			// 폴더는 생성되지 않으며. 따로 생성해야함
			// 기존 파일이 존재하면 내용을 덮어쓰기함
			// new FileOutputStream("경로", true) : 기존 파일이 존재하면 내용 덮어쓰기함
			
			fos = new FileOutputStream("C:\\Users\\user1\\Desktop\\IO 연습\\ByteStream_test.txt", true);
			
			// StringBuilder -> String을 가변성으로
			StringBuilder sb = new StringBuilder();
			sb.append("여기서부터 입력하는 내용입니다 \n");
			sb.append("일단 입력은 이렇게 하는데 \n");
			sb.append("한글은 2Byte 문자라 \n");
			sb.append("ByteStream의 일반적인 방법으론 \n");
			sb.append("출력이 잘 안됩니다 \n");
			sb.append("그래서 String을 byte[]로 변환해서 출력하면 됩니다 \n");
			
			
			// StringBuilder -> String 변환
			String content = sb.toString();
			
			
			// String을 Byte[]로 변환 후 출력
			fos.write( content.getBytes() );
			
			fos.flush(); // Stream 안에 남아있는 데이터를 모두 내보내기
			System.out.println("출력 완료");
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			
			// 사용 완료한 스트림 메모리 반환(제거, 닫기)
			
			try { 
				if(fos != null) { // 스트림이 정상 생성된 경우
					fos.close(); // 스트림을 닫아 없앤다
				}
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	/** Buffered 보조 스트림을 이용한 파일 출력
	 * 
	 */
	public void BufferedFileByteoutput() {
		
		/* 버퍼 Buffer : 데이터를 모아두는 박스.
		 * 	- 버퍼링에서 미리 앞에 재생 될 부분 다운 받아
		 * 		끊김 없이 동영상 재생할 수 있게 미리 담아두는 공간이 버퍼
		 * */
		
		/* BufferedOutputStream / BufferedInputStream
		 * - 버퍼에 입,출력 할 내용을 모아서 한 번에 출력함!
		 * -> 스트림을 이용하는 횟수 적어져 성능과 시간 효율 높아짐
		 * - 보조 스트림이므로 메인 스트림 없이 단독 사용 불가
		 * 
		 * */
		
		
		FileOutputStream fos = null; // 참조 변수 선언
		BufferedOutputStream bos = null; // 보조 스트림 선언
		
		try {
			fos = new FileOutputStream("\\Users\\user1\\Desktop\\IO 연습\\바이트기반테스트_Buffered.txt");
			bos = new BufferedOutputStream(fos); // 보조스트림 기반 스트림에 연결
			
			// StringBuilder -> String을 가변성으로
			StringBuilder sb = new StringBuilder();
			sb.append(" 안녕 \n");
			sb.append(" 반가워 \n");
			sb.append(" 사실 \n");
			sb.append(" 뻥이야 \n");
			sb.append(" 집에 가고싶어 \n");
			
			String content = sb.toString(); // StringBuilder -> String 으로 전환
			
			bos.write(content.getBytes() ); // 문자열을 파일에 바이트로 씀
			// content.getBytes() -> 문자열"content"를 바이트 배열로 변환
			// write() 메서드 -> 바이트 배열을 출력 스트림에 쓴다
			System.out.println("출력 완료 ");
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 사용 완료된 스트림 메모리 반환(닫기, 제
			
			try {
				if(bos != null) bos.close();
				// 보조 스트림 close 시 보조 스트림 생성에 사용된 기반 스트림도 같이 close()
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	/** Buffered 를 이용한 파일 출력 2
	 *  - BufferedOutoputStream 보조 스트림 사용
	 * 
	 */
	public void fileOutputByBuffered() {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream("\\Users\\user1\\Desktop\\IO 연습\\Study_BufferedOutput_2.txt");
			bos = new BufferedOutputStream(fos);
			
			StringBuilder sb = new StringBuilder();
			sb.append("두번째 연습이다");
			sb.append("잘 할 수 있을 때 까지");
			sb.append("계속 한다");
			sb.append("실시!");
			
			String content = sb.toString();
			
			bos.write( content.getBytes() );
			System.out.println("출력 완료");
			
			bos.flush();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				bos.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
	/** OutputStream + Buffered
	 *  -> 값 입력 받아 파일에 적용하기
	 * 
	 */
	public void BfStream3() {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("\\Users\\user1\\Desktop\\IO 연습\\Bf_2.txt");
			bos = new BufferedOutputStream(fos);
			
			StringBuilder input = new StringBuilder();
			input.append("박세리1 \n");
			input.append("박세리2 \n");
			input.append("박세리3 \n");
			input.append("박세리4 \n");
			
			String content = input.toString();
			
			bos.write(content.getBytes() );
			System.out.println("파일 생성 및 출력 완료");
			bos.flush();
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
			try {
				if(bos !=null) {
					bos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
