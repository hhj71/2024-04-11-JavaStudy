package com.sist.main4;
import javax.swing.*;
import java.awt.*;

public class 글쓰기 extends JFrame{
	JLabel la1,la2,la3,la4,la5;
	JButton b1,b2;
	JTextField tf1, tf2;
	JTextArea ta;
	JPasswordField pf;
	
	// 초기화, 배치 => 생성자
	public 글쓰기()
	{
		la1=new JLabel("글쓰기", JLabel.CENTER);
		la2=new JLabel("이름");
		la3=new JLabel("제목");
		la4=new JLabel("내용");
		la5=new JLabel("비밀번호");
		
		b1=new JButton("글쓰기");
		b2=new JButton("취소");
		
		tf1=new JTextField();
		tf2=new JTextField();
		
		ta=new JTextArea();
		JScrollPane js =new JScrollPane(ta);
				
		pf=new JPasswordField();
		
		// 배치
		setLayout(null); // 직접배치
 	    la1.setFont(new Font ("맑은 고딕",Font.BOLD,35));
 	    la1.setBounds(10,15,500,40);
 	    add(la1); // JFrame에 추가
 	    
 	    la2.setBounds(100, 75, 80, 30);
 	    tf1.setBounds(185, 75, 150, 30);
 	    add(la2);
 	    add(tf1);
 	    
 	    la3.setBounds(100, 115, 80, 30);
 	    tf2.setBounds(185, 115, 280, 30);
 	    add(la3);
 	    add(tf2);
	    
	    la4.setBounds(100, 155, 80, 30);
	    js.setBounds(185, 155, 280, 200);
 	    add(la4);
 	    add(js);
 	    
 	    la5.setBounds(100, 360, 80, 30);
 	    pf.setBounds(185, 360, 150, 30);
 	    add(la5);
 	    add(pf);
 	    
 	    JPanel p =new JPanel();
 	    p.add(b1);
 	    p.add(b2);
 	    
 	    p.setBounds(100, 400,300, 35);
 	    add(p);
 	    
 	    setSize(550,600);
	    setVisible(true);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new 글쓰기();
	}

}
