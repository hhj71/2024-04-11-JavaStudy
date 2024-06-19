package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class MenuPanel extends JPanel{
	JButton homeBtn, findBtn, boardBtn, chatBtn, newsBtn, myBtn, exitBtn;
	public MenuPanel()
	{
		setLayout(new GridLayout(1,7,5,5)); // 가로 메뉴 한줄에 6개 간격 5,5
			// 세로 메뉴 => setLayout(new GridLayout(6,1,5,5));
		homeBtn = new JButton("홈");
		findBtn = new JButton("도서 검색");
		boardBtn = new JButton("게시판");
		chatBtn = new JButton("실시간 채팅");
		newsBtn = new JButton("뉴스 검색");
		myBtn = new JButton("마이페이지");
		exitBtn = new JButton("나가기");
	
		add(homeBtn);
		add(findBtn);
		add(boardBtn);
		add(chatBtn);
		add(newsBtn);
		add(myBtn);
		add(exitBtn);
	}
}
