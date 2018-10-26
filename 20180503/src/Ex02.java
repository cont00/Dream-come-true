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
		
		JButton jbtn1 = new JButton("버튼1");
		JButton jbtn2 = new JButton("버튼2");
		JButton jbtn3 = new JButton("버튼3");
		JButton jbtn4 = new JButton("버튼4");
		
		con.add(jbtn1);
		con.add(jbtn2);
		con.add(jbtn3);
		con.add(jbtn4);
		
		setTitle("FlowLayout");
		setSize(500, 200);	//	넓이와 높이 지정
		setVisible(true);	//	화면에 보여지는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	창이 닫길 때 종료하는 함수
	}
	
	public static void main(String[] args)
	{
		new Ex02();
	}
}