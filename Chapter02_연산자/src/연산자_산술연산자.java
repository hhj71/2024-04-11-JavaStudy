
import java.util.*;// 자바에서 지원하는 라이브러리를 읽어 온다.
public class 연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 임의로 변수를 지정  int a=100
		// 변수 선언
		int num1, num2; // 사용을 하면 오류 발생 => 변수는 초기화 (값 지정)해야만 오류 X
		// 초기화
		Random r = new Random(); // 임의의 수를 추출
		num1=r.nextInt(101); // 0~100까지 사이의 정수 추출 => 괄호안의 수(마지막 값)는 제외가 된다.
		num2=r.nextInt(101);
		
		System.out.println("num1=" + num1);
		System.out.println("num2=" + num2);
		
		// 더하기(+)연산
		int plus=num1+num2;
		System.out.println("plus="+(num1+num2));//괄호는 최우선순위 연산자.
		
		System.out.println(5+5*10); //55
		System.out.println((5+5)*10); //100 
		
		int minus=num1-num2;
		System.out.println("minus="+minus);
		
		int gop=num1*num2;
		System.out.println("gop="+gop);
		int a =10;
		int b=3;
		
		System.out.println(a/(double)b); //3
		// int => double로 변경할 때는 (double)변수명 => 데이터형 변경
		// 값이 있는 경우 => .0
		System.out.println(a%b); //1
		System.out.println(a%-b); 
		System.out.println(-a%b); 
		System.out.println(-a%-b); 
		
		
		
		
		
		
	}
	    

}
