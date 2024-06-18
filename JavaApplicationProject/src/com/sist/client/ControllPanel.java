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
	ChatPanel chatP = new ChatPanel();
	public ControllPanel()
	{
		setLayout(card);
//		add("EP",ep);
		homeP=new HomePanel(this);
		detailP = new DetailPanel(this);
		findP = new FindPanel(this);
		add("HOME",homeP);
		add("CHAT",chatP);
		add("DETAIL",detailP);
		add("FIND", findP);
		
	}
}
