package com.sist.main;
/*
 * 	1. 객체지향 프로그램 => 규칙 (권장사항)
 * 		1) 기존의 프로그램을 쉽게 제작, 활용
 *         ---------------------
 *         = 코드의 재사용이 높다(개발이 빠르다) => 상속, 포함
 *         									----  ----
 *                                            |     | 기존의 기능을 있는 그대로 사용 => has-a
 *                                            | 기존의 기능을 변경 (오버라이딩) => is-a
 * 		   = 코드관리가 용이하다 => 구조화 프로그램 (프로그램을 관련된 사항만 나눠서 작업) => 메소드
 *         = 이미 사용중인 프로그램을 변경해서 사용가능
 *           ----------------- 신뢰성이 높은 프로그램
 *         = 보안 => 데이터를 보호 => 캡슐화
 *      ---------------------------------------------------
 *        객체지향의 3대 특성 : 캡슐화 => 변수관련 => private 변수/ 메소드를 이용하여 접근하는 방식
 *                           상속 => 재사용 기법 
 *                          다형성 => 오버로딩/ 오버라이딩 => 유지보수 (기능변경 => 메소드관련)     
 *        ** 상속을 사용하면 결합성이 높고, 제약조건이 많이 존재, 메모리가 커진다, 속도가 늦다는 단점 존재 => 가급적이면 사용하지 않는다
 *        		=> Java는 단일 상속만 가지고 있다. 
 *              => 상속 기호 : extends => 기존의 클래스를 확장해서 사용 ...
 *                 class A
 *                 class B extends A
 *                      ---       ---
 *                       |         | 상속을 내리는 클래스  => private
 *                       |                             => static      =====> 이 4개를 제외하고 나머지는 상속이 된다.
 *                       | 상속 받는 클래스                => 생성자
 *                                                     => 초기화블록
 *        ** 상속을 내린 클래스 (상위, 부모, 베이스 클래스)는 상속받은 클래스의 변수, 메소드에 접근이 안된다.
 *        ** 상속을 받은 클래스는 상속 내린 클래스에 접근이 가능
 *           --------------   ------------
 *            |                  | 자신의 객체만 가지고 있다 => this          
 *            | 자신의 객체, 상위클래스 객체 
 *              --------   -----------                              
 *                this       super
 *       ** 모든 클래스는 자신의 객체를 가지고 있다 => this
 *          ------------------------------- 인스턴스, 생성자에서 사용이 가능
 *       ** static 메소드나 static 초기화 블록은 this가 없다
 *       ** new를 이용해서 객체 생성시에 => this가 생성                                            
 *          ------ JVM에 의해서 자동 생성                                     
 */              
public class MainClass_1 {
	private int num; // num -> heap 에 저장됨
	public MainClass_1()
	{
		System.out.println("this라는 자신의 객체가 생성");
		System.out.println("this="+this);
	}
	public void numData(int num) // num -> stack 에 저장됨
	{
		// 적용하는 우선순위 => 지역변수와 매개변수가 우선순위 ==> 멤버변수를 찾는다
		System.out.println("num="+num);
		//                        ---
        //	                  지역변수, 매개변수
		
		// 멤버변수를 사용할 때는 this.변수명
		System.out.println("this.num="+this.num);
		// this가 구분자 => 멤버변수
		// 글씨 색상에 따라서도 변수 구분 가능
		this.num=num;
		System.out.println("this.num="+ this.num);
		// 매개변수와 멤버변수의 충돌 
	}
	public void display()
	{
		System.out.println("this="+this);
	}
    public static void aaa()
    {
//    	System.out.println("this="+this); // 오류발생 ==> static은 모든 객체가 공통으로 사용하기 때문에 this를 사용할 수 없다
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		MainClass_1 m = new MainClass_1();
		// this = m => JVM이 자동으로 객체 주소를 대입
		System.out.println("m="+m);
		MainClass_1 m1 = new MainClass_1();
		//this = m1
		System.out.println("m1="+m1);
		// 객체 생성시마다 this가 생성이 된다 => 자신의 클래스 객체를 나타네준다.
		//  -------------------------- this(자신의 객체), super(상위 개체) 
	}

}
