package com.sist.lang;
/*
 * 	 복제 => clone()
 *   => Object 는 모든 데이터형을 받을 수 있다
 *   => 자바에서는 대부분이 리턴형과 매개변수로 Object 를 사용한다 
 * 	 => 클래스 여러개를 묶어서 관리 => Object
 * 
 * 	class A
 * 	class B
 *  class C
 *  
 *  A a=new A()
 *  B b=new B()
 *  C c=new C()
 *  ============> 관리하기 어려움
 *  
 *  Object[] arr={new A(), new B(), new C()}
 *  ===> 여러개를 한개의 이름으로 제어하는 것이 중요하다
 *  ex) Object[] arr = new Object[100] => 100개의 클래스 한번에 제어
 *  
 *  => 객체지향은 누가 잘 묶어서 사용하는가? 
 *  
 *  화면 출력(관리 대상) 데이터 모으기 => 저장하는 공간 : 변수
 *  	=> 벤치마킹
 *  	=> 한개만 변수 : 로그 
 *  
 *  -------------------
 *  초기화 : 데이터를 저장 => 생성자
 *   => 기본 데이터를 저장 => 디폴트 생성자
 *   => 값을 받아서 저장 => 매개변수가 있는 생성자
 *   => 생성자는 여러개 필요할 때도 있다
 *      --------------------------- 오버로딩
 *      	오버로딩
 *      	 = 중복 함수 정의 => 같은 이름으로 제작
 *      	 = 메소드명이 동일
 *      	 = 매개변수를 다르게 만든다 (개수, 데이터형)
 *      	 = 리턴형은 관계없다
 *      	 = 접근지정어는 관계없다
 *      => 생성자
 *  		클래스명과 동일
 *  		리턴형이 없다
 *  	=> 필요시에만 생성 => 없는 경우에는 컴파일러가 자동으로 추가 (매개변수가 없는 생성자)
 *  		** 시작과 동시에 처리
 *  			= 화면 UI / 자동 로그인 / 서버 연결 / 데이터베이스 연결
 *  		*** 데이터베이스에서 읽어서 주로 처리
 *  	-----------------------
 *  	메소드 : 기능 처리
 *  			목록 출력, 페이지 나누기, 상세보기, 예약, 결제...
 *  			=> 다른 클래스와 연결
 *  			=> 접근지정어는 public
 *  				리턴형 / 매개변수
 *  				--------------
 *  				메소드 => 프로그램마다 기능은 동일 => 처리가 다르다
 *  				=> 추상클래스 / 인터페이스 => 한개로 통합
 *  				ex) 카페(네이버 카페 게시판)
 *  					영화 
 *  						= 상영영화 출력
 *  						= 상영예정작 출력
 *  						= 상세보기
 *  						= 예매기능
 *  						---------------------- CGV / 메가박스 / 롯데시네마
 *  											   -----------------------
 *  	}
 *  	
 *                                 | 반드시 정보처리기사 필수...
 *                                 ----
 *  	==> 클래스 제작이 가능 => 개발 (공기업/금융권 => 75%) = 차세대 개발, 학교 
 *  		--------------          스프링 기반                       ASP(MS) 기반
 *  		=> 에러에 대한 사전 대비 
 *  		=> 비정상 종료가 없는 프로그램
 *  		------------------------ 예외처리 (견고성)
 *  		=> 속도 (최적화)
 *  		=> 가독성 (유지보수) => 표준화해야 한다 => 인터페이스 (스프링, 마이바티스, JPA, VueJS, React)
 *  		=> 틀은 동일 => 분석
 *     
 *     => 예외 복구 => try~catch (복구)
 *        -------------------------- ↑ 대부분 사용
 *     => 예외 회피 => 알림 => throws => 복구는 불가능
 *     
 *     => 살을 붙이기 시작
 *     	  ------------- 라이브러리 (사용자가 만들지 못하는 기능을 제공해준다)
 *     		자바 => 거의 모든 내용이 만들어져 있다 (라이브러리 찾기가 중요)
 *     		 --------------------------------------------------
 *     			| 조립 => CBD (조립식 프로그램)
 *     			   | 자바개발자의 단점은 라이브러리가 없는 경우에는 조립이 안된다
 *     			  => C/C++ : 개발자
 *     			  => Java : 프로그래머
 *     			  => 스프링에서 kotlin 지원
 *                
 *         java.lang/ java.util / java.io / java.net / java.sql (브라우저에서 출력) 
 *         ----------------------------------------------------       
 */
class Card
{
	
}
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%d%s%c%f",10,"aaa",'a',10.7); //printf의 매개변수 ==> (String format, Object... args)
	}

}
