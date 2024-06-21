package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
	CardLayout card = new CardLayout();
//	EmpListPanel ep=new EmpListPanel();
	HomePanel homeP;
	DetailPanel detailP;
	FindPanel findP;
	BoardListPanel bp;
	BoardInsertPanel bip;
	BoardDetailPanel bdp;
	BoardDeletePanel bdelp;
	BoardUpdatePanel bup;
	NewsPanel np;
	ChatPanel chatP = new ChatPanel();
	MyPagePanel mpP;
	   // 웹에서 => 화면 변경 => Controller 
	   /*
	    *    처리 : Model 
	    *    화면 : View 
	    *    화면변경 : Controller ==> MVC
	    *    
	    *    최근 => Spring MVC가 사라졌다
	    *          ----------- JSP 
	    *                      ThymeLeaf / Vue / React => HTML
	    */
	ClientMain cMain;
	public ControllPanel(ClientMain cm)
	{
		cMain=cm;
		setLayout(card);
//		add("EP",ep);
		homeP=new HomePanel(this);
		detailP = new DetailPanel(this);
		findP = new FindPanel(this);
		bp=new BoardListPanel(this);
		bip=new BoardInsertPanel(this);
		bdp=new BoardDetailPanel(this);
		bdelp = new BoardDeletePanel(this); 
		bup = new BoardUpdatePanel(this);
		mpP = new MyPagePanel(this);
		np = new NewsPanel(this);
		add("HOME",homeP);
		add("CHAT",chatP);
		add("NEWS",np);
		add("DETAIL",detailP);
		add("FIND", findP);
		add("LIST",bp);
		add("INSERT",bip);
		add("BDETAIL",bdp);
		add("DELETE",bdelp);
		add("UPDATE", bup);
		add("MYPAGE",mpP); 
				
	}
}
