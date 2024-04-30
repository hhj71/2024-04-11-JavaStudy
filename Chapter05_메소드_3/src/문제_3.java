/*
 * 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
	임의의 정수 입력 (배열 생성후)
	정렬 처리
	출력 
 */
/*형식) 
	static 리턴형 메소드명 (매개변수)
	------ 메소드는 반드시 메모리에 저장 => 사용이 가능
	------ JVM에 의해서 자동으로 저장
	------ 공유하는 느낌 모든사람이 동일하게 쓸 수 있게
	{
		return 값; 
	}
	
	static int aaa(int a)
	{
		int b=10; => 전송 
		return b;
	}
	static int[] bbb(int[] arr)
	{
		return arr; => 배열로 넘길때는 보통 매개변수에 있는 변수를 리턴으로 사용하는 편이다.
	}
	static int input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("입력: ")
		int a = scan.nextInt();
		return a; // (= return scan.nextInt();) 
	}
	
	고려사항 
	1. 리턴형
	2. 매개변수
	3. 변수명, 메소드명이 동일 할 때도 있다 => but 가급적이면 이렇게 사용하지 않는다.
	4. 리턴값으로는 메소드명은 X
	
	버블 정렬 => 맨 뒤부터 고정
	j와 j+1을 비교함. (인첩한 것 끼리)
	
 */ 
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int [5];
		for (int i=0; i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1; // 배열 초기화
		}
		System.out.println("변경 전:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println("\n변경 후:");
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j])
			}
		}
	}

}
