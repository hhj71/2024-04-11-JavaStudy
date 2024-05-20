package com.sist.main;
/*
 * 266 page => 예외처리상속도
 * 상위 예외처리 클래스 일수록 => 예외처리 기능을 많이 가지고 있다
 * catch 1개로 여러개를 처리할 경우 : Exception (모든 예외처리 기능을 가지고 있다)
 * 실행시 예외는 RuntimeException
 */
/*
 * 		CheckedException : 컴파일시에 예외처리가 있는지 확인 => 반드시 예외처리를 해서 사용
 *      ----------------  파일 입출력, 오라클연동, 크롤링시, 네트워크, 웹
 *      													  -- 예외처리는 필수
 *      UnCheckedException : 실행시에 예외처리를 처리하기 때문에 => 생략이 가능하다
 *      					 --------------------------- 문법
 *      ==> 예외처리의 종류 (267 page)
 *      	ClassNotFoundException : 클래스를 찾을 수 없는 경우
 *      	---------------------- Class.forName("패키지명.클래스명"); => JSP/Spring => CheckedException
 *      	IOException : 입출력 => (메모리 입출력, 파일 입출력, 네트워크 입출력)
 *          SQLException : ***** 핵심 (오라클 실행 => SQL)
 *         				** => Spring / 데이터베이스 가능자
 *             				  ------ java/jsp/mvc
 *                         --------------------------- 위 내용이 안되면 웹은 포기
 *         				   => HTML/CSS : 윈도우 화면 UI 
 *          InterruptedException : 쓰레드 관련
 *          MalformedURLException : 네트워크 관련   
 *        ----------------------------------------------------------------------------- CheckedException : 반드시 예외처리  
 *           
 *          RuntimeEXception => 아래에 있는 모든 예외를 처리할 수 있는 기능이 있다 
 *          --------------------------------
 *          = NumberFormatException : 정수 변환 => Integer.parseInt() => 웹, 네트워크, 윈도우
 *          														   -----------------
 *          															|정수가 없다
 *          = ClassCastException : 클래스 형변환 문제
 *          = ArrayIndexOutOfBoundsException : 배열의 인덱스 초과
 *          = NullPointerException : 클래스에 주소값이 배정이 안된 상태
 *          = ArithmeticException : 0으로 나눈 경우
 *          = IllegalArgumentException : 매개변수 값이 다른 값이 전송이 된 경우 : 웹에서 전송을 받는 경우
 *            -------------------------------------------------------------------------------
 *            
 *            catch 1개로 처리 가능 : Exception / Throwable
 *            
 *            예외처리의 종류 (모든 프로그램 언어에서 존재, 자바스크립트, 오라클)
 *            = try ~ catch => 가장 많이 사용되는 예외처리
 *            = throws => 라이브러리에 주로 사용된다
 *            
 *            => 286 page
 *            		try ~ catch
 */
public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try
			{
				for (int i=1; i<=10;i++)
				{
					int n =(int)(Math.random()*3); // 0,1,2
					System.out.println(i/n); // 오류가 발생하면 => for 종료하고 => catch를 잦는다
				}
			}catch (Exception e)
			{
				
			}
			//
			/*
			 *   for 안에 => 예외처리
			 *   -----------------
			 *   크롤링 => 모든 HTML이 동일하지 않다 => 스킵
			 */
			
			
			
			
	}

}
