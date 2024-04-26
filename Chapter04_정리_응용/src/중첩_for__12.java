/*
 * 	정렬
 * 	--- 버블 정렬 (인접한 수끼리 비교) ==> 뒤에 부터 고정
 *    27 22 17 23 9 2 ==> 2 9 17 22 23 27 ASC(올림차순)
 *    
 *    27 22 17 23 9 2
 *    -- --
 *    22 27
 *       -- --
 *       17 27
 *          -- --
 *          23 27
 *             -- --
 *              9 27
 *                -- --
 *                 2 27     5번 비교 -> 1-5
 * ---------------------- 1round (for 1바퀴)
 *    22 17 23 9 2 27                
 *    -- --        (고정)
 *    17 22  
 *       -- --
 *       22 23
 *          -- --
 *           9 23     
 *             -- --
 *             2  23        4번 비교 -> 2-4
 * --------------------- 2round (for 2바퀴째)
 *    17 22 9 2 23 27            
 *              (고정)
 *    -- --          
 *    17 22 
 *       -- --
 *        9 22 
 *          -- --
 *          2  22           3번 비교 -> 3-3
 * --------------------- 3round (for 3바퀴째)
 *    17 9 2 22 23 27           
 *           ( 고  정 )
 *    -- --
 *    9  17
 *       -- --
 *       2  17              2번 비교 -> 4-2
 * --------------------- 4round (for 4바퀴째)
 *    9 2 17 22 23 27          
 *        (  고    정 )
 *   -- --      
 *   2  9                   1번 비교 -> 5-1
 * --------------------- 5round (for 5바퀴째)
 *   2 9 17 22 23 27 
 *   ================> 버블정렬  
 *             
 *     i   j
 *     1   5  ==> 6
 *     2   4  ==> 6
 *     3   3  ==> 6
 *     4   2  ==> 6
 *     5   1  ==> 6
 *     
 *     i+j=6 ===> j=6-i      
 *           
 */

import java.util.*;

public class 중첩_for__12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {27, 22, 17, 23, 9, 2};
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬 중:");
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			System.out.println((i+1)+"Round:"+Arrays.toString(arr));
		}
		System.out.println("오름차순 정렬 후:");
		System.out.println(Arrays.toString(arr));
		
		// DESC
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
	}
		System.out.println("내림차순 정렬 후:");
		System.out.println(Arrays.toString(arr));
	}
}
