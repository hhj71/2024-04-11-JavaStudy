package com.sist.main;
/*
 * 			
 * 			** catch는 에러가 있을때만 수행  => 수행하면 그 아래있는 문장은 건너뛴다
 * 				-> 정상 수행되면 catch 부분은 건너뛴다
 * 			문장 1 => error => 종료 => catch는 한번 수행
 * 			문장 2 => error 
 * 			문장 3 => 정상 수행 
 */
import java.util.*;
public class 예외처리_3 {
	public static void main(String[] args) {
	try
	{
	Scanner scan = new Scanner(System.in);
	System.out.print("첫번째 정수 입력:");
	// 문자열로 받는다 (윈도우, 웹 => 정수가 없다 => 문자열로 받는다)
	String num1=scan.next();
	System.out.print("두번째 정수 입력:");
	String num2=scan.next();
	
	// 첫번째 에러
	int n1= Integer.parseInt(num1); // 문자열을 정수로 변환 ==> 유효성 검사 
	// => 에러 발생 의심 부분 1
	int n2= Integer.parseInt(num2);
	// => 에러 발생 의심 부분 2
	int n3=n1/n2; // if 처리가 더 편리하다
	// => 에러 발생 의심 부분 3
	System.out.println("n1="+n1);
	System.out.println("n2="+n2);
	System.out.println("n3="+n3);
	// num1, num2, n1, n2, n3 => try 블록 안에서만 사용이 가능하다 => 블록 변수 / 지역 변수
	
	}catch(NumberFormatException e) // 정수변환이 안되는 경우에만 처리 가능
	{
		System.out.println("정수만 입력할 수 있습니다!!");
	}catch(ArithmeticException e) // 0으로 나누는 경우에만 처리
	{
		System.out.println("0으로 나눌 수 없습니다");
	}
	//  RuntimeException 이 NumberFormatException, ArithmeticException 포함함
	
	// 정상수행 가능, 사용자가 입력을 잘못한 경우 => 에러 처리가 안된다 => 입력값을 받아야 알 수 있기 때문
	//  ==> 강제로 예외처리를 하지 않는다 => 필요시에만 예외처리 => 예외처리 생략이 가능
	System.out.println("프로그램 종료!!"); // 정상종료
	// 프로그램을 정상 종료가 가능하게 만든다 => 윈도우, 브라우저를 실행상태로 유지할 수 있게
//	System.out.println("n2="+n2);
	
	// 
	}
}
