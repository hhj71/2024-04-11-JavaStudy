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
		// 프로그램에 필요한 데이터를 사용자로부터 받아서 => 오류체크
		/*
		 * for(int i=0; i<10; i++)
		 *    {
		 *        int j=10;
		 *     } //i,j는 for문 종료시까지만 사용가능 => 블록변수 - {}를 벗어나면 자동으로 삭제됨
		 *        
		 */
		for (;;) //무한 루프
		{   
			System.out.print("2~9사이의 정수 입력:");
			dan = scan.nextInt();
			if(dan<2 || dan>9)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			break; // for종료 => 정상 입력을 했을 경우
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
