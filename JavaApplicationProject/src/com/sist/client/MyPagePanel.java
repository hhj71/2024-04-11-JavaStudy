package com.sist.client;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.*;
import javax.swing.table.*;
import com.sist.commons.*;
import com.sist.dao.*;
import java.util.*;
import java.net.*;
public class MyPagePanel extends JPanel implements MouseListener{
	JLabel titleLa;
	JTable table;
	DefaultTableModel model;
	WikiDAO dao;
	ControllPanel cp;
	TableColumn column;
	
	public MyPagePanel(ControllPanel cp)
	{
		this.cp=cp;
		dao=WikiDAO.newInstance();
		titleLa=new JLabel("장바구니",JLabel.CENTER);// <table>
    	titleLa.setFont(new Font("맑은 고딕",Font.BOLD,30)); //<h3></h3>
    	setLayout(null);
    	titleLa.setBounds(70, 15, 700, 50);
    	
    	add(titleLa);
    	
    	String[] col= {"주문번호","도서명","표지","총 구매 가격","수량"};
    	Object[][] row = new Object[0][5];
    	model=new DefaultTableModel(row,col)
    			{

					@Override
					public boolean isCellEditable(int row, int column) {
						// TODO Auto-generated method stub
						return false;
					}
					public Class<?> getColumnClass(int columnIndex) {
						// TODO Auto-generated method stub
						return getValueAt(0, columnIndex).getClass();
					}
    				
    			};
    			table = new JTable(model);
    			table.setRowHeight(50);
    			for(int i=0;i<col.length;i++)
    	    	{
    	    		column=table.getColumnModel().getColumn(i);
    	    		if(i==0)
    	    			column.setPreferredWidth(15);
    	    		else if(i==1)
    	    			column.setPreferredWidth(500);
    	    		else if(i==2)
    	    			column.setPreferredWidth(35);
    	    		else if(i==3)
    	    			column.setPreferredWidth(30);
    	    		else if(i==4)
    	    			column.setPreferredWidth(10);
    	    		
    	    	}
    			table.getTableHeader().setBackground(Color.pink);
    			JScrollPane js = new JScrollPane(table);
    			
    			js.setBounds(70, 75, 800, 400);
    			add(js);
    			
    			table.addMouseListener(this);
	}
	public void print()
	{
		String id=cp.cMain.myId;
		List<BookCartVO> list = dao.bookCartSelect(id);
		for(int i=model.getRowCount()-1; i>=0; i--)
		{
			model.removeRow(i);
		}
		for(BookCartVO vo:list)
		{
			try
			{
				URL url = new URL(vo.getWvo().getIMAGE());
				Image img = ImageChange.getImage(new ImageIcon(url), 40, 45);
				Object[] data = {
						vo.getBno(),
    					vo.getWvo().getBOOKNAME(),
    					new ImageIcon(img),
    					vo.getPrice(),
    					vo.getAccount()
				};
				model.addRow(data);
			}catch (Exception ex) {}
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
				String bno = model.getValueAt(row, 0).toString();
				int sel= JOptionPane.showConfirmDialog(this, "장바구니에서 삭제할까요?","삭제",JOptionPane.YES_NO_OPTION);
				if(sel==JOptionPane.YES_OPTION)
				{
					dao.bookCartCancel(Integer.parseInt(bno));
					print();
				}
				
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
