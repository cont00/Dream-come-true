import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 컴포넌트들은 paint 라는 함수를 상속받아서 사용하고 재정의 그리는 방법을 약간 바꾸는
 */

public class Ex01 extends JFrame implements ActionListener {
	Ex01() {
		setLayout(null);
		
		JButton jbtn = new JButton("버튼1");
		jbtn.setBounds(10, 10, 100, 100);
		jbtn.addActionListener(this);
		add(jbtn);
		
		setVisible(true);
		setSize(600,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.cyan);
		g.fillRect(50, 150, (int)(Math.random()*200), (int)(Math.random()*200));
		g.drawOval(100, 200, 300, 300);
		g.setColor(Color.darkGray);
		g.drawRect(200, 200, 250, 200);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
	public static void main(String[] args) {
		new Ex01();
	}
}