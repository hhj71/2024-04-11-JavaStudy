/*
 * 논리연산자 ==> 결과값은 true/false
 * && => 직렬연산자
 * || => 병렬연산자
 *  
 *  (조건) && (조건) -> 두가지 조건을 연산해서 결과값을 나타낸다. 
 *  				 범위나 기간을 포함함.
 *                   왼쪽 조건이 false 면 오른쪽 조건연산을 안함
 *                 ex) jumsu>=0 && jumsu<=100  0~100사이에 있는지
 *   
 *  (조건) || (조건) -> 범위, 기간을 벗어난 경우
 *                   왼쪽 조건이 true 면 오른쪽 조건연산을 안함
 *   
 *   -----------------------------------
 *                 &&             ||
 *   -----------------------------------
 *   true true     true          true
 *   -----------------------------------
 *   true false    false         true
 *   -----------------------------------
 *   false true    false         true
 *   -----------------------------------
 *   false false   false         false
 *   -----------------------------------
 *   
 *   
 */
public class 연산자_논리연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;
		int y=9;
		
		//boolean bCheck = x==y && ++y==x; // 앞에서 false여서 뒤에꺼 수행 안함. => 효율적인 연산
		//boolean bCheck = x!=y && ++y==x;
		boolean bCheck = x!=y || ++y==x; // 앞에서 true여서 뒤에꺼 수행안함. => 효율적인 연산
		System.out.println("bCheck="+ bCheck);
		System.out.println("x="+x);
	    System.out.println("y="+y);
	    
	    
		
		
		
		
	}

}
