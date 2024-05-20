package com.sist.main;
/*
 * 	try절 ==> 정상수행이 가능한 문장
 * 	catch 절 => try안에 있는 문장을 수행하는 과정에서 에러가 	발생시 처리
 * 	-------- 여러개 사용이 가능, 예외처리 클래스의 순서
 * 							 -----------------
 * 							 크기 => 상속 => 상속도 => 위로 올라갈수록 에러처리의 기능이 많다
 *  
 * 
 */
import java.util.*;
class A
{
	
}
class B extends A
{
	
}
public class 예외처리_4 {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
				A a = new A();
				B b = (B)a; // 오류발생 => ClassCastException
						
		}catch(ArithmeticException e) // 0으로 나눌 때 에러 처리
		{
			
		}catch(ArrayIndexOutOfBoundsException e) // 배열범위 초과시에만 추리
		{
			
		}catch(NumberFormatException e) //문자열을 정수로 변환할 때 오류 처리
		{
			
		}catch(RuntimeException e)
		{
			
		}
		
		System.out.println("프로그램 종료!!");
	}

}
