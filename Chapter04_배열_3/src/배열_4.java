// 1. 배열의 범위를 벗어나면 오류가 발생한다. -> 인덱스는 0번부터 갯수-1까지!
// 2. 프로그래머의 실수가 가장 많은 곳 => 실행시에 오류발생 => ArrayIndexOutOfBoundsException (에러: 인덱스번호가 범위를 벗어났습니다.)
//                                           => 93 page => 크롤링할 때 발생하는 편 
// 그래서 배열 대신에 List를 사용하는 편 => 가변적임
/*
 * 에러 => 에러 처리 하는게 중요
 */
 
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2};
		 System.out.println(arr[2]);//에러
		 /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 
		 Index 2 out of bounds for length 2 at 배열_4.main(배열_4.java:10)*/

	}

}
