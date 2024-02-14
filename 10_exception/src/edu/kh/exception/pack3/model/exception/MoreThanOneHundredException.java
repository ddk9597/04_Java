package edu.kh.exception.pack3.model.exception;

/**
 *  100 을 초과하는 예외를 발생시킴
 *  	-> RuntimeException tkdthr
 *  	--> UnCheceked Exception
 *  	--> 예외 처리 구문 작성 해도 그만, 안해도 그만
 *   
 *   - 사용자 정의 예외는 RuntimeException 상속 받는 경우 많음
 */
public class MoreThanOneHundredException extends RuntimeException{

	public MoreThanOneHundredException() {
		super("100을 초과하였습니다");
	}
	
	public MoreThanOneHundredException(String message) {
		// 전달 받은 메세지가 그대로 보이게 한다
		super(message);
	}
}
