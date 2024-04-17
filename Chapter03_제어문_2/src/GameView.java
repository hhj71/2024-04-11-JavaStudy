import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel {
         Image back,horse;
         int x=750;
         int y=500;
	public GameView() 
	{ 
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.jpg");  // 파일 경로에 파일을 넣어두어야 한다. 
		horse=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\horse.gif"); // 파일 경로에 파일을 넣어두어야 한다. 
	}

	@Override                                                               // 코드창에서 오른쪽 마우스 클릭 source-> override -> paint 체크
	public void paint(Graphics g) {
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(horse, x, y, 120, 80, this);
	}

}
