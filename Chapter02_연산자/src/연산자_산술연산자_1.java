/*
 *  '+' 연산자의 기능 
 *  -------------
 *   1) 산술연산자 (더하기 연산자)
 *   2) 문자열 결합
 *       ex) "7"+7      ==> "77"
 *            7+"7"     ==> "77"  
 *            7+7"7"    ==> "147"
 *            7+"7"+7+7 ==> "7777" // 앞에서 부터 계속 문자열+숫자 가 되어서 결과값이 문자열로 나옴
 *            7+"7"+7*7 ==> "7749" // 우선순위가 곱하기 먼저 -> 그다음에 앞에서부터 계산 
 *       
 *       () => 우선순위 변경
 *       / => 정수/정수 = 정수
 *       % => 왼쪽편의 부호를 따라간다.
 *       같은 데이터형 끼리 연산이 된다. => 형변환이 되어 최종 결과값은 가장 큰 데이터형을 결과값으로 처리된다.
 *       
 *       
 *       
 *       
 */
public class 연산자_산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // char+int
		char c = 'A';
		int i = 10;
		System.out.println(c+i); //75
		
		double d=10.5;
		System.out.println(d+i); // i가 10.0으로 바뀜 ==> 20.5
		
		byte b1=10;
		byte b2=20;
		int b3=b1+b2; //b3의 데이터형을 byte로 하면 오류남 -> int로 변경하여 계산
		System.out.println(b3);
		
		// char + char = int
		char c1='A';
		char c2='B';
		int c3=c1+c2;
		System.out.println(c3);
		
		//char+byte+double+float => double
		  char d1='A';
		  byte d2=100;
		  double d3=10.5;
		  float d4=10.5f;
		System.out.println(d1+d2+d3+d4);
		 
		// int+long+float => float 
		
		  
				  
				  
				  
				  
				  
				  
				  
				  
				  
	}

}
