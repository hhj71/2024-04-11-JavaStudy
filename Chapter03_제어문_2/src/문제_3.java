/*
 * 3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
 */
import java.util.Scanner;
public class 문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = scan.nextInt();
		System.out.println("a="+Math.abs(num));// 양수만 출력 => 절대값
		/*
		  if (num<0) {
			System.out.println("a="+num*(-1));
		}else {
			System.out.println("a="+num);
		}
		*/
		/*if(num<0)//음수 
        {
        	num=num*-1; // ==> num*=-1
        }
        System.out.println(num);*/
	}

}
