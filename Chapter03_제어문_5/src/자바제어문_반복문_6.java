/*
 * 사용자로부터 2~9사이의 정수를 입력받아서 구구단을 출력하기
 * 단, 입력이 2~9까지 아닐 경우에는 다시 입력을 하게 만든다.
 * 
 */
import java.util.Scanner;
public class 자바제어문_반복문_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner scan = new Scanner(System.in);
		
		int dan = 0;
		for (;;) //무한 루프
		{   
			System.out.print("2~9사이의 정수 입력:");
			dan = scan.nextInt();
			if(dan<2 || dan>9)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break;
			/* if(dan>=2 && dan<=9)
				break;
			else 
			   {
				System.out.println("잘못된 입력입니다.");
				continue;
				}
				*/
		}
		System.out.println("단="+dan);
		System.out.println("====="+dan+"=====");
		for(int i=1; i<=9;i++)
		{
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
		}
		
		
		
		
		
	}

}
