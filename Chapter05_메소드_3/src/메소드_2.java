// 정수 2개를 메소드로 전송 => Max 를 찾아서 넘겨준다
//  -----               ------
//  매개변수                리턴형
import java.util.*;
public class 메소드_2 {
	static int max(int a, int b)//최댓값
	{
		int max=a;
		if(a<b) 
		{
			max=b;
		}
		return max;//결과값
	}
	static int min(int a, int b)// 최솟값
	{
		int min = a;
		if(a>b)
		{
			min=b;
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*100)+1;
		System.out.println("a="+a+" b="+b);
		// 최대값
		int m=max(a,b);
		System.out.println("max="+m);
		// 최솟값
		int n=min(a,b);
		System.out.println("min="+n);
	}

}
