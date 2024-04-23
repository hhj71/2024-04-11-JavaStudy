
public class 문자열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha="ABCDEFGHIJ";
		//            0123456789
		// 1. => CDEFGHIJ
		// 2. => EFG
		
		System.out.println(alpha.substring(2));
		System.out.println(alpha.substring(4, 7));
		
		String id=" admin ";
		System.out.println(id+"의 문자 갯수:"+id.length());
		// " " => space 문자
		id=id.trim();
		// trim() ==> 좌우의 공백 제거 => 검색, 입력에 사용
		// " 감자" => 실수로 공백을 주면 검색이 안될 수 있다. 
		System.out.println(id+"의 문자 갯수:"+id.length());
		
		String msg= "Hello Java";
		//           0123456789
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		
		String ext="Hello.java";
		//          0123456789
		System.out.println(ext.substring(ext.indexOf(".")+1)); // java만 출력하고 싶기 때문에 +1 해준다.
		// 업로드/ 다운로드 할때 사용함...
		/*
		 * 데이터형
		 * 	정수 : 정수만 저장 => int, long, byte
		 * 					Integer, Long , Byte // 클래스
		 *  실수 : 실수만 저장 => double
		 *                   Double // 클래스
		 *  문자 : 문자 1개 저장 ==> char
		 *  논리 : true/false => boolean
		 *                      Boolean // 클래스
		 *  문자열 : 문자 여러개를 동시에 저장 => String
		 * 
		 */
		int a = Integer.parseInt("100");// 문자열을 정수형으로 바꿔주는 메서드 
		
		
	}

}
