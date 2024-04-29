/*
 *   클래스
 *   ------
 *      구성요소 
 *      class ClassName
 *      {
 *        -------------
 *        변수 ==============> 클래스 전체 (전역변수)
 *          = 멤버변수
 *          = 공유변수
 *          = 메소드 안에 선언되는 변수 => 매개변수, 지역변수
 *          = 객체지향 프로그램 핵심 => 캡슐화(데이터 보호 목적) 
 *        --------------
 *        생성자 : 변수의 초기화, 클래스 저장시에 호출
 *             => 필요시에만 사용 
 *        --------------
 *        메소드 : 기능 수행 ==> 수정(오버라이딩) => 가독성 => 유지보수
 *        		예) 게시판
 *        			= 글쓰기
 *        			= 상세보기
 *        			= 조회수 증가
 *        			= 수정
 *        			= 추가
 *        			= 삭제
 *        			= 검색
 *       -----------------
 *       }
 *       
 *      = 기존의 프로그램을 기능별로 나눠서 작업(분업화)
 *      							 ------ 메소드 
 *      = 메소드는 반드시 한개의 기능만 수행 => 재사용하기 편리하다
 *                   -------------
 *        ex) 게시판 + 댓글 (x) => 게시판 / 댓글 각각 따로 작업해야 함.
 *      ** 모든 프로그램은 세분화가 되어있다. 
 *         ------------------------
 *         1. 입력
 *         2. 처리
 *         3. 출력
 *         ------------------------
 *         메소드 
 *         	 = 선언부 => 추상메소드
 *             형식 ) [접근지정어][옵션] 리턴형 메소드명(매개변수...)
 *             - 접근지정어
 *                  전체 프로그램에 사용 => public
 *                  상속받은 클래스 => protected
 *                  같은 폴더까지 => default (생략가능)
 *                  -----------------------------
 *                  클래스 안에서 접근 => private
 *                  
 *             - 옵션
 *                  공유하는 메소드 => static -> 자동으로 메모리에 저장됨
 *                                -------
 *                  선언하는 메소드 => abstract 
 *                  수정할 수 없는 메소드 => final 
 *                  
 *             - 리턴형 : 사용자 요청에 따른 처리후 결과값
 *                  기본형 (byte, int, char, String, double, long) => 결과값이 1개일 때 사용
 *                  배열 => 결과값이 여러개 있는 경우 => sort
 *                  클래스 => 일반 웹 => 상세보기 
 *                  *** 결과값 없이 메소드 자체 처리하는 경우도 있음 => 결과값이 없는 상태 (void)
 *                  
 *             - 메소드명 : 변수 식별자와 동일
 *                      *** 소문자로 시작한다.
 *                      
 *             - 매개변수 : 사용자가 보내준 값 (요청 값) 
 *                        여러개 사용이 가능하다
 *                          => 기본형, 배열, 클래스
 *                                   ---------  데이터가 3개 이상일 때 사용
 *                                   
 *             
 *             
 *           = 구현부 => 일반메소드
 *             {
 *                 구현부
 *                 => 반드시 결과값을 보내준다
 *                 return 값;
 *             }
 *           
 *    메소드를 사용하는 목적
 *      1. main 에 소스 코딩 하면 => 한번 쓰고 버린다. (절차적 언어)
 *         ===> ★ 메소드를 쓰면 재사용이 가능하다. (수정이 편리)  
 *                사이트 기능 => 게시판, 공지사항, 회원가입, 예약, 결제, 장바구니 ==> 1차 프로젝트 (여기에 +보안 => 2차 프로젝트)
 *         ===> 가독성이 좋다. 
 *         ===> 중복 코드를 제거할 수 있다.
 *                                    
 *   메소드의 형식
 *   1. 원형 
 *     리턴형 메소드명(매개변수) => 라이브러리 => 기능
 *     
 *   2. 유형
 *    ----------------------------------
 *        리턴형          매개변수
 *    ----------------------------------
 *         O              O
 *    예) => String substring(int start)   
 *    ----------------------------------
 *         O              X
 *    예)  => String trim()  => 공백만 제거
 *    예)  => double random() => 임의의 수 추출 
 *    -----------------------------------
 *         X              O
 *    예)  => void print("")
 *    -----------------------------------
 *         X              X
 *    예)  => 빈도수가 거의 없다
 *         다음줄로 내릴 때 
 *         System.out.println()   
 *    -----------------------------------     
 *    ** 리턴형이 없는 경우에는 메소드 자체 처리
 *       => 출력할 경우
 *       => 브라우저나 핸드폰에 전송 => 리턴형
 *       => 리턴형 => 오라클 자체 처리 (Insert, Update, Delete)
 * 
 */
// 2단~9단까지 구구단 출력 ==>리턴형 x , 매개변수 x

public class 메소드_1 {
	static void gugudan()
	{
		for(int i=1; i<=9; i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d * %2d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}
	/*
	 * 	void aaa();
	 *  호출 => aaa();
	 *  int bbb(int a);
	 *   a = 10 이라면
	 *  호출 => int a = bbb(10); 
	 *  void ccc(char c);
	 * 	호출 => ccc('A')
	 *  double rand(int num)
	 *  호출 => double d = rand(3)
	 *         ----------- 리턴한 값을 받는다 (데이터형 일치)
	 *  String getName()
	 *  호출 =>        
	 *  String setName(String name)
	 *  호출 => 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan(); // 호출시에는 메소드 명만 사용
		           // 매개변수가 있을 경우는 실제 값을 넣어줘야 한다. 
	}

}
