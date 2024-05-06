/*
 * 두 개의 정수를 입력 받아서 첫째 수를 둘째 수로 나눈 나머지를 
 * 출력하는 프로그램을 작성해 보자.
 */
import java.util.Scanner;
public class 연산자문제__13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan = new Scanner(System.in);
         System.out.print("두 개의 정수를 입력하시오(10 20):");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);
	}

}
