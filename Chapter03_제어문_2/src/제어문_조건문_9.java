// 사칙연산 -> 연산을 한번만 수행하는 조건 -> 다중조건문
import java.util.Scanner;
public class 제어문_조건문_9 {
     public static void main(String[] args) {
    	 Scanner scan = new Scanner(System.in);
    	 //사용변수
    	 int num1, num2;
    	 char op=' ';
    	 
    	 System.out.print("첫번째 정수 입력:");
    	 num1 = scan.nextInt();
    	 System.out.print("연산자 입력(+,-,*,/):");
    	 op = scan.next().charAt(0);
    	 System.out.print("두번째 정수 입력:");
    	 num2 = scan.nextInt();
    	
    	 if(op=='+') {
    		 System.out.printf("%d + %d = %d", num1,num2,num1+num2);
           } else if (op=='-') {
        	 System.out.printf("%d - %d = %d", num1,num2,num1-num2);
           } else if (op=='*') {
        	 System.out.printf("%d * %d = %d", num1,num2,num1*num2);
           } else if (op=='/') {
        	   if(num2!=0) {
        	 System.out.printf("%d / %d = %d", num1,num2,num1/num2);
        	   } else {System.out.println("0으로 나눌 수 없습니다."); }
           } else {System.out.println("잘못된 연산자을 입력하셨습니다.");
        	   
           }
    	 
     }
}
