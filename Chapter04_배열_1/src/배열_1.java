/*
 * 	자바 => Application / Web / Mobile
 * 						----
 * 개발방법
 * ---------
 * 	데이터저장  -------------------> 데이터 가공(사용자 요청) -----------------> 화면에 출력
 *  -------                       -----------------                    브라우저/ 모바일
 *  한개 저장 : 변수                  명령문을 모아서 관리                        | 자바 => web => HTML/CSS/JavaScript
 *  여러개 저장 : 배열, 클래스            = 사용자 입력 부분                       | => 코틀린 / 스위프트
 *                                 = 사용자 요청 처리 부분                           |     |
 *                                 = 결과값 도출                                   ------
 *                                ------------------                            Dart 언어    
 *                                1) 재사용                                          |
 *                                2) 유지보수가 편리                                 Flutter
 *                                ------------------                           React Native
 *                                ★ 메소드 ★
 *                                게시판
 *                                  = 목록 출력 기능 => 묶는다
 *                                  = 글쓰기
 *                                  = 상세보기
 *                                  = 삭제
 *                                  = 수정
 *                                  = 검색
 *                                 => 오더가 요청 - 댓글형 게시판
 *                                     - 게시판을 가져와서 
 *                                       상속을 받아서 처리
 *                                        -> 댓글기능만 추가
 *                                 => 재사용기법 (유지보수)                 
 *                                ------------------------
 *                                => 변수/메소드 => 클래스 (조립) 
 *  ** 배열 (4장)
 *  	-> 일차원 배열
 *      -> 같은 데이터를 여러개 모아서 관리 (한개 이름으로 처리 가능)
 *      -> 장점:
 *      		변수 여러개를 한개의 이름으로 제어할 수 있다 => 반복문 사용이 편리해진다
 *      		연속적 메모리 공간을 만든다
 *      		------------------- 인덱스 번호를 사용해서 처리 가능
 *      -> 단점:
 *              고정적이다 => 추가, 삭제하기가 어렵다 (큰 배열, 작은 배열)
 *              같은 데이터형만 모아서 관리
 *                          └> 보완하기 위해서 (가변형, 다른 데이터형을 모아서 관리 => 컬렉션 ==> 12장)
 *  ** 클래스 (5장)
 *      -> 다른 데이터를 여러개 모아서 관리 (한개 이름으로 처리)
 *    * 변수/ 연산자/ 제어문 => 기본 문법
 *       ---------------- 모아서 관리 		
 * 	  * 변수/ 배열 / 클래스 => 메모리에 저장 : RAM 프로그램 종료시 삭제	
 *      ----------------------------
 *      | 영구적인 저장 장치
 *        = 파일 => 파일 여러개를 연결해서 사용하기 어렵다, 보안에 취약하다
 *        = RDBMS => 관계형 데이터 베이스 (15장)
 *          파일 => table 
 *          ================================ 오라클/ MySQL / MS-SQL/ MariaDB
 *                                                 -----           -------
 *                                                   |                |
 *                                                   -----------------
 *                                                         |무료버전
 *                                                     => 3차 (MySQL/MariaDB)
 *                                                         
 *   개발 => 누가 잘 모아서 관리
 *          -------------  수정, 삭제, 추가가 쉽게 만드는 작업
 *           => 변수 + 연산자 + 제어문 => 기능별로 모아서 처리
 *           => 패키지 -> java.io /java.util /javax.swing
 *            
 *  ** 1. 변수 여러개를 모아서 관리
 *   		형식) int a,b,c,d,e,f,g;
 *                   --------------
 *              ==>   int[]       arr    =  new int[7]; 
 *                    └ 배열 데이터형  └배열명            └저장하는 갯수
 *              double d1, d2, d3, .....   
 *              ==> double[] arr=new double[갯수]      
 */
import java.util.Scanner;
// 3명의 학생 => 국어, 영어, 수학 => 1. 총점, 2. 평균, 3. 학점
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int kor1, kor2, kor3;
		int eng1, eng2, eng3;
		int math1, math2, math3;
		int total1, total2, total3;
		double avg1, avg2, avg3;
		char score1, score2, score3;
		
		// 점수 입력
		System.out.print("첫번째 학생의 국어 점수:");
		kor1=scan.nextInt();
		System.out.print("첫번째 학생의 영어 점수:");
		eng1=scan.nextInt();
		System.out.print("첫번째 학생의 수학 점수:");
		math1=scan.nextInt();
		System.out.print("두번째 학생의 국어 점수:");
		kor2=scan.nextInt();
		System.out.print("두번째 학생의 영어 점수:");
		eng2=scan.nextInt();
		System.out.print("두번째 학생의 수학 점수:");
		math2=scan.nextInt();
		System.out.print("세번째 학생의 국어 점수:");
		kor3=scan.nextInt();
		System.out.print("세번째 학생의 영어 점수:");
		eng3=scan.nextInt();
		System.out.print("세번째 학생의 수학 점수:");
		math3=scan.nextInt();
		
		// 총점
		total1=kor1+eng1+math1;
		total2=kor2+eng2+math2;
		total3=kor3+eng3+math3;
		
		// 평균
		avg1=total1/3.0;
		avg2=total2/3.0;
		avg3=total3/3.0;
		
		// 학점
		switch(total1/30)
		{
		case 10: case 9:
			score1='A';
			break;
		case 8:
			score1='B';
			break;
		case 7:
			score1='C';
			break;
		case 6:
			score1='D';
			break;
		default:
			score1='F';
		}
		switch(total2/30)
		{
		case 10: case 9:
			score2='A';
			break;
		case 8:
			score2='B';
			break;
		case 7:
			score2='C';
			break;
		case 6:
			score2='D';
			break;
		default:
			score2='F';
		}
		switch(total3/30)
		{
		case 10: case 9:
			score3='A';
			break;
		case 8:
			score3='B';
			break;
		case 7:
			score3='C';
			break;
		case 6:
			score3='D';
			break;
		default:
			score3='F';
		}
		// 결과값 출력
		/*
		 *  %-5d(왼쪽 정렬)    / %5d
		 *  ----              -----
		 *   └00000            └00000
		 *  ex) 90---90---    ex) ---90---90 
		 */
		  System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n", kor1, eng1, math1, total1, avg1, score1);
		  System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n", kor2, eng2, math2, total2, avg2, score2);
		  System.out.printf("%-5d%-5d%-5d%-7d%-7.2f%-3c\n", kor3, eng3, math3, total3, avg3, score3);
		  
	}

}
