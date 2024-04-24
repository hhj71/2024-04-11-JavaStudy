import java.util.Scanner;
public class 배열_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// 년 월 일 => 결과값 무슨요일
		 System.out.print("년도 입력:");
		 int year=scan.nextInt();
		 
		 System.out.print("월 입력:");
		 int month=scan.nextInt();
		 
		 System.out.print("일 입력:");
		 int day=scan.nextInt();
		 
		 // 요청 처리 ==> 요일 확인
		 /*
		  * 요일 구하기 
		  * 1. 1년도 1월 일부터 ~ 요청한 년도의 전년도까지의 총 날 수
		  * 2. 요청한 전달까지의 날수
		  * 3. 요청한 일
		  * ----------------------------------------------
		  * 4. 총날수 %7 => 요일을 구할 수 있다.
		  *    0~6 => 0:일 ~ 6:토
		  *    
		  */
		  char[] strWeek= {'일', '월', '화' ,'수', '목', '금', '토'};
		  int[] lastday = {31,28,31,30,31,30,
				  		   31,31
		  }
		 // 2.요청한 전
		 
		 
		 // 결과값 출력
		 System.out.println(year + "년도 "+month+"월"+day+"일");
		 
		  //요청한 일
		  total+=day;
		 
		  //요일 구하기 
		 int week = total%7;
	}

}
