package com.sist.client;

import java.awt.Font;
import java.awt.Image;
import java.net.URL;

import javax.swing.*;

import com.sist.commons.ImageChange;
import com.sist.dao.WikiVO;

public class PosterCard extends JPanel{
	JLabel poLa=new JLabel(); // 이미지 출력
	JLabel tLa=new JLabel(); // 제목 출력
	// 초기화
	public PosterCard(WikiVO vo)
	{
		setLayout(null);
		poLa.setBounds(10, 5, 110, 140);
		tLa.setBounds(15, 160, 130, 15); 
		tLa.setFont(new Font("맑은 고딕", Font.PLAIN, 13));
		
		add(poLa);
		add(tLa);
		
		try
		{
			  if(vo.getIMAGE()!=null)
			   {
			     URL url=new URL(
					   vo.getIMAGE());
			     Image image=ImageChange.getImage(new ImageIcon(url),
					   110, 140);
			     poLa.setIcon(new ImageIcon(image));
			     
			   }
			   else
			   {
				     Image image=ImageChange.getImage(
				    		 new ImageIcon(vo.getIMAGE()),
						   110, 140);
				     
				     poLa.setIcon(new ImageIcon(image)); 
			   }
			   tLa.setText(vo.getBOOKNAME());
			   System.out.println(vo.getIMAGE());
		}
		catch(Exception ex) {ex.printStackTrace();}
	}
}
