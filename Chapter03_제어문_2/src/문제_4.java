/*
 * 4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을
 *  if~else문으로 사용하라
 *  윤년의 조건은 
 *  4로 나눠지고 100으로는 나눠지지 않음 
 *  또는 400으로 나눠짐
 */
import java.util.Scanner;
public class 문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("연도 입력:");
		int year = scan.nextInt();   //년이니까 변수는 year
		
		if((year%4==0 && year%100!=0) || (year%400==0)) {
			System.out.println(year+"년도는 윤년입니다.");
		} else {System.out.println(year+"년도는 윤년이 아닙니다.");}
	}

}
