/*
 * 	1. 클래스의 구성 요소
 *      ------------
 *      class ClassName
 *      {
 *        --------------
 *        변수: 데이터 저장
 *             => 캡슐화(데이터 보호)
 *        --------------     
 *        생성자: 변수에 대한 초기화
 *        --------------
 *        메소드: 데이터를 활용하는 기능
 *        --------------
 *       }
 *   ** 클래스 
 *        = 사용자 데이터형 => 데이터만 저장할 목적 => ~VO, ~DTO, ~Bean
 *        = 액션 클래스 => 메소드(기능만) => ~DAO, ~Manager
 *             | 중심
 *               => 실무 -> 실습 (2주) => 관리자페이지 만들어서 제출
 *               						댓글형 게시판 만들어서 제출
 *               						.....
 *               						예약, 결제 ...    
 *      --------------------------------------------------------  
 *        
 *        		
 *  2. 메소드의 기능 설정
 *       단락 => 처리 => 메소드
 *       자바: 메소드 => 클래스 종속
 *       c/c++: 함수 => 독립적으로 사용
 * 
 *  3. 데이터의 저장 방법   ==================> 데이터 처리(요청받은 내용)  =============> 요청 결과를 전송
 *     -------------                       ------------------
 *     | 변수(한개)                            데이터 가공
 *     | 배열(여러개)                           |연산자
 *        => 같은 데이터형                       |제어문
 *        => 인덱스 이용                        -----------
 *     | 클래스(사용자 정의 데이터형)                연산자+제어문 => 메소드
 *     		=> 다른 데이터형도 존재                  -> 명령문의 집합
 *                                             -> 한가지 기능만 수행
 *                                             -----------------
 *                                              | 반복적인 내용을 제거
 *                                                =>System.out.println();
 *                                                    └ 출력의 기능 수행 메소드
 *                                              | 구조적 프로그램(단락)
 *                                                 => 수정, 추가, 삭제가 편리
 *                                              | 재사용 가능 => 다른 클래스에서 사용 가능  
 *  
 * 4. 메소드(Method)                                                    
 *  -> 사용목적 : 가독성 (기능별로 묶는다) => 에러 발생시 처리가 편리                                             
 *             기능별 구분해줌                                        
 *             재사용성 O => 객체지향 프로그램
 *             속도 (최적화) 
 *  -> 기능별 처리:
 *            => 로그인 처리
 *            => 회원가입
 *            => 게시판
 *            => 목록 => 페이징
 *            => 예약하기
 *            => 결제
 *            ---------------------
 *            -> 다른 클래스에서 연결 => 메세지 (메소드) => 상호 통신
 *            -> 필요시마다 재사용
 *                ex) 정수형 입력받을때 :
 *                     => Scanner scan = new Scanner(System.in)
 *                     => nextInt()  
 *            -> 반복을 제거 할 수 있다                                                   
 *               메소드가 호출되면 => 처음부터 실행 
 *               
 *               변수(데이터) = 기능 = 조립
 *                            |
 *                           메소드
 *               ---------------------            
 *                => 웹사이트 조립
 *                   메인페이지
 *                   메뉴/Footer/Content 
 *                                 |
 *                             게시판/채팅/공지/예약/결제/장바구니....
 *    --------------------------------------------------------------------
 *    		=> 오버라이딩 / 오버로딩 => 인터페이스 / 추상클래스 / 오라클 연동
 *     1) 메소드의 형식 ([] => 생략 가능)  ┌결과값
 *               => [접근지정어] [옵션] 리턴형 메소드명([매개변수]...) => 선언문
 *               
 *             {
 *                  ....
 *                  .... 기능 구현
 *                  결과값 전송 
 *                  return 값; => 값은 1개만 사용이 가능
 *                                --------------- java/c/c++
 *                                ** python은 여러개 사용이 가능
 *                     | 데이터가 많은 경우 => [], 클래스를 이용해서 모아서 보내준다        
 *                                     
 *             }
 *             ** 모든 메소드는 메소드 종료를 나타내는 return 이 필요하다
 *                 but, void 일 경우에는 return 을 생략할 수 있다.
 *                                     └> 컴파일러가 자동으로 추가해줌
 *             [접근지정어] 
 *               - public
 *               - private
 *               - protected
 *               - default (같은 폴더 안에서만)
 *               
 *             [옵션]
 *               - abstract : 선언만 하는 메소드
 *               - static : 공유 => 메모리에 자동으로 올라간다
 *             
 *             리턴형(결과값 넘겨주는 것) => 모든 메소드는 리턴형을 가지고 있다.
 *                        		   => 사용자 요청에 대한 처리 결과를 넘겨준다.
 *                                 => 리턴형은 1개 사용만 => 데이터가 많은 경우에는 묶어서 넘겨준다
 *                                                      ---------------------------
 *                                                        |묶는 방식 => 배열 / 클래스
 *                                 => 사용자 요청에 따라
 *                                     정수 2개를 전송 => 더한 결과값 => 정수+정수
 *                                                                -------
 *             매개변수(사용자 요청값)
 *                              예) 로그인 요청
 *                               결과값  사용자요청값(입력값) 
 *                                     --------
 *                               ex)      |id/ password
 *                                    => boolean (true/false)
 *                               ex)
 *                                   검색      사용자 요청값
 *                                  -----     ---------
 *                                  결과값         검색어
 *                                   |
 *                                 검색결과 => []                     
 *                                                                                                                        
 *     2) 메소드명 
 *        (1) 알파벳, 한글로 시작한다(대소문자 구분)
 *        (2) 숫자 사용이 가능 (맨앞 사용은 금지)
 *        (3) 키워드는 사용 금지
 *        (4) 특수 문자 (_,$) 사용가능                                                                                                                   
 *        (5) 공백을 사용할 수 없다
 *        ----------------------------------------- 식별자
 *           ** 변수는 중복 사용이 불가능 (한개의 메소드에서 같은 변수 사용이 안된다.)
 *           ** 같은 이름의 메소드 사용이 가능
 *           ** 약속 사항 (자바 개발자) => 소문자로 시작한다
 *                => 단어가 2개일 떄    
 *                     fileName() => 두번째 시작하는 단어는 대문자로 시작
 *       
 *      *** 결과값 / 요청값을 받는다 
 *          ----   -----
 *          리턴형  매개변수     
 *          
 *     3) 메소드 유형
 *     
 *        ---------------------------------
 *              리턴형             매개변수                                                                                                                    
 *        ---------------------------------
 *                o                 o
 *           ex) String substring(int start, int end)    
 *        ---------------------------------
 *                o                 x
 *           ex) double random() => 결과값은 0.0 ~ 0.99 => 실수 결과값을 리턴함  
 *        ---------------------------------
 *                x                 o   
 *           ex) void println("aaa") => 결과값이 없는 경우 void   
 *        ----------------------------------
 *                X                 X                       
 *           ex) void println() => 다음줄에 출력
 *        ------------------------------------
 *        ** 웹 개발
 *           -----
 *            사이트 => 사용자 입력 => 매개변수
 *                       처리 => 화면
 *                              --- 결과값 (리턴형)
 *           => 사용자 행위 : 입력/ 마우스 클릭 => 매개변수
 *                         => 화면 출력 => 리턴형
 *                                               
 *           => 사용자 요청 => 처리 => 결과값을 돌려준다
 *              ------------------------------ 메소드
 *                                                                                                                           
 *                                                                                                                            
 *     4) 메소드 사용법
 *        메소드 => 호출 방법
 *           (1) 결과값이 없는 경우: 메소드명(매개변수)
 *           
 *           (2) 결과값이 있는 경우: 데이터형 변수명 = 메소드명(매개변수)
 *                         ex)  double d = Math.random()
 *                              --------   -------------
 *                                일치 => 형변환 / 큰 데이터형으로 받는 경우
 *               
 *     5) 반복을 제거                                                                    
 *          ex) -> 예
 *              -> 오라클 열기
 *              -> 오라클 닫기
 *          ------------------ 메소드화
 *              오라클 연결
 *               문장 => 전송 (SELECT)
 *              오라클 닫기                                             
 *                     
 *              오라클 연결
 *               문장 => 전송 (INSERT)
 *              오라클 닫기
 *              
 *              오라클 연결
 *               문장 => 전송 (UPDATE)
 *              오라클 닫기
 *              
 *              오라클 연결
 *               문장 => 전송 (DELETE)
 *              오라클 닫기
 *         ------------------------------ 반복구간을 찾아서 메소드화 시키는 것이 중요...       
 *         
 *                                                
 *                                                
 *                                                
 */  
// 메소드 호출 방법

public class 메소드_1 {
    // 자동 메모리 할당  => 메소드 메모리에 저장해서 사용
	// void -> return 값이 없기 때문에 자체 처리 => 출력을 메소드 안에서 처리 
	
	static void display(String name)
	{                  // └> 매개변수 => 사용자가 보내준 값 
		System.out.println("display : 진입");
		System.out.println("사용자가 보내준 값:" + name);
		System.out.println("display : 처리완료");
		System.out.println("display : 종료");
	}
	 
	public static void    main   (String[] args) {
     //      공유   결과값x   메소드명   매개변수	
		//  main 이 시작점
		
		System.out.println("display 진입전");
		display("홍길동"); // 메소드 호출
		// 리턴형, 매개변수 확인하면서 사용해야 한다.
		System.out.println("===============");
		System.out.println("display 진입전");
		display("심청이");
		System.out.println("===============");
		System.out.println("display 진입전");
		display("이순신");
		
		   /*  System.out.println("Hello Method");
		     // void java.io.PrintStream.println(String x) => void => 자체 처리 한다는 뜻
		     Math.random(); // double java.lang.Math.random()
		     String s= "";
		     s.substring(0);
		     //String java.lang.String.substring(int beginIndex)
		     // 원형 => 라이브러리 => 메소드 
		   */
		
	}

}
