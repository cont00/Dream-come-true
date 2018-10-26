import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//	CardLayout
public class Ex04 extends JFrame
{
	Ex04() throws Exception
	{
		CardLayout cards = new CardLayout();
		Container con = getContentPane();
		con.setLayout(cards);
		
		BufferedImage myPicture = ImageIO.read(new File("src/mahumahu.jpg"));
		JLabel picLabel = new JLabel(new ImageIcon(myPicture));
		
		JPanel jp1 = new JPanel();	// �⺻ �� = flowLayout
		
		jp1.setLayout(new BorderLayout()); 
		jp1.add(new JButton("ù��° �г�"), BorderLayout.CENTER);
		
		JPanel jp2 = new JPanel();
		jp2.add(new JButton("�ι�° �г�"));
		
		JPanel jp3 = new JPanel();
		jp3.add(new JButton("����° �г�"));
		
		JPanel jp4 = new JPanel();
		jp4.add(new JButton("�׹�° �г�"));
		
		JPanel jp5 = new JPanel();
		jp5.add(new JButton("�ټ���° �г�"));
		
		con.add("One", jp1);
		con.add("Two", jp2);
		con.add("Three", jp3);
		con.add("Four", jp4);
		con.add("Five", jp5);
		
		setTitle("GridLayout");
		setVisible(true); //ȭ�鿡 �������� �Լ�
		setSize(500, 200); //jframe ũ�� ���ϴ� �Լ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //jframe â�� �ݱ�� ���α׷�����
		
		while(true)
		{
			try
			{
				Thread.sleep(1000);
				cards.next(con);
			}
			catch (Exception e)
			{
				
			}
		}
	}
	public static void main(String[] args)
	{
		new Ex04();
	}
}