package com.sist.vo;

import lombok.Data;

// 데이터형 선언되는 부분 => 영화 1개에 대한 정보를 저장
/*
 * 1|
 * 쇼생크 탈출|
 * 드라마|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|
 * 팀 로빈스(앤디 듀프레인), 모건 프리먼(엘리스 보이드 레드 레딩)|
 * 2016 .02.24 재개봉, 1995 .01.28 개봉|
 * 15세 관람가|
 * 프랭크 다라본트
 * 
 */
@Data
// lombok => getter/setter -> 생성자와 관련된 
public class Movie {
	private String rank;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String director;
	// private는 movie 클래스 영역에서만 사용할 수 있다.=> 다른 클래스에서는 연결이 안된다. => 데이터 손실이 없게 ... private을 사용함
	// 각 변수의 기능을 부여 => 다른 클래스에서도 사용이 가능하게 만든다 (캡슐화)
	// ------ 읽기/쓰기 => getter / setter
	// public Movie{}
	
}
