//API
import java.util.*;
public class 중첩_for__11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(arr));
		
	    //정렬 (ASC)
		Arrays.sort(arr); // ASC 만 가능
		System.out.println("오름차순 정렬 후:");
		System.out.println(Arrays.toString(arr));
		// 자바에서 전부 지원하지 않는다 => 직접 만들어서 사용 (오버로딩) / 기존 라이브러리를 수정해서 사용(오버라이딩)
		
		// 정렬 (DESC)
		System.out.println("내림차순 정렬 후:");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+ " ");
		}
	
		
		
	}

}
