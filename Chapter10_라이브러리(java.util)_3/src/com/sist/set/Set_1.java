package com.sist.set;
/*
 * 
 * 
 * 
 * 특징) 
 * 		1. 순서가 없다(인덱스가 존재하지 않는다)
 * 		2. 데이터 중복을 허용하지 않는다
 * 			=> DISTICNT (오라클)
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;
public class Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 장르별 / 부서명 / 상품명 .....
		Set<String> set = new HashSet<String>();
		// 저장장소 선언
		set.add("사과");
		set.add("배");
		set.add("체리");
		set.add("수박");
		set.add("메론");
		set.add("참외");
		set.add("사과"); // 중복된 데이터는 저장할 수 없다 => 이미 존재하는 데이터는 저장이 불가능하다
		set.add("배");
		set.add("오렌지");
		set.add("딸기");
		System.out.println("======== 저장된 과일 출력 =======");
		// => index번호가 없다 => for-each
		for(String f:set)
		{
			System.out.println(f);
		}
	}

}
