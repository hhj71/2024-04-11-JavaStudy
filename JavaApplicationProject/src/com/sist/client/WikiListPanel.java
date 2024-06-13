package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.*;
import com.sist.dao.*;

// 사번의 정보를 출력 => 조인

public class WikiListPanel extends JPanel implements HomeInterface,MouseListener{

	PosterCard[] pcs=new PosterCard[18];
	JPanel pan=new JPanel();	
	JLabel titleLa, pageLa;
	JButton b1,b2;
	ControlPanel cp;

		

		public WikiListPanel(ControlPanel cp)
		{
			this.cp=cp;
			setLayout(null);
			titleLa = new JLabel("도서 목록", JLabel.CENTER);
			titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
			titleLa.setBounds(10,15,930,40);
			add(titleLa);
			
			b1=new JButton("이전");
			b2=new JButton("다음");
			pageLa=new JLabel("0 page / 0 pages");
			setLayout(null);
			pan.setLayout(new GridLayout(3,6));
			pan.setBounds(10,15,960,500);
			add(pan);
			JPanel p=new JPanel();
			p.add(b1);
			p.add(pageLa);
			p.add(b2);
			p.setBounds(10,550,960,35);
			add(p);
		}
			// 데이터 첨부
		public void cardPrint(List<WikiVO> list)
		{
			
			int i=0;
			for(WikiVO vo:list)
			{
				pcs[i]=new PosterCard(vo);
				pan.add(pcs[i]);
				i++;
			}
			for(int j=0;j<pcs.length;j++)
			{
				pcs[j].addMouseListener(this);
			}
		
		}
		public void cardInit(List<WikiVO> list)
		{
//			for(int i=0;i<list.size();i++)
//			{
//				pcs[i].poLa.setIcon(null);
//				pcs[i].tLa.setText("");
//			}
			pan.removeAll(); // 데이터 제거
			pan.validate(); // panel 재배치
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void cardPrint(List<WikiVO> list) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void cardInit(List<WikiVO> list) {
			// TODO Auto-generated method stub
			
		}
}