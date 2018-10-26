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
	JLabel dec_label = new JLabel("파일 내용을 읽고 저장할 수 있는 프로그램 입니다.");
	JButton jbtn_save = new JButton("파일저장");
	JButton jbtn_open = new JButton("파일열기");
	
	Ex05() {
		setTitle("파일");
		
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
	// makeDesign 은 디자인만
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
	// setTextArea 은 텍스트만
	public void setTextArea() {
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("obejct = " + e.getSource());
//		System.out.println("btn = " + e.getActionCommand());
		
		if (e.getSource().equals(jbtn_save)) {
//			System.out.println("저장버튼을 눌렀습니다.");
			JFileChooser jfs = new JFileChooser();
			int returnValue = jfs.showSaveDialog(this);
			System.out.println("returnValue = " + returnValue);
			System.out.println("저장할 파일명 = " + jfs.getSelectedFile());
			
			if (returnValue == 0) {
				String jtext = TextArea.getText();
				System.out.println(jtext);
				// 파일저장
				try {
					File file = jfs.getSelectedFile();
					PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
					pw.println(jtext);
					pw.flush();
					pw.close();
				}	catch (Exception e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(this, "파일저장을 완료 하셨습니다.");
			}
			else {
				JOptionPane.showMessageDialog(this, "파일저장을 취소 하셨습니다.");
			}
		}
		else if (e.getSource().equals(jbtn_open)) {
//			System.out.println("열기버튼을 눌렀습니다.");
			JFileChooser jfo = new JFileChooser();
			int returnValue = jfo.showOpenDialog(this);
			System.out.println("returnValue = " + returnValue);
			System.out.println("열려는 파일명 = " + jfo.getSelectedFile());
			
			if (returnValue == 0) {
				// 파일열기
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
					JOptionPane.showMessageDialog(this, "파일열기중에 예외사항이 발생하였습니다.");
				}
				
				JOptionPane.showMessageDialog(this, "파일열기를 완료 하셨습니다.");
			}
			else {
				JOptionPane.showMessageDialog(this, "파일열기를 취소 하셨습니다.");
			}
		}
		
//		if (e.getActionCommand().equals("파일저장")) {
//			System.out.println("저장버튼을 눌렀습니다. ActionCommand");
//		}
//		else if (e.getActionCommand().equals("파일열기")) {
//			System.out.println("열기버튼을 눌렀습니다. ActionCommand");
//		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
}