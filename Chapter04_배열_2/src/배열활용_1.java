/*
 *  배열 => 5
 *  ------------------------ 
 *      |    |    |    |
 *  ------------------------
 *  ==> 간격이 다 동일해야 index 를 만들수 있다
 *      간격의 단위는 byte --> 4byte   /  8byte
 *                         int[]      double[] 
 *                         
 *  1) 초기값
 *  	1. 0번부터 추가
 *      2. 마지막부터 추가
 *  ------------------------
 *    정수 입력을 받아서 => 2진법을 출력
 *    
 *    8bit 
 *    10 =이진법=> 00001010 -> 뒤에서부터 첨부하는게 좋다.
 * 
 */
import java.util.Scanner;
public class 배열활용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("0~32767까지 사이의 정수 입력:");
		// 16bit
		int input = scan.nextInt();
		// 0,1 저장
		int[] binary = new int[16];
		int index=binary.length-1; //0~15
		
		System.out.println("===== API 이용 =====");
		System.out.println(Integer.toBinaryString(input)); //2진법
		System.out.println(Integer.toOctalString(input));  //8진법
		System.out.println(Integer.toHexString(input));    //16진법
		/* 100을
		 *  
		 * 2진법으로
		 * 1100100
		 * 
		 * 8진법으로
		 * 1 100 100
		 * - --- ---
		 * 1  4   4
		 * 
		 * 16진법으로 
		 * 110 0100
		 * --- ----
		 *  6    4
		 */
		
		
		while (true)
		{
			binary[index]=input%2;
			input=input/2;
			if(input==0)
				break;
			index--;
		}
		// 출력
		for(int i=0; i<binary.length;i++)
		{
			if(i%4==0 && i!=0) //4개 출력후에 1칸 공백 추가 / i!=0 <- i가 0이면 제일 앞칸 공백이 생기기 때문에 생기지 말라고 있는 조건
			{
				System.out.print(" ");
			}
			System.out.print(binary[i]);
		}
	}

}
