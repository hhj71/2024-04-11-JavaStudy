package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class IdCheckFrame extends JFrame{
      JLabel la1,la2,alert;
      JButton idFind,ok;
      JTextField idTf;
      
      public IdCheckFrame()
      {
    	  setLayout(null);
    	  la1=new JLabel("아이디 중복체크",JLabel.CENTER);
    	  la1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
    	  la1.setBounds(10, 15, 250, 35);
    	  add(la1);
    	  
    	  la2=new JLabel("ID");
    	  la2.setBounds(10, 55, 30, 30);
    	  add(la2);
    	  
    	  idTf=new JTextField();
    	  idTf.setBounds(45, 55, 150, 30);
    	  add(idTf);
    	  
    	  idFind=new JButton("검색");
    	  idFind.setBounds(200, 55, 60, 30);
    	  add(idFind);
    	  
    	  alert=new JLabel("",JLabel.CENTER);
    	  alert.setForeground(Color.red);
    	  alert.setBounds(10, 95, 250, 30);
    	  add(alert);
    	  
    	  ok=new JButton("확인");
    	  ok.setVisible(false);
    	  JPanel p=new JPanel();
    	  p.add(ok);
    	  p.setBounds(10, 135, 250, 35);
    	  add(p);
    	  setSize(290, 220);
    	  //setVisible(true);
    	  
      }
		/*
		 * public static void main(String[] args) { new IdCheckFrame(); }
		 */
      
}
