import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex02 extends JFrame
{
	Ex02()
	{
		FlowLayout f1 = new FlowLayout();
		Container con = super.getContentPane();
		con.setLayout(f1);
		
		JButton jbtn1 = new JButton("��ư1");
		JButton jbtn2 = new JButton("��ư2");
		JButton jbtn3 = new JButton("��ư3");
		JButton jbtn4 = new JButton("��ư4");
		
		con.add(jbtn1);
		con.add(jbtn2);
		con.add(jbtn3);
		con.add(jbtn4);
		
		setTitle("FlowLayout");
		setSize(500, 200);	//	���̿� ���� ����
		setVisible(true);	//	ȭ�鿡 �������� �Լ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	â�� �ݱ� �� �����ϴ� �Լ�
	}
	
	public static void main(String[] args)
	{
		new Ex02();
	}
}