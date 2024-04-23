import javax.swing.*;
public class 문자열_4 extends JFrame{ //JFrame -> 윈도우창
	JTextField tf=new JTextField();
	public 문자열_4()
	{
		add("North", tf);
		tf.setText(String.valueOf(true));
		tf.setText(String.valueOf(1000));// string으로 바꿔줘야만 값을 넣을 수 있다
		setSize(350, 300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열_4();
	}

}
