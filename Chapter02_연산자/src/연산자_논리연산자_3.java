/*
 * || (or 연산) -> 표현방식 (조건) || (조건)
 *  └ 병렬연산자 -> 조건중에 한개 이상이 true면 true가 되는 연산자
 *               범위를 벗어난 경우에 주로 처리
 *               score >= 60 && score <70 - 범위가 있는 경우 (~부터 ~까지)
 *               score <= 60 || score >70 - 범위를 벗어난 경우
 *                
 */
public class 연산자_논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score=(int)(Math.random()*100)+1; //1~100 추출
		System.out.println("score= " + score);
		boolean bCheck=(score<30)||(score>70); // 1~29, 71~100 이면 true
		System.out.println(bCheck);
		
		
		
	}

}
