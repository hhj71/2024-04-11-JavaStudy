//
   
/* 
 * 출력형식
 *   = System.out.println()
 *   				======= ln() => new Line
 *   	System.out.println("Hello");
 *   	System.out.println("Java");
 *   ===> 결과값은 Hello
 *   			 Java
 *   
 *   = System.out.print() => 옆으로 출력
 *    	System.out.print("Hello");
 *    	System.out.print("Java");
 *    ====> 결과값은  Hello Java
 *    
 *   = System.out.printf()
 *    -> 서식이 있는 출력
 *    %d => 정수
 *    %f => 실수
 *    %c => 문자
 *    %s => 문자열
 *    
 * = 자바에서 표현법
    # 정수표현법
 *   		= 10진법 (0~9)  ex) 10,20
 *   		= 8진법 (0~7)   ex) 010 (8을 표현한 것)
 *           	* 8진법은 앞에 0을 붙임.
 *   		= 16진법        ex)0x10 (16을 표현한 것)
 *   			* 16진법은 앞에 0x 를 붙임.
 *   			*  색상을 표현할 때 많이 사용한다.
 *   		= 2진법 		   ex)0b10 (2를 표현한 것)
 *   			* 2진법은 앞에 0b 를 붙임.
 *   ==============================================
 *   			10 , 10L --> 64bit (long)          *long 보다도 길면 문자열로 바꿔서 사용
 *  			 |> 32bit (int)
 *   	
 *  # 실수표현법 => 10.5 , 10.5F
 *               -----  ----- > 32bit (4byte) 1byte => 8bit
 *                 |>저장하는 메모리 크기 => 64bit
 *   	
 *  # 문자표현법  => 'A' => 한글자만 사용이 가능
 *   	
 *  # 문자열표현법 => "Hello" =>  여러 문자 사용이 가능
 *    
 *    
 */
public class MainClass2 {  // 괄효는 항상 옆으로 붙여주는게 좋다.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("\"홍길동\""); // 따옴표까지 출력하기 위해서는 역슬러시를 꼭 붙여야 오류가 안 난다.
									// 명령문이 종료하면 반드시 ; 을 써야 한다!!!
	System.out.println("c:\\javaDev\\movie.txt"); // 역슬러시를 출력하기 위해서는 역슬러시 한개를 더 붙여줘야 오류가 안 난다.

	//홍길동 남자 로 출력하고 싶다 두가지 방법
	System.out.println("홍길동    남자");
	System.out.println("홍길동\t남자");
	
	/* 홍길동
	 * 남자      로 출력하고 싶다
 	 */
	System.out.println("홍길동\n남자");
	
	//홍길동   남자   26을 출력하고 싶다
	System.out.print("홍길동\t");  // 옆으로 붙이고 싶을 때는 print
	System.out.print("남자\t");
	System.out.print("26");
	System.out.println();
	
	/*
	 *  ★
	 *  ★★
	 *  ★★★
	 *  ★★★★          => 출력하기
	 *  ★★★★★
	 */
	System.out.println("★");
	System.out.println("★★");
	System.out.println("★★★");
	System.out.println("★★★★");
	System.out.println("★★★★★");
	
	
    /*
     * ★★★★★
     * ★★★★
     * ★★★          => 출력하기
     * ★★
     * ★
     */
	
	for(int i=0; i<=5; i++) {
    	
    	for(int j=0; j<=4-i; j++) {
    		System.out.print("★");	
    	}
    	System.out.println();
    	

    }
	
	System.out.println("10 20 30 40 50");
	System.out.printf("%3d%3d%3d%3d%3d", 10,20,30,40,50); //printf 서식주고 출력/ 왼쪽정렬은 - , 오른쪽 정렬은 그냥
	}

}
