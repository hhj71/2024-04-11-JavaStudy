package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import com.sist.dao.*;
import com.sist.client.HomePanel;

public class ClientMain extends JFrame implements ActionListener, MouseListener{
    CardLayout card=new CardLayout();
    LoginPanel loginP=new LoginPanel();
    MainPanel mainP=new MainPanel();
    JoinPanel joinP=new JoinPanel();
    PostFindFrame post=new PostFindFrame();// 우편번호 검색 
    IdCheckFrame idFrm=new IdCheckFrame();
    HomePanel homeP = new HomePanel();
    int curpage=1;
    int totalpage=48;
    
    public ClientMain()
    {
    	setLayout(card);
    	add("LOGIN",loginP);
    	add("JOIN",joinP);
    	add("MAIN",mainP);
    	add("HOME",homeP);
    	setSize(960, 780);
    	setResizable(false);
    	setVisible(true);
    	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //윈도우 창 우측상단 X버튼으로 종료금지
    	//setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    	mainP.menuP.homeBtn.addActionListener(this); //홈
		mainP.menuP.findBtn.addActionListener(this); //검색
		mainP.menuP.newsBtn.addActionListener(this); //뉴스
		mainP.menuP.boardBtn.addActionListener(this); //게시판
		mainP.menuP.chatBtn.addActionListener(this); //채팅
		mainP.menuP.exitBtn.addActionListener(this); // 종료
    	
    	loginP.loginBtn.addActionListener(this);// 로그인 
    	loginP.joinBtn.addActionListener(this);// 회원가입 
    	loginP.cancelBtn.addActionListener(this);// 종료
   
    	joinP.idCheck.addActionListener(this);// 아이디 중복체크 버튼
    	joinP.cancel.addActionListener(this);// 취소
    	joinP.postFind.addActionListener(this);// 우편번호 검색
    	joinP.join.addActionListener(this); // 가입
    	
    	post.find.addActionListener(this);// 우편 검색 버튼 
    	post.cancel.addActionListener(this);// 취소 
    	post.postTf.addActionListener(this);// 우편번호 입력창 
    	post.table.addMouseListener(this); // 우편번호 더블클릭
    	
    	idFrm.idFind.addActionListener(this); // 아이디 체크
    	idFrm.ok.addActionListener(this); // 확인
    	
    	homeP.prev.addActionListener(this); // 홈 도서목록 이전버튼
    	homeP.next.addActionListener(this); // 홈 도서목록 다음버튼
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
        new ClientMain();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==loginP.cancelBtn)
		{
			dispose();// window메모리 해제 
			System.exit(0);// 프로그램 종료
		}
		else if(e.getSource()==loginP.loginBtn)
		{
			//1. 입력한 사번 / 이름을 가지고 온다 
			try
			{
				// 유효성 검색 => 오라클 
				String id=loginP.idField.getText();
				if(id.length()<1)
				{
					JOptionPane.showMessageDialog(this, "아이디를 입력하세요");
					loginP.idField.requestFocus();
					return;
				}
				String pwd=String.valueOf(loginP.pwField.getPassword());
				//비밀번호 값 가지고 오기 char배열이라 String으로 변환
				if(pwd.length()<1)
				{
					JOptionPane.showMessageDialog(this, "비밀번호를 입력하세요");
					loginP.pwField.requestFocus();
					return;
				}
				// 오라클 연결 
				MemberDAO dao=MemberDAO.newInstance();
				String result=dao.memberLogin(id, pwd);
				// 웹 => 자바스크립트로 처리 
				if(result.equals("NOID"))
				{
					// 아이디가 없는 경우 
					JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다");
					loginP.idField.setText("");
					loginP.pwField.setText("");
					loginP.idField.requestFocus();
				}
				else if(result.equals("NOPWD"))
				{
					// 이름이 틀린 경우
					JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다");
					loginP.pwField.setText("");
					loginP.pwField.requestFocus();
				}
				else
				{
					// 로그인 
					System.out.println("로그인 완료");
					card.show(getContentPane(),"MAIN"); // 화면 변경 
				}
			}catch(Exception ex)
			{
				ex.printStackTrace();
				JOptionPane.showMessageDialog(this, "잘못된 입력입니다.");
				return; // 메소드 종료 
			}
		}
		else if(e.getSource()==loginP.joinBtn)
		{
			card.show(getContentPane(), "JOIN");
		}
		else if(e.getSource()==joinP.cancel)
		{
			card.show(getContentPane(), "LOGIN");
		}
		else if(e.getSource()==mainP.menuP.homeBtn)
		{
			card.show(mainP.ctrP,"HOME");
		}
		else if(e.getSource()==joinP.idCheck)// 아이디 중복 체크
		{
			idFrm.idTf.setText("");
			idFrm.ok.setVisible(false);
			idFrm.alert.setText("");
			idFrm.setVisible(true);
		}
		else if(e.getSource()==idFrm.idFind)
		{
			String id = idFrm.idTf.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "아이디를 입력하세요"); // alert()
				idFrm.idTf.requestFocus();//tf.focus()
				return;
			}
			// 입력된 상태
			// 오라클 연결
			MemberDAO dao=MemberDAO.newInstance();
			int count = dao.memberIdCheck(id);
			if(count==0)
			{
				idFrm.alert.setText(id+"는(은) 사용 가능한 아이디입니다");
				idFrm.ok.setVisible(true);
			}
			else
			{
				idFrm.alert.setText(id+"는(은) 사용중인 아이디입니다");
				idFrm.ok.setVisible(false);
				idFrm.idTf.setText("");
				idFrm.idTf.requestFocus();
			}
		}
		else if(e.getSource()==idFrm.ok)
		{
			String id = idFrm.idTf.getText();
			joinP.idF.setText(id);
			idFrm.setVisible(false); // 아이디칸 비활성화
		}
		else if(e.getSource()==joinP.postFind) // 우편번호 검색
		{
			for(int i=post.model.getRowCount()-1;i>=0;i--)
			{
				post.model.removeRow(i);
			}
			post.postTf.setText("");
			post.setVisible(true);
		}
		else if(e.getSource()==post.cancel)
		{
			post.setVisible(false);
		}
		else if(e.getSource()==post.find || e.getSource()==post.postTf)
		{
			String dong=post.postTf.getText();
			if(dong.length()<1)// 입력이 안된 경우
			{
				JOptionPane.showMessageDialog(this, "동/읍/면을 입력하세요");
				post.postTf.requestFocus();
				return;
			}
			MemberDAO dao=MemberDAO.newInstance();
			ArrayList<ZipcodeVO> list=dao.postFindData(dong);
			if(list.size()==0)
			{
				JOptionPane.showMessageDialog(this, "검색된 결과가 없습니다");
				post.postTf.setText("");
				post.postTf.requestFocus();
			}
			else
			{
				for(int i=post.model.getRowCount()-1;i>=0;i--)
				{
					post.model.removeRow(i); //열릴때마다 리스트 리셋, 지우기
				}
				
				for(ZipcodeVO vo:list)
				{
					String[] data={vo.getZipcode(),vo.getAddress()};
					post.model.addRow(data);
				}
			}
		}
		else if(e.getSource()==joinP.join)
		{
			String id= joinP.idF.getText();
			if(id.length()<1)
			{
				joinP.idF.requestFocus();
				return;	
			}
			String pwd= String.valueOf(joinP.pwF.getPassword());
			if(pwd.length()<1)
			{
				joinP.pwF.requestFocus();
				return;	
			}
			String pwd2= String.valueOf(joinP.pw2F.getPassword());
			if(pwd.length()<1)
			{
				joinP.pw2F.requestFocus();
				return;	
			}
			if(!pwd.equals(pwd2)) {
				joinP.pw2F.requestFocus();
				return;
			}
			String name=joinP.nameF.getText();
			if(name.length()<1)
			{
				joinP.nameF.requestFocus();
				return;
			}
			String sex="";
			if(joinP.genderM.isSelected())
			{
				sex="남자";
			}
			else
			{
				sex="여자";
			}
			String birthday=joinP.birthF.getText();
			if(birthday.length()<1)
			{
				joinP.birthF.requestFocus();
				return;
			}
			String post=joinP.postF.getText();
			if(post.length()<1)
			{
				joinP.postF.requestFocus();
				return;
			}
			
			String addr1=joinP.addr1F.getText();
			if(addr1.length()<1)
			{
				joinP.addr1F.requestFocus();
				return;
			}
			String phone1=joinP.phoneF1.getText();
			String phone2=joinP.phoneF2.getText();
			String phone3=joinP.phoneF3.getText();
			if(phone1.length()<1)
			{
				joinP.phoneF1.requestFocus();
				return;
			}
			String phone=phone1+"-"+phone2+"-"+phone3;
			String emailId=joinP.emailF.getText();
			String emailSite=joinP.emailCombo.getSelectedItem().toString();
			if(emailId.length()<1)
			{
				joinP.emailF.requestFocus();
				return;
			}
			String email=emailId+"@"+emailSite;
			
			String addr2=joinP.addr2F.getText();
			String content=joinP.conT.getText();
			//phone => NOT NULL => 반드시 입력....
			MemberVO vo=new MemberVO();
			vo.setId(id);
			vo.setPwd(pwd);
			vo.setName(name);
			vo.setSex(sex);
			vo.setBirthday(birthday);
			vo.setPost(post);
			vo.setAddr1(addr1);
			vo.setAddr2(addr2);
			vo.setEmail(email);
			vo.setPhone(phone);
			vo.setContent(content);
			
			MemberDAO dao = MemberDAO.newInstance();
			String res=dao.memberInsert(vo);
			
			if(res.equals("yes"))
			{
				JOptionPane.showMessageDialog(this, "회원가입을 축하합니다");
				card.show(getContentPane(), "LOGIN");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "회원 가입에 실패하셨습니다\n"+res);
			}
		}		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==post.table)
		{
			if(e.getClickCount()==2)
			{
				int row=post.table.getSelectedRow();
				String zip=post.model.getValueAt(row, 0).toString();
				String addr=post.model.getValueAt(row, 1).toString();
				joinP.postFind.setText(zip);
				joinP.addr1F.setText(addr);
				post.setVisible(false);
			}
		}
		
		if(e.getSource()==homeP.prev)
		{
			if(curpage>1)
			{
				curpage--;
			}
		}
		else if(e.getSource()==homeP.next)
		{
			if(curpage<totalpage)
			{
				curpage++;
				
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