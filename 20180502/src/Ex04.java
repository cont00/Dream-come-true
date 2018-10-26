import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class Ex04 extends JFrame
{
	public Ex04()
	{
		JLabel Label = new JLabel("Please enter the correct information.");
		Label.setBounds(0, 0, 260, 20);
		getContentPane().add(Label);
		
		JLabel id_Label = new JLabel("I D");
		id_Label.setHorizontalAlignment(SwingConstants.CENTER);
		id_Label.setBounds(30, 30, 120, 15);
		getContentPane().add(id_Label);
		
		JTextField id_Text = new JTextField();
		id_Text.setHorizontalAlignment(SwingConstants.CENTER);
		id_Text.setBounds(170, 30, 200, 20);
		getContentPane().add(id_Text);
		
		JLabel ps_Label = new JLabel("Password");
		ps_Label.setHorizontalAlignment(SwingConstants.CENTER);
		ps_Label.setBounds(30, 70, 120, 15);
		getContentPane().add(ps_Label);
		
		JTextField password_Text = new JTextField();
		password_Text.setHorizontalAlignment(SwingConstants.CENTER);
		password_Text.setBounds(170, 70, 200, 20);
		getContentPane().add(password_Text);
		
		JLabel cps_Label = new JLabel("Confirm Password");
		cps_Label.setHorizontalAlignment(SwingConstants.CENTER);
		cps_Label.setBounds(30, 110, 120, 15);
		getContentPane().add(cps_Label);
		
		JTextField cps_Text = new JTextField();
		cps_Text.setHorizontalAlignment(SwingConstants.CENTER);
		cps_Text.setBounds(170, 110, 200, 20);
		getContentPane().add(cps_Text);
		
		JLabel name_Label = new JLabel("Name");
		name_Label.setHorizontalAlignment(SwingConstants.CENTER);
		name_Label.setBounds(30, 150, 120, 15);
		getContentPane().add(name_Label);
		
		JTextField name_Text = new JTextField();
		name_Text.setHorizontalAlignment(SwingConstants.CENTER);
		name_Text.setBounds(170, 150, 200, 20);
		getContentPane().add(name_Text);
		
		JLabel email_Label = new JLabel("E-mail");
		email_Label.setHorizontalAlignment(SwingConstants.CENTER);
		email_Label.setBounds(30, 190, 120, 15);
		getContentPane().add(email_Label);
		
		JTextField email_Text = new JTextField();
		email_Text.setHorizontalAlignment(SwingConstants.CENTER);
		email_Text.setBounds(170, 190, 200, 20);
		getContentPane().add(email_Text);
		
		JLabel phon_Label = new JLabel("Phon Number");
		phon_Label.setHorizontalAlignment(SwingConstants.CENTER);
		phon_Label.setBounds(30, 230, 120, 15);
		getContentPane().add(phon_Label);
		
		JTextField phon_Text1 = new JTextField();
		phon_Text1.setHorizontalAlignment(SwingConstants.CENTER);
		phon_Text1.setBounds(170, 230, 50, 20);
		getContentPane().add(phon_Text1);
		
		JLabel phon_Label1 = new JLabel("-");
		phon_Label1.setHorizontalAlignment(SwingConstants.CENTER);
		phon_Label1.setBounds(222, 230, 10, 15);
		getContentPane().add(phon_Label1);

		JTextField phon_Text2 = new JTextField();
		phon_Text2.setHorizontalAlignment(SwingConstants.CENTER);
		phon_Text2.setBounds(235, 230, 60, 20);
		getContentPane().add(phon_Text2);
		
		JLabel phon_Label2 = new JLabel("-");
		phon_Label2.setHorizontalAlignment(SwingConstants.CENTER);
		phon_Label2.setBounds(298, 230, 10, 15);
		getContentPane().add(phon_Label2);
		
		JTextField phon_Text3 = new JTextField();
		phon_Text3.setHorizontalAlignment(SwingConstants.CENTER);
		phon_Text3.setBounds(310, 230, 60, 20);
		getContentPane().add(phon_Text3);
		
		JLabel address_Label = new JLabel("Address");
		address_Label.setHorizontalAlignment(SwingConstants.CENTER);
		address_Label.setBounds(30, 270, 120, 15);
		getContentPane().add(address_Label);
		
		JTextField address_Text1 = new JTextField();
		address_Text1.setHorizontalAlignment(SwingConstants.CENTER);
		address_Text1.setBounds(170, 270, 200, 20);
		getContentPane().add(address_Text1);
		
		JTextField address_Text2 = new JTextField();
		address_Text2.setHorizontalAlignment(SwingConstants.CENTER);
		address_Text2.setBounds(170, 310, 200, 20);
		getContentPane().add(address_Text2);
		
		JButton join_Button = new JButton("Sign Up");
		join_Button.setBounds(70, 360, 100, 40);
		getContentPane().add(join_Button);
		
		JButton cancel_Button = new JButton("Cancel");
		cancel_Button.setBounds(210, 360, 100, 40);
		getContentPane().add(cancel_Button);
		
		setSize(400, 450);	//	넓이와 높이 지정
		setVisible(true);	//	화면에 보여지는 함수
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	창이 닫길 때 종료하는 함수
		getContentPane().setLayout(null);
	}
	
	public static void main(String[] args)
	{
		new Ex04();
	}
}