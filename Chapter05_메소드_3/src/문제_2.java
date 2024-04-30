/*
 * 정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
   정수 입력 
   이진법 처리
   출력 

 * 
 */

import java.util.Scanner;

public class 문제_2 {
	static int input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("0~32767사이의 정수 입력:");
	    return scan.nextInt();
	}
	static int[] binaryCheck(int num)
	{        
		int[] binary = new int[16]; //16개의 정수가 0으로 초기화됨
		/*
		 *  new를 이용하면 
		 *  데이터형이 초기화가 된다
		 *   int => 0
		 *   double => 0.0
		 *   boolean => false
		 *   char => '\0'
		 *   String => null
		 *   new => 동적 메모리 할당 (실행시에 메모리를 만들어서 배치)
		 */
		int index = 15; //뒤에서부터 값을 저장한다.
		while(true) // 반복갯수를 알 수 없기 때문에 무한 루프 (입력된 값에 따라 달라짐)
		{
			 // 2로 나누고 나머지 값을 저장
			 binary[index]=num%2;
			 // 2로 나누기
			 num=num/2;
			 // num 이 0이 될때 까지 반복
			 if(num==0) break;
			 
			 index--;
		}
		return binary;
	}
	// 출력 
	// void 는 리턴(전송)할 값이 없는 경우
	static void print(int[] binary)
	{
		for(int i=0; i<binary.length; i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Scanner scan = new Scanner(System.in);
		System.out.print("0~32767사이의 정수 입력:");
	    int num = scan.nextInt();
		int[] binary = new int[16]; //16개의 정수가 0으로 초기화됨
		/*
		 *  new를 이용하면 
		 *  데이터형이 초기화가 된다
		 *   int => 0
		 *   double => 0.0
		 *   boolean => false
		 *   char => '\0'
		 *   String => null
		 *   new => 동적 메모리 할당 (실행시에 메모리를 만들어서 배치)
		 */
		/* int index = 15; //뒤에서부터 값을 저장한다.
		while(true) // 반복갯수를 알 수 없기 때문에 무한 루프 (입력된 값에 따라 달라짐)
		{
			 // 2로 나누고 나머지 값을 저장
			 binary[index]=num%2;
			 // 2로 나누기
			 num=num/2;
			 // num 이 0이 될때 까지 반복
			 if(num==0) break;
			 
			 index--;
		}
		// 출력
		for(int i=0; i<binary.length; i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}*/
		
		/*     이진법으로 바꿔주는 라이브러리
		 *		int num=10;
				System.out.println(Integer.toBinaryString(num));
		 */
		
	}

}