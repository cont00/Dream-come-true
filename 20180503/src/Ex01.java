import java.awt.BorderLayout;
import java.awt.Container;
import javax.crypto.SecretKeyFactorySpi;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * BorderLayout
 * GirdLayout
 * CardLayout
 * 
 * AbstractClass
 * 
 *  javascript BOM -> window loaction screen
 */

public class Ex01 extends JFrame
{
	Ex01()
	{
		//�������� �߰� BorderLayout
		BorderLayout b1 = new BorderLayout();
//		getContentPane().setLayout(null);
		Container con = getContentPane();
		
		JButton north_btn = new JButton("���ʹ�ư");
		con.add(north_btn, BorderLayout.NORTH);
		
		JButton east_btn = new JButton("���ʹ�ư");
		con.add(east_btn, BorderLayout.EAST);
		
		JButton west_btn = new JButton("���ʹ�ư");
		con.add(west_btn, BorderLayout.WEST);
		
		JButton south_btn = new JButton("���ʹ�ư");
		con.add(south_btn, BorderLayout.SOUTH);
		
		BorderLayout blc = new BorderLayout();
		JPanel center_jpanel = new JPanel();
		center_jpanel.setLayout(blc);
		
		
		JButton center_north_jbutton = new JButton("�߰��� ���ʹ�ư");
		center_jpanel.add(center_north_jbutton, BorderLayout.NORTH);
		
		JTextField center_center_JtextField = new JTextField();
		center_jpanel.add(center_center_JtextField, BorderLayout.CENTER);
		
		con.add(center_jpanel, BorderLayout.CENTER);
		
//		JButton center_btn = new JButton("�߾ӹ�ư");
//		con.add(center_btn, BorderLayout.CENTER);
		
		setTitle("BorderLayout");
		setSize(500, 200);	//	���̿� ���� ����
		setVisible(true);	//	ȭ�鿡 �������� �Լ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	â�� �ݱ� �� �����ϴ� �Լ�
	}
	public static void main(String[] args)
	{
		new Ex01();
	}
}