/*
 *    9)Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
        십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.

		결과)
		2자리수정수입력(10~99) >> 77 
		10의자리와 1의자리가같습니다.

 */
import java.util.Scanner;
public class 문제_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	while (true) { // 계속해서 입력할 수 있게 함
		System.out.print("정수 입력(10~99):");
		int num = scan.nextInt();
		
		if (num>=10 && num<=99) 
		   {
				if (num%11==0) { // (num/10)==(num%10)
					System.out.println("10의 자리와 1의 자리가 같습니다.");
					} 
				else {
					System.out.println("10의 자리와 1의 자리가 같지 않습니다.");
					}
		   } 
		else {
			System.out.println("잘못된 입력입니다!!");
		     continue; } 
		}
	
	}

}
