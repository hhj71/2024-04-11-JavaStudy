package com.sist.main;
// Movie를 불러온다
import com.sist.vo.Movie;
// 가져오려는 클래스가 다른 폴더에 저장된 경우는 반드시 import 를 이용해서 불러온다
//                 ------- ==> 다른 패키지 
/*
 *   private / public
 *   
 *   변수 => private => 데이터 공개 (x)
 *           => 접근이 가능하게 하려면
 *           => getXxx(), SetXxx()
 *   메소드 / 클래스 / 생성자 => 다른 클래스에서 연결 => public
 *   
 *  127 page 
 * 
 */
import java.util.*;
// import java.util.Date;
import java.sql.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메모리에 저장
		///com.sist.vo.Movie movie = new com.sist.vo.Movie(); // 클래스가 충돌 될 때 앞에 패키지 명을 붙여줘야됨
		//Date date = new Date();
		java.util.Date date = new java.util.Date();
		Movie movie = new Movie();
		// 데이터 초기화
		movie.setRank(1);
		System.out.println("순위:"+movie.getRank());
	}

}
