package com.sist.client;

import javax.swing.*;
import java.net.*;
import com.sist.dao.*;
import com.sist.commons.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

//ISBN, BOOKNAME, WRITER, TRANSLATOR, PAGE, PRICE, PUBDATE, SERIES, IMAGE
public class DetailPanel extends JPanel implements ActionListener,ItemListener{
	JLabel imageLa,booknameLa,writerLa,transLa,pageLa,priceLa,pubdateLa,seriesLa;
	JButton cartBtn,listBtn;
	JComboBox<Integer> box;
	JLabel numLa,totalpriceLa, noteLa;
	ControllPanel ctrP;// 화면 이동
	WikiDAO dao;
	public DetailPanel(ControllPanel ctrP)
	  {
		dao=WikiDAO.newInstance();
		this.ctrP = ctrP;
		setLayout(null);
		imageLa = new JLabel();
		imageLa.setBounds(10,15,450,550);
		add(imageLa);
		
		booknameLa = new JLabel();
		booknameLa.setBounds(470, 15, 400, 100);
		add(booknameLa);
	
		writerLa = new JLabel();
		writerLa.setBounds(470,120,400,30);
		add(writerLa);
		
		transLa = new JLabel();
		transLa.setBounds(470, 155, 400, 30);
		add(transLa);
				
		pageLa = new JLabel();
		pageLa.setBounds(470, 190, 200, 30);
		add(pageLa);
				
		priceLa = new JLabel();
		priceLa.setBounds(470, 225, 400, 30);
		add(priceLa);
				
		pubdateLa = new JLabel();
		pubdateLa.setBounds(470, 260, 400, 30);
		add(pubdateLa);
				
		seriesLa = new JLabel();
		seriesLa.setBounds(470, 295, 300, 30);
		add(seriesLa);
				
		numLa = new JLabel("수량: ");
		numLa.setBounds(470, 330, 40, 30);
		add(numLa);
		
		box=new JComboBox<Integer>();
		box.addItem(1);
		box.addItem(2);
		box.addItem(3);
		box.addItem(4);
		box.addItem(5);
		box.addItem(6);
		box.addItem(7);
		box.setBounds(510, 330, 200, 30);
		add(box);
		
		noteLa = new JLabel("최대 7개까지 구매하실 수 있습니다."); 
		noteLa.setBounds(470, 365, 200, 30);
		add(noteLa);
		
		totalpriceLa = new JLabel();
		totalpriceLa.setBounds(470, 405, 380, 40);
		add(totalpriceLa);
		
		cartBtn = new JButton("장바구니");
		listBtn = new JButton("목록");
		JPanel p=new JPanel();
		p.add(cartBtn);p.add(listBtn);
		p.setBounds(470, 460, 450, 55);
		add(p);
		
		listBtn.addActionListener(this);
		box.addItemListener(this);
	  }
	
	public void print(int NUM)
	  {
		  // 1. 오라클에서 값을 받는다 
		  WikiVO vo=dao.bookDetailData(NUM);
		  try
		  {
			  URL url=new URL(vo.getIMAGE());
			  Image img=ImageChange.getImage(new ImageIcon(url), 400, 500);
			  imageLa.setIcon(new ImageIcon(img));
		  }catch(Exception ex) {}
		  booknameLa.setText("<html><font size= 5>"+vo.getBOOKNAME()+"</font></html>");
		  writerLa.setText("지은이: "+ vo.getWRITER());
		  transLa.setText("옮긴이: "+vo.getTRANSLATOR());
		  pageLa.setText("페이지: "+vo.getPAGE());
		  priceLa.setText("가격: "+vo.getPRICE()+"원");
		  pubdateLa.setText("발행일: "+vo.getPUBDATE());
		  seriesLa.setText("시리즈: "+vo.getSERIES());
	 }  
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box)
		{
			String price=priceLa.getText();
			price=price.substring(price.indexOf(":")+1);
			price=price.replaceAll("[^0-9]", ""); // 숫자를 제외한 나머지는 공백으로 바꿔준다
			
			int account=box.getSelectedIndex()+1;
			int total=Integer.parseInt(price)*account;
			
			DecimalFormat df=new DecimalFormat("##,###,###");
			String s=df.format(total);
			totalpriceLa.setText("총 구매 가격:"+s+"원");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==listBtn)
		{
			ctrP.card.show(ctrP, "HOME");
		}
	
	}

}
