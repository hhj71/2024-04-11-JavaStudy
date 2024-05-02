/*
 *  절차적 언어?
 *   => 순차적으로 명령문을 줌 (한줄씩 번역)
 *       => 수정, 추가하기가 어렵고, 재사용이 힘들다.
 *  
 *  메소드? 
 *    => 기능별로 나눠서 처리
 *    -> 변수가 메소드안에서 사용 => 리턴형/매개변수 => 고려
 *    -> 지역변수 => 매개변수 포함 => 메소드 블록 => 메소드가 종료되면 사라진다
 *    
 *  전역변수? 전채 메소드애서 사용하는 변수 => 리턴형 / 매개변수는 고려하지 않는다.
 *        => 클래스 블록 => 프로그램 종료시에 사라진다. 
 * -------------------------------------------------------------------
 *  전역변수 : a,b
 *  지역변수 : c,d,e
 *  aaa()
 *    => a
 *    => b
 *    => c
 *  bbb()
 *    => a
 *    => b
 *    => d
 *  ccc()
 *    => a
 *    => b
 *    => e    
 *   
 *    1. 년도/월 => 변수 => year/month
 *    2. 요일 => year/ month/ week / i(루프변수 -> 지역변수)
 *    3. 출력 => year/ month/ week / i(루프변수 -> 지역변수)
 *    ==> 공통으로 쓰는 변수 year, month
 *    
 */
import java.util.*;
// 문법 => C
// 메소드 => C++
// 전역변수 => 메소드 => 자바 ==> 5장 부터가 진정한 자바
/*
 *   사람 ========= 자판기
 *   ===
 *   지역변수로 동전 가지고 있으면 자판기 이용 못함.
 *   전역변수로 가지고 있어야 이용 할 수 있음.
 * 
 */
// 문법 => 메소드 (재사용) => 실제 프로그램 (객체 지향) => 전역변수(멤버변수, 공유변수)
//                         5장 ~ 12장 => 웹 프로그램
// 5장 => 기술면접 
public class 메소드정리_달력만들기_절차적언어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 사용자 입력 or (라이브러리 배우면)default => date를 잡거나
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		
		System.out.print("월 입력:"); // final
		int month = scan.nextInt();
		
		// 2. 요일 구하기 => 사용자 정의로 만들기 or 라이브러리 이용
		Calendar cal = Calendar.getInstance(); // 싱글턴
		// calendar 클래스 메모리 할당
		// 추상클래스
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);// month는 0번 부터 시작함.
		cal.set(Calendar.DATE, 1);
		
		// 요일
		int week = cal.get(Calendar.DAY_OF_WEEK);// 여기에 사용된 week는 1번부터 시작해서 week-1 해줘야 됨 
		week = week-1;
		// 마지막 날
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		// 3. 달력 출력
		String[] strWeek = { "일", "월", "화", "수", "목", "금", "토"};
		
		System.out.println(year+"년도 "+month+" 월");
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		for(int i=1; i<=lastday; i++)
		{
			if(i==1)
			{
				for (int j=0; j<week; j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;//0~6
			if(week>6)
			{
				System.out.println();
				week=0;
			
			}
		}
			
	}

}
