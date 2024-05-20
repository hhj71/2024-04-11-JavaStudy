package com.sist.main;
// finally
/*
 * 	  예외처리	
 * 		try
 * 		{
 * 			정상 수행 코드 
 * 			=> 에러 발생 가능
 * 		}catch(예외처리클래스)
 * 		{
 *        => 에러에 대한 대비 => 사전에 에러 방지 => 에러 복구
 * 		}catch(예외처리클래스)
 *      {
 *      	=> 에러에 대한 대비 => 사전에 에러 방지 => 에러 복구 => 다시 입력 (continue)
 *      } 
 *      finally => 생략이 가능 (필요시에만 사용) // 예외 발생 여부와 무관하게 무조건 실행된다
 *      { 
 *      	파일 닫기 / 서버 닫기 / 오라클 닫기 ==> 닫지 않으면 DDOS 공격 받을 수 있음.   
 *      	=> try 수행, catch 수행 => 무조건 수행이 된다
 *      }
 * 
 * 	흐름 
 * 		- 에러가 없는 상태
 * 		문장 1
 * 		문장 2
 * 		try 
 * 		{
 * 			문장 3
 * 			문장 4
 * 			문장 5
 * 		}catch(예외처리 클래스)
 * 		{
 * 			문장 6
 * 		}
 * 		finally
 * 		{
 * 			문장 7
 * 		}
 *        ===> 1→2→3→4→5→7
 * 		
 * 		- 에러가 있는 상태 	
 * 		문장 1
 * 		문장 2 ==> 여기서 에러가 발생하면 => 여기서 종료된다
 * 		try // try 안에서 에러가 발생해야 뒤 문장을 건너뛴다
 * 		{
 * 			문장 3
 * 			문장 4  // 에러 발생 1→2→3→6→7
 * 			문장 5
 * 		}catch(예외처리 클래스)
 * 		{
 * 			문장 6
 * 		}
 * 		finally => 필요시에만 사용
 * 		{
 * 			문장 7 // 에러 여부와 관계없이 무조건 수행
 * 		}
 */
public class 예외처리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 에러가 없는 상태 
		System.out.println("1");
		System.out.println("2");
//		System.out.println(10/0);
		try 
		{
			System.out.println("3");
			System.out.println(10/0); // 오류 발생 => catch로 이동
			System.out.println("4");
			System.out.println("5");
			// 수행 문장
		}catch (Exception e) // 에러가 있을 때만 수행
		{
			System.out.println("에러처리 -> 6"); // 에러 확인 => printStackTrace(), getMessage()
		}
		finally
		{
			System.out.println("7"); // 파일 닫기, 오라클 닫기 => 서버 부하가 심하다 ==> 닫기에 자주 사용된다.
		}
	}

}
