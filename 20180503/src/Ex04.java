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
		
		JPanel jp1 = new JPanel();	// 기본 값 = flowLayout
		
		jp1.setLayout(new BorderLayout()); 
		jp1.add(new JButton("첫번째 패널"), BorderLayout.CENTER);
		
		JPanel jp2 = new JPanel();
		jp2.add(new JButton("두번째 패널"));
		
		JPanel jp3 = new JPanel();
		jp3.add(new JButton("세번째 패널"));
		
		JPanel jp4 = new JPanel();
		jp4.add(new JButton("네번째 패널"));
		
		JPanel jp5 = new JPanel();
		jp5.add(new JButton("다섯번째 패널"));
		
		con.add("One", jp1);
		con.add("Two", jp2);
		con.add("Three", jp3);
		con.add("Four", jp4);
		con.add("Five", jp5);
		
		setTitle("GridLayout");
		setVisible(true); //화면에 보여지는 함수
		setSize(500, 200); //jframe 크기 정하는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //jframe 창이 닫길시 프로그램종료
		
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