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
		
		JButton jbtn1 = new JButton("버튼1");
		JButton jbtn2 = new JButton("버튼2");
		JButton jbtn3 = new JButton("버튼3");
		JButton jbtn4 = new JButton("버튼4");
		JButton jbtn5 = new JButton("버튼5");
		JButton jbtn6 = new JButton("버튼6");
//		JButton jbtn7 = new JButton("버튼7");
//		JButton jbtn8 = new JButton("버튼8");
		
		con.add(jbtn1);
		con.add(jbtn2);
		con.add(jbtn3);
		con.add(jbtn4);
		con.add(jbtn5);
		con.add(jbtn6);
//		con.add(jbtn7);
//		con.add(jbtn8);

		setTitle("GridLayout");
		setVisible(true); //화면에 보여지는 함수
		setSize(500, 200); //jframe 크기 정하는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //jframe 창이 닫길시 프로그램종료
	}
	public static void main(String[] args)
	{
		new Ex03();
	}
}