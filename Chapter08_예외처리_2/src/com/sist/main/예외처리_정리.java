package com.sist.main;
/*
 * 	예외 처리가 필요한 곳 
 * 	=> 컴파일러에 예외처리가 되어있는지 확인
 * 		---------------------------- 반드시 예외처리 후에 사용 (메소드) =>  CheckedException
 *      java.io , java.sql, java.net, javax.http.servlet
 * 	
 *  => 예외처리를 확인하지 않는 곳 => UnCheckedException	
 * 		java.lang =>예외처리가 필수가 아니다
 * 		=> 생략을 할 수 있는데 => 사용자의 에러가 많이 발생하는 위치 => 예외처리를 하는 것이 좋다
 * 								---------------------------------------
 * 								| 사용자 입력창                           |
 * 								| 나이 입력 ==> textfield =>  받는경우 int |
 *                               ---------------------------------------
 *  => try~catch~finally
 *  => throws 가 있는 경우 어떻게 처리
 *  	
 *  => 예외 발생이 많은 경우 : NumberFormatException
 *  					   브라우저      ==========
 *  								    문자열 (다른 데이터형 없다) => 정수
 *  
 *  try => 원하는 위치에서 사용이 가능 
 *  for문 안에 try~catch 사용하면 for문은 계속 돌아간다.          
 */
public class 예외처리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
