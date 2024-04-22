/*
 * 알파벳을 입력을 받아서 
 * 		=> 대문자 -> 소문자 로 출력
 *      => 소문자 -> 대문자 로 출력
 *  => 결과값 출력 위치 
 *     - for에서 출력 => for문안에 변수 설정
 *     - for 종료후에 출력 => for위에 변수 설정
 *  => 변수를 유지하는 범위 => {} => 블록변수, 지역변수 ===> 반드시 사용전에 초기화시켜야 한다. 
 *  ====> 변수의 종류: 멤버변수, 공유변수, 지역변수
 *                  --------------
 *                  └> 초기화가 되어있음
 *   class A
 *    {
 *        int a; ==> 0
 *        static int b; ==> 0
 *        ---------------------------> 5장에서 나오는 내용
 *        public static void main(String[] arg)
 *         {
 *             int c=10;
 *         }    
 *    }
 *    
 *   1~4장 => 자바의 기본 문법
 *   5~7장 => 객체지향 프로그램
 *   8장 => 예외처리 -> 프로그램을 종료하지 않게 만든다
 *   --------------------------------------- 자바 기초
 *   9장 ~ => 라이브러리 (조립식) => 암기
 *   모든 프로그램
 *   ----------
 *      | 마지막 단위 (오라클 연동) => JDBC (웹 : 85%)
 *        웹 개발자 : Java, 데이터베이스, Spring이 가능한지
 *                  JavaScript => VueJS, ReactJS 
 *      | c/c++ => 네트워크 
 *        
 */
import java.util.Scanner;
public class 자바제어문_반복문_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++)
		{
		System.out.print("알파벳을 입력:");
		char c = scan.next().charAt(0); // 5번의 메모리가 만들어진다.(메모리할당)
		// for 한바퀴때마다 사라지고 다시 만들어진다. 
		System.out.println("입력된 알파벳:"+c);
		if (c>='A' && c<='Z')
		{
			System.out.println("소문자로 변경:"+(char)(c+32));
		}
		else if (c>='a' && c<='z') 
		{
			System.out.println("대문자로 변경:"+(char)(c-32));
		} else 
		 {
			System.out.println("알파벳이 아닙니다!!");
		 }
	    } //c 변수는 for안에서만 가능 
	}
}
