/*
 *  소스가 많은 경우 => 나열(x) => 기능별 분리
 *  문장 => 단락을 나눠서 처리
 *  --------------------------------------
 *  오류 => 해당 메소드만 찾는다
 *  	  수정하기 편리하다 
 *  -------------------------------------- 구조적인 프로그램
 *  메소드 
 *  	= 재사용 => 다른 클래스와 연결
 *          장점) 1. 신뢰성이 뛰어나다(검증이 된 상태) 
 *               2. 소스량을 줄일 수 있다
 *               3. 개발속도가 빠르다 (조립 후 약간의 수정만 거치면 돼서)
 *               4. 같은 내용과 비숫한 모양의 프로그램을 얼마든지 만들어 낼 수 있다.
 *      = 반복 제거
 *         같은 내용 소스코딩을 줄이기 위해서 => 한개로 통합
 *         수정이 편리하다
 *        ==> 개발 / 유지보수
 *             SI    SM
 *             => 1년 => 개발
 *             => 10~15년 => 유지보수
 */
// 국어, 영어, 수학, 물리, 국사, 화학 점수를 입력받아서 출력
import java.util.*;
public class 메소드_구조적프로그램 {
	static int input(String msg) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(msg+" 입력: ");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  int k = input("국어");
	  int e = input("영어");
	  int m = input("수학");
	  int p = input("물리");	
	  int h = input("국사");
	  int c = input("화학");
			  
		/*	Scanner scan = new Scanner(System.in);
		System.out.println("국어 입력: ");
		int kor = scan.nextInt();
		System.out.println("영어 입력: ");
		int eng = scan.nextInt();
		System.out.println("수학 입력: ");
		int math = scan.nextInt();
		System.out.println("물리 입력: ");
		int p = scan.nextInt();
		System.out.println("국사 입력: ");
		int h = scan.nextInt();
		System.out.println("화학 입력: ");
		int m = scan.nextInt();
		*/
		
	}

}
