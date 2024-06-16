package com.sist.dao;
import java.util.*;
import java.sql.*;
import com.sist.dao.*;


public class WikiDAO {
	private Connection conn;
	private PreparedStatement ps;
	private final String URL="jdbc:oracle:thin:@LAPTOP-2F22OMOQ:1521:XE";
	private static WikiDAO dao; // 싱글턴
	
	//1. 드라이버 등록
	public WikiDAO()
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {ex.printStackTrace();}
	}
	
	//2. 오라클 연결
	public void getConnection()
	{
		try 
		{
			conn=DriverManager.getConnection(URL, "hr", "happy");
			// conn hr/happy
		}catch(Exception ex) {ex.printStackTrace();}
	}
	//3. 오라클 해제
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {ex.printStackTrace();}
	}
	// 4. 싱글턴 => 한사람당 한개의 DAO만 사용할 수 있게 만든다 -> 메모리 누수현상을 제거
	public static WikiDAO newInstance()
	{
		if(dao==null)
			dao = new WikiDAO();
		return dao; // null이 아니면 기존에 저장된 dao를 전송
	}
	//////////////////////////////////// 모든 DAO에 공통 사항
	// 기능설정
	// 1. emp, dept 데이터 출력 (웹, 윈도우) => DAO 변경이 없다 => React / Vue/ Ajax
	// 2. DAO / VO는 변경사항이 없다
	// SQL은 검색언어 => SELECT 
	// 1. 오라클을 배우는 목적 => 자바에서 사용이 가능 => 2주 
	/*
	 * 
NUM
ISBN
BOOKNAME
WRITER
TRANSLATOR
PAGE
PRICE
PUBDATE
SERIES
PAPER
IMAGE
DETAIL
	 * 
	 */
	
	public ArrayList<WikiVO> wikiListData(int page)
	{
		ArrayList<WikiVO> bookList = new ArrayList<WikiVO>();
		try 
		{
			getConnection();
			String sql = "SELECT NUM, ISBN, BOOKNAME, WRITER, TRANSLATOR, PAGE, PRICE, PUBDATE, SERIES, IMAGE, DETAIL "
				     +"FROM wiki WHERE NUM BETWEEN ? AND ? ORDER BY NUM ASC ";
				     
			ps=conn.prepareStatement(sql);
			
				int rowSize = 12;
				int start=(rowSize*page)-(rowSize-1);
				int end=rowSize*page;
				   ps.setInt(1, start);
				   ps.setInt(2, end);
				ResultSet rs = ps.executeQuery();
				
			while(rs.next())
			{
				WikiVO vo = new WikiVO();
				vo.setNUM(rs.getInt(1));
				vo.setISBN(rs.getLong(2));
				vo.setBOOKNAME(rs.getString(3));
				vo.setWRITER(rs.getString(4));
				vo.setTRANSLATOR(rs.getString(5));
				vo.setPAGE(rs.getInt(6));
				vo.setPRICE(rs.getInt(7));
				vo.setPUBDATE(rs.getDate(8));
				vo.setSERIES(rs.getString(9));
				vo.setIMAGE(rs.getString(10));
				vo.setDETAIL(rs.getString(11));
								
				bookList.add(vo);
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return bookList;
	}
}
