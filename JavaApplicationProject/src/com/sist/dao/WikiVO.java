package com.sist.dao;
import java.util.*; // 오라클 데이터형이 DATE로 되어있으면 => java.util.date 

import lombok.Data;

@Data
public class WikiVO {
	private int NUM, PRICE, PAGE;
	private long ISBN;
	private String BOOKNAME, WRITER, TRANSLATOR, SERIES, IMAGE, DETAIL;
	private Date PUBDATE;	
}
