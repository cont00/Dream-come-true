import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.InputStream;

public class Ex01 extends JFrame {
	private JTextField textField;
	Ex01() throws Exception {
//		String fName = "BMHANNA_11yrs_ttf.ttf";
//	    InputStream is = Ex01.class.getResourceAsStream(fName);
//	    Font font = Font.createFont(Font.TRUETYPE_FONT, is);
	    
	    Font Label_font = new Font("����", Font.BOLD, 12);	// Font ���� ���� ("�۲�", Font ����, Font ũ��) - �۲��� �ݵ��""���
		
		getContentPane().setLayout(null);	// Layout null �����
		
		JLabel Label = new JLabel("�ֱٷζ� ��ȣ");	//	JLabel ����
		Label.setBounds(10, 10, 90, 15);		// JLabel ��ġ��ǥ
		Label.setFont(Label_font);				// JLabel Font ����
		getContentPane().add(Label);
		
		JLabel Label2 = new JLabel("���Դϴ�... ���� ��ȸ��...");
		Label2.setBounds(10, 80, 150, 15);
		Label2.setFont(Label_font);
		getContentPane().add(Label2);
		
		JLabel Label3 = new JLabel("��ȣ�Է�Ȯ��");
		Label3.setBounds(10, 110, 90, 15);
		Label3.setFont(Label_font);
		getContentPane().add(Label3);
		
		JLabel Label4 = new JLabel("1");
		Label4.setBounds(10, 130, 15, 15);
		Label4.setFont(Label_font);
		getContentPane().add(Label4);
		
		textField = new JTextField();
		textField.setBounds(25, 128, 30, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Label5 = new JLabel("2");
		Label5.setBounds(70, 130, 15, 15);
		Label5.setFont(Label_font);
		getContentPane().add(Label5);
		
		textField = new JTextField();
		textField.setBounds(85, 128, 30, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Label6 = new JLabel("3");
		Label6.setBounds(130, 130, 15, 15);
		Label6.setFont(Label_font);
		getContentPane().add(Label6);
		
		textField = new JTextField();
		textField.setBounds(145, 128, 30, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Label7 = new JLabel("4");
		Label7.setBounds(190, 130, 15, 15);
		Label7.setFont(Label_font);
		getContentPane().add(Label7);
		
		textField = new JTextField();
		textField.setBounds(205, 128, 30, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Label8 = new JLabel("5");
		Label8.setBounds(250, 130, 15, 15);
		Label8.setFont(Label_font);
		getContentPane().add(Label8);
		
		textField = new JTextField();
		textField.setBounds(265, 128, 30, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Label9 = new JLabel("6");
		Label9.setBounds(310, 130, 15, 15);
		Label9.setFont(Label_font);
		getContentPane().add(Label9);
		
		textField = new JTextField();
		textField.setBounds(325, 128, 30, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel Label10 = new JLabel("746 ȸ��");
		Label10.setBounds(30, 165, 60, 15);
		Label10.setFont(Label_font);
		getContentPane().add(Label10);
		
		textField = new JTextField();
		textField.setBounds(100, 163, 80, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton Button1 = new JButton("�ش� ȸ����");
		Button1.setBounds(200, 162, 110, 24);
		Button1.setFont(Label_font);
		getContentPane().add(Button1);
		
		setVisible(true);	//	����ڿ��� �������� �����ִ� ��Ȱ
		setSize(400,230);	//	������ ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//	������â ���� �� ���μ��� ���� 
	}
	@Override
	public void paint(Graphics g) {		// ����� �ִ� ĭ�� ��������� paint ���
		super.paint(g);
		g.setColor(Color.yellow);		// ������ ����
		g.fillRoundRect(20, 55, 50, 50, 20, 20);	//	��ġ��ǥ,ũ�� �Է�
		g.setColor(Color.black);		// ���ڻ��� ����
		g.drawString("1", 40, 85);		// �Է��� ����, ��ġ��ǥ �Է�
		
		g.setColor(Color.yellow);
		g.fillRoundRect(80, 55, 50, 50, 20, 20);
		g.setColor(Color.black);
		g.drawString("1", 100, 85);
		
		g.setColor(Color.green);
		g.fillRoundRect(140, 55, 50, 50, 20, 20);
		g.setColor(Color.black);
		g.drawString("1", 160, 85);
		
		g.setColor(Color.yellow);
		g.fillRoundRect(200, 55, 50, 50, 20, 20);
		g.setColor(Color.black);
		g.drawString("1", 220, 85);
		
		g.setColor(Color.green);
		g.fillRoundRect(260, 55, 50, 50, 20, 20);
		g.setColor(Color.black);
		g.drawString("1", 280, 85);
		
		g.setColor(Color.red);
		g.fillRoundRect(320, 55, 50, 50, 20, 20);
		g.setColor(Color.black);
		g.drawString("1", 340, 85);
	}
	public static void main(String[] args) throws Exception {
		new Ex01();
	}
}