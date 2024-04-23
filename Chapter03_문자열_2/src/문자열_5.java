
public class 문자열_5 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		String s1 = "hello";
		String s2 = "Hello";
		
		if(s1.equalsIgnoreCase(s2))// 같은 경우 => true / 다른 경우 => false
		{                          // .equals() -> 대소문자 구분해서 비교 -> 비밀번호에서 사용 
			                      //.equalsIgnoreCase()-> 대소문자 구분없이 비교 -> 검색기에서 사용
			                      // 둘다 결과값 true/false => 조건문에서 주로 사용
			System.out.println("s1과 s2가 같다");
		}
		else
		{
			System.out.println("s1과 s2가 다르다");
		}
		
		*/
		String msg= "Hello Java";
		for(int i=msg.length()-1;i>=0;i--) // 초기값에 -1을 하는 이유는 index는 0부터 시작하기 때문에
		{
			System.out.print(msg.charAt(i));
		}
		//length() 문자갯수 => index 는 0부터 시작함.
		for(int i=0; i<msg.length();i++) // 
		{
			System.out.print(msg.charAt(i));
		}
	}

}
