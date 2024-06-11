package com.sist.client;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.table.*;
import com.sist.dao.*;

// 사번의 정보를 출력 => 조인

public class ListPanel extends JPanel{
		JLabel titleLa;
		JTable table;
		DefaultTableModel model;

		public ListPanel()
		{
			setLayout(null);
			titleLa = new JLabel("도서 정보", JLabel.CENTER);
			titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
			titleLa.setBounds(10,15,930,40);
			add(titleLa);
			String[] col = {"번호","제목","저자"};
			String[][] row = new String[0][3];
			model = new DefaultTableModel(row,col);
			table = new JTable(model);
			JScrollPane js = new JScrollPane(table);
			js.setBounds(10,65,930,500);
			add(js);
			// 데이터 첨부
			EmpDeptDAO dao = EmpDeptDAO.newInstance();
			ArrayList<EmpVO> list = dao.empListData();
			for(EmpVO vo: list)
			{
				String[] data = {
						String.valueOf(vo.getEmpno()),
						vo.getEname(),
						vo.getJob(),
						new SimpleDateFormat("yyyy-MM-dd").format(vo.getHiredate()),
						vo.getDvo().getDname(),
						vo.getDvo().getLoc()
					};
				model.addRow(data);
			}
		}
}