package io.study.pack2.service;

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
		
		/* 버퍼 : ㄷ[ㅔ
		 * 
		 * 
		 * */
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
