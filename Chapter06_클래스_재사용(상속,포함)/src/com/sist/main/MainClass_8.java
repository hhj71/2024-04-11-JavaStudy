package com.sist.main;
// 메소드 오버라이딩 204 page
class Music
{
	int count = 10;
}

class Genie extends Music
{
	// 목록출력
	// 상세보기
	// 검색수행
	int musiccount=200;
	public void list()
	{
		System.out.println("Genie뮤직에서 목록 출력");
	}
	public void detail()
	{
		System.out.println("Genie뮤직에서 상세보기");
	}
	public void find()
	{
		System.out.println("Genie뮤직에서 검색수행");
	}
}

// 여러개의 데이터를 다룰 때 ==> 배열 먼저 생각해보고 그다음에 상속 생각해보기
public class MainClass_8 {
	/*
	 * 	상속을 받는 경우
	 * 
	 * 	변수 : 선언하는 클래스명
	 *  메소드 : 생성자에 따라
	 *  생성자 => 상속의 제외조건
	 *  
	 *  class A
	 *  class B extends A
	 *  
	 *  A a=new B()   변수: A   메소드 : B ==> 클래스가 여러개 일 때 사용된다 
	 *  A a=new A()   변수: A   메소드 : A
	 *  B a=new B()   변수: B   메소드 : B  =====> 위 3가지 유형중에 가장 많이 사용된다
	 *  ------------------------------------------------------------------------
	 *  B b=new A() => 오류발생 (형변환 해줘야됨)
	 *  => 라이브러리에서 값을 받는 경우
	 */
	// 유사한 클래스를 여러개 모아서 1개 객체로 제어할 때 사용 => 상속
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==== 지니뮤직 ====");
		Music m=new Genie();
		// Genie g = new Genie ==> 자기 자신 거를 가져오는게 좋다 
		// 상속으로 했다가 꼬일 수 있음
		// 메소드 호출할 때 생성자를 잘 확인하기!
		m.detail();
		m.list();
		m.find();
		
		System.out.println("==== 멜론 ====");
		m=new Melon();
		m.detail();
		m.list();
		m.find();
		
		System.out.println("==== Mnet ====");
		m=new Mnet();
		m.detail();
		m.list();
		m.find();
	}

}
