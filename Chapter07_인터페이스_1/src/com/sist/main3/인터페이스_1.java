package com.sist.main3;
interface A
{
	public void aaa();
}
interface B
{
	public void bbb();
}
// 다중상속 => , 로 구분한다.
/*
 * 	자신의 클래스 = 자신의 생성자()
 * ---------------------------
 * 상위클래스 = 하위클래스 생성자
 * 
 * 	class A
 *  class B extends A
 *  
 *  A a = new A()
 *  B b = new B()
 *  
 */
class C implements A,B
{
	public void bbb() {
		System.out.println("C : bbb() call...");
	}
	public void aaa() {
		System.out.println("C : aaa() call...");
	}
}
/*
 * 	 상속을 받은 경우
 *   -------------
 *   	1. 변수 ===================> 클래스 선언
 *   	2. 메소드 ===================> 생성자 => 메소드를 덮어쓴다
 *   
 *   	class A
 *   	{
 *   		int a,b;
 *   		public void aaa(){}
 *   	}
 *   	A aa = new A();
 *      ----      ------     => aa.a aa.b aa.aaa()
 *      | 변수      |메소드
 *      
 *   	class B
 *   	{
 *   		int c;
 *   		public void bbb(){}
 *   	}
 *   	B bb = new B();
 *      ----       ----
 *  =>  |bb.c       |bb.bbb()
 * 
 * 		class C extends A
 * 		{
 * 			--------------------------
 * 				int a,b;
 * 				public void aaa(){}
 * 			----------------------- 상속받은 내용
 * 				int d;
 *				public void ddd(){}
 *		}
 *		
 *		C c = new C(); ==> C가 가지고 있는 모든 내용 
 *		A a = new C();
 * 
 * 			
 * 		interface A
 * 		{
 * 			void aaa();
 * 		}
 * 		interface B
 * 		{
 * 			void bbb();
 * 		}
 * 		extends / implements => 상속과정
 * 		
 * 		class C implements A,B
 *              ---------- 상속
 *      {        
 * 			aaa()
 * 			bbb()
 * 		}
 * 
 * 
 * 
 * 
 * 
 */
/*
 * 
 */
//=> 다중상속 
interface AA
{
	void aaa();
}
interface BB extends AA
{
	// aaa();
	void bbb();
}
class CC implements BB
{

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a=new C(); // aaa() 호출 가능
		// 클래스명 
		a.aaa();
		B b=new C(); // bbb() 호출 가능
		b.bbb();
		// => 다중 상속시에는 상속받은 클래스 이용 => 모든 메소드를 가지고 있기 때문에...
		C c=new C(); // => aaa(), bbb() 호출 가능
		c.aaa();c.bbb();
	}

}
