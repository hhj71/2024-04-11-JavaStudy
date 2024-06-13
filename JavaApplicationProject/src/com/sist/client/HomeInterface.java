package com.sist.client;

import java.util.List;

import com.sist.dao.WikiVO;

public interface HomeInterface {
	public void cardPrint(List<WikiVO> list);
	public void cardInit(List<WikiVO> list);
}

