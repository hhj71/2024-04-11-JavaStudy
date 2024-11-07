package com.sist.main;
/*
 * 	 상속
 * 		=> 사용자 정의 클래스는 상속으로 사용을 잘 안한다
 *      => 라이브러리 클래스
 *         --------------
 *      => 단일 상속
 *      	=> 상위클래스는 가급적이면 공통기반을 모아서 처리
 *      		class  사람 ==> 재사용
 *                  |
 *             extend 사람    
 *          -------------------
 *          |     |     |      |     
 *        회사원  학생   교직원   교수
 *   
 *        => 메모리에 저장하는 방법 (대입)
 *          상위 클래스 = 하위 클래스
 *          --------------------
 *          상위 클래스 = 상위 클래스
 *          하위 클래스 = 하위 클래스
 *          하위 클래스 = (하위클래스)상위 클래스
 *          
 *          => 클래스 크기 비교는 상속이 있어야 가능
 *             --------
 *             상속 내리는 클래스 > 상속 받는 클래스
 *             ------------------------------
 *             = 선언되는 클래스에 따라 달라짐 : 변수
 *             = 생성자에 따라 달라짐 : 메소드 지정
 *          
 *          class Super
 *          {
 *          	int a=10;
 *          	int b=20;
 *          	public void display()
 *          	{ 
 *          		System.out.println("Super: display() call...")
 *          	}
 *          }
 *          class Sub extends Super
 *          {
 *          	int a=100;
 *          	int b=200;
// *              public void display()
// *              {
// *               	System.out.println("Sub: display() call...")
// *              }
 *          }    
 *              Super sup = new Super(); sup => a=10,b=20,Super: display() call... 
 *              Sub sub = new Sub(); sub => a=100, b=200, Sub: display() call...
 *              
 *              Super sup2 = new Sub()
 *              -----        --------- 
 *              a=10,b=20    Sub: display() call... => 오버라이딩
 *              				--> 생성자에 따라서 메소드가 덮어써진다
 */
// 동물
class A
{
	int a=10;
	int c=20;
	public void display()
	{
		System.out.println("A: display() Call...");
	}
}
// 사람
class B extends A 
{
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	int a=100;
	int c=200;
	public void display()
	{
		System.out.println("B: display() Call...");
	}
}
// A aa=new B() ===>(X)
public class MainClass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa=new A();
		System.out.println(aa.a);
		System.out.println(aa.c);
		aa.display();
		
		System.out.println("==============================");
		// 이런 형식 가장 많이 사용
		B bb=new B();
		System.out.println(bb.a);
		System.out.println(bb.c);
		bb.display();
		
		
		System.out.println("==============================");
	
		A cc=new B();
		System.out.println(cc.a);
		System.out.println(cc.c);
		// 상위 = 하위 => 변수 (상위)
		cc.display();
		// new B() => B가 가지고 있는 메소드
		
		System.out.println("==============================");
		
		B dd = (B) cc;
		// 라이브러리 클래스 -> 형변환
		System.out.println(dd.a);
		System.out.println(dd.c);
		dd.display();// B
		
		
	}

}
