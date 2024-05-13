package com.sist.main;
/*
 * 
 * 상속 
 * --- 재사용, 단일상속
 * 예외조건 : 생성자, 초기화블록, static 
 *                          ------ 공통으로 사용
 *                          
 *   class A
 *   {
 *   	int a,b,c,d,e,f;
 *   }
 *   class B extends A
 *   {
 *   	 // int a,b,c,d,e,f; => 소스코드가 간결해진다.                       
 *       int k; 
 *         => 기능을 변경 => 메소드 (오버라이딩)
 *   }
 *   => 실행 속도가 느려진다
 *   => 소스를 볼 수 없기 때문에  => 가독성이 떨어진다
 *   => 제약 조건이 많다
 *   => 결합성이 높아진다
 *   -------------------------------------------- 단점 존재 => 상속을 사용하지 않는다 (Spring)
 *   ===> 그래서 상속보다 포함 사용 많이 함  
 *   
 *     Music : 지니, 멜론 , Mnet...  => 거의 동일
 *             --- 한개를 만들고 나머지는 상속하면 됨  
 *     Movie : cgv, 롯데시네마, 메가박스...
 *     FoodHouse : 메뉴판 닷컴, 망고 플레이트...
 *     Shopping : 우체국쇼핑...
 *     ----------------------------------------       
 *       
 */
/*
 *  상속을 내리는 클래스 : super클래스, base클래스, 부모클래스, 상위클래스
 *  상속 받는 클래스 : sub 클래스, 파생클래스, 자식클래스, 하위클래스
 *  
 *  class 게시판
 *  {
 *  	글쓰기()
 *  	상세보기()
 *  	검색()
 *  	수정()
 *  	추가()
 *  	삭제()
    }
 *  class 묻고답하기 extends 게시판
 *  {
 *  	묻기() => 글쓰기()를 변경 => 오버라이딩
// *  	상세보기()
// *  	검색()
// *  	수정()
// *  	추가()
// *  	삭제()
 *  	답하기()
 *  }
 *  class 댓글게시판 extends 게시판
 *  {
 *  	댓글()
 *  }
 *  
 *  class 갤러리게시판 extends 게시판
 *  {
 *  	// 게시판
 *     -----------------------3000줄
 *  	파일업로드() => 이미지
 *  }
 */
//import javax.swing.*;
class Super
{
	int a;
	int b;
	// c는 사용 불가
}
class Sub extends Super
{
	// a,b
	int c;
}
public class MainClass_4 /* extends JFrame // 상속 */{
//	JFrame f = new JFrame(); // 포함	클래스 (has-a) 
//	//=> 포함 클래스는 여러개 사용이 가능하다
//	public MainClass_4()
//	{
//		f.setSize(500,500);
//		f.setVisible(true);
//	}
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new MainClass_4();
//		Super su=new Super();
//		System.out.println(su.a);
//		System.out.println(su.b);
//		Sub sub=new Sub();
//		System.out.println(sub.a);
//		System.out.println(sub.b);
//		System.out.println(sub.c);
		Super su=new Sub();
		// 상위       하위
		// double     int 느낌
		// su => a,b
//		Sub sub = new Super(); // 이렇게 하면 오류남
		//  하위        상위
		// int        double
		System.out.println(su.a);
		System.out.println(su.b);
		
		//Sub sub = (Sub)new Super();
		Sub sub = (Sub)su; // 형변환
		// Super > Sub
		// double   int 느낌
		System.out.println(sub.a);
		System.out.println(sub.b);
		System.out.println(sub.c);
		// sub => a,b,c
		// 클래스에 따라 접근 변수가 달라진다
		// -> 인터페이스
	}

}
