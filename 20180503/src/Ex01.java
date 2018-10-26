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
		//동서남북 중간 BorderLayout
		BorderLayout b1 = new BorderLayout();
//		getContentPane().setLayout(null);
		Container con = getContentPane();
		
		JButton north_btn = new JButton("북쪽버튼");
		con.add(north_btn, BorderLayout.NORTH);
		
		JButton east_btn = new JButton("동쪽버튼");
		con.add(east_btn, BorderLayout.EAST);
		
		JButton west_btn = new JButton("서쪽버튼");
		con.add(west_btn, BorderLayout.WEST);
		
		JButton south_btn = new JButton("남쪽버튼");
		con.add(south_btn, BorderLayout.SOUTH);
		
		BorderLayout blc = new BorderLayout();
		JPanel center_jpanel = new JPanel();
		center_jpanel.setLayout(blc);
		
		
		JButton center_north_jbutton = new JButton("중간에 북쪽버튼");
		center_jpanel.add(center_north_jbutton, BorderLayout.NORTH);
		
		JTextField center_center_JtextField = new JTextField();
		center_jpanel.add(center_center_JtextField, BorderLayout.CENTER);
		
		con.add(center_jpanel, BorderLayout.CENTER);
		
//		JButton center_btn = new JButton("중앙버튼");
//		con.add(center_btn, BorderLayout.CENTER);
		
		setTitle("BorderLayout");
		setSize(500, 200);	//	넓이와 높이 지정
		setVisible(true);	//	화면에 보여지는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	창이 닫길 때 종료하는 함수
	}
	public static void main(String[] args)
	{
		new Ex01();
	}
}