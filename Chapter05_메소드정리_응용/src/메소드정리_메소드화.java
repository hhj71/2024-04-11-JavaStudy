// 메소드정리_4 메소드화
import java.util.*;
public class 메소드정리_메소드화 {
	// 3자리 정수 => 중복없는 난수
	static void rand(int[] com)
	{
		 for(int i=0; i<com.length; i++)
		 {
			 com[i] = (int)(Math.random()*9)+1; // 1~9사이의 정수가 중복없이 필요함
			 // 중복 체크
			 for (int j=0; j<i; j++)
			 {
				 if(com[i]==com[j])
				 {
					 i--; // 다시 발생 -> 원상 복귀
					 break;
				 }
			 }
		 }	 
	}
	// 사용자 입력값을 가지고 온다
	static void inputData(int[] user)
	{
		 Scanner scan = new Scanner (System.in);
		 while (true)
		 {
			 System.out.print("세자리 정수 입력:");
			 int input = scan.nextInt();
			 // 오류처리
			 if (input <100 || input >999)
			 {
				 // 세자리 수 범위를 벗어나는 경우 
				 System.out.println("세자리 정수만 사용이 가능합니다!");
				 // 처음 상태로 돌아간다
				  continue;
			 }
			 user[0] = input/100;
			 user[1] = (input%100)/10;
			 user[2] = input%10;
			 
			 // 오류 처리
			 if (user[0]==user[1] || user[0]==user[2] || user[1]==user[2] )
			 {
				 System.out.println("같은 수는 사용할 수 없습니다.");
				 continue;
			 }
			 if(user[0]==0 || user[1]==0 || user[2]==0)
			 {
				 System.out.println("0은 사용할 수 없습니다.");
				 continue;
			 }
			 break;
		 }	 
	}
	// 비교
	static int compare(int[] com, int[] user)
	{
		int s=0, b=0;
	     for (int i=0; i<com.length;i++)
	        {
	    	  for (int j=0; j<user.length;j++)
	    	  {
	    		  if (com[i]==user[j])
	    		  {
	    			  if(i==j)
	    				  s++;
	    			  else 
	    				  b++;
	    		  }
	    	  }
	        }
	     hint(user, s,b); // 힌트 메소드 호출
	     return s;
	}
	static boolean isEnd(int s)
	{
		boolean bCheck = false;
		if(s==3)
			bCheck=true;
		return bCheck;
	}
	// 힌트
	static void hint(int[] user, int s, int b)
	{
		 System.out.printf("Input Number: %d%d%d, Result : %dS=%dB\n", user[0],user[1],user[2], s, b);
	}
	// 전체 매소드 조립
	static void process()
	{
		int[] com = new int[3];
		//난수
		rand(com); // 배열 주소를 메소드로 전송 => call by reference
		//System.out.println(Arrays.toString(com));
		int[] user = new int[3];
		//inputData(user);
		//System.out.println(Arrays.toString(user));
		while(true)
		{
			inputData(user);
			compare(com, user);
			if (isEnd(s))
			{
				System.out.println("Game Over!!");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process(); // 완성된 메소드 호출
		 
	}

}
