package com.sist.dao;
import java.util.*; // 오라클 데이터형이 DATE로 되어있으면 => java.util.date 

import lombok.Data;

@Data
public class WikiVO {
	private int 가격, 페이지;
	private long ISBN;
	private String 도서명, 지은이, 옮긴이, 시리즈, 표지, 상세보기;
	private Date 발행일;	
}