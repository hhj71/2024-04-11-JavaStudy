// 두 정수의 나눗셈 결과를 구하는 메소드를 구현하시오(실수)

import java.util.Scanner;

public class 문제_4 {
	static double div(int num1, int num2)
	{
		double d = 0.0;
		try
		{
		   d=num1/(double)num2; //정상 수행 	
		}catch(Exception e)
		{
			System.out.println("0으로 나눌 수 없습니다!!");//오류발생
		}
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("1번 정수 입력:");
		int num1 = scan.nextInt();
		System.out.print("2번 정수 입력:");
        int num2 = scan.nextInt();
        double res = div(num1, num2);
        
		System.out.println("result="+res);
	}

}
