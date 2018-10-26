import java.awt.Graphics;

import javax.swing.JFrame;

public class Ex07 extends JFrame{
	Ex07() {
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("좋은 관계", 200, 100);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
