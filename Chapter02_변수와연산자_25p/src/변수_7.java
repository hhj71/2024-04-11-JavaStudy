/*
 * 값을 교환하는 방법 (a↔b)
 * int a = 100;
 * int b = 200;
 * int temp = a; // 임시변수 / temp=100
 * a=b; // a=200
 * b=temp;
 * 
 *  
 */
public class 변수_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100;
		int b=200;
		int temp = a;// 임시 저장
		a=b; // a=200
		b=temp; // b=100 // b=a 라고 하면 b=>200이 된다.
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//정렬할 때 사용 많이 함...

		
		
	}

}
