
/*
 *     30 20 40 50 10
 *  ---------정렬--------> 10 20 30 40 50
 *     -- --
 *     20 30
 *     --    --
 *     20    40
 *     --       --
 *     20       50
 *     --          --
 *     10          20
 *     -------------------
 *     10 30  40 50 20
 *     -- --  --
 *     고정 30  40
 *        --     --
 *        30     50
 *        --        --
 *        20        30
 *     --------------------
 *     10 20  40 50 30
 *            -- --
 *       고정  40 50
 *            --    --
 *            30    40
 *     --------------------
 *     10 20 30  50 40
 *         고정    -- --
 *               40  50
 *     --------------------
 *     10 20 30 40 50
 *     
 *  선택정렬 (Select Sort)
 *  : 가장 작은 것을 선택해서 앞으로 보내는 정렬 기법
 *  -> 정렬되지 않은 데이터들에 대해 가장 작은 데이터를 찾아 가장 앞의 데이터와 교환해나가는 방식
 *     데이터 2개씩 교환함 (temp 변수 활용)
 *  
 */

import java.util.Arrays;

public class 변수_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {30,20,40,50,10};
		System.out.println("변경전:");
		System.out.println(Arrays.toString(arr));
		//방법 2가지
		//1)
		Arrays.sort(arr); // 오름차순 정렬
		/*2)
		 * for(int i=o;i<arr.length-1; i++);{
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		System.out.println("변경후:");
		System.out.println(Arrays.toString(arr));
		
	}

}
