/*
 * 
 * 
 * 
 * 
 *    => 1부터 입력한 정수까지 합을 구해서 출력
 * 
 */
import java.util.Scanner;
public class 자바제어문_반복문_9 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		/* Runtime.getRuntime().exec("C:\Program Files\Google\Chrome\Application\\chrome.exe"
				+)
		*/
		Scanner scan = new Scanner(System.in);
	    System.out.print("정수 입력(1~100):");
	    int num=scan.nextInt();
	    
	    // 합을 누적하는 변수
	    int sum= 0;
	    int i=1;
	    while(i<=num)
	    {
	    	sum+=i;
	           i++;	
	    }
		System.out.println("while: 결과값 sum="+sum);
		
		System.out.println("===== for문 =====");
		sum=0;
		for(i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("while: 결과값 sum="+sum);
	}

}
