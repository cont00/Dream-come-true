import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JButton;

public class Ex04 extends JFrame implements ActionListener {
	JButton btn_start = new JButton("���α׷����� ����");
	JButton btn_end = new JButton("���α׷����� ����");
	JProgressBar jpb = new JProgressBar();
	JLabel jlabel1 = new JLabel("���α׷����� ���� ������ �����մϴ�.");
	JLabel jlabel2 = new JLabel("���α׷����� ���� ������ �����մϴ�.");
	Thread th = null;
	boolean thread_state = true;
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("�������ϴ�.");
//		jpb.setValue(70);
		if (e.getActionCommand().equals("���α׷����� ����")) {
//			System.out.println("th = " + th);
			if( th == null || !th.isAlive() ){
				th = new Thread(new Runnable() {
					@Override
					public void run() {
						int i = 0;
						while(i<101){
							if(!thread_state){
								System.out.println("���α׷����� ����");
								break;
							}
							try{
								Thread.sleep(300);
								jpb.setValue(i);
								i = i+2;
								System.out.println("�ϳ���");
							}catch(Exception e1){
								e1.printStackTrace();
							}
						}
					}
				});
				System.out.println(th.isAlive());
				thread_state = true;
				th.start();
			}
			else {
//				System.out.println("th.isAlive() " + th.isAlive());
				JOptionPane.showMessageDialog(this, "���� ���α׷����ٰ� ����ǰ� �ֽ��ϴ�.");
			}
		}
		else {
//			th.stop();
			thread_state = false;
//			System.out.println("���α׷����� ����");
		}
	}
	// container ������Ʈ �ø��� ��
	public void makeDesign() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout(30, 30));
		
		// ���� JPanel
		JPanel jpN = new JPanel();
		jpN.setLayout(new FlowLayout());
		jpN.add(btn_start);
		jpN.add(btn_end);
		
		// �߰� ���α׷�����
		jpb.setMaximum(100);
		jpb.setMinimum(0);
		jpb.setValue(30);
		con.add(jpb, BorderLayout.CENTER);
		
		// �Ʒ� JPanel
		JPanel jpS = new JPanel();
		jpS.setLayout(new GridLayout(2, 1));
		jpS.add(jlabel1);
		jpS.add(jlabel2);
		
		con.add(jpN, BorderLayout.NORTH);
		con.add(jpS, BorderLayout.SOUTH);
	}
	// ��ư 2���� Event �ٴ� ��
	public void makeEvent() {
		btn_start.addActionListener(this);
		btn_end.addActionListener(this);
	}
	
	Ex04() {
		makeDesign();
		makeEvent();
		
		setVisible(true);
		setSize(400,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex04();
	}
}