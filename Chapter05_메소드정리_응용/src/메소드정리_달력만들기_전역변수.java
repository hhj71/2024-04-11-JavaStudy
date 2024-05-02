import java.util.*;
public class 메소드정리_달력만들기_전역변수 {
	static int year, month, week, lastday;
	static void userInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력:");
		year = scan.nextInt();
		
		System.out.print("월 입력:"); // final
		month = scan.nextInt();
		
	}
	static void week()
	{
		Calendar cal = Calendar.getInstance(); // 싱글턴
		// calendar 클래스 메모리 할당
		// 추상클래스
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);// month는 0번 부터 시작함.
		cal.set(Calendar.DATE, 1);
		
		// 요일
		week = cal.get(Calendar.DAY_OF_WEEK);// 여기에 사용된 week는 1번부터 시작해서 week-1 해줘야 됨 
		week = week-1;
		// 마지막 날
		lastday = cal.getActualMaximum(Calendar.DATE);
		
	}
	
	static void print()
	{
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			userInput();
			week();
			print();
		
		
		
	}

}
