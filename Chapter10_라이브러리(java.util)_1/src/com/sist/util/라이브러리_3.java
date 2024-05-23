package com.sist.util;
// java.lang을 제외한 나머지는 반드시 import를 사용해야 한다
import java.util.*;
// 한개를 사용시에는 => import java.util.Scanner
// 두개 이상 => *
public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(); // 웹 => 예약이 가능한 날, 예약 시간 변동 => 오라클에 저장후에 예약 프로그램 
		for(int i=1; i<=10; i++)
		{
			System.out.print(i+"번 학생 학점:");
			int score = r.nextInt(5)+1; // 1~5
			switch(score)
			{
			case 1:
				System.out.println('A');
				break;
			case 2:
				System.out.println('B');
				break;
			case 3:
				System.out.println('C');
				break;
			case 4:
				System.out.println('D');
				break;
			case 5:
				System.out.println('F');
				break;
				
			}
		}
	}

}
