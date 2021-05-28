import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class SimpleDraw extends JFrame implements MouseMotionListener, MouseListener {

	int lastx=0, lasty=0, newx, newy;
	DrawPanel panel;


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		newx=e.getX();
		newy=e.getY();
		panel.drawLine(lastx,  lasty, newx, newy);
		lastx=newx;
		lasty=newy;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

	}





	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SimpleDraw frame = new SimpleDraw();
		frame.frameInit();
	}

}
