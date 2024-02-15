package edu.kh.io.package2.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteService {

	/* Stream : Java 에서 Data 가 이동하는 통로
	 *  - 기본적으로 단방향
	 *  
	 * 
	 * Byte 기반 Stream
	 * - 1 Byte단위로 데이터를 입/출력하는 Stream
	 * 
	 * - 최상위 인터페이스 : InputStream. OutputStream
	 * 
	 * - 문자열, 이미지, 영상, 오디오, pdf 등
	 * 	 모든 것을 입/출력 가능
	 * 	 (단, 통로가 좁다보니 속도가 조금 느림
	 * 
	 * */
	
	/*******************************************************************/
	// IO 관련 코드는 IOException 발생 가능성이 높다
	// -> 거의 모든 메서드가 throws IOException
	// -> IOException 예외 처리 구문 작성하는 것이 필수다!
	/*******************************************************************/
	
	/**  Byte 기반 file 출력
	 * 
	 */
	public void fileByteOutPut() {
		
		// FileOutputStream 참조변수 선언
		FileOutputStream fos = null; // try, finally 구문에서 사용 예정
		
		try {
			
			// new FileOutputStream("경로") : 경로에 작성된 파일과 연결된 파일 출력 스트림 객체 생성
			// -> 출력 스트림에 연결된 파일이 존재하지 않으면 자동 생성
			// (단, 폴더는 생성되지 않음 -> 파일을 만드려는 폴더는 생성해야함)
			
			// 기존 파일이 존재하면 내용을 덮어쓰기 한다
			
			// new FileOutputStream("경로", true)
			// -> 기존 파일 이 존재하면 내용을 이어쓰기함
			
				fos = new FileOutputStream("/io_test/20240215/바이트기반_테스트.txt", true);
				
				// StringBuilder -> String을 가변성으로
				StringBuilder sb = new StringBuilder();
				sb.append("Hello World!! \n");
				sb.append("1234123123");
				sb.append("자바는 정말 재밌다");
				sb.append("이걸로 밥 벌어먹고 살기 SSap Able??");
				sb.append("Able! 아블레!");
				sb.append(" 화이팅!");
				sb.append(" 아자아자!");
				
				// StringBuilder -> String 변환
				String content = sb.toString();
			
			// 출력 방법 1 : 한 글자(2byte)씩 파일로 출력
			// -> 2byte 범주의 문자(영어, 숫자, 기본 특수문자 제외)는
			// 1byte 기반 스트림 통과 시 데이터 손실 발생하여 글자가 깨지는 문제 발생
			
//			for(int i=0, len=content.length() ; i < len ; i ++) {
//				
//				char ch = content.charAt(i); // i번째 글자 반환
//				
//				fos.write(ch); // 1byte 출력 스트림이 연결된 파일에 ch 쓰기
//				// -> char 는 2byte
//				
//			}
			
				// System.nanoTime(); -> 1970.01.01. 09:00 부터
				// 현재 시간 까지의 차이를 ns(nano second) 단위로 반환
				
				// 1ms(미리second) == 1/1,000 초 
				// 1us(마이크로sc) == 1/1,000,000 초
				// 1ns(나노sc) 	   == 1/1,000,000,000 초
				long startTime = System.nanoTime();
				
				// 출력 방법 2 : String 을 byte[] 로 변환 후 출력
				fos.write( content.getBytes() );
				
				long endTime = System.nanoTime();
				System.out.println( "수행 시간 : " + (endTime - startTime) + "ns" );
				
				fos.flush(); // Stream 안에 남아 있는 데이터를 모두 내보내기
				
				System.out.println("출력 완료");
			
			
			
		} catch(IOException e) {
			e.printStackTrace(); // 예외가 발생한 메서드까지 추적해 출력

		} finally { // 예외 발생 여부 관계 없이 무조건 수행
			
			// 사용 완료한 스트림을 제거(닫기, 메모리 반환) 하는 코드 작성
			
			try{
					if(fos != null) { // 스트림이 정상 생성된 경우
						fos.close(); // 스트림을 닫아 없앤다
				}
					
					
			} catch(IOException e) {
				
				e.printStackTrace();
				
			}
			
		}
		
	}
	
	/** Buffered 를 이용한 파일 출력
	 * 
	 * - BufferedOutputStream 보조 스트림 이용
	 * 
	 */
	public void bufferedFileByteOutput() {
	
		/* 버퍼(Buffer)
		 *  - 데이터를 모아두는 박스, 장바구니 같은 메모리 공간
		 *  
		 *  * 버퍼링
		 *  
		 *   - 인터넷 속도 낮음 + 스트리밍 코드가 효율이 안좋음
		 *   	-> 동영상 재생 중에 미리 앞에 재생될 부분을 다운받아 
		 *    	   끊김 없이 영상을 재생하도록 함
		 *    
		 *    	  --> 다운 받아서 저장하는 공간이 바로 버퍼
		 * */

		/* BufferedOutputStream / BufferedInputStream
		 * 
		 * - FileOutputStream은 1바이트씩 테이터를 입출력함
		 * 
		 * - BufferedOutputStream / BufferedInputStream
		 * 	-> 버퍼에 입출력할 내용을 모아서 한 번에 출력!
		 * 
		 * 	--> 스트림을 이용하는 횟수가 적어짐
		 *      --> 성능, 시간 효율 up!
		 * */
		
		
		// 참조변수 선언. 지역내 전역변수로
		FileOutputStream fos = null;
		
		// 보조 스트림 선언
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream("/io_test/20240215/바이트기반_테스트_Buffered.txt");
			
			// 기반 스트림 fos를 이용해 보조 스트림 bos를 생성
			bos = new BufferedOutputStream(fos);
			
			// StringBuilder -> String을 가변성으로
				StringBuilder sb = new StringBuilder();
				sb.append("Hello World!! \n");
				sb.append("1234123123");
				sb.append("자바는 정말 재밌다");
				sb.append("이걸로 밥 벌어먹고 살기 SSap Able?? \n");
				sb.append("Able! 아블레! \n");
				sb.append(" 화이팅!");
				sb.append(" 아자아자!");
				
				// StringBuilder -> String 변환
				String content = sb.toString();
				
				long startTime = System.nanoTime();
				
				bos.write(content.getBytes());
				
				long endTime = System.nanoTime();
				System.out.println(" 소요 시간 : " + (endTime - startTime) + "ns");
				bos.flush(); // 스트림에 남아있는 데이터 밀어내기(쏟아내기)
				
				System.out.println("출력 완료");
			
			
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {
			// 사용 완료된 스트림 메모리 반환(닫기, 제거)
			try {
				if(bos != null) bos.close();
				// 보조스트림 close 시 보조 스트림 생성에 사용 된 기반 스트림도 같이 close()
				
			} catch(IOException e ) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	/** 바이트 기반 파일 입력
	 *  외부 파일을 자바로 입력시킨다
	 */
	public void fileByteInput() {
		
		// 파일 입력용 바이트 기반 스트림
		FileInputStream fis = null;
		
		
		
		try {
			fis = new FileInputStream("\\io_test\\20240215\\노래가사.txt");
			
			/* ***** 읽어오는 방법 1. ***** */
			
			// - 파일 내부 내용을 1byte씩 끊어서 가져오기
			// - 2byte 범주의글자들이 깨지는 문제 발생
			// + 자바에서 byte는 정수형 
			// -> 다루기 힘들기 때문에 정수 기본형은 int로 변환해서 사용
			
			
			int value = 0; // 읽어온 바이트 값을 저장할 변수 하나 만들기
			
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				
				value = fis.read(); // 1바이트 씩 읽어옴.
				// the next byte of data, or -1 if the end of the file is reached.
				// -> 더 이상 읽어올 값이 없으면 -1이 반환됨 
				
				if(value == -1) break; // 다 읽어오면 반복을 멈춰라
				
				// 읽어온 값을 StringBuilder 객체에 추가
				sb.append( (char)value ); // int 자료형이므로 숫자로 들어가는 것을 char 강제 형변환
			}
			
			System.out.println(sb.toString()); // 읽어온 내용 콘솔에 추가하기
			
			// fis.flush(); -> InputStream은 flush 없음
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			// 사용 완료된 Stream 메모리 반환(제거, 닫기)
			
			try {
				if(fis !=null) fis.close();
				
			} catch(IOException e) {
				e.printStackTrace();;
			} 
		}
		
	} 
	
	/** 바이트 기반 파일 입력
	 *  외부 파일을 자바로 입력시킨다
	 */
	public void fileByteInput2() {
		
		// 파일 입력용 바이트 기반 스트림
		FileInputStream fis = null;
		
		
		
		try {
			fis = new FileInputStream("\\io_test\\20240215\\노래가사.txt");
			
			/* ***** 읽어오는 방법 2. ***** */
			// 파일에 저장된 모든 byte 값을 다 읽어와
			// byte[] 형태로 반환 받기
			// 이후 bytes[] 배열을 이용하여 String 객체 생성
			//  -> Sting 생성 시 배열 요소 2개씩 묶어 한 글자로 해석
			byte[] bytes = fis.readAllBytes();
			
			String content = new String(bytes);
			System.out.println(content);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			// 사용 완료된 Stream 메모리 반환(제거, 닫기)
			
			try {
				if(fis !=null) fis.close();
				
			} catch(IOException e) {
				e.printStackTrace();;
			} 
		}
		
	} 
	
	/**
	 *  BufferedInputStream 보조 스트림을 이용한 성능 향상
	 */
	public void bufferedFileByteInput() {
		
		// FileInputStream 변수 선언
		FileInputStream fis = null;
		
		// BufferedInputStream 변수 선언
		BufferedInputStream bis = null;
		
		try {
			// 기반 스트림 생성
			fis = new FileInputStream("\\io_test\\20240215\\노래가사.txt");
			
			// 보조 스트림 생성
			bis = new BufferedInputStream(fis);
			
			// 파일 내용을 bute[] 배열로 받아 String으로 변환
			String content = new String(bis.readAllBytes());
			
			System.out.println(content);
			
			
		} catch(Exception e) { // Exception 은 IOException의 부모(다형성)
			e.printStackTrace();
			
		} finally {
			
			try { // 보조 스트림만 닫아도 기반 스트림도 같이 close();
				 if(bis != null) bis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	
	/**
	 *  파일 복사
	 *  
	 *  파일 경로를 입력 받아 지정된 파일과 같은 경로에 복사된 파일 출력하기
	 *  
	 *  [ 실행 화면 ]
	 *  파일 경로 입력 : /IO_test/20240215/노래가사.txt
	 *  복사 완료 : //IO_test/20240215/노래가사_copy.txt
	 *   -> 같은 폴더 에 같은 파일 + copy
	 *   
	 *   
	 *   
	 *  1. 입력된 경로에 파일이 있는지 검사 : File.exist();
	 *  
	 *  2. 있다면 파일 내용을 모두 읽어오기 : FileInputStream();
	 *  	-> 성능 향상을 위해 BufferedInputStream();
	 *  
	 *  3. 읽어온 내용을 같은 위치에 "파일명_copy" 이름으로 출력
	 *  	-> FileOutputStream + BufferedOutputStream
	 *  
	 *  4. + Scanner 대신 BufferedReader 이용
	 *  -> Reader : 문자 기반 스트림
	 *  
	 */
	
	
	public void fileCopy() {
		
		// 스트림 참조 변수 선언
		BufferedReader br = null; // 문자열 입력용 스트림
		
		FileInputStream fis 	 = null; // 파일 입력
		BufferedInputStream bis  = null; // 입력 보조
		FileOutputStream fos 	 = null; // 파일 출력
		BufferedOutputStream bos = null; // 출력 보조
		
		
		try {
			
			// 키보드 입력을 받기 위한 Stream 객체 생성
			// InputStream: 1바이트 짜리를 Reader : 2바이트 짜리로 확장 
			br = new BufferedReader( new InputStreamReader(System.in) );
			
			// 경로 입력 받기
			System.out.print("파일 경로 입력 : ");
			String target = br.readLine(); // 입력된 한 줄 읽어오기
			
			File directory = new File(target);
			
			// 해당 경로에 파일이 존재하는지 확인
			if( !directory.exists() ) { // 해당 경로에 파일 이 존재하지 않으면
				System.out.println("해당 경로에 파일이 존재하지 않습니다");
				return;
			}
			// --------------------------------------------------- //
			// target이 가리키는 파일을 입력 받을 수 있도록 
			// 입력용 Stream 생성
			fis = new FileInputStream(target);  // 기반 스트림
			bis = new BufferedInputStream(fis); // 보조 스트림
			
			// 입력용 Stream 입력해서 target 입력 받기
			// byte 배열로 얻어오기
			byte[] bytes = bis.readAllBytes();
			
			// ---------------------------------------------------- //
			
			// 출력할 파일의 경로 + "_copy"가 붙은 파일 이름
			// target : \\io_test\\20240215\\노래가사.txt
			// copy   : \\io_test\\20240215\\노래가사_copy.txt
			
			StringBuilder sb = new StringBuilder();
			sb.append(target); // \\io_test\\20240215\\노래가사.txt
			
			// inst String.lastIndexOf("문자열")
			// -> String 뒤에서 부터 검색해서 문자열과 일치하는 부분의 인덱스를 반환
			// 없으면 -1 반환
			int insertPoint = target.lastIndexOf(".");
			// -> 마지막 . 의 인덱스 값 얻어옴
			sb.insert(insertPoint , "_copy");
			// -> 마지막 . 의 인덱스 앞에 "_copy" 넣기
			
			String copy = sb.toString(); // 복사할 파일의 경로
			// 출력용 Stream 생성
			
			fos = new FileOutputStream(copy);
			bos = new BufferedOutputStream(fos);
			
			// 읽어왔던 내용 bytes를 bos를 이용해서 출력
			bos.write(bytes);
			
			bos.flush(); // Stream에 남아있는 데이터 밀어내기
			
			System.out.println(" 복사 완료 " + copy);
			
			
				
			
		} catch(Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try { // 사용한 스트림 메모리 반환(닫기, 제거)
				if(br != null ) br.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
