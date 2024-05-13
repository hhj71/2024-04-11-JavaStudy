package com.sist.main;
/*
 *  5장 객체지향 프로그램 시작
 *  	=> 변수 설정
 *  	=> 저장할 내용이 여러개 => new 인스턴스 변수
 *         한개 저장 => static
 *      => 메소드 형식 => 처리과정
 *         -----  연산자 / 제어문
 *      => 초기화 : 생성자, static{}  
 *   194 page
 *    상속 => 재사용
 *    => 변경 (오버라이딩)
 *    => 상속 => 호출되는 과정
 *    => 메모리 할당 (상위, 하위)
 *    => 형변환
 *    -------------------------
 *    7장 : 추상클래스 / 인터페이스 => 기반 상속(다중상속)
 *                    --------
 *    8장 : 예외처리 
 *          -----
 *    ------------------------- 자바 기본 문법
 *    9장 ~ 마지막 : 라이브러리 => 조립(암기)
 *    ----------- 컬렉션      
 *    
 *    ** 오라클 연동 / JSP / Spring / Spring-Boot
 *       MyBatis / JPA
 *    ----------------------------------------- 자바 기반
 *    Java / JavaScript / Spring
 *    ---------------------------
 *    
 *    상속
 *    	=> 멤버변수, 메소드
 *                   └ 변경 가능
 *      => 집 -> 수리
 *      => 상속 => 확장된 클래스 
 *      		  ----- extends
 *      형식)
 *      class A extends B => 단일 상속, 재사용 목적
 *      
 *      => 단일 상속
 *      	 동물
 *      	  |
 *           인간         | => 이다 (is-a) => 추상화 => 공통점을 모아준다
 *            |
 *        ---------		 
 *        |       |      | => 구체화
 *       남자 	 여자   
 *       
 *           나무
 *            |
 *         -------
 *         |     |
 *       침엽수   활엽수
 *         |     |
 *        ---   ---   공통점이 많이 존재 => 상속을 내리는 클래스는 클래스마다 공통점을 가지고 있다 
 *                                      -------------------------------------------
 *                                       | 확장
 *     201 page => 단일 상속
 *             A
 *             |                A                  
 *           -----    ====>     |
 *           |   |              B           
 *           B   C  
 *                                           
 *           A    B                             
 *          ---  ---                             
 *           |    |                          
 *           ------                            
 *              |
 *              C     ====> 다중 상속 (클래스에는 존재하지 않는다 => 인터페이스)
 *              
 *    201 page => 확장   
 *                ---- 변경해서 사용 => 오버라이딩 (변수오버라이딩, 메소드오버라이딩)
 *                ---- 추가
 *   
 *   추가                변경(수정)
 *   ---                --------
 *         	   오버로딩        오버라이딩(덮어쓰기)
 *  --------------------------------------------       
 *   상태    같은 클래스 내에서 만  상속이 된 상태여야 만 
 *                 가능                 가능 
 *                            ----------------
 *                               * 익명의 클래스 
 *  -------------------------------------------
 *  메소드명     동일             동일
 *  -------------------------------------------
 *  매개변수    개수/데이터형이      개수나 데이터형 동일
 *             다르다        
 *  -------------------------------------------
 *  리턴형      관계없다           동일
 *  -------------------------------------------
 *  접근지정어   관계없다         축소하지 못한다/
 *                            확대는 가능하다          
 *           <-------- 축소
 *  => private < default < protected < public          
 *           확대 ----------->
 * ---------------------------------------------
 *	 class A
 *   {
 *   	void display(){}
 *   }
 *   ==> void display(){}
 *   ==> protected void display(){}
 *   ==> public void display(){}
 *   --> 잘 모르는 경우 ==> public                                       
 */
// 변수 오버라이딩
import java.util.*;
class Parent
{
	String name;
	int age;
	// 메모리에 저장 ==> 상속받은 클래스에서 연결해서 사용
	
	public Parent()
	{
		name="홍길동";
		age=25; 
		System.out.println("Parent 클래스 메모리 할당!!");
	}
	
}
class Child extends Parent
{
//	 Stirng name int age
	String name;
	int age; // ==> 오버라이딩을 하려면 변수설정을 따로 해줘야 한다. 
	public Child()
	{
		System.out.println("Child 클래스 메모리 할당!!");
	}
//   Child c=new Child(); // 확장된 클래스 => 기본
//	 ---------------------
//   Parent p=new Child();
//   --------------------- 클래스 여러개를 한개의 이름으로 제어
}
/*
 *  프로그램은 여러개를 가지고 제어하면 => 어렵다
 *  int a,b,c,d,e,f,k,j,s,q,n,m,p;
 *  
 *  int[] arr=new 
 */
class KKK
{
	public void display()
	{
		System.out.println("KKK:display() Call...");
	}
}
class AAA extends KKK
{
	
}
class BBB
{
	
}
public class MainClass_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		System.out.println("이름:"+c.name);
		System.out.println("나이"+c.age);
//		Scanner scan = new Scanner (System.in);
//		System.out.print("AAA(1),BBB(2),CCC(3),DDD(4),EEE(5):");
//		int no=scan.nextInt();
//		
//		KKK k=null; //상속받은 모든 클래스를 상위 클래스를 이용해서 
//		switch(no)
//		{
//		case 1:
//			k=new AAA();
//			break;
//			
//		
//		}
//				
		
	}

}
