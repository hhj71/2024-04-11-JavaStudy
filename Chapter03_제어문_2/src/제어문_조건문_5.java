/*
 * if~else
 * => if    정상수행문장
 * => else  오류, 잘못된 입력일 경우
 * 
 * 
 */
// 사칙연산 => 연산자를 잘못 입력한 경우... 처리하는 방법
import java.util.Scanner;
public class 제어문_조건문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      int num1, num2;
      char op=' ';
      System.out.print("첫번째 정수 입력:");
      num1=scan.nextInt();
      System.out.print("연산자 입력(+,-,*,/):");
      op=scan.next().charAt(0); //문자 1개 받는 경우(charAt(0)-> 제일 앞에있는 한글자)
      System.out.println("두번째 정수 입력:");
      num2=scan.nextInt();
      
      if(op=='+'||op=='-'||op=='*'||op=='/') {//오류처리 위해 if~else 사용
    	  // 정상 수행
    	    if(op=='+')
    	    	System.out.printf("%d + %d = %d\n", num1,num2,num1+num2);// printf -> 출력 서식을 만들어서 출력요청. %d는 숫자(정수값).
    	    if(op=='-')
    	    	System.out.printf("%d - %d = %d\n", num1,num2,num1-num2); 
    	    if(op=='*')
    	    	System.out.printf("%d * %d = %d\n", num1,num2,num1*num2);
    	    if(op=='/') {
    	    	if(num2==0)
    	    		System.out.println("0으로 나눌 수 없다");
    	    	else
    	    	System.out.printf("%d / %d = %.2f\n", num1,num2,num1/(double)num2); // %f는 실수값. -> 앞에 .1 .2 등을 붙여서 소수점자리 조절 가능
    	    } //printf -> %c ==> 문자 / %s ==> 문자열
    	       // └> 명령프롬프트에 결과를 띄울때만 사용. 문법상에서 사용
    	       // └> 실사용은 HTML => CSS 사용 
         }
      else { // 오류처리가 반드시 필요하다.
    	  //연산자가 없는 경우
    	  System.out.println("잘못된 연산자 입니다."); // println 은 소수점 자리 조절 불가
      }
	}

}
