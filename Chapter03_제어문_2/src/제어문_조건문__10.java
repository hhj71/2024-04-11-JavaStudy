// 문자를 받아서 => 대문자 / 소문자 / 숫자 / 기타 인지 알려주는 프로그램
import java.util.Scanner;
public class 제어문_조건문__10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       System.out.print("문자 입력:");
       char c = scan.next().charAt(0); //문자 1개를 받는 경우
       
       if(c>= 'A' && c<='Z') {
    	   System.out.println(c+"는(은) 대문자입니다.");
       } else if (c>='a' && c<='z') {
    	   System.out.println(c+"는(은) 소문자입니다.");
       } else if (c>= '0' && c<= '9') {
    	   System.out.println(c+"는(은) 숫자입니다.");
       } else { System.out.println(c+"는(은) 알파벳, 숫자가 아닙니다!!");}
      
	}
	
	// 난수 => 0,1,2 
    /*
     *   if(num==0)
     *   else if(num==1)
     *   else if(num==2)
     *   값 고정이 된 상태 ==> else문장 사용할 필요가 없다  ==> 생략이 가능 
     */
}
