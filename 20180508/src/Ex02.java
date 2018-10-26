import java.awt.Graphics;

import javax.swing.JFrame;

public class Ex02 extends JFrame{
	private int a = 0;
	
	Ex02() {
		setVisible(true);
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(10, 10, 100, 300);
		System.out.println("그림그리기 = " + (a++));
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}