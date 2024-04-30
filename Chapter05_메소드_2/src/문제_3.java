//1~n 까지 합을 구하는 메소드를 구현하시오
// 리턴형 o (합) , 매개변수 o (n)
// n 은 사용자의 요청값
import java.util.*;
public class 문제_3 {	
	static int add(int n)
	{    int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         System.out.print("정수 입력:");
         int n=scan.nextInt();
         int sum=add(n);		 
         System.out.println("sum="+sum); 
		
	}

}
