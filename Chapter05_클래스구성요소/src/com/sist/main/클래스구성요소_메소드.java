package com.sist.main;
/*
 * 메소드
 * 		=> 문장 => 단락
 *      => 기능별 분리       =>          오류 처리
 *         -------- 1. 재사용하기 좋음
 *           장점    2. 수정이 쉽다
 *                  3. 추가가 가능하다
 *                  4. 유지보수하기 좋음
 *                  5. 분업 => 나눠서 작업 => 일이 줄어든다...
 *                     ---------------- 
 *                      |인원 ↑
 *     => 역할 : 다른 클래스와 연결해서 사용
 *         사람클래스  ============= 자판기클래스
 *                     동전 투입 => 음료수 선택
 *                                음료수 뽑기        ==> 이런 동작들 ==> 메소드
 *                                잔돈을 돌려준다   
 *         객체지향 프로그램 = 여러개의 클래스를 만들어서 상호 연결해서 사용 
 *     
 *         => 사이트 분석
 *           ----------
 *           1. 데이터 확인
 *           2. 기능 확인 ===> 데이터 추출      
 *         예) 중복없는 난수 3개발생 int[] com
 *             사용자 입력 int[] user
 *             입력값 난수 비교 com/user
 *             힌트 com/ user/s/b
 *             종료여부 확인 s==3
 *             
 *         예) 년도/월 입력   year/ month
 *         	   요일 구하기 => 윤년 처리 => year/month/week
 *             달력 출력 => year/month/week                                   		
 */
// 클래스는 기본적으로 public 사용 ==> 한개의 파일에서는 public은 한개만 사용이 가능 
import java.util.*;
class Diary
{
	public int input(String msg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+"입력:");
		return scan.nextInt();
	}
	// 요일 구하기
	public int getWeek(int year, int month)
	{
		Calendar cal = Calendar.getInstance(); // 객체 생성 방법 => 추상클래스는 new를 사용해서 객체를 생성할 수 없다.
		// => 추상클래스 : 미완성된 클래스 => 객체는 new를 사용하지 않아도 객체 생성이 가능하다
		// Spring => new를 사용하지 않고 객체 사용이 가능 => 리플렉션
		// => 디자인 패턴 / 알고리즘 / 자료구조...
		//    --------- GOF 패턴 => 23개 => 8가지
		cal.set(Calendar.YEAR, year);  // static final int YEAR <== 클래스명.상수명 이라서 static
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		// 상수 => static final => 모든 프로그램에서 공유 => 클래스명.상수명
		// 상수형 (변수) => final => 객체 생성한 다음에 쓸 수 있음/ 클래스내에서 사용가능 => 객체명.상수
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		return week-1;
		/* Calendar 
		 * month는 0부터 시작 week는 1부터 시작
		 *  {"일" ....."토"}
		 *     0        6
		 *   => Calendar => week => 1부터 시작 (앞에 공백 존재){" ","일",..."토"}  
		 */
	}
	public int getLastDay(int year, int month)
	{
		Calendar cal = Calendar.getInstance(); // 객체 생성 방법 => 추상클래스는 new를 사용해서 객체를 생성할 수 없다.
		// => 추상클래스 : 미완성된 클래스 => 객체는 new를 사용하지 않아도 객체 생성이 가능하다
		// Spring => new를 사용하지 않고 객체 사용이 가능 => 리플렉션
		// => 디자인 패턴 / 알고리즘 / 자료구조...
		//    --------- GOF 패턴 => 23개 => 8가지
		cal.set(Calendar.YEAR, year);  // static final int YEAR <== 클래스명.상수명 이라서 static
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int lastday=cal.getActualMaximum(Calendar.DATE);
		return lastday;
	}
	// 달력 출력 => 전역변수 없이 => 전역번수(멤버변수)
	public void print(int year, int month, int week, int lastday)
	{
		System.out.println(year+"년도 "+month+"월 ");
		String[] strWeek = {"일","월","화","수","목","금","토"};
		for(String s: strWeek)
		{
			System.out.print(s+"\t"); // 빨간색으로 출력됨(error)
		}
		System.out.println("\n");
		for(int i=1;i<=lastday;i++)
		{
		   if(i==1)
		   {
			   // 저번달 부분 공백 주기
			   for(int j=0; j<week; j++)
			   {
				   System.out.print("\t");
			   }
		   }
		   
		   System.out.printf("%2d\t",i);
		   
		   week++;
		   if(week>6)
		   {
			   week=0;
			   System.out.println();
		   }
		}
	} 
	public void process()
	{
		int year = input("년도");
		int month = input("월");
		int week = getWeek(year,month);
		int lastday = getLastDay(year, month);
		print(year,month,week,lastday);
	}
}
// public이 있는 클래스의 클래스명이 저장명이 된다 => 자바는 파일명 = 클래스명이 동일
public class 클래스구성요소_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Diary d = new Diary(); // input => 저장
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			d.process();
			System.out.println("\n종료할까요?(y/n):");
			char end = scan.next().charAt(0);
			if (end == 'y' || end == 'Y')
			{
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}

}
