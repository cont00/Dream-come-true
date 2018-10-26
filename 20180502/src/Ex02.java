import java.lang.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ex02 extends JFrame
{
	/*
	 * BorderLayout 동서남북중간
	 * GirdLatout table개념
	 * FlowLayout 흐르는 레이아웃
	 * null 좌표값으로 컴포넌트(button, textfiled, radiobutton)
	 */
	
	Ex02()
	{
		getContentPane().setLayout(null);
		
		JButton jbtn1 = new JButton("1");
		jbtn1.setBounds(10, 10, 80, 80);
		getContentPane().add(jbtn1);
		
		JButton jbtn2 = new JButton("2");
		jbtn2.setBounds(90, 10, 80, 80);
		getContentPane().add(jbtn2);
		
		JButton jbtn3 = new JButton("3");
		jbtn3.setBounds(170, 10, 80, 80);
		getContentPane().add(jbtn3);
		
		JTextField jtf = new JTextField();
		jtf.setBounds(10, 100, 270, 40);
		getContentPane().add(jtf);
		
		setSize(500, 300);	//	넓이와 높이 지정
		setVisible(true);	//	화면에 보여지는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	창이 닫길 때 종료하는 함수
	}

	public static void main(String[] args)
	{
		new Ex02();
	}
}