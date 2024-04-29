// 9. 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
import java.util.*;
public class 문제_9 {
static boolean isYear(int year)
{
	boolean bCheak = false;
	if((year%4==0 && year%100!=0)||(year%400==0))
	{
		bCheck=true;
	}
	else
	{
		bCheck=false;
	}
	return bCheck;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("연도 입력:");
		int year = scan.nextInt();
		boolean bCheck=isYear(year);
		if(bCheck==true) System.out.println("윤년");
		else System.out.println("윤년이 아닙니다");
	}

}
