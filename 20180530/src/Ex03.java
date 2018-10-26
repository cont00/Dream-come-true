import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JTextArea;

/*
 * http://www.lotto.com/alksjdcnlqk/340
 *  
 * http://www.naver.com
 * <html>
 * 	<head>
 * qweqweqwe
 *  </head>
 *  <body>
 *  qweqweqwe
 *  </body>
 * </html>
 */
public class Ex03 extends JFrame implements ActionListener{
	private JTextField urlField;
	private JButton reqBtn = new JButton("요청");
	private JTextArea resultArea = new JTextArea();
	
	Ex03(){
		getContentPane().setLayout(null);	// absolute layout
		
		urlField = new JTextField();
		urlField.setBounds(12, 10, 319, 21);
		getContentPane().add(urlField);
		
		reqBtn.setBounds(343, 10, 79, 21);
		getContentPane().add(reqBtn);
		reqBtn.addActionListener(this);
		
		resultArea.setBounds(12, 41, 410, 211);
		getContentPane().add(resultArea);
		
		setSize(450,330);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("되는지 확인");
		String result = "";
		try{
			String ip = urlField.getText();
			URL url = new URL(ip);
			URLConnection uc = url.openConnection();
			uc.setDoInput(true); // http get post get설정
	InputStreamReader isr = new InputStreamReader(uc.getInputStream());
	BufferedReader br = new BufferedReader(isr, 512);
	while(true){
		String line = br.readLine();
		if(line ==null || line.isEmpty())
			break;
		result = result +"\n"+ line;
	}
	resultArea.setText(result);
		}catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}







