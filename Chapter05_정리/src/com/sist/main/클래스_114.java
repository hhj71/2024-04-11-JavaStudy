package com.sist.main;
/*
 * 114 page
 * 1) 클래스 구성요소 : 윈도우, 웹, 모바일 
 * 		클래스
 * 		-----
 * 		개발자 ===> 설계  ====> 메모리에 저장
 * 				  ----        ---------
 * 				  클래스        인스턴스/객체
 * 	  1. 클래스 설계
 * 		 -----
 * 		 클래스 : 데이터만 관리 (변수 여러개를 모아서 관리) => 웹, 윈도우에 전송할 때 데이터를 모아서 한번에 전송
 * 														-> ex) 상세보기 페이지
 * 		        => 데이터 활용 : 메소드를 여러개 묶어서 관리 => Manager(사용자 요청시 => 처리)
 * 							   -> 액션 클래스 (동작을 정의)
 *                 데이터+메소드 => 혼합 
 *                 ----------------------------- 벤치마킹 => 요구사항
 *       클래스 설계 내용
 *       -------------
 *       1. 데이터 => 어떤 데이터를 모아줄건지 => 멤버변수
 *       2. 기능 => 어떤 기능을 수행하게 할건지 => 메소드
 *       3. 필요시 멤버변수의 초기화 : 생성자 / static => static{}
 *       --------------------------------------------------
 *       = 멤버변수의 종류
 *         인스턴스 변수 => Heap에 저장된다. => 메모리공간을 만들어 동시에 저장 후 관리
 *                                         --------------- 메모리공간을 만들어주는 연산자 ==> new =>new를 사용안하면 사용이 불가능 (프로그래머가 관리함)
 *                    => 메모리를 따로 저장하기 때문에 여러개가 필요한 경우 사용
 *                        ex)회원정보, 영화정보, 게시물.....
 *         정적 변수 => Method Area에 저장된다. => 모든 객체가 공통으로 사용하는 변수 (메모리공간 1개를 가지고 사용) 
 *                                          => 변수앞에 static 붙임 => 변경하면 데이터값이 동시에 변경된다. 
 *                                          => 공통으로 사용되는 변수값을 지정
 *                                          => 데이터 전체를 모아서 관리 => 오라클 (공유된 데이터) => 마이페이지는 각자 다름
 *                                          => 사이트 -> 데이터는 똑같은데 사용자마다 동작이 다름
 *         									** 모든 객체의 변수값을 한번에 변경 => static
 *         									** 게임의 아바타 => width / height를 바꿀때 static 사용
 *         									** 변수는 값을 저장해줘야 사용이 가능 			
 *         									        -------- 초기화
 *                                          ==> 변수의 초기화
 *                                          	- 인스턴스 초기화 블록
 *                                          		 class A
 *                                          		{
 *                                          			int a; => 선언
 *                                          			--------------------- 클래스 블록은 선언만 하는 영역 (값 대입은 불가능, 선언과 초기값 동시에 주는건 가능)
 *                                          			{
 *                                          				a=100; => 구현 ==> 제어문/연산자/파일읽기....
 *                                          			}
 *                                          		}
 *                                          	
 *                                              - 정적변수 초기화 블록 => static 변수는 초기화 블록에서 주로 사용
 *                                              	class A
 *                                              {
 *                                              	static int a =100;
 *                                              	
 *                                              	static
 *                                              	{
 *                                              		a=100; => 명시적인 초기화가 안되는 경우에 사용 ==> 난수, 제어문....
 *                                              	}
 *                                              }
 *                                              *** 자동로그인 정보 --> cookie 에 저장되어 있음/ 화면 UI
 *                                              
 *                                              - 생성자 	======> 가장 많이 사용 ===> 인스턴스		
 *                                                 (1) 특징
 *                                                 		=> 모든 클래스는 생성자가 1개이상 존재한다.	
 *                                                 					  -------------------- 없는 경우에는 컴파일러가 자동으로 1개 추가해줌 
 *                                                 																	 --- 디폴트 생성자 
 *                                                 																		 (매개변수가 없는 생성자)
 *                                                 		=> 클래스명과 동일
 *                                                 		=> 리턴형이 없다 (void도 사용이 안됨)
 *                                                     
 *                                                 		=> 같은 이름으로 여러개의 생성자를 만들 수 있다
 *                                                 		   ---------------------- 오버로딩 (중복 메소드 정의)
 *                                                 			=> 같은 이름으로 여러개를 만드는 경우
 *                                                 				1.
 *                                                      => 생성자는 단독으로 호출이 불가능 => 호출 시 new 생성자()
 *                                                      									 -----------
 *                                                      
 *                                                 (2) 역할
 *                                                 		=> 멤버변수의 초기화
 *                                                 		=> 시작과 동시에 처리하는 소스가 있는 경우
 *                                                 			-> 화면 UI , 카카오(서버연결시켜둠), 데이터베이스 연결, 파일읽기 
 *                                                 ------------------------------------------------------------------------------------------
 *                                                 *** static 메소드 안에서는 static 변수 , static 메소드만 사용이 가능
 *                                                      => 인스턴스를 사용하고 싶은 경우 new를 이용해서 메모리 할당 후 사용
 *                                                 *** 인스턴스 메소드 안에서는 모든 것을 사용이 가능     
 *                                                 class A
 *                                                 {
 *                                                 		int a=10;  => 인스턴스
 *                                                 		static int b=20; => 정적
 *                                                 		A() => 인스턴스
 *                                                 		{
 *                                                         => a,b,aaa(),bbb() 호출 가능
 *                                                      }
 *                                                      void aaa()
 *                                                      {
 *                                                      	=> a,b,bbb() ==> 생성자는 호출이 불가능
 *                                                      } => 인스턴스        
 *                                                      static void bbb()
 *                                                      {
 *                                                      	b => static은 static 메소드, static 변수만 호출이 가능
 *                                                      } => 정적 블록
 *                                                       
 *                                                   }    
 *                                                   																																												
 */ 													
class Student
{
	private String name;
	private String sex;
	private int age;
	
	public Student()
	{
		name="홍길동";
		sex="남자";
		age=20;
	}
	// 사용자에게 입력받은 값으로 초기화
	public Student(String n, String s, int a)
	{
		name=n;
		sex=s;
		age=a;
	}
	public Student(String n)
	{
		// 생성자 호출이 가능 ==> this()
		// 반드시 생성자 안에서만 호출 가능 , 한번만 사용이 가능하다
		this(); // 첫번째 줄에 사용해야 한다 / public Student() 호출함 
		name=n; 
		// 이름만 바뀌고 성별과 나이는 그대로 
	}
	public Student(String s, int a)
	{
		this("박문수",s,a); //public Student(String n, String s, int a) 호출함
	}
	public void print() // 일반 메소드라서 this() 사용불가
	{
		System.out.println("이름:"+name);
		System.out.println("성별:"+sex);
		System.err.println("나이:"+age);
	}
	
}
class Member
{
	// 생성자 하나가 있음 --> 자동추가 안됨 (==> default 생성자는 존재하지 않는다)
	public Member(String name)
	{
		System.out.println("이름:" + name);
	}
}
class Sawon
{
	// public Sawon(){} => 생성자가 1개도 없기 때문에 컴파일러가 default 생성자 자동으로 추가해줌
}
class Emp
{
	private String name;
	private String dept;
	public Emp(String name, String dept) {
		this.name = name;
		this.dept = dept;
	} // 우클릭 -> source -> Gernerate constructor using Fields -> 생성자 자동 추가 해줌
	
	
}
public class 클래스_114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1 = new Student();
//		s1.print();
//		
//		System.out.println("========== 사용자 입력을 받아서 초기화 ============");
//		Student s2 = new Student("심청이", "여자",21);
//		s2.print();
		
//		Student s1 = new Student("박문수");
//		s1.print();
//		Student s2 = new Student("여자",30);
//		s2.print();
		
//		Member m = new Member(); // 매개변수 값을 안넣어주면 오류 발생 
//		Member m = new Member("aa");
		Sawon s = new Sawon();
		// 생성자는 여러개 만들 수 있다, 클래스에 생성자가 없는 경우에만 자동으로 추가됨 (디폴트 생성자)
		// 클래스 안에서 생성자 호출시에는 this()를 이용한다
	
	}

}
