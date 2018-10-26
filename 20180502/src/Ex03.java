import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.font.*;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ex03 extends JFrame
{
	Ex03() throws Exception
	{
//		String fName = "BMDOHYEON_ttf.ttf";
//	    InputStream is = Ex03.class.getResourceAsStream(fName);
//	    Font font = Font.createFont(Font.TRUETYPE_FONT, is);
		
		Font text_font = new Font("고딕", Font.BOLD, 20);
		Font num_font1 = new Font("고딕", Font.BOLD, 15);
		Font num_font2 = new Font("고딕", Font.BOLD, 12);
	    
		getContentPane().setLayout(null);
		
		JTextField jtf = new JTextField();
		jtf.setHorizontalAlignment(SwingConstants.RIGHT);
		jtf.setText("0");
		jtf.setFont(text_font);
		jtf.setBounds(10, 10, 290, 40);
		getContentPane().add(jtf);
		
		JButton Cancel = new JButton("←");
		Cancel.setFont(num_font1);
		Cancel.setBounds(10, 60, 50, 40);
		getContentPane().add(Cancel);
		
		JButton CE = new JButton("CE");
		CE.setFont(num_font2);
		CE.setBounds(70, 60, 50, 40);
		getContentPane().add(CE);
		
		JButton Clear = new JButton("C");
		Clear.setFont(num_font1);
		Clear.setBounds(130, 60, 50, 40);
		getContentPane().add(Clear);
		
		JButton plusminus = new JButton("±");
		plusminus.setFont(num_font1);
		plusminus.setBounds(190, 60, 50, 40);
		getContentPane().add(plusminus);
		
		JButton luto = new JButton("√");
		luto.setFont(num_font1);
		luto.setBounds(250, 60, 50, 40);
		getContentPane().add(luto);
		
		JButton num1 = new JButton("1");
		num1.setFont(num_font1);
		num1.setBounds(10, 110, 50, 40);
		getContentPane().add(num1);
		
		JButton num2 = new JButton("2");
		num2.setFont(num_font1);
		num2.setBounds(70, 110, 50, 40);
		getContentPane().add(num2);
		
		JButton num3 = new JButton("3");
		num3.setFont(num_font1);
		num3.setBounds(130, 110, 50, 40);
		getContentPane().add(num3);
		
		JButton plus = new JButton("+");
		plus.setFont(num_font1);
		plus.setBounds(190, 110, 50, 40);
		getContentPane().add(plus);
		
		JButton percent = new JButton("%");
		percent.setFont(num_font1);
		percent.setBounds(250, 110, 50, 40);
		getContentPane().add(percent);
		
		JButton num4 = new JButton("4");
		num4.setFont(num_font1);
		num4.setBounds(10, 160, 50, 40);
		getContentPane().add(num4);
		
		JButton num5 = new JButton("5");
		num5.setFont(num_font1);
		num5.setBounds(70, 160, 50, 40);
		getContentPane().add(num5);
		
		JButton num6 = new JButton("6");
		num6.setFont(num_font1);
		num6.setBounds(130, 160, 50, 40);
		getContentPane().add(num6);
		
		JButton minus = new JButton("-");
		minus.setFont(num_font1);
		minus.setBounds(190, 160, 50, 40);
		getContentPane().add(minus);
		
		JButton x1 = new JButton("1/x");
		x1.setFont(num_font2);
		x1.setBounds(250, 160, 50, 40);
		getContentPane().add(x1);
		
		JButton num7 = new JButton("7");
		num7.setFont(num_font1);
		num7.setBounds(10, 210, 50, 40);
		getContentPane().add(num7);
		
		JButton num8 = new JButton("8");
		num8.setFont(num_font1);
		num8.setBounds(70, 210, 50, 40);
		getContentPane().add(num8);
		
		JButton num9 = new JButton("9");
		num9.setFont(num_font1);
		num9.setBounds(130, 210, 50, 40);
		getContentPane().add(num9);
		
		JButton multiply = new JButton("*");
		multiply.setFont(num_font1);
		multiply.setBounds(190, 210, 50, 40);
		getContentPane().add(multiply);
		
		JButton sum = new JButton("=");
		sum.setFont(num_font1);
		sum.setBounds(250, 210, 50, 90);
		getContentPane().add(sum);
		
		JButton num0 = new JButton("0");
		num0.setFont(num_font1);
		num0.setBounds(10, 260, 110, 40);
		getContentPane().add(num0);
		
		JButton point = new JButton(".");
		point.setFont(num_font1);
		point.setBounds(130, 260, 50, 40);
		getContentPane().add(point);
		
		JButton division = new JButton("/");
		division.setFont(num_font1);
		division.setBounds(190, 260, 50, 40);
		getContentPane().add(division);
		
		setSize(330, 350);	//	넓이와 높이 지정
		setVisible(true);	//	화면에 보여지는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	창이 닫길 때 종료하는 함수
	}
	
	public static void main(String[] args) throws Exception
	{
		new Ex03();
	}
}