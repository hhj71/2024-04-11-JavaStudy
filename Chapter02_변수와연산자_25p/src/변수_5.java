
/*
 *  byte, char, int, long, float, double
 *  기타 : boolean
 *  
 *  1.데이터형의 크기 (기준 : 수 표현의 갯수) // 같은 1이라도 int는 1 , double 은 1.000000 // 실수형이 정수형보다 크다
 *     byte < char < int < long < float < double 
 *    
 *    ┌  int a = 10L -> 오류생김 // 왼쪽(대입받는 쪽)이 무조건 커야지 오류가 안남...
 *    │  └ 4byte  └8byte
 *    │ 
 *    └  long a = 10 -> 오류 X
 *    
 *  !데이터 형은 언제나 변환이 가능하다! (형변환)
 *    
 *    
 *           
 */



public class 변수_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // 자동 형변환
	int a='A';	
	char c = 65;
		System.out.println(c); // A로 출력됨 int => char
	double d ='A';
		System.out.println(d); //65.0으로 출력됨 char => double
	// 강제 형변환 -> (int)'A'	
		
		byte b1=10;
		byte b2=110;
		byte b3=b1+b2; // 오류 발생 -> byte + byte = int // int 이하는 다 더하면 int가 나옴... ex) byte+byte, char+char..// int랑 크기 큰거랑 더하면 크기 큰걸로 데이터형 정해짐.
		
		
	}

}
