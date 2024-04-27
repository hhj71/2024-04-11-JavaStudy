//1~100까지의 합을 구해서 출력
public class 자바제어문_반복문__10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0; //누적합 구해야 되서 for문 밖에 있어야 된다.
		
		for(int i=1; i<=100;i++)
		{
			sum+=i;
			System.out.println("i="+i+" sum="+sum);
		}
		System.out.println("1~100사이의 정수 합:"+sum);
	}

}
