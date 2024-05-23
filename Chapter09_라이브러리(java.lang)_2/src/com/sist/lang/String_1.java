package com.sist.lang;
/*
 * 	  String : 문자열 관리 => char[]를 제어
 * 	           => 오버라이딩이 불가능하다 (제공한 그대로 사용한다)
 * 			   => 종단 클래스 (final) => 상속이 불가능한 클래스
 * 			      ----------------
 * 					Math, System, StringBuffer, Wrapper => 암기용
 * 
 *    => String에 문자열을 저장하는 방법 
 *    	  일반 기본형처럼 사용
 *    	  String s = ""; ==> String 은 일반 데이터형처럼 사용하는 것이 기본이다
 *    	  객체 생성
 *    	  String s = new String("") ==> 한글 코드 변환할 때 new 사용한다
 *    	 *** 문자열은 자체가 메모리 주소
 *    		 ---------------------
 *    		  "Hello" => 메모리 주소 => {'H','e',...}
 *    	  String s1="Hello"
 *    	  Stirng s2="Hello"
 *    
 *    		s1==s2 ==> 같다 ==> == 은 메모리 주소값을 비교할 때 사용한다
 *    						  equals() 는 실제 저장된 문자열을 비교할 때 사용한다
 *    
 *    => 기능 (메소드)
 *    		1. public char charAt(int index) : 원하는 위치의 문자 1개를 가지고 올때 사용
 *    			문자열은 char[] => index 번호는 0번부터 시작한다
 *    			 ex) "Hello Java"
 *    				  0123456789   ==> chatAt(6) ==> 'J'
 *    
 *         2. length() : 문자의 개수를 가지고 온다
 *         	  => public int length()
 *         	  => ex) "Hello Java"
 *    				  0123456789  => 10 => 영문/ 한글 => 글자수(공백 포함)
 *                                                           --- space 문자
 *            => 지정한 길이를 넘어설 때 ...으로 표현 , 비밀번호 확인 , MMS                                  
 *    
 *         3. toUpperCase() / toLowerCase()
 *         		대문자 변환      소문자 변환
 *         	  public String toUpperCase()
 *            public String toLowerCase()
 *            => 한글을 주로 사용하기 때문에 잘 안 사용함
 *         -----------------------------------------------------------------------------------------
 *         검색
 *         4. startsWith() : 시작 문자열이 같은 경우
 *         		public boolean startwith(String start)
 *         		=> 서제스트(자동완성기)를 만드는 경우에 주로 사용
 *         		=> cookie 저장 => cookie 읽기
 *         			=> 문자열만 저장이 가능
 *         			=> 방문 맛집   , 레시피
 *         		           ---     ----
 *         				 food_      recipe_
 *              => ^A (정규식) => A% (오라클)
 *                 --- CSS
 *                 img[src^ = 'http']
 *                 
 *         5. endsWith() : 끝나는 문자열이 같은 경우
 *             public boolean endswith(String end)
 *             	=> 확장자 찾기
 *             	=> 그림 파일 => gif/ jpg / png / bmp
 *              => A$ (정규식)  => %A(오라클)
 *              => img[src^ = 'jpg|gif|png']
 *              
 *        ★ 6. contains() : 포함된 단어
 *         		 => 검색
 *         		 public boolean contains(String s)
 *               => 사이트에 나오는 모든 검색 
 *               => [A] (정규식) , %A% (오라클)
 *               => img[src*='A']
 *               
 *        ★ 7. equals() : 문자열이 같을 때
 *        		public boolean equals(String s)
 *        		=>  주로 사용 : 로그인, 아이디 찾기, 비밀번호
 *        		** equalsIgnoreCase()
 *        		** equals() - 대소문자 구분 /  equalsIgnoreCase()- 대소문자 구분하지 않는다 (검색할 때 사용)
 *                           (아이디,비번찾기)
 *         
 *         8. indexOf() : 앞에서부터 찾기 (일반문자열)
 *         	  public int indexOf(찾는 문자, 찾는 문자열)
 *         9. lastIndexOf() : 뒤에서부터 찾기 (경로명, 확장자)
 *         	  public int lastIndexOf(찾는 문자, 찾는 문자열)
 *         
 *         변경
 *       ★ 10. replace() : 문자나 문자열을 변경할 때 사용
 *              => 크롤링 => 오라클에 저장할 때 자주 사용
 *                 -----------
 *                 => || ,    & ...  ==> 이미지가 있는 경우
 *                 	  --      --
 *                   문자열결합  Scanner
 *              => 오버로딩
 *              public String replace(char c1, 				char c2)
 *              					  -------  				-------
 *                                    변경해야되는 문자(대상)    변경할 문자    
 *              public String replace(String s1, String s2)
 *         
 *       ★ 11. replaceAll() : 정규식 이용 =====> 빅데이터
 *       					  ----- 문자 형태                           
 *                                   맛있다 맛있고 맛있는 ... ==> 맛있+
 *             * 데이터
 *             	 -----
 *             		= 정형화된 데이터 => 프로그램에 필요한 데이터만 수집 (데이터베이스안에 저장)
 *             		= 반정형화 데이터 => 구분되어 있음 => HTML/XML/JSON
 *             		= 비정형화 데이터 => 구분이 없는 데이터 => (트위터, 페이스북....)
 *             		   --------- 이 데이터를 정형화 ==> 빅데이터 ==> 통계, 분석 ===> 머신러닝
 *              
 *              public String replaceAll (String regex, String 변경문자열)
 *          
 *          예) ABCDEFG한글입니다 
 *             => 알파벳을 모두 공백으로 => replaceAll([A-Z], "")
 *             => 한글을 모두 공백으로 => replaceAll([가-힣], "")
 *             => 숫자를 모두 공백으로 => replaceAll([0-9], "")
 *             
 *        ★ 12. substring() : 문자열을 자르는 경우에 사용
 *        		public String substring (int start)
 *        		 "Hello Java"
 *                      ----       => substring(6)
 *    			  0123456789
 *        		public String substring (int start, int end) ==> end는 포함이 안된다 --> end-1까지 잘라옴
 *              "Hello Java"
 *    		       ---           => substring(2,5) 
 *               0123456789
 *          
 *        ★ 13. valueOf() : 모든 데이터형을 문자열로 변환
 *        			public static String valueof(Object o) 
 *                         ------
 *                  public static String valueof(int o) 
 *                  public static String valueof(double o)
 *                  public static String valueof(float o)
 *                  public static String valueof(boolean o)  
 *                  
 *              => String s = "Hello Java";
 *                 s.length()
 *                 s.substring()
 *                 String.valueof(10); ==> static이기 때문에 클래스 이름으로 접근
 *                 
 *      **** 웹은 모든 데이터가 String, 윈도우도 String
 *      	  입력창 : JTextField
 *      			   ----
 *      				<input type = text>
 *      				 "10" => 변경이 가능하게 클래스를 지원 => Wrapper
 *        ★ 14. split() => 구분자별로 문자열을 잘라서 배열에 저장
 *        	     public String[] split(String regex) => 정규식을 이용한다
 *        ★ 15. trim() => 좌우의 공백 제거
 *        		 public String trim()
 *          ---------------------------------------------------------------------- 자바스크립트와 동일
 *                       
 *                 
 */
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열 저장공간 만들기 
		String s1 = "Hello";
		String s2 = "Hello";
		// 같은 문자열을 다른 메모리에 저장한다
		String s3 = new String("Hello");
		
		if (s1==s2) // == 은 객체일때 => 메모리 주소값을 비교한다 => 실제 문자열만 비교할 때는 equals
		{
			System.out.println("s1과 s2는 같다");
		}
		else
		{
			System.out.println("s1과 s2는 다르다");
		}
		
		if (s1==s3)
		{
			System.out.println("s1과 s3은 같다");
		}
		else
		{
			System.out.println("s1과 s3은 다르다");
		}
	}

}
