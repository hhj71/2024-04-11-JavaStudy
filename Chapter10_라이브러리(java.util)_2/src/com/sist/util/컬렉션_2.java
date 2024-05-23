package com.sist.util;
import java.util.*;
public class 컬렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		// add(Object)
		list.add(100);
		list.add("홍길동");
		list.add('A');
		list.add(true);
		list.add(10.5);
		// 데이터형을 마음대로 첨부 => 관리하기 어렵다, 반복문을 사용하기 어렵다
		int a = (int)list.get(0);
		String name = (String)list.get(1);
		char c = (char)list.get(2);
		boolean b = (boolean)list.get(3);
		double d = (double)list.get(4);
		// => 가급적이면 동일한 데이터형을 저장해서 사용한다
		// 형변환이 부담스럽다
	}

}
