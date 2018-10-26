import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class Ex06 extends JFrame {
	Ex06() {
		getContentPane().setLayout(new FlowLayout());
		
		JButton btnNewButton = new JButton("\uBC84\uD2BC2");
		btnNewButton.setIcon(new ImageIcon("D:\\HTML\\\uC774\uBBF8\uC9C0\\kano.jpg"));
		getContentPane().add(btnNewButton);
		getContentPane().add( new MyButton("버튼1"));
		
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex06();
	}
}

class MyButton extends JButton {
	private BufferedImage image;
	public MyButton(String str) {
		super(str);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		try {
			image = ImageIO.read(getClass().getResource("kano.jpg"));
		}	catch (Exception ex) {
				System.out.println("이미지 없음");
		}
		g.drawImage(image, 10, 10, 50, 30, null);
	}
}