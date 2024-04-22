/*
 *   2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라
 */
import java.util.Scanner;
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력:");
		int num = scan.nextInt();
		
		if (num%3==0 && num !=0) { //사용자가 0을 입력했을 경우도 생각해야 함.
			System.out.println(num+"는(은) 3의배수 입니다.");
		}else {
			System.out.println(num+"는(은) 3의배수가 아닙니다.");
		}
	}

}
