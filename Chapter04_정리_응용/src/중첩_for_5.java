// 중복이 없는 난수 
// 1~10 => 10개의 난수 발생 => 중복이 없어야 한다.

public class 중첩_for_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 용도가 같은 정수 10개 저장 => 배열
		
		int[] arr = new int[10]; // 변수 이름 1개로 통일 => 구분은 인덱스로 
		// 인덱스 번호는 0부터 length-1 까지
		// 제어하기가 편리하다 (읽기와 쓰기가 편리하다) => 반복문을 사용하기 때문에 소스코딩을 줄일 수 있다
		// int a=random() => 500
		// 클래스 => 1개의 이름 => 여러개를 동시에 제어 => 인터페이스
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0; j<i; j++)    // 배열에 값이 저장된 만큼만 돌아가게 ==> j<i
			{
				if(arr[i]==arr[j])
				{
					i--;            // 중복이면 난수 발생시키는 위치로 되돌아가게 한다.
					break;          // 2차 for문만 제어한다  
				}
			}
		}
		// 초기화 ==> 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		
	}

}
