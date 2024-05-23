package com.sist.util;
/*
 *    StringTokenizer : 문자열 분리
 *    
 *    nextToken() => 분리된 데이터를 가지고 오는 경우
 *    hasMoreTokens() => 분리된 데이터만큼 루프
 *    counterToken() => 분리된 개수
 */
import java.util.*;
public class 라이브러리_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String colors="red, green, blue, black, white, yellow, magenta, pink, gray";
		StringTokenizer st = new StringTokenizer(colors, ",");
//		 구분자가 있을 땐 구분자대로 자르고 , 없을 때는 공백 기준으로 자른다
		System.out.println("color의 개수 :"+ st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while (st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		/*
		 *  		hasMoreTokens() => 329 page => 이미지 => 전체 분리된 데이터를 가지고 올 때
		 *  
		 *  cursor--------------------------
		 *  		before / first
		 *   -------------------------------
		 *  	 
		 *  
		 *  
		 *  
		 *  
		 */
	}

}
