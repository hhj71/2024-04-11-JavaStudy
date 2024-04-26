/*
 *   문자 10개를 저장
 *   => 출력
 *      HELLO
 *   => 반대 출력
 *      OLLEH
 *   => Sort => 이차 for =>
 *   -----------------------------------------------
 *   이력서      
 *    ↓     ┌ 기본 개념(x) -> 본인의 포트폴리오 내용에서 질문함
 *   면접 : 기술면접/ 코딩테스트 / 인성면접 
 *         테스트지(서술형) / 인성면접  
 *   -------------------------------------------------
 * 	
 * 
 */
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] alpha=new char[10];
		for(int i=0; i<alpha.length;i++)
		{
			alpha[i]=(char)((Math.random()*26)+65);
		}
		// 출력 => for-each : 출력 중심 => 웹 => 배열/(컬렉션-12장)
		/*
		 *  for(데이터형 변수: 배열명)
		 *      -----      ----
		 *        |          |
		 *        ------------ 일치 (데이터형 변수가 데이터형이 클 수도 있다)
		 *   char[]
		 *   
		 *    for(char c: 배열)
		 *    for(int  i: 배열)
		 *    for(double d: 배열)
		 *    
		 *    byte<char<int<long<double
		 *      -------------------->
		 *      for-each 구문
		 *      => 있는 그대로 출력할 때 사용하기 좋음. 하나의 배열만 출력 가능
		 *      => 가급적이면 같은 데이터형으로 받는다
		 *      => 인덱스를 이용하는 것이 아니라 => 실제 배열에 저장된 값을 읽어온다
		 *      => 단점 : 관련된 다른 배열의 값을 출력할 수 없다
		 *       ex) 
		 *         String[] names={"","","","",""}
		 *         String[] sexs={"","","","",""}
		 *         ================> index를 이용해서 출력 불가 -> 일반 for문 이용해야 함.
		 *         
		 *         이름 (성별)
		 *         for(String name:names)
		 *      => 단점2: 뒤에서부터 출력도 안된다.   
		 * 
		 */
		for(char c:alpha)
		{
			System.out.print(c+" ");
		}
		System.out.println("\n------------반대로 출력");
		for (int i=alpha.length-1; i>=0; i--)
		{
			System.out.print(alpha[i]+ " ");
		}
		
	}

}
