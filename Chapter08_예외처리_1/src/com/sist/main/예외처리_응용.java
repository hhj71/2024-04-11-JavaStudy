package com.sist.main;
// UpDown 게임
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // interface

public class 예외처리_응용 extends JFrame implements ActionListener{
	// 예외처리_응용 => 윈도우를 확장 => 상속 (단일 상속 기본)
	JTextField tf;
	JButton b1, b2;
	JLabel la=new JLabel("",JLabel.CENTER); // 명시적 초기화 
	//클래스 => 변수(객체) => 변수 사용(기본형, 배열, 클래스) => 멤버변수로 사용이 가능
	// 초기화, 화면 UI, 서버연결 => 생성자에 주로 처리
	// 전체 변수
	int com; // 난수
	int user; // 사용자 입력값
	// 메소드 2개 이상에 사용할 것이기 때문에 멤버변수(전역변수)로 설정 ==> 1. 입력값을 받을 때 , 2. 비교할 때 사용
	// 메소드 1개에서만 사용 => 지역변수
	// 처리는 입력 => 엔터시 => 입력값을 받는다, 비교 => 결과값 출력
	// 
	public 예외처리_응용()
	{
		tf=new JTextField();
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		
		//배치
		setLayout(null);
		tf.setBounds(10, 15, 150, 30);
		tf.setEnabled(false);// textfield 비활성화
		// 윈도우 추가
		add(tf);
		
		b1.setBounds(165, 15, 100, 30);
		add(b1);
		b2.setBounds(270, 15, 100, 30);
		add(b2);
		la.setBounds(10,55,360,30);
		add(la);
		//윈도우 크기 결정
		setSize(400, 135);
		setVisible(true);
		
		// 버튼 클릭 => 등록 => 메소드 자동 호출
		b1.addActionListener(this); // actionPerformed => 어디 있는 함수를 호출할 것인가? => 이 클래스 안에 있다 --> this
		b2.addActionListener(this); // this => 자신의 객체를 나타낸다
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
		new 예외처리_응용();
	}
	public void getRand() 
	{
		com=(int)(Math.random()*100)+1;
	}
	public void compare()
	{
		if(com>user)
		{
			la.setText("입력값보다 큰 값을 입력하세요");
			tf.setText("");
			tf.requestFocus(); // 깜빡이는 커서
		}
		else if (com<user)
		{
			la.setText("입력값보다 작은 값을 입력하세요");
			tf.setText("");
			tf.requestFocus(); // 깜빡이는 커서
		}
		else
		{
			//JOptionPane.showConfirmDialog(null, "종료할까요?","confirm",JOptionPane.YES_NO_OPTION);
			int no = JOptionPane.showConfirmDialog(this, "종료할까요?", "종료", JOptionPane.YES_NO_OPTION);
			if(no==JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
			else
			{
				tf.setText("");
				tf.setEnabled(false); 
				b1.setEnabled(true);
				la.setText("");
			}
		}
	}
	// 예외처리는 에러가 발생시 종료하는 목적이 아니라 => 프로그램을 정상상태로 유지하는 목적을 가지고 있다.
	// 예외처리는 클래스 블록에는 사용이 불가능 하다 
	// ==> 초기화 블록이나, 메소드, 생성자에만 사용이 가능하다
	// 버튼이나 JTextField 처리 (엔터) => 고정 => 구현을 할 수 없어서 선언만 해서 넘겨준다 => 프로그램에 맞게 구현해서 사용해라
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b2)//b2번 버튼을 클릭했다면
		{
			System.exit(0);
		}
		else if (e.getSource()==b1)
		{
			getRand(); // com 에 난수 발생
			JOptionPane.showMessageDialog(this, "게임을 시작합니다!!");
			tf.setEnabled(true); // 텍스트필드 활성화
			tf.requestFocus();
			b1.setEnabled(false);// 시작버튼 비활성화
			
		}
		else if (e.getSource()==tf)// 입력후에 엔터치면
		{
			String no = tf.getText(); // 입력값을 읽어 온다
			// 예외 처리 => 에러 출력을 하지 않고 프로그램을 유지시키기 위해 사용
			try
			{
				user=Integer.parseInt(no);
				
			}catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다!!");
				tf.setText("");
				tf.requestFocus();
				return; // 다시 처음부터 동작을 하게 만든다
				// 메소드에서 return을 사용하면 ==> 메소드가 종료된다
			}
			// 메소드는 return이 있을 때 종료한다 => return은 항상 마지막줄에 있는 건 아니다....
			// 비교 
			compare();
			// return; 생략됨 => void 여서
			// 맨 마지막에 있는 return 만 생략가능
		}
		
	}

}
