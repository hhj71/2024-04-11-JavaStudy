
public class 메소드정리_3 {
	static void swap (int[] arr)
	{
		// 메모리 주소 자체를 넘겨준다 => 같은 메모리에서 값을 변경 => 원본 자체가 변경됨
		System.out.println("변경전 : arr[0]="+arr[0]+", arr[1]="+arr[1]);
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("변경후 : arr[0]="+arr[0]+", arr[1]="+arr[1]);
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Call By Reference 방식 => 메모리 주소 자체를 변경
		// 배열/ 클래스만 주소를 가지고 있다. 
		int[] temp = {100,200};
		swap(temp);
		System.out.println("main => temp값 : temp[0]="+temp[0]+", temp[1]="+temp[1]); // 원본 값 변경 되었음
		
		
	}

}
