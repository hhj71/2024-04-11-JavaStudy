
public class 문자열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg="ABCDEFG";
		String m=msg.substring(2, 6);  // 자른걸 다른 변수에 저장함.
		/* 잘라도 원본 변경 x
		 * System.out.println(msg.substring(2, 6));
		 */
		System.out.println(m);
		System.out.println(msg);
		/*
		 * 원본을 유지하는 게 좋음
		 */
		
		int a=10; 
		int b=20;
		String s1=String.valueOf(a); // String.valueOf() -> 모든 데이터형을 문자열로 변경해준다. 
		String s2=String.valueOf(b); // 정수를 문자열로 변경
		/*
		 * 윈도우, 웹에는 정수, 실수, 논리형과 같은 데이터형이 없다 -> 문자열로 꼭 변환해줘야함
		 * 자바에서는 원래상태로 복귀시켜서 처리함
		 */
		/*
		 * 입력창
		 * <input type = text> <input type=number>
		 * JtextField
		 * 
		 * 
		 * 
		 */
	}

}
