package com.sist.user;
// 클라이언트 => 접속자가 보게 만듦 => 윈도우. JSP, Spring, Kotlin 등으로 만들 수 있다. => 화면출력위치만 달라지고 자바 코드는 동일
import java.util.*;
import com.sist.manager.*;
import com.sist.vo.*; // Movie
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		MovieManager mgr = new MovieManager(); // new는 메모리를 생성 => 계속 생성가능 => while 안에 쓰면 계속 만들어져서 메모리 엄청 차지할 수 있음
//		while(true)
//		{
//			System.out.print("번호 입력:");
//			int menu = scan.nextInt();
//			if(menu==9)
//				break;
//			System.out.println(mgr);
//		}
		while(true)
		{
			System.out.println("=================== 메뉴 ===================");
			System.out.println("1. 목록");
			System.out.println("2. 검색");
			System.out.println("3. 상세보기");
			System.out.println("4. 종료");
			System.out.println("===========================================");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==1)
			{
				int total=mgr.movieTotalPage();
				System.out.print("1~"+total+"사이의 페이지 입력:");
				int page = scan.nextInt();
				// 데이터를 읽어와라 요청
				Movie[] movie=mgr.movieListData(page);
				for(Movie m:movie)
				{
					System.out.println(m.getRank()+"."+m.getTitle());
				}
			}
			else if(menu==2)
			{
				System.out.println("검색어 입력:");
				String title=scan.next();
				Movie[] movie = mgr.movieFindData(title);
				for(Movie m:movie)
				{
					System.out.println(m.getRank()+"."+m.getTitle());
				}
			}
			else if(menu==3)
			{
				System.out.println("번호 입력:");
				int mno =scan.nextInt();
				Movie mmm = mgr.movieDetailData(mno);
				System.out.println("순위:"+mmm.getRank());
				System.out.println("영화명:"+mmm.getTitle());
				System.out.println("감독:"+mmm.getDirector());
				System.out.println("출연:"+mmm.getActor());
				System.out.println("장르:"+mmm.getGenre());
				System.out.println("등급:"+mmm.getGrade());
				System.out.println("개봉일:"+mmm.getRegdate());
				
			}
			else if(menu==4)
			{
				System.out.println("프로그램 종료");
			    break;
			}
			else
			{
				System.out.println("잘못된 입력입니다!");
			}
		}
	}

}
