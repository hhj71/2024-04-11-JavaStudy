package com.sist.dao;
import java.util.*;

import lombok.Data;
/*
 * BNO
ID
BNUM
ACCOUNT
PRICE
REGDATE
 * 
 */
@Data
public class BookCartVO {
	
	private int bno, bnum, price, account;
	private String id;
	private Date regdate;
	private WikiVO wvo = new WikiVO();
}
