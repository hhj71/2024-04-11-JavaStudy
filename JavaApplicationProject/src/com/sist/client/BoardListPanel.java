package com.sist.client;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import com.sist.dao.*;
public class BoardListPanel extends JPanel implements ActionListener, MouseListener{
    JLabel titleLa,pageLa;
    JButton b1,b2,b3;
    JTable table;
    DefaultTableModel model;
    ControllPanel cp;
    BoardDAO dao;
    TableColumn column;
    int curpage=1;
    int totalpage=0;
    public BoardListPanel(ControllPanel cp)
    {
    	this.cp=cp;
    	dao=BoardDAO.newInstance();
    	
    	b1=new JButton("글쓰기");//<input type=button value="새글">
    	b2=new JButton("이전");
    	b3=new JButton("다음");
    	pageLa=new JLabel("0 page / 0 pages"); //<label>0 page / 0 pages</label>
    	titleLa=new JLabel("게시판",JLabel.CENTER);// <table>
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,25)); //<h3></h3>
    	
    	String[] col={"번호","제목","이름","작성일","조회수"};//<tr><th></th>....</tr>
    	String[][] row=new String[0][5];
    	// 한줄에 5개 데이터를 첨부 
    	model=new DefaultTableModel(row,col) // 데이터 관리
    	{

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
    		 // 익명의 클래스 => 포함 클래스 => 상속없이 오버라이딩 => 클릭 => 편집기 => 편집방지 
    		 
    	};
    	table=new JTable(model); // 테이블 모양 관리 
    	JScrollPane js=new JScrollPane(table);
    	for(int i=0;i<col.length;i++)
    	{
    		column=table.getColumnModel().getColumn(i);
    		if(i==0)
    		{
    			column.setPreferredWidth(50);
    		}
    		else if(i==1)
    		{
    			column.setPreferredWidth(350);
    		}
    		else if(i==2)
    		{
    			column.setPreferredWidth(100);
    		}
    		else if(i==3)
    		{
    			column.setPreferredWidth(150);
    		}
    		else if(i==4)
    		{
    			column.setPreferredWidth(50);
    		}
    	}
    	table.getTableHeader().setReorderingAllowed(false);
    	table.setShowVerticalLines(false);
    	table.setRowHeight(30);
    	table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getPreferredSize().width, 32));
		table.getTableHeader().setBackground(Color.pink);

    	// 배치 
    	setLayout(null);
    	titleLa.setBounds(155, 50, 620, 50);
    	add(titleLa);
    	b1.setBounds(750, 560, 70, 25);
    	add(b1);
    	js.setBounds(120, 110, 700, 364);
    	add(js);
    	
    	JPanel p=new JPanel();
    	p.add(b2);
    	p.add(pageLa);
    	p.add(b3);
    	
    	p.setBounds(155, 600, 620, 30);
    	add(p);
    	print();
    	
    	DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(JLabel.LEFT);

        for (int i = 0; i < table.getColumnCount(); i++) {
            if (i == 1) { // 제목 열
                table.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
            } else {
                table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            }
        }

    	
    	b1.addActionListener(this);
    	b2.addActionListener(this);
    	b3.addActionListener(this);
    	
    	table.addMouseListener(this);
    }
    public void print()
    {
    	// 1. 테이블 지우기 
    	for(int i=model.getRowCount()-1;i>=0;i--)
    	{
    		model.removeRow(i);
    	}
    	
    	// 데이터 읽기 
    	List<BoardVO> list=dao.boardListData(curpage);
    	totalpage=dao.boardTotalPage();
    	
    	for(BoardVO vo:list)
    	{
    		String[] data={
    			String.valueOf(vo.getNo()),
    			vo.getSubject(),
    			vo.getName(),
    			vo.getRegdate().toString(),
    			String.valueOf(vo.getHit())
    		};
    		model.addRow(data);
    		
    		pageLa.setText(curpage+" page / "+totalpage+" pages");
    	}
    	
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)
		{
			if(curpage>1)
			{
				curpage--;
				print();
			}
		}
		else if(e.getSource()==b3)
		{
			if(curpage<totalpage)
			{
				curpage++;
				print();
			}
		}
		else if(e.getSource()==b1)
		{
			// 글쓰기로 이동 
			cp.bip.nameTf.setText("");
			cp.bip.subTf.setText("");
			cp.bip.ta.setText("");
			cp.bip.pwdPf.setText("");
			cp.card.show(cp, "INSERT");
			cp.bip.nameTf.requestFocus();
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row = table.getSelectedRow();
				String no = model.getValueAt(row, 0).toString();
				// 데이터를 출력
				cp.bdp.print(Integer.parseInt(no));
				// 이동
				cp.card.show(cp, "BDETAIL");
			}
		}
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
}






