package com.sist.main;
/*
 * 		문자열 2개 받아서
 		정수배열에 저장 ==> 정수변환(사용자) , 배열의 인덱스 (프로그래머 실수)
 		배열값을 나누기해서 출력 => 사용자가 나누기 값을 0을 입력하는 경우
 		----------------------------------------------------------
 		1. 예상되는 에러 => 3개
 		2. 기타 발생 	=> 4개
 		----------------------------------------------------------
 		   1) 사전에 에러 방지핳 수 있는 프로그램 제작
 		   		웹 -> 사용자 -> 사이트에서 오류 발생하면 => 탈퇴
 		   		=> 배포 => 의뢰자가 일부러 오류 => 유지하는 것 확인
 		   		    --------------------------------------- 통과 안되면 (위약금 / 다시 개발)
 		   		    														  -------
 		        => 방지하기 위해서 신입사원 교육이 타이트하다                           급여가 없다
 		        -> 신입사원 교육 => Spring											 
 * 
 * 
 */
import java.util.*;
public class 예외처리_6 {
		public static void main(String[] args) {
			try
			{	
				String s1="3";
				String s2= "0";
				int n1= Integer.parseInt(s1);
				int n2= Integer.parseInt(s2); // error
				int[] arr = {n1,n2};
				System.out.println(arr[0]/arr[1]); // error
			}catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("배열 범위 초과");
			}
		}
}
