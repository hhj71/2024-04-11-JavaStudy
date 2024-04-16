/*
 *  비교연산자 => 숫자, 문자에서만 사용이 가능(문자열은 비교가 불가능)
 * 
 *  "aaa"=="aaa" X => equals()
 *  ** 비교연산자는 결과값 => true/false => 조건문에서 주로 사용 
 *  == 같다 (자바스크립트에서는 ===/ 오라클에서는 = 로 사용한다.)
 *  != 같지 않다 
 *  < 작다 ==> 기준점은 왼쪽에 있는 데이터
 *  > 크다 
 *  <= 작거나 같다  (< || ==)
 *  >= 크거나 같다  (> || ==)
 *  
 *  6==7 ==> false
 *  6!=7 ==> true
 *  6>7  ==> false
 *  6<7  ==> true
 *  6<=7 ==> true  6<7 or 6==7
 *  6>=7 ==> false 6>7 or 6==7
 *  
 *  ==> char
 *  'A'=='B' 'A'!='B'...
 *  
 *  1) 단항연산자 / 산술연산자 / 비교연산자/ 대입연산자 / 논리연산자 / 형변환
 *    프로그램 - 변수/연산자/제어문 ==> 묶음
 *  2) 
 *  
 */
public class 연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 비교
		int a=(int)(Math.random()*100)+1; //1~100사이의 임의의 수를 추출
		int b=(int)(Math.random()*100)+1;
		
	    System.out.println("a="+a+", b="+b);
		System.out.println("====== 비교 ======");
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b)); // a<b || a==b
		System.out.println("a>=b:"+(a>=b)); // a>b || a==b
		
		System.out.println("====== 알파벳 비교 ======");
  //char c = (char)((int)(Math.random()*26)+65);// 알파벳 대문자 범위
		//                    ------------1
		//                                 ---2 
		//                                  └0~25.74
		
  //char d = (char)((int)(Math.random()*26)+65);// 알파벳 대문자 범위
		
		
	char c = (char)((int)(Math.random()*26)+97); // 알파벳 소문자 범위 
	char d = (char)((int)(Math.random()*26)+97);
		System.out.println("c="+c+", d="+d);
	    System.out.println("c!=d:"+(c!=d));
		System.out.println("c<d:"+(c<d));
		System.out.println("c>d:"+(c>d));
		System.out.println("c<=d:"+(c<=d)); 
		System.out.println("c>=d:"+(c>=d));
		
		
	}

}
