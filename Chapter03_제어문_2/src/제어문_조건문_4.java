/*
 * if~else 와 똑같은 역할을 하는 것=> 삼항연산자. 형식은 (조건)?값1:값2
 *  if(조건문)
 *  {
 *      조건 true
 *  }
 *  else
 *  {
 *      조건 false
 *  }  
 */
/*
 * 3개의 정수 (국어, 영어, 수학)
 *    => A , B , C , D ,F
 *       -> A+ , A0 , A-
 *        A+ = 100~97
 *        A0 = 96~93
 *        A- = 92~90
 *   순서
 *   1. 사용자가 국어 영어 수학 입력
 *   2. 조건에 맞게 학점 부여     
 */

import java.util.Scanner;
public class 제어문_조건문_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in); // System.in은 키보드 입력값을 읽어온다 => 키보드 입력값만 읽을 수 있다.  
		/*
		 * 데이터형 별 읽어올때 쓰는 것
		 *    1) 정수: nextInt()
		 *    2) 실수: nextDouble()
		 *    3) 논리: nextBoolean()
		 *    4) 문자열: next() ==> String
		 *       ** 문자 추출 => next().charAt(index) 
		 *       ex) 
		 *       ABCDEFG   => next().charAt(6) => 'G' => char
		 *       0123456
		 */
		System.out.println("국어 점수 입력:");
		int kor=scan.nextInt();
		System.out.println("영어 점수 입력:");
		int eng=scan.nextInt();
		System.out.println("수학 점수 입력:");
		int math=scan.nextInt();
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
		
		//학점 => 중첩 조건문
		//1. 학점 => A~F
		char score = 'A';
		
		//2. op => +,0,-
		char op = '+'; //지역변수는 반드시 초기화 후에 사용해야 한다. 초기화 할 때 공백도 가능함.
		
		int avg = (kor+eng+math)/3;
		if (avg>=90 && avg <100) {//A
			score='A';
			if(avg>=97) 
				op='+';
	        if(avg>=93 && avg<97)
	        	op='0';
	        if(avg>=90 && avg<93)
	        	op='-';
		}
		if (avg>=80 && avg <90) {//B
			score='B';
			if(avg>=87) 
				op='+';
	        if(avg>=83 && avg<87)
	        	op='0';
	        if(avg>=80 && avg<83)
	        	op='-';
		}
		if (avg>=70 && avg <80)	{//C
			score='C';
			if(avg>=77) 
				op='+';
	        if(avg>=73 && avg<77)
	        	op='0';
	        if(avg>=70 && avg<73)
	        	op='-';
		}
		if (avg>=60 && avg <70) {//D
			score='D';
			if(avg>=67) 
				op='+';
	        if(avg>=63 && avg<67)
	        	op='0';
	        if(avg>=60 && avg<63)
	        	op='-';
		}
		if (avg<60) {//F
			score='F';
		}
		System.out.println("학점:"+ score+""+op);
	}

}
