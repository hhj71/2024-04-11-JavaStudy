/*
 *   단일 조건문   - 중복조건을 다 처리할 때 사용
 *   --------- 단점: 독립문장이기 때문에 모든 조건을 다 처리 => 속도가 느려진다. 
 *   if(조건문)
 *   {
 *   }
 *   if(조건문)
 *   {
 *   }
 *   if(조건문)
 *   {
 *   }
 *   if(조건문)
 *   {
 *   }
 *   if(조건문)
 *   {
 *   }
 * 
 *   => 선택조건문 => true/false => 나눠서 처리
 *      형식) 
 *         if(조건문)
 *         {
 *             조건이 true일때 처리
 *         }
 *         else
 *         {
 *             조건이 false일때 처리
 *         }
 * 
 *         if(조건문)
 *         {
 *         }
 *       --------------------------  
 *         if(조건문)
 *         {
 *         }
 *         else
 *         {
 *         }
 *       --------------------------  
 *     다중조건문 - if{} else{}
 *             쓰이는 곳
 *             - if => 정상수행
 *               else => 오류/입력문제
 *            - 오류발생 -> 1) 프로그래머의 실수 -> 어렵다 -> 예외처리
 *                       2) 사용자 입력 -> if~else 
 */
//1. 짝수/홀수 판단 ==> num%2==0 /num%2!=0
public class 제어문_조건문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=(int)(Math.random()*100)+1;
       System.out.println("num="+num);
       if(num%2==0) {
    	   System.out.println(num+"는(은) 짝수입니다");  //true일때 처리되는 문장
    	  }
       //num%2!=0
       else {
    	   System.out.println(num+"는(은) 홀수입니다"); //false일때 처리되는 문장
       }
		
	}

}
