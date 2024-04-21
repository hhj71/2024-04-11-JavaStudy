/* 임의의 수
 * 5) 100점 만점으로 성적을 입력 받아 90~100이면 A,
 * 80~89이면 B,70~79이면 C, 60~69이면 D,
   60점 이하면 F를 출력하라 (if 사용)
 */
// import java.util.Scanner;
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scan = new Scanner(System.in);
	    int score = (int)(Math.random()*101);//0~100
		System.out.println("점수:"+score);
		//int score = scan.nextInt();
		char re = 'A';
	    if (score>=90 && score<=100) {
	    	re = 'A';
	    }
	    if (score>=80 && score<90) {
	    	re = 'B';
	    }
	    if (score>=70 && score<80) {
	    	re = 'C';
	    }
	    if (score>=60 && score<70) {
	    	re = 'D';
	    }
	    if (score<60) {
	    	re = 'F';
	    }
	    	
	System.out.println(re+"학점입니다.");
	}
}
