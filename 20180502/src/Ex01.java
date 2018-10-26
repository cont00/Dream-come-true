import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ex01 extends JFrame
{
	public Ex01() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("button 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(10, 10, 145, 40);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("button 2");
		btnNewButton_1.setBounds(10, 60, 145, 40);
		getContentPane().add(btnNewButton_1);
	}
}