/*
 *  ★
 *  ★★
 *  ★★★
 *  ★★★★
 *  
 *  줄수 별표
 *  1    1
 *  2    2
 *  3    3
 *  4    4
 *           =>  i=j 
 *           
 * ★★★★
   ★★★
   ★★
   ★
 *           
 * --------------------
 *      *
 *     **
 *    ***
 *   ****
 *   
 *   ****
 *    ***
 *     **
 *      *
 *  줄수 공백 별표
 *  i    j  k          
 *  1    3  1
 *  2    2  2     => i+j=4
 *  3    1  3     => i=k
 *  4    0  4 
 *  
 *  줄수 공백 별표
 *  i    j  k          
 *  1    0  4
 *  2    1  3     => i-j=1
 *  3    2  2     => i+k=5 => k=5-i
 *  4    3  1
 *  
 *  
 */ 
public class 중첩_for_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=4; i++)
		{
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("★");
			}
			
			
			/*
			for(int j=1; j<=4; j++)
			{
				System.out.print("★");
				
				if(i==j)
					break;
			}
			*/
			
		  System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1;j<=5-i;j++) // 한줄 몇개 출력
			{
				System.out.print("★");
			}
			 System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int i=1; i<=4; i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("★");
			}
			for(int j=1;j<=4-1;j++) // 한줄 공백 몇개 출력
			{
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1;j<=i-1;j++) // 한줄 공백 몇개 출력
			{
				System.out.print(" ");
			}
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		
		
		
	}

}
