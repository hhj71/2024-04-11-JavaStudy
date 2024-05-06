
public class 자바제어문_반복문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char c = 'A';
		// 변수의 범위지정은 {}으로 한다. => scope => 사용범위 지정을 잘해야 원하는 결과값 추출이 가능
		for(int i=1; i<=5; i++)
		{   
			char c = 'A';  // for안에서 생성=> 증가 => 삭제 => 생성 반복
			System.out.print(c+" ");
			c++;
			// c변수는 여기까지만 사용이 가능
		} // c변수는 사라진다
	}

}
