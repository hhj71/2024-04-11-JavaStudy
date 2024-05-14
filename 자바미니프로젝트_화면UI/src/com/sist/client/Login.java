package com.sist.client;
/*
 * 	윈도우 (컨테이너)
 *    |
 *    └ **JFrame : 기본 윈도우 => 최소화, 최대화, 닫기
 *    └ JWindow : 타이틀바가 없다
 *    └ **JPanel : 단독으로 수행이 불가능 => JFrame, Jwindow와 함께 사용 => 화면 변경할 때 사용
 *    └ JDialog : 검색어를 입력하세요.. 등 대화상자
 *  컴포넌트
 *    | 
 *    버튼 
 *      => 메뉴 JMenu <ul>
 *      => 버튼 JButton, 라디오 : JRadioButton , 체크 : JCheckBox
 *      	<input type = button>
 *          <input type = radio>
 *          <input type = checkbox>
 *    입력창
 *    	=> 한줄 : JTextField, JPasswordField
 *    				<input type = text> <input type = password>
 *      => 여러줄 : JTextArea
 *      			<textarea>
 *    라벨
 *      => JLabel  <label>
 *    테이블
 *    	=> JTable  <table>
 *    트리
 *    	=> JTree
 *    
 *   배치
 *   	= BorderLayout 
 *      = FlowLayout --> 일차로 배치
 *      = GridLayout --> 격자로 배치
 *      = CardLayout 
 *      = 사용자 정의 => 직접 배치
 *      
 *  ----------------------------------
 *  1. JFrame 상속
 *  2. 필요한 컴포넌트를 포함
 *  3. 생성자 
 *  	 초기화 => 배치    
 *     
 *    //  McWinLookAndFeel
 *    
 *    => 라벨 2개 필요
 *    => JTextField, JPasswordField 필요
 *    => JButton 2개
 */
import javax.swing.*; // javafx
public class Login extends JFrame{
	// 포함 클래스 
	/*
	 *  모든 멤버변수는 private 가 아니다 => 라이브러리는 public으로 설정
	 */
	public JLabel la1, la2;
	public JTextField tf;
	public JPasswordField pf;
	public JButton b1,b2;
	
	// 초기화 => 화면 배치 => 생성자 => 다른 클래스와 연결하기 위해 => public
	public Login()
	{
			setTitle("로그인");
			// 초기화
			la1=new JLabel("아이디");
			la2=new JLabel("비밀번호");
			
		    tf=new JTextField();
		    pf=new JPasswordField();
		    
		    b1=new JButton("로그인");
		    b2=new JButton("취소");
			
		    // 배치
		    // 사용자 정의 
		    setLayout(null); // BorderLayout
		    la1.setBounds(10, 15, 80, 30);
		    tf.setBounds(100, 15, 200, 30);
		    
		    // 윈도우에 추가
		    add(la1); add(tf);
		    
		    la2.setBounds(10, 50, 80, 30);
		    pf.setBounds(100, 50, 200, 30);
		    
		    // 윈도우에 추가
		    add(la2); add(pf);
		    
		    // 버튼 
		    JPanel p = new JPanel();
		    p.add(b1); p.add(b2); // 가운데 정렬
		    
		    p.setBounds(10, 90, 290, 35);
		    add(p);
		    
		    // 윈도우 크기 결정
		    setSize(330, 170);
		    // 출력 여부
		    setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 호출
//		try
//		{
//			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
//			
//		}catch(Exception ex) {}
		
		new Login();
	}

}
