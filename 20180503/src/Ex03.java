import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Ex03 extends JFrame
{

	Ex03()
	{
		Container con = super.getContentPane();
		con.setLayout(new GridLayout(3, 2, 100, 50));
		
		JButton jbtn1 = new JButton("��ư1");
		JButton jbtn2 = new JButton("��ư2");
		JButton jbtn3 = new JButton("��ư3");
		JButton jbtn4 = new JButton("��ư4");
		JButton jbtn5 = new JButton("��ư5");
		JButton jbtn6 = new JButton("��ư6");
//		JButton jbtn7 = new JButton("��ư7");
//		JButton jbtn8 = new JButton("��ư8");
		
		con.add(jbtn1);
		con.add(jbtn2);
		con.add(jbtn3);
		con.add(jbtn4);
		con.add(jbtn5);
		con.add(jbtn6);
//		con.add(jbtn7);
//		con.add(jbtn8);

		setTitle("GridLayout");
		setVisible(true); //ȭ�鿡 �������� �Լ�
		setSize(500, 200); //jframe ũ�� ���ϴ� �Լ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //jframe â�� �ݱ�� ���α׷�����
	}
	public static void main(String[] args)
	{
		new Ex03();
	}
}