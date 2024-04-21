import java.util.Scanner;
/* 숫자를 입력을 받아서 => 3의배수 , 5배수, 7배수 인지 확인
   조건 여러개를 동시에 수행 => 단일 조건문 
 */
//조건 1개만 수행 => 다중 조건문 
public class 제어문_조건문_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner scan=new Scanner(System.in);
      System.out.print("정수입력:");
      int num1 = scan.nextInt();
      
      if(num1%3==0) {
    	  System.out.println(num1+"는(은) 3의배수 입니다.");
      }
      if(num1%5==0) {
          System.out.println(num1+"는(은) 5의배수 입니다.");	 
      }
      if(num1%7==0) {
          System.out.println(num1+"는(은) 7의배수 입니다.");	 
      }
	}

}
