
public class 변수_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte byteValue = 10; //변수 이름 byte 그대로 쓰면 오류남
		byte byte_value = 10; // -128~127 사이의 정수만 대입
		int intValue = 20; // 컴퓨터에서 모든 숫자를 정수(int)로 인식한다. // 21억 4천을 넘기면 안됨. // 정수의 default 값
		// 4byte
		long  longValue = 30L; // 구분하기 위해 숫자 뒤에 L,l을 붙인다. 
		// 8byte
		float floatValue = 10.5f; // 소수점 6자리까지 계산
		// 4byte		
		double doubleValue = 10.5; // = 10.5D, 10.5d => D,d는 생략가능 // 실수의 default 값
		// 8byte
		
		//실제 프로그램에서는 int, double을 가장 많이 쓴다.
		//변수는 계속 상태가 변경되는 것! 변수를 설정할 때 꼭 기억하기... //고정되는 것은 상수
	   
		boolean booleanValue = true; // 조건식에 사용 // 저장은 true, false 만 가능
		// 1byte
		char charValue = 'A'; // 문자 1개 저장 공간
		// 2byte
		
		// ★ byte, char, int, long, double, boolean 잘 기억하기
		
		//된장국 끓이는 법 출력하는 방법 2가지
		//1)
		char c1='된';
		char c2='장';
		char c3='국';
		char c4=' ';
		char c5='끓';
		char c6='이';
		char c7='는';
		char c8=' ';
		char c9='법';
		System.out.println(""+c1+c2+c3+c4+c5+c6+c7+c8+c9);
		
		//2)
		String s= "된장국 끓이는 법";
		System.out.println(s);
		
		
				
		
		
		
		
	}

}
