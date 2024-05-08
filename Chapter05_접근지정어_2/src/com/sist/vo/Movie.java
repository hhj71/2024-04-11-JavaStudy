package com.sist.vo;
import lombok.Data;
@Data

public class Movie {
	public int rank;
	private String title;
	private String actor;
	private String director;
	private String grade;
	private String genre;
	private String regdate;
	public Movie()
	{
		//System.out.println("");
	}
	
	
	
	// private 변수 =>> Movie 클래스의 블록안에서만 사용 가능하다.
	/*
	 *   실제 데이터 값은 은닉화
	 *   ------------------- 읽기/ 변경 => 메소드를 이용해서 접근이 가능하게 만든다 ==> 캡슐화 방식
	 *   변수에 대한 기능을 부여
	 *   ------------------- 읽기      / 쓰기
	 *                      getXxx()    setXxx()
	 * 
	 */
}
