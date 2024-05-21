package com.sist.main;
//import java.io.*;
/*
 *  throw : 임의로 에러 발생
 *  	    형식) 		
 *  			  throw new 예외클래스() => catch로 이동
 *  				=> (밑에)코딩이 불가능
 *  		catch는 예외처리 크기에 따라 순서가 존재 => 상속도
 *  		throws 문장 예외처리 -> 순서가 없다 
 *   try
 *   {
 *     		1
 *          2
 *          3
 *          --------------------------
 *          4   => error => catch로 이동
 *          5
 *          6
 *          7
 *          --------------------- skip  
 *    }catch (Exception e){8}
 *    		9
 *    		10      
 *     
 *      자바는 다시 올라오지 않는다 
 *      
 */
import java.util.*;
public class 예외처리_2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("양수만 입력:");
		int no = scan.nextInt();
		try
		{
			// 예외처리 발생한 것이 아니라 => 임의의 발생
			if(no<0)
			{
				throw new IllegalArgumentException("음수는 사용할 수 없습니다!!"); // catch 이동
				// 예외를 던진다 => 직접 예외의 catch를 호출 가능
				// 아래에 코딩 불가 (catch로 이동하기때문에 아래 코딩은 의미가 없음)
				// 견고한 프로그램인지? => 에러 발생시에 처리가 되고 있는지? => 테스트
				// 개발자 => 단위테스트 => JUnit
				// 애플리케이션 테스트
				// System.out.println("음수는 불가능합니다!!");
			}
			System.out.println("no="+no);
		}catch(IllegalArgumentException e) // 입력값이 잘못된 경우 사용
		{
			//"음수는 사용할 수 없습니다!!" -> getMessage()
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(e.getMessage());
		}catch(Exception e) // 기타 (예상하지 못한 오류)
		// 제일 큰 범위의 예외처리클래스니까 마지막에 위치해야 한다.
		{
			System.out.println(e.getMessage());
		}
		// 반드시 실행되는 문장이 있는 경우
		System.out.println("프로그램 종료!!"); 
	
//		try {
//			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
