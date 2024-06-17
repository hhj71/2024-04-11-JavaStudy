package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

public class ControllPanel extends JPanel{
	CardLayout card = new CardLayout();
//	EmpListPanel ep=new EmpListPanel();
	HomePanel homeP = new HomePanel();
	ChatPanel chatP = new ChatPanel();
	public ControllPanel()
	{
		setLayout(card);
		add("CHAT",chatP);
//		 add("EP",ep);
		add("HOME",homeP);
		
	}
}
