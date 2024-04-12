
/*
 *  30 20 40 50 10
 *  ---------정렬--------> 10 20 30 40 50
 *  값이 작은거를 앞쪽으로 계속 2개씩 교환해나감 (temp 변수 활용)
 *  -> Select Sort
 * 
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
		Arrays.sort(arr);
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
