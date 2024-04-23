// 망고:mango
public class 문자열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String f = "망고:mango";
		System.out.println("망고의 영어는?");
		System.out.println("영어는 "+f.substring(f.indexOf(":")+1));
		
		/*
		 * substring: 문자열을 자르는 경우에 사용
		 *
		 * 1. substring(int startIndex): startIndex 자리 이후 문자열 다
		 * ex) Hello Java
		 *     0123456789
		 *     substring(6) => Java
		 *     
		 * 2. substring(int startIndex, int endIndex) : startIndex 부터 endIndex-1자리까지 잘라줌
		 * ex) Hello Java
		 *     0123456789
		 *     substring(3,8) =>lo Ja
		 */
		
		String msg="Hello Java";
	    System.out.println(msg.substring(0, 7)+"...");
		
		
	}

}
