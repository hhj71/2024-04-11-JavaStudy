/*
 * 1~100까지 사이의 정수를 10개 추출
 *  => 최댓값/ 최솟값 구한다.
 *     ----  ----
 *  => for 10바퀴 돌림 -> 추출하는 용도
 * 
 */
public class 자바제어문_반복문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max=1; // max는 비교해야 하기 때문에 가장 낮은 숫자로 설정
		int min=100; // min은 비교해야 하기 때문에 가장 높은 숫자로 설정
		
		// 반복수행 => 임의의 정수 10개 추출
		  for(int i=1;i<=10;i++) //출력하고 관련이 없음
		  {
			  //=> 임의의 정수 추출
			  int num=(int)(Math.random()*100)+1; //1~100 사이의 정수 추출 (임의로)
			  System.out.print(num+" ");
			  // 최댓값/ 최솟값 구하기
			  if(max<num)
				  max=num; // 최댓값
			  if(min>num)
				  min=num; // 최솟값
		  }
		   System.out.println();
		   System.out.println("최댓값:"+max);
		   System.out.println("최솟값:"+min);
		/*
		 *  int max=1;
		 *  int a=10;
		 *  int b=20;
		 *  int c=30;
		 *  
		 *  if(max<a)
		 *     max=a   => max => 0->10
		 *  if(max<b)
		 *     max=b   => max => 0->20
		 *  if(max<c)
		 *     max=c   => max => 0->30   
		 *      
		 */
		
		
	}

}
