package com.sist.lang;
/*
 * 		wrapper : 모든 기본형 데이터형을 클래스화 시켜서 기능을 부여함 => 사용이 쉽게
 * 		-------
 * 		Integer --> int
 * 		문자열 => 정수로 변환
 * 		Integer.parseInt(String)
 * 		
 *      Double  --> double
 * 		문자열 => 실수로 변환
 *      Double.parseDouble(String)
 *      
 * 		Boolean --> boolean
 * 
 * 		Float --> float
 * 		Byte --> byte
 *  ----------------------------
 *  
 *  	오토박싱/ 언박싱
 *  	------------
 *  	Integer i =10; ==> 오토박싱
 *  	int ii = i  ==> 언박싱
 *      --------------------- integer / int 교환이 가능
 * 
 * 	  * 제네릭스 : 데이터형을 변경 => 이미 만들어져 있는 라이브러리의 데이터형 변경
 * 		 |						 ----------------------------------
 * 		클래스만 등록 가능				 메소드의 리턴형 / 매개변수
 * 
 * 		<데이터형>
 *       <int> (x) => <Integer>
 *       => 라이브러리 매개변수/ 리턴형의 데이터형을 변경할 수 있다 => 형변환 없이 사용
 */
// 제네릭스 => 데이터형 통일
class A<T>
{
	T t;
	public T getT()
	{
		return t;
	}
	public void setT(T t)
	{
		this.t=t;
	}
}
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A<String> a =new 
		
		Integer i =100;
		System.out.println(i);
		int ii=i;
		System.out.println(ii);
		// 형변환 없이 사용
		
		String s = "1000"; // 웹에서 자바로 보내는 모든 정수는 문자열
		System.out.println(Integer.parseInt(s)+1);
		
	}

}
