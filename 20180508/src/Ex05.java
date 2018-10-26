import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Ex05 extends JFrame {
	private BufferedImage image;
	private int x1 = 30;
	private int x2 = 30;
	
	Ex05() {
		setVisible(true);
		setSize(1200,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while(x1<600) {
			repaint();
			x1 = x1 + 10;
			x2 = x2 + (int)(Math.random()*100);
			try {
				Thread.sleep(1000);
			}	catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		try {
			image = ImageIO.read(getClass().getResource("kano.jpg"));
		}	catch (Exception ex) {
				System.out.println("이미지 없음");
		}
		g.drawImage(image, x1, 30, null);
		g.drawImage(image, x2, 330, null);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}