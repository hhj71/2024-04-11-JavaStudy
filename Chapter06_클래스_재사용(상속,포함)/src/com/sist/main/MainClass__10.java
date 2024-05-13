package com.sist.main;
/*
 *   206 page / 207 page
 *   --------   --------
 *              상속에서 접근지정어
 *   
 *   오버로딩  /  오버라이딩 (면접에서 매우 자주 나온다) 
 *                 | 라이브러리   
 *                 
 *  - 오버로딩 : 중복 메소드 정의 => 같은 기능
 *       ex 1) print(int) print(char) print(char[]) ...
 *       ex 2) 사칙연산 
 *             plus(byte, byte)  => 오버로딩이 가능한 덕분에 같은 이름으로 같은 기능의 다른 메소드들을 쓸 수 있다.
 *                  byte, int
 *                   ...  ...  
 *    	 ex 3) 버스 
 *    		   일반 버스
 *             버스(좌석)
 *             버스(마을)
 *             버스(고속)  
 *             
 *  - 오버라이딩 : 기존의 클래스를 상속을 받아서 => 재정의 (메소드 기능을 변경)
 *               ----------------                 --------------                            
 *   -------------------------------------------------------------------------------------------------
 *                     오버 로딩                                                   오버라이딩
 *   -------------------------------------------------------------------------------------------------
 *    상태          같은 클래스 내에서                                                  상속
 *               class A                                                             
 *               {
 *                   public void aaa(){}  ---> aaa()                                
 *                   public void aaa(int a){} ---> aaa(int)
 *                   public void aaa(char c){} ---> aaa(char) ┐ 같은 메소드
 *                   public void aaa(char k){} ---> aaa(char) ┘
 *                   public void aaa(int a, int b){} --> aaa(int,int)
 *                   public int aaa(double d){} ---> aaa(double)
 *                   void aaa(float f){} --> aaa(float)
 *               }    
 *   --------------------------------------------------------------------------------------------------
 *    메소드명            동일                                                         동일
 *   --------------------------------------------------------------------------------------------------
 *    매개변수      개수, 데이터형이 다르다                                                동일
 *   --------------------------------------------------------------------------------------------------
 *    리턴형            관계 없다                                                       동일
 *   --------------------------------------------------------------------------------------------------
 *    접근지정어         관계 없다                                                       같거나 확대만 가능
 *                                                                                    * 기본은 public
 *   --------------------------------------------------------------------------------------------------
 * 
 *    * 오버라이딩 => 상속 - 멤버변수 (인스턴스) ===> 변수값 변경(변수 오버라이딩)
 *                      - 메소드 ======> 기능 변경(메소드 오버라이딩)
 *                      
 *    
 *                  예외조건) static : 상속은 안된다 => 공유하여 사용하는 것이기 때문에
 *                          private : 상속은 가능 => 접근이 불가능
 *                               => 보완 => protected
 *                          생성자 
 *                          초기화 블록
 *                          ----------------------  
 *   * 메소드의 종류
 *      1. 인스턴스 메소드 : new에 의해서 저장
 *      2. 공통메소드 : static => 상속의 예외 조건 => 변경하면 전체변경이 됨 -> 오버라이딩이 안된다
 *      3. 종단메소드 : 확장이 불가능 => 변경이 불가능 => final
 *      ----------------------------------------------------------------------------
 *        권장 ) 메소드의 접근 지정어는 가급적이면 public 을 사용하라 
 *      
 *   * 접근지정어
 *      1. public : 생성자, 클래스, 메소드, 인터페이스
 *                   => 다른 클래스와 연결
 *      2. private : 멤버변수 => 데이터 노출 방지 (데이터 보호)
 *                     => 다른 클래스에서 사용하려면
 *                        => 변수기능의 메소드 제작
 *                           -----------------
 *                           메모리 저장   / 메모리에 읽어오기
 *                           --------      ------------
 *                           |set변수명()    |get변수명() 
 *                         
 *                         ==> class A
 *                             {
 *                                 private String name;
 *                                 private boolean login;
 *                                 public void   
 *                             }                          
 *                                                         
 * 
 *                                                         
 *  * 클래스 영역
 *     1. static 메소드 : 기본은 static 메소드, static 변수만 사용이 가능
 *     					 인스턴스 메소드, 인스턴스 변수는 사용할 수 없다
 *                       this. 가 없다
 *     2. 인스턴스 메소드 : 인스턴스 메소드, 인스턴스 변수, static 변수, static메소드 사용이 가능                                                       
 *                       this. 를 가지고 있다.                                  
 */
class ABC
{
	public void display1() {} // 멤버메소드 => 오버라이딩이 가능
	public static void display2() {} // 공통메소드
	public final void display3() {} // 종단메소드 => 변경할 수 없는 메소드
}
class BCD extends ABC
{
	public void display1() {} // 멤버메소드
//	public static void display2() {} // 공통메소드
//	public final void display3() {} // 종단메소드
}
// 인스턴스 메소드, 인스턴스 변수가 중심이 된다. static은 데이터베이스 쪽에서 사용 => MyBatis => 2차 (Spring)
class DGB
{
	private String name;
	private boolean login;
	private static int age; // 인스턴스 메소드, static 메소드 둘다에서 사용이 가능하다.
	public void display()
	{
		this.name = "홍길동";
		name = ""; // this.name
		age=100;
		aaa();
	}
	public static void aaa()
	{
		// static은 클래스의 멤버변수가 아니다 => 공통 사용부분을 구사해주는 역할 이다.
		System.out.println(age);
	}
	public String getName() {
		return name;
	}
	//this. => 상속 내려주는 클래스가 가지고 있는 변수라는 뜻
	// 생성자, 멤버 메소드에만 존재 => static 메소드는 this가 없다 => 멤버변수를 사용할 수 없다.
	public void setName(String name) {
		this.name = name;
		// 지역변수 우선순위
		// 지역변수나 매개변수를 먼저 찾고 없으면 멤버변수에서 찾는다.
	}
	// 읽기
	// boolean 형만 get 대신 is 사용함
	public boolean isLogin() {
		return login; // 원래는 this.login인데 변수가 충돌되지 않아서 this.는 생략 가능
	}
	public void setLogin(boolean login) {
		this.login = login;
	}
	
}
public class MainClass__10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
