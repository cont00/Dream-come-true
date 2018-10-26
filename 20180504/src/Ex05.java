import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class B implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		String temp = Ex05.jtf.getText();
		String a[] = temp.split("\\+");
		int sum = 0;
		
		sum = Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
		System.out.println(temp + " = " + sum);
		Ex05.jtf.setText("");
	}
}

public class Ex05 {
	public static JTextField jtf = new JTextField("입력창 입니다.");

	public static void main(String[] args) {
		JFrame jf = new JFrame("긍정적인 사람이 됩시다.");

		jf.setLayout(new FlowLayout());

		String input = jtf.getText();
		System.out.println(input);
		// JButton jbtn_plus = new JButton("+");
		JButton jbtn_equal = new JButton("=");
		jbtn_equal.addActionListener(new B());

		jf.add(jtf);
		// jf.add(jbtn_plus);
		jf.add(jbtn_equal);

		jf.setVisible(true);
		jf.setSize(300, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}