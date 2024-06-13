package com.sist.client;

import java.awt.Image;
import java.net.URL;

import javax.swing.*;

import com.sist.dao.WikiVO;

public class PosterCard extends JPanel{
	JLabel poLa=new JLabel(); // 이미지 출력
	JLabel tLa=new JLabel(); // 제목 출력
	// 초기화
	public PosterCard(WikiVO vo)
	{
		setLayout(null);
		poLa.setBounds(5, 5, 120 , 110);
		tLa.setBounds(5, 120 , 120 , 15); 
		
		add(poLa);
		add(tLa);
		
		try
		{
			URL url=new URL(vo.get표지());
			Image img=ImageChange.getImage(new ImageIcon(url), 150, 150);
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.get도서명());
		}
		catch(Exception ex) {}
	}
}
