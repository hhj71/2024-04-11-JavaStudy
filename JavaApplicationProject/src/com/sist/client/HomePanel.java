package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.*;

import com.sist.dao.*;

// 사번의 정보를 출력 => 조인

public class HomePanel extends JPanel {
	JButton prevBtn,nextBtn;
	PosterCard[] pcs=new PosterCard[573];
	JPanel pan=new JPanel();
	JLabel titleLa, pageLa;
	JTable bestTable;
	DefaultTableModel model;
	public int curpage=1;
	public int totalpage=48;
	public WikiDAO dao = WikiDAO.newInstance();
	public ArrayList<WikiVO> bookList = dao.wikiListData(curpage);
		
		public HomePanel()
		{
			  pan.setLayout(new GridLayout(3,4,-15,-15));
			  pan.setBounds(20, 20, 650, 630);
		      setLayout(null);
//		      JScrollPane pp=new JScrollPane();
//		      Dimension size = new Dimension();//사이즈를 지정하기 위한 객체 생성
//		      size.setSize(700, 650);//객체의 사이즈를 지정
//		      pan.setPreferredSize(size);//사이즈 정보를 가지고 있는 객체를 이용해 패널의 사이즈 지정
//		      pp.setViewportView(pan);
		      add(pan);
		      cardPrint(bookList);
		           
		        prevBtn=new JButton("이전");
				nextBtn=new JButton("다음");
			    pageLa=new JLabel(curpage+"page /"+ totalpage +"pages");			    
			    setLayout(null);
		    	JPanel p=new JPanel();
		    	p.add(prevBtn); p.add(pageLa); p.add(nextBtn);
		    	p.setBounds(130, 645, 400, 30);
		        add(p);
		        
		        setLayout(null);
				titleLa = new JLabel("베스트셀러");
				titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 22));
				titleLa.setBounds(720,25,130,50);
				add(titleLa);
				setLayout(null);
				String[] col = {"순위", "도서명"};
				String[][] row = new String[0][2];
				model = new DefaultTableModel(row,col);
				bestTable = new JTable(model);
				JScrollPane js = new JScrollPane(bestTable);
				js.setBounds(670,75,230,400);
				add(js);
				// 데이터 첨부
//				WikiDAO dao1 = WikiDAO.newInstance();
//				ArrayList<CartVO> list1 = dao.CartListData();  // 구매순위가 있는 데이터가 필요함
//				for(CartVO vo: list1)
//				{
//					String[] data = {
//							vo.get구매횟수
//							vo.get도서명()
//						};
//					model.addRow(data);
//				}
				
//			setLayout(null);
//			titleLa = new JLabel("도서 목록", JLabel.CENTER);
//			titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
//			titleLa.setBounds(10,15,930,40);
//			add(titleLa);    
		}

			// 데이터 첨부
		public void cardPrint(ArrayList<WikiVO> bookList)
		{
			int i=0;
			for(WikiVO vo:bookList)
			{
				pcs[i]=new PosterCard(vo);
				pan.add(pcs[i]);
				i++;
			}
		}
		
		public void cardInit(ArrayList<WikiVO> bookList)
		{
			for(int i=0;i<bookList.size();i++)
			{
				pcs[i].poLa.setIcon(null);
				pcs[i].tLa.setText("");
			}
			pan.removeAll(); // 데이터 제거
			pan.validate(); // panel 재배치
		}
		
		public void prev()
		{
			cardInit(bookList);
			curpage--;
			cardPrint(bookList);
//			System.out.println(curpage);
		}
		
		public void next()
		{
			cardInit(bookList);
			curpage++;
			cardPrint(bookList);
//			System.out.println(curpage);
		}
		
				
}