// 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
import java.util.*;
public class 문제_6 {
	static void munje_6(String msg)
	{
		// 구글 코딩테스트 문제
		if(msg.length()%2!=0)// 문자열 갯수가 짝수여야지 좌우대칭임을 확인할수 있기 때문에 // 오류처리
		{
			System.out.println("잘못된 입력입니다."); 
			return; // 메소드 종료
			// return 은 원하는 위치에서 사용이 가능하다.
		}
		
		boolean bCheck=true;
		for (int i=0; i<msg.length()/2;i++) 
		{
			char c1 = msg.charAt(i);
			char c2 = msg.charAt((msg.length()-1)-i);
		if(c1!=c2)
		{
			bCheck=false;
		}
		
		
		
		}
		
	}
	
	/* static boolean sy(String a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하시오:");
		a = scan.next(); 
		boolean check=false;
		for (int i=0; i<a.length();i++)
		{
			if(a.charAt(i)==a.charAt((a.length()-1)-i))
				{
					check=true;
				}
			else
				{
				    check=false;
				}
		}
		return check;
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print(munje_6("abccba"));
	}

}
