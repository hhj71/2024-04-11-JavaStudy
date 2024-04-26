/*
 *  정렬
 *  ---
 *    선택 정렬
 *       30  20  40  10  50 => 정렬 2가지 -> ASC(오름차순)      / DESC (내림차순)
 *                                        └10 20 30 40 50     └50 40 30 20 10
 *    
 *    선택정렬 하는 방법
 *      - 앞에 숫자 한개를 고정 시키고 1개씩 교환
 *      1) ASC
 *         30  20  40  10  50
 *         --  --
 *         20  30                                     
 *         --      --                         총 arr.length-1 바퀴
 *         20      40                         
 *         --          --                      
 *         10          20                     
 *         --             --                   
 *         10             50
 *         --------------------- 1round ==> for문 1번째바퀴
 *         10  30  40  20  50                   
 *         --  --  --
 *         고정 30  40     
 *             --      --
 *             20      30
 *             --          --         
 *             20          50        
 *        --------------------- 2round ==> for문 2번째바퀴    
 *         10  20  40  30  50  
 *        ------  --  --
 *         고정    30  40
 *                --      --
 *                30      50
 *        ---------------------- 3round => for문 3번째바퀴
 *        10  20  30  40  50 
 *        ----------  --  --
 *          고정       40  50
 *        ---------------------- 4round => for문 4번째바퀴
 *        10 20 30 40 50
 *        -----------
 *           고정 ------------------> 결론적으로 for문이 length-1바퀴만큼 실행된다.
 *         
 *                       
 *                       
 *    버블 정렬
 *    
 * 
 */
import java.util.*;
public class 중첩_for_8 {
// 선택 정렬
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬전:");
		System.out.println(Arrays.toString(arr));
		System.out.println("정렬후:");
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) // 여기서 조건을 <로 주냐(내림차순) >로 주냐(오름차순)에 따라서 정렬방향이 바뀜
				{
				int temp=arr[i];  // 값 교환할 때 임시변수 쓰는거 까먹지 말기!!!
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
