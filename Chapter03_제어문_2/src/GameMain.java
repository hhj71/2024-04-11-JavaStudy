import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GameMain extends JFrame implements KeyListener{
   GameView gv=new GameView();
	public GameMain()
    {      
		add("Center", gv);
    	setSize(900,650);
    	setVisible(true);
    	addKeyListener(this);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new GameMain();
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {                   //키보드가 눌렸을 때 
		// TODO Auto-generated method stub
		if(e.getSource()==this) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {        //키보드 방향키 왼쪽을 누르면 말 그림이 왼쪽으로 이동함
				gv.x-=5;                                  // x좌표의 -5만큼 이동
				if(gv.x<0)                                // x좌표 왼쪽 끝까지 갔으면 
					gv.x=700;                             // 다시 처음 위치로 돌아가기
				gv.repaint();
			}
		}
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
