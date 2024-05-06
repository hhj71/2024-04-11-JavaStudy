/*
 * 프로그램 제작
 * 1) 기본 문법
 *    --------- 변수/데이터형/연산자/제어문
 * 2) 묶는 연습
 *    --------- 데이터 묶음 (배열/클래스)
 *    --------- 명령문 묶음 (메소드)
 *    ---------------------------- + (클래스)
 *    => 데이터형 / 액션(기능 처리)
 *    ------------------------------ 패키지
 * 3) 재사용을 중심
 * 4) 퍼포먼스 중심 (속도) -> 최적화   
 * 
 * 연산자
 * 	단항연산자
 * 		= 증감연산자(++,--)
 * 		= 부정연산자(!)
 * 		= 형변환연산자 ((데이터형))
 *          *** 연산시 주의점 
 *               1. 데이터형 
 *               2. 프로그램에 필요한 데이터형이 무엇인지 확인 
 * 	이항연산자 (연산대상(피연산자) => 2개)
 * 		= 산술연산자 (+,-,*,/,%) 
 * ----------------------------------------------
 * 		= 비교연산자 (==,!=,<,>,<=,>=)
 *         -->문자, 숫자(정수,실수)만 비교가능 / 문자열은 비교안됨
 *            문자열을 비교하려면 equals(), !equals(), compare() 등을 이용해야 함.
 *            String => 클래스형 (주소)
 *            
 * 		= 논리연산자 (&&, ||)
 *           -효율적인 연산 (최적화 연산)
 *             && => 앞에 있는 조건이 false 면 뒤에 있는 연산은 하지 않는다.
 *                       └ false 일 확률이 높은 것을 앞에 두는 게 좋음
 *             || => 앞에 있는 조건이 true 면 뒤에 있는 연산은 하지 않는다.
 *                        └ true 일 확률이 높은 것을 앞에 두는게 좋음
 * 
 *         => Java => 결과값이 무조건 true/false
 *                     true  : 0, 0.0이 아닌 수
 *                     false : 0, 0.0
 *         => c/c++/Python/Javascript => 결과값이 숫자 
 * ----------------------------------------if(조건)에 사용 => true/false
 * 		= 대입연산자 (=, +=, -=)
 *          -> ' = ' 오른쪽에 있는 걸 왼쪽에 대입한다고 생각하기 
 *                  ex) a=10+10이면 10+10먼저 계산하고 a에 대입하는 것이다.
 *                  
 * 	삼항연산자 ==> if~else ==> 소스가 긴 경우에 주로 사용(HTML)
 *      = (조건)?값1:값2
 *      -> 결과값이 true면 값1, false면 값2
 *        ex) int a=10;
 *            a%2==0?"짝수":"홀수"
 *            true => "짝수"   
 *            false => "홀수"
 *             
 */
public class 연산자_삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 자동 형변환
		char c=65; // c='A'
		int a=10;
		int b=55;
		char c1=(char)(a+b);
		
		int num=(int)(Math.random()*100)+1; // 1~100 사이의 숫자 한개 임의 추출
		System.out.println("num="+num);
		System.out.println(num%2==0?"짝수":"홀수");// 삼항연산자를 이용해 짝수 홀수 확인/ 쓰는 형식을 잘 기억하기
		
	}

}
