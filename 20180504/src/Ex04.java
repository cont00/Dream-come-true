import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
 * 컴포넌트(버튼, 입력창, 라벨, 프레임, 패널)
 * 컴포넌트.set 설정 하는 것
 * 컴포넌트.get 설정 가져오는 것
 * 컴포넌트.add 이벤트를 넣는 것
 */

class A implements ActionListener {
	public void actionPerformed(ActionEvent e) {
//		System.out.println("확인");
		JFrame jf = new JFrame("긍정적인 생각");
		jf.setVisible(true);
		jf.setSize(300,400);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		JButton jbtn = new JButton("버튼");
		jbtn.addActionListener( new A() );
		
		JFrame jf = new JFrame("긍정적인 마인드");
		jf.setVisible(true);
		jf.setSize(300,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		jf.add(jbtn);
	}
}