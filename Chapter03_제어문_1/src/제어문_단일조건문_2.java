/*
 * 컴퓨터/사용자 => 가위바위보
 * 
 * 컴퓨터는 난수 받고
 * 사용자는 입력 받아야 됨
 * => 임의로 설정함 0-> 가위/ 1-> 바위 / 2-> 보
 * 
 */
import java.util.Scanner;
public class 제어문_단일조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 컴퓨터
		int com=(int)(Math.random()*3); // random으로 0,1,2 중에 하나가 됨

		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2):");
        int user=scan.nextInt();
		
        if(user==0)
		System.out.println("사용자:가위");
		if(user==1)
		System.out.println("사용자:바위");
		if(user==2)
		System.out.println("사용자:보");
		
		
		if(com==0)
		{
			System.out.println("컴퓨터:가위");
		}
		if(com==1)
		{
			System.out.println("컴퓨터:바위");
		}
		if(com==2)
		{
			System.out.println("컴퓨터:보");
		}
		
		//게임 결과 출력
		/*                                           com-user
		 *     com=> 0(가위)
		 *            user=> 0 (가위)	 => 비겼다            0
		 *                   1 (바위) => 사용자 win        -1
		 *                   2 (보)  => 컴퓨터 win        -2
		 *     com=> 1(바위)
		 *            user=> 0 (가위)	 => 컴퓨터 win        1
		 *                   1 (바위) => 비겼다            0
		 *                   2 (보)  => 사용자 win        -1
		 *      com=> 2(보)
		 *            user=> 0 (가위)	 => 사용자 win         2
		 *                   1 (바위) => 컴퓨터 win         1
		 *                   2 (보)  => 비겼다              0
		 *                                             => 컴퓨터 Win: -2,1
		 *                                                사용자 Win: -1,2
		 *                                                비겼다 : 0
		 *                                              
		 */
		System.out.println("===== 게임 결과 =====");
		int result=com-user;                       //아래내용 변형
		if (result==-2 || result==1)
			System.out.println("컴퓨터 Win");        
		if (result==-1 || result==2)
			System.out.println("사용자 Win");
		if (result==0)
			System.out.println("비겼다");
		
		// 컴퓨터가 가위를 낸 경우
		/*if(com==0 && user==0)
			System.out.println("비겼다");
		if(com==0 && user==1)
			System.out.println("사용자 Win");
		if(com==0 && user==2)
			System.out.println("컴퓨터 Win");
		// 컴퓨터가 주먹을 낸 경우
		if(com==1 && user==0)
			System.out.println("컴퓨터 Win");
		if(com==1 && user==1)
			System.out.println("비겼다");
		if(com==1 && user==2)
			System.out.println("사용자 Win");
		//컴퓨터가 보를 낸 경우
		if(com==2 && user==0)
			System.out.println("사용자 Win");
		if(com==2 && user==1)
			System.out.println("컴퓨터 Win");
		if(com==2 && user==2)
			System.out.println("비겼다");
			*/
		
		
		
		
		
	}

}
