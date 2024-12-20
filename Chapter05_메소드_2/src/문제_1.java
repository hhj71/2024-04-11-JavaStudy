/*
 * 메소드 => 전체 소스를 분리해서 작업 (분업화)
 *   1) 형식 
 *      리턴형 메소드형(매개변수)  ============> 선언부 (원형)
 *      ---------- 존재 여부 ----- 존재 여부------
 *      {
 *      	=> 구현
 *      	return 값 => void일 경우에는 생략할 수 있다.
 *      }
 *   2) 유형
 *       리턴형  매개변수
 *        o      o
 *        o      x
 *        x      o
 *        x      x
 *   3) 구현
 *   	{
 *    		구현 => 연산자/제어문
 *    	}
 *   4) 호출
 *   	리턴형이 있는 경우
 *   	데이터형 변수 = 메소드명()
 *   	리턴형이 없는 경우
 *   	메소드명()
 *      
 *     ------------------------
 *     매개변수 => 메소드(값, 값....)
 *     ** 메소드는 호출시마다 => 처음부터 수행
 *     ** 객체지향의 3대 요소 
 *     		------------- 변수, 메소드, 생성자
 *     ** 클래스는 1개의 기능만 가지고 있다
 *              --------
 *              이 1개의 기능을 세분화 시킨 것 -> 메소드
 *            ex) class 예약 =============> 웹 프로그램에 조립
 *                {
 *                   1. 맛집 목록 출력
 *                   2. 맛집 클릭시에 예약일 출력
 *                   3. 예약일 클릭시 예약 가능한 시간 
 *                   4. 시간 => 인원수 확정
 *                   5. 예약버튼 활성화
 *                }
 *  
 */
// 1~10까지 출력하는 메소드를 구현하시오
// 리턴형 x, 매개변수 x
public class 문제_1 {
static void num() //메소드에서 출력하라는 것은 void 함수를 이용하면 된다.
{
	for(int i=1; i<=10; i++)
	{
		System.out.print(i+" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		num();
	}

}
