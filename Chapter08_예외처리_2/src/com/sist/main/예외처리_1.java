package com.sist.main;
/*
 * 	9장 => 메소드
 *  	java.lang
 *  	java.util
 *  
 *  10장 => 자료구조 => 웹 => 크롤링 => 배열을 대체 => 컬렉션/제네릭스
 *  ---------------------------------------------------------- ↑ 예외 처리 필수 
 *  
 *  11장 => 입출력
 *  
 *  12장 => 핵심 (java.sql) => 오라클 연동
 *  -------------------------------------------- 사용자 정의 메소드는 없다 => 조립
 * 	
 * 	 1. 데이터형 / 변수 / 연산자 / 제어문
 *   2. 클래스 구성요소 : 멤버변수 (static) , 메소드 , 생성자
 *   3. 재사용 => 상속 / 포함
 *   4. 클래스의 종류 : 추상클래스, 인터페이스
 *   5. 예외처리 : try ~ catch, throws
 *   --------------------------------------------------- 자바 기본 문법
 *   6. 라이브러리
 *   7. 조립 (라이브러리를 이용해서 프로그램 제작)
 *   ---------------------------------------------------
 *   	=> 사용 (웹) => 자바는 변경사항이 없다
 *   				=> 출력하는 형태만 다르다 (윈도우 출력, 도스 출력, 브라우저) 
 *                                                            ------  HTML/CSS (Java + HTML)
 *                                                            					==> Java와 HTML 분리 => MVC
 *                                                            										  ----- Spring
 *                                                                              ==> 기술 => 자바스크립트
 *                                                                              ==> 배포 => AWS(리눅스)
 *     => 데이터베이스 라이브러리 : MyBatis / JPA
 *     => Full Stack : Ajax, VueJS, React(React-Query), Redux
 *                                                      ----- React의 MVC 구조
 *     => 서버가 분리 ( 역할별 => 서버를 따로 제작) => MSA 구조
 *     ------------------------------------------------------------------------
 *      파이썬 => 데이터 분석 => 브라우저 출력 (장고) => React
 *      	     -------- 넘파이/판다스/MatplotLib
 *     ------------------------------------------------------------------------ 
 *     => 70% -> 자바, 20% -> 데이터베이스
 *       ------------------------------ 자바/오라클
 *       
 *        => 자격조건 : Spring(Spring-Boot), Vue/React(React-Query), MyBatis, JPA
 *        				=> 리눅스 사용자
 *        				=> MSA
 *        				=> 정보처리기사(산업기사)
 *  ============================================================================================================================
 *  
 * 	 예외처리 : 사전에 에러발생에 대한 방지 프로그램
 * 			  -----------
 * 				=> 비정상종료를 하지 않고 정상수행이 가능하게 만들어준다
 * 				=> 에러가 나면 => 에러를 자동 수정해주는 것이 아니라 점프를 해서 에러부분을 통과한다...
 *                              ------------               ---------------------
 *                 문장 1
 *                 문장 2 => 에러발생 => 프로그램 종료 => 뒷 문장 수행 안함
 *                 문장 3 
 *                 ======> 에러부분의 문장을 컴파일시 무시(통과) => 예외 처리 
 *       에러발생
 *       ------ 1. 처리 (조건문을 먼저 고려) => 조건문으로 처리가 어려운 경우 => 예외처리 이용
 *       ------ 프로그래머의 실수 (배열 인덱스 초과, 파일명 오류 ....) => 테스팅
 *       ------ 사용자 입력값 오류 => 웹 (유효성검사 => 자바스크립트)
 *       
 *       에러종류
 *       Error : 수정이 불가능한 에러 (메모리 부족, 이클립스 오류 ....) 
 *       Exception : 수정이 가능한 에러 => 가벼운 에러
 *       			 -------------- 프로그램 소스 안에서 수정
 *       			  IP연결시 IP오류.... , 크롤링시 사이트 URL 오류, 파일명 오류...
 *       			  라이브러리 사용시 => 라이브러리를 로드 안한 경우
 *       
 *       정상처리 방법 (예외처리 방법)
 *       	= 직접처리 (프로그래머가 에러를 직접 잡아서 => 복구) => 예외 복구
 *       							  -------- catch
 *       			형식) try~catch~finally
 *       
 *       	= 간접처리 (떠맡기기) => 메소드 호출시에 예외처리
 *       			  => 예측되는 에러만 선언 => 라이브러리, 복잡한 소스가 있는 경우
 *                  형식) 메소드() throws  예외 종류
 *                       ------          -------
 *                       메소드를 호출해서 사용하려면 => 뒤에 선언된 예외처리를 하고 호출한다
 *                       	=> 복구할 수 없다 => 예외를 피해간다 => 예외 회피
 *                       
 *       	= 임의발생 : 테스트(에러발생시 -> 견고 ) 많이 사용하지는 않는다
 *       				형식) throw
 *       
 *       	= 사용자 정의 : 자바에서 전체적인 예외처리를 지원하지 않는다 => 필요시에는 직접 만들어서 사용 => 사용빈도는 거의 없다
 *       
 *       	=> catch는 순서가 존재
 *       	=> throws는 순서가 없다
 *       	=> 예외처리의 상속도 (반드시 예외처리(CheckedException),  필요시 예외처리(UnCheckedException)
 *       	   -------------     컴파일시 예외처리 확인                실행시 처리 (사용자 입력값을 받아서..)
 *       
 *       	=> 상속도
 *       					Object => java.lang.* => 모든 클래스의 최상위 클래스 (모든 클래스는 Object 상속)
 *       					   |
 *       					Throwable => 예외처리의 최상위 클래스 => Error/Exception
 *       						|
 *       			----------------------------
 *                  |                          |
 *                Error                    Exception => 예외처리의 기본 클래스
 *                							   |
 *                			   -----------------------------------------------------
 *                             |                                                   |
 *                      CheckedException                                     UnCheckedException
 *                      ----------------                                      ------------------
 *                      컴파일시에 예외처리 확인                                   컴파일시에 예외처리 미확인
 *                      => 반드시 예외처리 사용                                    => 필요시에만 예외처리 사용 (생략가능)
 *                                                      
 *                     => IOException : 입출력                                  => 최상위 클래스
 *                        -----------                                            RuntimeException
 *                        => 파일                                                      |
 *                        => 메모리                                                ArrayIndexOutOfBoundsException : 배열의 인덱스 초과
 *                     => SQLException : 오라클 연결/해제                            NumberFormatException : 웹, 윈도우
 *                    	  ------------                                                    =>  정수가 필요한데 웹이나 윈도우는 문자열만 전송 => 정수로 변환후에 사용
 *                     	  => 연결시 => 오라클서버주소                                                  Integer.parseInt() => 문자열을 정수로 변환
 *                        => SQL문장                                                               -------- 기본형 int를 사용하기 쉽게 => 클래스화
 *                        => 입력값 오류                                                             Double, Boolean, Float, Byte 
 *                        => 자바(입력값 전송) => 오라클에서 결과값 얻기                                   ----------------------------- 기본 데이터형을 클래스화 => Wrapper
 *                        => 오라클 : 전체 프로그램에서 사용되는 데이터를 저장              ArithmeticException : 0으로 나누기
 *                           ----- 데이터 저장 : 크롤링                              NullPointerException
 *                     => MalformedURLException : IP, URL 주소가 틀린 경우           ClassCastException
 *                     	  ---------------------
 *                     		=> 크롤링(정적: Jsoup , 동적: 셀레니움) 할 때 자주 발생                                                                                                         
 *                             
 *                     => InterruptedException : 쓰레드
 *                     
 *                     => ClassNotFoundException : 클래스이름으로 메모리 할당 안됨
 *                         new => 대신 
 *        => 라이브러리
 *        		- java.lang : 기본 사용 클래스
 *        			= Object, String, StringBuffer, Math Wrapper  
 *        		- java.util : 유용하게 사용되는 클래스
 *        					
 *        		- java.io : 파일 => FileReader, FileWriter
 *        		- java.sql : Connection, Statement, ResultSet...
 *        
 *        => 사용법
 *        		1) try ~ catch ~ finally  
 *        			
 *        			try
 *        			{ 
 *        				정상적으로 실행되는 소스
 *        				=> 예상못한 에러가 발생할 수 있다 => 프로그래머의 실수 / 사용자 입력의 문제
 *                      => 프로그램에서 중요시
 *                      	에러에 대한 대비 : 에러를 예상
 *                  }catch(예외처리 클래스) => 멀티 (여러개 사용이 가능)
 *                   {
 *                   		에러를 잡아서 복구 => 에러확인
 *                   						  ---------------
 *                   							getMessage() : 에러메시지만 출력
 *                   							printStackTrace() : 실행하는 과정 => 에러위치 확인
 *                   							---------------- 권장
 *                   							=> 에러나는 경우 => output창
 *                   							=> 에러 확인
 *                   }
 *                  finally => 생략이 가능
 *                  {
 *                  	try/catch 상관없이 무조건 수행하는 문장
 *                  	=> 파일 닫기 , 오라클 닫기, 서버 닫기...
 *                  	=> 연결 => 회수 (메모리 회수가 안된다)
 *       
 *               2) throws => 선언, 라이브러리
 *               	---------------------------------
 *                  메소드() throws 예외처리등록  => 떠맡기기
 *                  ------------------------------------
 *                  	| 메소드를 호출하려면 등록 예외처리를 하고 사용
 *                  	| 이미 소스가 만들어진 경우	     
 *                                                                                                                               
 *                  
 *                    => throws 문장
 *                    	 public void disp() throws ArrayIndexOutOfBoundsException, NumberFormatException, NullPointerException 
 *                    		{
 *                    		}
 *                    		
 *                    		=> 호출에 등록된 에외처리를 한 후에 사용한다                                                                                                        
 *                       
 *                       public void print()
 *                       {
 *                       	disp();	=> 정상 수행 (예외처리가 없어도 된다) => UnCheckedException
 *                       }
 *                       
 *                       public void disp() throws Exception
 *                       {
 *                       }
 *                       
 *                       public void print()
 *                       {
 *                       	disp(); => 오류 발생
 *                       }
 *                       
 *                       // 1. 떠맡긴다 , 2. 직접 처리
 *                       public void print() throws Exception => 시스템에 알려만 줘서 떠맡긴다
 *                       {
 *                       }
 *                       
 *                       ==> 예외처리 전체 통합 => Exception
 *                       
 *                       public void print()
 *                       {
 *                       	try
 *                       	{
 *                       		disp();
 *                       	}catch(Exception e){} 
 *                       }                                                                                                  
 *                          
 *                          
 *                          ==> 라이브러리 -> 이미 소스코딩이 되어있는 상태 => try~catch보다 throws가 편리하다
 *                          													   ------ 유지보수                                                                                               
 *                                                                                                                            
 *                                                                                                                            
 */
public class 예외처리_1 {
	// display() 호출시에 => 발생할 수 있는 에러 예상
	// 사용시에는 반드시 예외 처리를 하고 사용한다
	// throws 뒤에는 예외 등록 => 순서가 없다
	// throws 뒤에 예외 등록은 보통 => CheckedExeption
	/*
	 *  try~catch : 초기화 블록, 생성자, 메소드에서 사용이 가능
	 *  throws : 생성자, 메소드에서만 사용가능
	 *  ** 권장사항 => 가급적이면 try~catch를 사용한다
	 *  ** 라이브러리는 프로그래머에게 처리 요청 => throws 문장으로 메소드 정의
	 */
	public void display() throws ArrayIndexOutOfBoundsException, NumberFormatException,
	                             NullPointerException, IllegalArgumentException
	 {
		
	 } 
	// 
	public void print() throws ArrayIndexOutOfBoundsException, NumberFormatException,
    NullPointerException, IllegalArgumentException
     {
		display();
     }
	public void print2() throws Exception
	{
		display();
	}
	public void print3()
	{
		display();      // UnCheckedException이라서 생략이 가능하다
	}
	public void print4()
	{
		try
		{
			display();
		}catch(ArrayIndexOutOfBoundsException e) {}
		catch(NumberFormatException e) {}
		catch(NullPointerException e) {}
		catch(IllegalArgumentException e) {}
	}
	public void print5()
	{
		try 
		{
			display();
		}catch(Exception ex) {}
	}
	
	public void disp() throws Exception // CheckedException 이기 때문에 생략 불가능
	{
		
	}
	// 예외처리는 축소할 수 없다 => 상속도 알아두기
	public void print6() 
	{
		try {
			disp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void print7() throws Throwable
	{
		disp();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
