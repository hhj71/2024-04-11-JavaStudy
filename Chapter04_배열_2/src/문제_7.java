/*
 * 문제 5번과 동일 문제
 */
import java.util.Arrays;
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열 선언, 변수 선언
		int[] arr = new int [10];
		// 2. 초기화 => 인덱스를 필요로 한다.
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = (int)(Math.random()*10)+1;
		 }
		// 3. 요청 처리
		 System.out.println(Arrays.toString(arr));
		 int sum = 0;
		 for(int i:arr)
		 {
			 sum+=i;
		 }
		 double avg=sum/(double)arr.length; // 10.0
		 // 4. 결과값 출력
		 System.out.printf("평균:%.2f", avg);
	}
}