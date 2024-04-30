// => 사용자가 년 월 일을 전송하면 => 출력
// => 받아서 출력 or  메소드 자체에서 출력
//    └리턴형 o       └리턴형 x
// 목적 -> 재사용/ 반복제거
import java.util.*;
public class 메소드_3 {
	// 리턴형없이
	static void print(int year, int month, int day)
	{
		System.out.println(year + "년도 "+ month+"월 "+ day + "일 ");
	}
	// 반복 제거
	static int input(String msg)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+" 입력: ");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.print("년도 입력: ");
		int year = input("년도");
	    //system.out.print("월 입력: ");
		int month = input("월");
		//System.out.print("일 입력: ");
		int day = input("월");
		
		print(year, month, day);
		}

}
