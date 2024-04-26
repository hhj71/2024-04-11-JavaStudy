/*
 * 		1. 중복없는 난수 => 응용
 *      -------------------
 *      숫자 야구 게임
 *      ----------
 *      순서
 *      1. 난수를 발생시킨다 (3자리)
 *      2. 사용자 입력을 받는다
 *      3. 힌트를 준다 
 *      	- 같은 자리 일때 : S 
 *      	- 다른 자리 일때 : B
 */
 
import java.util.*; // 사용자 입력
/*
 *  2장 / 3장 / 4장
 *   |    |  ---------> 묶음 
 *  연산자/제어문
 * 
 * 1. 묶음
 * 		변수 여러개를 묶어서 관리
 * 		변수 여러개 => 제어문 사용이 어렵다 ===> 배열(이름이 1개 -> 구분자는 인덱스) 
 * 		-------- 평문을 사용한다                                    └ 0번부터 순차
 *                                         *** 배열은 변수가 3개 이상일 경우 사용
 *                                              -> 사용 용도가 같을 경우만 가능하다는 것 명심!!
 *                                             
 *      난수 100개 
 *      int a1=(int)(Math.random()*100)+1;
 *      ..
 *      ..
 *      int a100=(int)(Math.random()*100)+1;
 *      
 *      최댓값 / 최솟값
 *      int max=a1;
 *      if(max<a2)
 *      	max=a2;
 *      ...
 *      ...
 *      if(max<a100)
 *      	max=a100;   
 *      ===============> 배열을 활용하면 훨씬 간단하게 코딩할 수 있다. 
 * 
 *   -> 명령문 묶음 : 메소드
 *   -> 한개에 대한 정보 묶음 : 클래스    +
 *      ----------------------------
 *                     프로그램 1개 완성 
 * ===============================================================================================================================
 *   2장 연산자
 *   -------
 *   종류
 *   단항연산자                    연산방향     우선순위
 *   	 [], (),                 ==>       1
 *       ++, -- (전치연산)         <==        2
 *       ++, -- (후치연산)         <==        3
 *       --------------- !, (type)
 *       ex)
 *            (int)Math.random()*100
 *                 -----------------
 *              2       1
 *                    <==== (연산방향)
 *    ** (type) : 형변환 연산자                
 *                 └> 숫자와 관련/ 클래스에 사용가능
 *                  = UpCasting -> 데이터형을 크게 만든다
 *                     정수 => 실수
 *                     문자 => 정수
 *                  = DownCasting -> 데이터형을 낮게 만든다
 *                     실수 => 정수
 *                     정수 => 문자
 *                  크기 순서
 *                  ------
 *                       ========> UpCasting
 *                 byte < char < int < long < float < double
 *                       <======== DownCasting
 *                       
 *         ** 자동으로 변경 (자동 형변환)
 *             대입 / 연산
 *             int a = 'A'
 *                     ---- 65
 *                     a=65
 *             double d = 10
 *                        --- 10.0
 *                     d= 10.0 
 *            -------------------
 *             자동으로 변경되는 조건?
 *             값보다 큰 데이터형이어야 변경됨 (데이터형 변수명 = 값)
 *            -------------------  
 *             데이터형이 값보다 작은 경우?
 *             필요에 의해서 강제로 변경해야 함. (강제 형변환)
 *             ex) int a = 10.5
 *                 ---     ----  int<10.5 (오류)
 *                 int    (int)double                                      
 *               ** 예외) 
 *              	char c=65; => char는 예외
 *               ** 연산처리
 *               1) char는 자동으로 int로 변경
 *               2) 연산처리시에는 큰 데이터형으로 변경 => 연산처리(같은 데이터형이어야 한다)
 *                -> 10 + 10.5 
 *                   --   ----
 *                   10.0 (double) => 연산처리
 *                   
 *                -> 'A' + 1
 *                   ---
 *                   65  + 1
 *                   
 *                ** 주의할 점 ) int 이하 데이터형은 연산시에 int값의 결과가 나온다
 *                				 	char + char = int
 *                 					byte + byte = int 
 *                        			ex) byte b1=10;
										byte b2=20;
										byte b3=b1+b2; -> 오류 발생 ==> byte b3= (byte) b1+b2;
		            
 *   이항연산자        
 *   		                       						연산방향       우선순위 --> 우선순위를 모르는 경우 () 사용하자
 *          - 산술연산자:  *,/,%        			 		 ==>          4              ** '/' => 정수/정수 = 정수
 *                      +,-          			 		 ==>          5              ** '+' 는 산술 기능 외에 문자열 결합 연산자의 기능도 한다. 
 *                             
 *          - 비교연산자:  <,>,<=,>=,==,!=         			 ==>          6
 *                     (숫자, 문자, 논리형 비교할 때 사용)
 *                      equals, instanceof  
 *                      (문자열)   (클래스)
 *                    ** 모든 결과값은 true/false
 *          - 논리연산자:
 *                      &&                               ==>          7
 *                      ||                               ==>          8
 *                     ** 모든 결과값은 true/false    
 *                     ** 조건문이나 반복문에서 많이 쓰임  
 *                                          
 *   삼항연산자
 *           - (조건)?값1:값2 -> true면 값1, false면 값2      <==          9
 *              ==> if~else와 비슷
 *              --> 웹/게임 -> 복잡도를 줄이기 위해 주로 사용
 *                   
 *   대입연산자
 *          - =, +=, -=                                  <==         10
 *           
 *           ** 예) int a=10; --> a라는 변수에 10을 대입한다(x)
 *                           --> 10을 a라는 변수에 대입한다.(o)
 *           ** 대입연산자는 대부분 제일 마지막에 처리되는 연산자이다.
 *           
 * 연산자의 사용빈도 순위
 *  1. 산술 연산자 / 2. 대입연산자
 *  ** 제어문에서는 조건문은 1. 비교연산자 / 2. 논리연산자
 *              반복문은 1. 비교연산자 / 2. 증감연산자                          
 * ================================================================================================================================ 자바 연산자
 *  3장 제어문 
 *   => 프로그램을 제어 
 *      -> 반복수행 
 *          - for       : 반복횟수가 지정된 경우
 *          - while     : 반복횟수를 모르는 경우
 *          - do~while  : 반복횟수를 모르는 경우 & 반드시 한번이상 수행해야 할 때 
 *      -> 건너뛴다
 *          - 단일 조건문  : if ~ else
 *      -> 선택한 내용만 처리
 *          - 다중 조건문  : if ~ else if .... ~ (else)
 *                       -> 해당 조건 문장만 수행, else는 해당 조건이 없는 경우에 처리
 *          - 선택문      : switch (정수, 문자, 문자열)
 *          				{
 *          					case 1: 
 *          					처리문장
 *          					break;
 *                             ...
 *                           (default:   ) // 생략 가능
 *                           }  	
 *                        ** 단순화된 다중조건문
 *                        ** 처리문장이 같은 경우 case 만 연달아 작성할 수 있다.
 *                        ** 웹에서는 사용빈도가 작지만 네트워크의 경우수, 게임에서 사용된다.
 *                        
 *      -> 오류 처리
 *          - 조건문         
 *             ** 조건문으로 처리를 못한는 경우에는 예외처리를 해야 한다. 
 *                 (throws / try~catch) => 반드시 예외처리를 해야하는 것들이 있다. => file 관련된 것, 네트워크
 *                                         ---------- 8장
 *                                         2~8장 -> 기본 문법
 *                     					   9~14장 -> 라이브러리
 *                                         다른 프로그램 연결: 네트워크, SQL
 *  => 반복문에 제어
 *      -> 종료 
 *          - break     : 반복문, 선택문에서만 사용이 가능하다.
 *      -> 제외
 *          - continue  : 반복문에서만 사용이 가능하다.
 * -----------------------------------------------------------------------------------------------
 *  제어문을 공부할 때 초점을 맞춰야 하는 부분
 *    1. 제어문 별 형식
 *    2. 동작 순서
 *         => 조건이 맞는 경우에만 실행 
 *    3. 사용 위치
 *         => 오류 처리 => 사용자 입력값을 받은 경우에 주로 처리
 *    4. 조건 설정                                              
 *         => 비교연산자 / 논리연산자
 *                      ------ 범위 지정할 경우  
 *     ** 주의할 점 
 *          - if를 여러개 사용하면 독립적이기 때문에 모든 조건을 검색한다 -> 속도가 느려질 수 있다.
 *             (여러 문장을 동시에 수행이 가능)                             
 *                     
 */
public class 중첩_for_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 컴퓨터가 난수 발생 => 1~9 사이의 중복이 없는 숫자 -> 3개
		int[] com = new int[3];
		for(int i=0; i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;//1~9
			// 중복여부 확인
			for(int j=0; j<i; j++)//생성된 난수 만큼만 비교함 -> j<i
			{
				if(com[i]==com[j])// 같은 수가 있는지 확인 ==> 비교연산/ 논리연산만 조건에 쓸 수 있음
				{
					i--; // 다시 난수를 발생한다
					break; // j가 있는 2차 for만 종료 ==> i++로 이동한다
				}
			}
			
		}
		//System.out.println(Arrays.toString(com));
	    
		// 사용자가 입력한 데이터 저장
		int[] user = new int[3];
		Scanner scan = new Scanner(System.in);
		
		// 2. 사용자 입력 요청
		while(true) // 반복횟수를 모르기 때문에 => 정답시에 종료를 해준다 => 무한 루프
		{
			System.out.print("세자리 정수를 입력하세요>>");
			int input = scan.nextInt();
			// 오류 처리 => 세자리 정수가 입력이 안된 경우
			if(input<100 || input>999)
			{
				System.out.println("알림 ☞ 세자리 정수만 입력해야 됩니다.");
				// while의 처음으로 이동
				continue; 
				// while에서 사용될 때는 조건식으로 이동됨(처음으로 다시 시작할때 많이 사용) / for에서 사용될 때는 증감식으로 이동됨(제외할 때 많이 사용)
			}
			// 세자리 정수를 입력한 경우 
			// 자리수별로 한개씩 배열에 들어가게 잘라냄
			   user[0] = input/100;
			   user[1] = (input%100)/10;
			   user[2] = input%10;
			// '%' 는 숫자를 잘라낼 때 많이 사용
			   
			// 오류처리 2개
			// 1. 같은 수인 경우는 안된다
			   if(user[0]==user[1] ||
				  user[1]==user[2] ||
				  user[0]==user[2]    )
			   {
				   System.out.println("알림 ☞ 중복된 수는 사용할 수 없습니다.");
				   continue; // 다시 입력
				   // if => 단일 조건문 => 사용자 입력 , 오류
			   }
			   
			// 2. 0을 입력하면 안된다. -> 0이 앞자리가 되면 8진법이 되어버리기 때문에
			   if(user[0]==0 || user[1]==0 || user[2]==0)
			   {
				   System.out.println("알림 ☞ 0은 입력할 수 없습니다.");
				   continue; // 다시 입력
			   }
			   // 정상적으로 입력이 되었다면
			   // 3. 비교
			   int s=0, b=0; // s는 숫자와 자리수가 맞는 경우,  b는 숫자는 있고 자리수가 맞지 않는 경우
			   for(int i=0; i<3; i++) //com
			   {
				   for(int j=0; j<3; j++)  //user
				   {
					   if(com[i]==user[j])  // 같은 수가 존재하는지 확인
					   {
						   if(i==j) // 같은 자리면
							   s++;
						   else
							   b++;
					   }
				   }
			   }
			 // 힌트 제공  
			   System.out.printf("Input Number: %d, Result:%dS-%dB\n", input, s, b);
			 //  4. 정답 여부 확인 => 정답이면 종료
			 //                    break
			   if(s==3) 
			   {
				   System.out.println("GAME OVER!!");
				   break;
			   }
		}
		
		// 오답이면 다시 입력 가능
		//      continue
		
		
		
	}

}
