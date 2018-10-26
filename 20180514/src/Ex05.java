import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ex05 extends JFrame implements ActionListener{
	TextArea TextArea = new TextArea();
	JLabel dec_label = new JLabel("���� ������ �а� ������ �� �ִ� ���α׷� �Դϴ�.");
	JButton jbtn_save = new JButton("��������");
	JButton jbtn_open = new JButton("���Ͽ���");
	
	Ex05() {
		setTitle("����");
		
		getContentPane().setLayout(null);
		
		makeDesign();
		makeEvent();
		
		setVisible(true);
		setSize(320,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void makeEvent() {
		jbtn_save.addActionListener(this);
		jbtn_open.addActionListener(this);
	// makeDesign �� �����θ�
	}
	public void makeDesign() {
		TextArea.setBounds(10, 60, 250, 250);
		getContentPane().add(TextArea);
		
		
		dec_label.setBounds(2, 2, 320, 15);
		getContentPane().add(dec_label);
		
		
		jbtn_save.setBounds(10, 30, 90, 20);
		getContentPane().add(jbtn_save);
		
		
		jbtn_open.setBounds(120, 30, 90, 20);
		getContentPane().add(jbtn_open);
	}
	// setTextArea �� �ؽ�Ʈ��
	public void setTextArea() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("obejct = " + e.getSource());
//		System.out.println("btn = " + e.getActionCommand());
		
		if (e.getSource().equals(jbtn_save)) {
//			System.out.println("�����ư�� �������ϴ�.");
			JFileChooser jfs = new JFileChooser();
			int returnValue = jfs.showSaveDialog(this);
			System.out.println("returnValue = " + returnValue);
			System.out.println("������ ���ϸ� = " + jfs.getSelectedFile());
			
			if (returnValue == 0) {
				String jtext = TextArea.getText();
				System.out.println(jtext);
				// ��������
				try {
					File file = jfs.getSelectedFile();
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
					pw.println(jtext);
					pw.flush();
					pw.close();
				}	catch (Exception e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(this, "���������� �Ϸ� �ϼ̽��ϴ�.");
			}
			else {
				JOptionPane.showMessageDialog(this, "���������� ��� �ϼ̽��ϴ�.");
			}
		}
		else if (e.getSource().equals(jbtn_open)) {
//			System.out.println("�����ư�� �������ϴ�.");
			JFileChooser jfo = new JFileChooser();
			int returnValue = jfo.showOpenDialog(this);
			System.out.println("returnValue = " + returnValue);
			System.out.println("������ ���ϸ� = " + jfo.getSelectedFile());
			
			if (returnValue == 0) {
				// ���Ͽ���
				File file = jfo.getSelectedFile();
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					String temp = null;
					String print_text = "";
					while ( (temp = br.readLine() ) != null ) {
						System.out.println(temp);
						print_text += temp;
					}
					TextArea.setText(print_text);
				}	catch (Exception e1) {
					e1.printStackTrace();
					JOptionPane.showMessageDialog(this, "���Ͽ����߿� ���ܻ����� �߻��Ͽ����ϴ�.");
				}
				
				JOptionPane.showMessageDialog(this, "���Ͽ��⸦ �Ϸ� �ϼ̽��ϴ�.");
			}
			else {
				JOptionPane.showMessageDialog(this, "���Ͽ��⸦ ��� �ϼ̽��ϴ�.");
			}
		}
		
//		if (e.getActionCommand().equals("��������")) {
//			System.out.println("�����ư�� �������ϴ�. ActionCommand");
//		}
//		else if (e.getActionCommand().equals("���Ͽ���")) {
//			System.out.println("�����ư�� �������ϴ�. ActionCommand");
//		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
}