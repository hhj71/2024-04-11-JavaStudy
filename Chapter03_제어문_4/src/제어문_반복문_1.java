// 65page 
/*
 *   반복 제어문
 *   ***
 *   = for => 화면 출력  = 갯수 확정 => 반복 횟수 지정되었을 때 사용
 *     형식)
 *                     | true => 반복수행문장 
 *                     | false => 종료
 *    [실행순서]-> [1]  [2]  [4]
 *          for(초기값;조건식;증가식) ==> 2차 for => 코딩 테스트 
 *          {
 *             		반복 수행문장 [3] 
 *          }
 *   = while => 데이터베이스 = 무한 스크롤 => 반복 횟수 지정이 없는 상태 
 *          초기값 ------------- [1]
 *          while(조건식) ------ [2] => false면 종료
 *          {
 *             반복 수행문장 ----- [3]
 *             증가식   -------- [4] => 다시 조건식으로 이동 
 *          }
 *   ------------------------------------------- 한번도 수행을 못할 수도 있다
 *      => 조건 : 선조건 
 *   = do~while => 빈도수가 거의 없다 
 *          초기값
 *          do{
 *               반복문장 
 *               증가식
 *          }while(조건식)
 *   ------------------------------------------- 무조건 한번 이상 수행 
 *      => 조건 : 후조건 
 *      => 자바의 모든 프로그램은 변수/연산자/if,for ==> 알파벳 
 *                          ----------------
 *      => 관련된 내용끼리 묶어서 사용 : 배열/클래스/메소드 => 재사용
 *                                단어 / 문장 / 회화
 *                                
 *      ** for : 반복문 => 가장 많이 사용되는 반복문 
 *         => for-each
 *         
 *         1) 형식 
 *            for(초기값;조건식;증가식)
 *            {
 *                반복 수행 문장 
 *            }
 *            초기값 : 시작점 int i=1 
 *            조건식 : 끝점  i<=10
 *            증감식 : i++
 *         2) 동작 순서     | false => for문 종료
 *                  ① --> ② <-- ③
 *            for(①초기값;②조건식;③증가식)
 *            {           
 *                           ↗
 *                        | true 반복문장 수행
 *                반복 수행 문장 ④
 *            }
 *            ① -> ② -> ④ -> ③ -> ② -> ④ -> ③ -> ② -> ④ -> ③ 
 *                 -----------    ------------   ------------ ②false면 종료
 *         3) 구현 
 */
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");
        System.out.println("Hello Java!!");*/
		/* for(int i=1;i<=10;i+=2) // 증가식은 프로그램에 따라 달라진다 
		{                          // 홀수만 출력할 때
			System.out.println(i+":Hello Java!!");
		}*/ 
		for(int i=10;i>=1;i--) // 초기값은 첫번째 값 or 마지막 값, 증감식 => -- , ++
		{                      // 내림차순으로 출력할 수 도 있다.
			System.out.println(i+":Hello Java!!");
		} 
		// 방문 => cookie에 저장 클릭한 순서로 저장 => 뒤에서부터 출력 
		// 웹 => 최신순 
	}

}