// 점수 >=60 <=100 -> true
public class 연산자_논리연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=(int)(Math.random()*100)+1; //
		System.out.println("난수값:"+score);
		
		boolean bCheck=(score>=60) && (score%2==0); 
		//                              └짝수 조건
		// System.out.println(bCheck);

		// score가 40이상이고 score 홀수면
		
		//boolean cCheck=(score>=40) && (score%2==1);// 홀수 조건 score%2==1 or score%2!=0
		
		bCheck=(score>=40) && (score%2!=0); // 변수 재사용 -> 데이터명은 사용X
		// 변수는 필요할 때마다 변경해서 사용이 가능하다. 
		// main 종료시까지 메모리가 유지되고 있음.
		System.out.println(bCheck);
	}

}
