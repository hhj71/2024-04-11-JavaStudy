/*
 *   1|
 *   쇼생크 탈출|
 *   드라마|
 *   https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2
 *   |팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)
 *   |2016 .02.24 재개봉, 1995 .01.28 개봉
 *   |15세 관람가
 *   |프랭크 다라본트

 */
import java.util.*;
import java.io.*; // 파일 입출력 => 데이터 읽기 => 메모리에 저장
// 사용자 정의 데이터형 => 한개에 대한 영화 정보 => 응용
class Movie
{
    String mno;
	String title;
	String genre;
	String poster;
	String actor;
	String regdate;
	String grade;
	String director;
}

public class 멤버변수_초기화 {
      Movie[] movies = new Movie[1938]; // 선언만 하는 영역
      // int[] arr = new arr[5] => 0
      // 멤버변수로 선언 => 프로그램 종료시까지 유지
      // 초기화 => 시작
      // 파일 읽기 => 구현
      {
    	  try
    	  {
    		  FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
    		  // 파일 읽기 => 반드시 예외처리, URL
    		  StringBuffer sb = new StringBuffer();
    		  // 문자열을 임시로 저장하는 클래스
    		  // + 
    		  int i=0; // 파일의 글자읽기 => ASC => 정수형으로 읽어옴 
    		  //String m="";
    		  while ((i=fr.read())!=-1) // -1 => EOF
    		  {
    			 sb.append((char)i);
    			 // m+=(char)i;
    		  }
    		   fr.close();
    		 // System.out.println(m);
    		  String temp = sb.toString();
    		  //String => 메소드 활용
    		  String[] movie=temp.split("\n");
    		  int j=0;
    		  for(String mm:movie)
    		  {    
    			  movies[j]=new Movie(); //클래스 초기화 => 저장할 공간을 만든다
    			  String[] data = mm.split("\\|");
    			  movies[j].mno=data[0];
    			  movies[j].title=data[1];
    			  movies[j].genre=data[2];
    			  movies[j].poster=data[3];
    			  movies[j].actor=data[4];
    			  movies[j].regdate=data[5];
    			  movies[j].grade=data[6];
    			  movies[j].director=data[7];
    			  j++;
    		  }
    	  }catch(Exception ex) {}
      }
     

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        멤버변수_초기화 m=new 멤버변수_초기화();
        // m으로 선언함 
        // m 안에 movies[1938] -> m.movies
        Scanner scan=new Scanner(System.in);
       /* System.out.println("===== 영화 목록 =====");
        for(Movie movie:m.movies) // 클래스변수.
        {
        	System.out.println(movie.mno+"."+movie.title);
        }
        System.out.println("-----------출연진 검색-----------------");
        System.out.print("출연자명 입력:");
        String actor=scan.next();
        int count=0;
        for(Movie movie:m.movies)
        {
        	if(movie.actor.contains(actor))
        	{
        		System.out.println(movie.title+"("+movie.actor+")");
        		count++;
        	}
        }
        System.out.println("출연한 영화 총 "+count+"건입니다");
        System.out.println("---------- 영화명 검색 -------------");
        System.out.print("영화명 입력:");
        String movieName=scan.next();
        count=0;
        for(Movie movie:m.movies)
        {
        	if(movie.title.contains(movieName))
        	{
        		System.out.println(movie.title+"("+movie.actor+")");
        		count++;
        	}
        }
        System.out.println("영화 총 "+count+"건입니다");
        
        System.out.println("---------- 관람가 검색 -------------");
        System.out.print("관람가 입력:");
        String movieGrade=scan.next();
        count=0;
        for(Movie movie:m.movies)
        {
        	if(movie.grade.contains(movieGrade))
        	{
        		System.out.println(movie.title+"("+movie.actor+")");
        		count++;
        	}
        }
        System.out.println("영화 총 "+count+"건입니다");
        
        System.out.println("---------- 장르 검색 -------------");
        System.out.print("장르 입력:");
        String movieGenre=scan.next();
        count=0;
        for(Movie movie:m.movies)
        {
        	if(movie.genre.contains(movieGenre))
        	{
        		System.out.println(movie.title+"("+movie.actor+")");
        		count++;
        	}
        }
        System.out.println("영화 총 "+count+"건입니다");
        
        System.out.println("============= Top 10 ==========");
        for(int i=0; i<10; i++)
        {
        	System.out.println(m.movies[i].mno+"."+m.movies[i].title);
        }
        */
        System.out.print("1~1938번 사이의 정수 입력:");
        int no=scan.nextInt();
        Movie mm=m.movies[no-1];
        System.out.println("순위:"+mm.mno);
        System.out.println("영화명:"+mm.title);
        System.out.println("출연:"+mm.actor);
        System.out.println("이미지:"+mm.poster);
        System.out.println("장르:"+mm.genre);
        System.out.println("등급:"+mm.grade);
        System.out.println("감독:"+mm.director);
	}

}