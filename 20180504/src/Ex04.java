import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
/*
 * ������Ʈ(��ư, �Է�â, ��, ������, �г�)
 * ������Ʈ.set ���� �ϴ� ��
 * ������Ʈ.get ���� �������� ��
 * ������Ʈ.add �̺�Ʈ�� �ִ� ��
 */

class A implements ActionListener {
	public void actionPerformed(ActionEvent e) {
//		System.out.println("Ȯ��");
		JFrame jf = new JFrame("�������� ����");
		jf.setVisible(true);
		jf.setSize(300,400);
	}
}
public class Ex04 {
	public static void main(String[] args) {
		JButton jbtn = new JButton("��ư");
		jbtn.addActionListener( new A() );
		
		JFrame jf = new JFrame("�������� ���ε�");
		jf.setVisible(true);
		jf.setSize(300,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		jf.add(jbtn);
	}
}