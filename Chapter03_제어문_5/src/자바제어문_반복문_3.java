/*
 *    1~100까지 정수 => 3의 배수 개수, 5의 배수 개수, 7의 배수 개수
 *    -----          ----------  ----------  ---------
 *                    변수
 *                    => 3,5,7 => 공통
 *                       15:3,5의 배수 , 21:3,7의 배수 , 35:5,7의 배수 ==>중복되는 조건이 있음 ==> 단일조건문 사용
 */
public class 자바제어문_반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 설정 => 어떤 값이 변경이 되는지 확인
		int a3=0;
		int a5=0;
		int a7=0;
		// 갯수 누적 (++), += (누적, 합) sum+=i => 값을 계속 더한다.
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
				a3++;
			if(i%5==0)
				a5++;
			if(i%7==0)
				a7++;
		}
		System.out.println("1~100까지 3의 배수의 개수:"+a3);
		System.out.println("1~100까지 5의 배수의 개수:"+a5);
		System.out.println("1~100까지 7의 배수의 개수:"+a7);
	}

}
