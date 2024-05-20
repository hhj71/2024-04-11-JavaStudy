package com.sist.main;
// 에러메세지 => 출력
/*
 * 	에러 확인
 * 	getMessage() : 에러내용만 출력
 * 	printStackTrace() => 권장사항 => 에러 위치 확인 가능
 *  -------------------------------------------
 *  
 *  Exception : 상속을 내린 모든 클래스의 예외 처리 기능을 가지고 있다
 *  -----------------------------------------------------------------------------
 *  	IOException / SQLException / ClassNotFoundException / RuntimeException
 *      ....
 *  ----------------------------------------------------------------------------     
 *   RuntimeException : 실행시 예외처리의 모든 기능을 가지고 있다
 *   -----------------
 *     ClassCastException / ArithmeticException / NullPointerException / NumberException
 *     
 *   상속에서 크기
 *   ---------- 상속 내리는 클래스가 받는 클래스보다 크다
 *   class A
 *   class B extends A     => A>B
 *           ------- 클래스에서 클래스 상속은 확장이라는 뜻을 가지고 있다
 *   
 *   interface A
 *   class B implements A  => A>B ===> 인터페이스도 클래스다
 *           ---------- 인터페이스에서 클래스 상속은 구현한다는 뜻을 가지고 있다 (인터페이스는 구현이 안된 메소드를 가지고 있다)
 *           								   ------ 구현해서 완성된 클래스를 만들어서 사용
 *  --------------------------------------------------------------------------------------------------------
 *     => ClassCastException < RuntimeException < Exception < Throwable
 *     ----------------------------------------------------------------------   
 *     예외처리
 *      Exception =>  예외정리의 최상위 클래스 / 다중 catch문을 이용할 때 반드시 맨 마지막에 위치해야 한다
 *      --------- 모든 예외처리가 첨부되어 있다
 *      	=> 어떤 에러가 발생했는지 확인
 *      		getMessage(), printStackTrace() (권장)
 *      			=> 에러발생시 처리 : output 창 (console)
 *      			      	
 */
class AAA
{
	
}
class BBB extends AAA
{
	
}
public class 예외처리_7 {
//	String msg; // 초기값 null => null 같은 경우에는 연결하는 주소가 없어서 => 메소드를 사용할 수 없다
	            // => NullPointerException
	public static void main(String[] args) {
		try 
		{
		 // int a = Integer.parseInt(" 10"); // 정수변환 
//			int[] arr = new int[2];
//			arr[0]=10;
//			arr[2]=20; // index 초과
//			System.out.println(10/0);
//			예외처리_7 a = new 예외처리_7();
//			String s = a.msg.concat("Java"); // 문자열 결합 => + => 오류 발생 (주소가 없음(null))
			                                 // Cannot invoke "String.concat(String)" because "a.msg" is null
//			System.out.println(s);
			AAA a = new AAA(); // AAA a = new BBB(); 로 해야 오류가 안난다
			BBB b = (BBB)a; //ClassCastException
			                //class com.sist.main.AAA cannot be cast to class com.sist.main.BBB
			// 형변환은 반드시 생성자가 일치해야 한다 AAA a = new BBB();
		}catch(Exception ex)
		{
			// Exception => 자바에서 지원하는 모든 오류처리가 가능 => Throwable : Error도 출력 => 웹에서 사용
			ex.printStackTrace();
//			System.out.println(ex.getMessage());
			// error가 자주 나는 경우 => try~catch 이용...
		}
	}
}
