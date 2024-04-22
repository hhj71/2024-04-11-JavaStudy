import java.util.Scanner;
/*
 *  for => updown
 *   1. 난수 => 난수를 맞추는 프로그램
 *      --- 힌트를 준다 (Up, Down)
 *   --------------------------- 반복횟수가 명확하지 않다 -> while
 *   => 종료 : break
 *   => 잘못 입력시 : continue
 *   --------------------------- 반복제어문   
 * 
 */
public class 자바제어문_반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		//1. 난수 발생
		int com = (int)(Math.random()*100)+1; //1~100 사이의 임의의 정수 추출
		while(true)//무한 루프
		{
			System.out.print("1~100사이의 정수 입력:");
			int user=scan.nextInt();
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다!!"); // while 처음으로 이동
				continue; //조건식으로 이동
			}
			//힌트 
			if(com>user)
			{
				System.out.println("입력값 보다 큰 숫자를 입력하세요");
			}
			else if(com<user)
			{
				System.out.println("입력값 보다 작은 숫자를 입력하세요");
			}
			else // com==user
			{ 
				System.out.println("정답입니다!!!");
			}
			
		}   
		   
		
		
		
		
	}

}
