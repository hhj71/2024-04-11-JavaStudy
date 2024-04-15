/*
 *  형변환연산자
 *  ------------(데이터형) => boolean은 제외
 * 
 *  형변환 종류
 *   - UpCasting => 데이터형을 크게 만든다
 *   - DownCasting => 데이터형을 작게 만든다. 
 * 
 *     =========UpCasting============> 
 *     byte<char<int<long<float<double 
 *     <========DownCasting===========
 *     
 *     
 *     
 * 
 */
public class 연산자_단항연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 형변환 (데이터형) => (int), (double), (char) ...
		System.out.println('A');
		System.out.println((int)'A');//65
		
		System.out.println(98);
		System.out.println((char)98); //b
		
		System.out.println(10.5);
		System.out.println((int)10.5);//10
		
		/*
		 *    10.5+10.5           ==> 21.0
		 *    (int)(10.5+10.5)    ==> 21
		 *    (int)10.5+(int)10.5 ==> 20
		 *    
		 *    double d=123456.78
		 *    int i=123456
		 *    (int)((d-i)*100) = 77 //bit가 다르면 .999999로 채워지기 때문에
		 *    
		 *    float d=123456.78F
		 *    int i=123456
		 *    (int)((d-i)*100) = 78
		 *    
		 *     
		 */
		
		int rand=(int)(Math.random()*100)+1;
	 //                ----------- 
	 //			         0.0~0.99
	//                -------------------
	//                  0.0 ~ 99.0	
	//            ---
	//            0~99	(int 변환함)
	//                                  ----
	//                                  1~100	
		System.out.println("rand=" + rand);
		
		
	}

}
