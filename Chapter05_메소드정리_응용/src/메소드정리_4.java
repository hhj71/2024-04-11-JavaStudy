// 매개변수의 전송
//   => 메소드안의 변수는 메소드가 종료가 되면 자동으로 사라진다.
//   => 필요한 변수가 있다면 다른 메소드로 값을 전송해주어야 한다.
import java.util.*;
/*
 *   메소드의 연결
 *   ---------
 *   숫자 야구 게임을 분리해서 작업
 *   기능 
 *   1) 3개의 중복없는 난수를 발생시킨다 
 *   2) 사용자로부터 3개의 정수를 입력받는다 
 *   3) 난수와 사용자 입력값 비교
 *   4) 힌트 제공
 *   5) 종료 여부 확인 => 다시 게임을 할 지 물어본다
 *   
 */
public class 메소드정리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 절차적 언어는 다시 게임을 할 지 물어보는 기능이 불가능하다. => 재사용이 안된다.
		// 1) 3개의 중복없는 난수를 발생시킨다 
		 int[] com = new int[3];
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
		 // System.out.println(Arrays.toString(com));
	    
		 //2) 사용자로부터 3개의 정수를 입력받는다 
		 // 사용자 입력이 정답이 될 때까지 입력해야 한다. => 반복 횟수 모름 => while 사용
		 // 사용자 입력값 저장
		 int[] user = new int[3];
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
			 
			 // 비교
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
			     // 힌트 
			    System.out.printf("Input Number: %d, Result : %dS=%db\n", input, s, b);
			    // 종료 여부 확인
			      if(s==3)
			      {   
			    	  System.out.println("Game Over!!");
			    	  break;
			      }
			    	  
			    	  
		 }
		 
	}

}
