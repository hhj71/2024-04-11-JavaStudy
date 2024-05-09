package com.sist.main;
import java.util.*; // 유틸이라는 폴더안에 여러개의 클래스를 사용 => Scanner / Calendar
// import java.util.Scanner
import static java.lang.Math.random;
import static java.lang.Math.max;
import static java.lang.Math.min;
public class 패키지설정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*100)+1;
		int b=(int)(random()*100)+1;
		System.out.println("최댓값:"+max(a,b));
		System.out.println("최솟값:"+min(a,b));
	}

}
