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
	JButton btn_start = new JButton("프로그레스바 시작");
	JButton btn_end = new JButton("프로그레스바 종료");
	JProgressBar jpb = new JProgressBar();
	JLabel jlabel1 = new JLabel("프로그레스바 시작 누르면 동작합니다.");
	JLabel jlabel2 = new JLabel("프로그레스바 종료 누르면 종료합니다.");
	Thread th = null;
	boolean thread_state = true;
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("눌렀습니다.");
//		jpb.setValue(70);
		if (e.getActionCommand().equals("프로그레스바 시작")) {
//			System.out.println("th = " + th);
			if( th == null || !th.isAlive() ){
				th = new Thread(new Runnable() {
					@Override
					public void run() {
						int i = 0;
						while(i<101){
							if(!thread_state){
								System.out.println("프로그래스바 종료");
								break;
							}
							try{
								Thread.sleep(300);
								jpb.setValue(i);
								i = i+2;
								System.out.println("하나씩");
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
				JOptionPane.showMessageDialog(this, "아직 프로그레스바가 진행되고 있습니다.");
			}
		}
		else {
//			th.stop();
			thread_state = false;
//			System.out.println("프로그레스바 종료");
		}
	}
	// container 컴포넌트 올리는 것
	public void makeDesign() {
		Container con = getContentPane();
		con.setLayout(new BorderLayout(30, 30));
		
		// 위쪽 JPanel
		JPanel jpN = new JPanel();
		jpN.setLayout(new FlowLayout());
		jpN.add(btn_start);
		jpN.add(btn_end);
		
		// 중간 프로그레스바
		jpb.setMaximum(100);
		jpb.setMinimum(0);
		jpb.setValue(30);
		con.add(jpb, BorderLayout.CENTER);
		
		// 아래 JPanel
		JPanel jpS = new JPanel();
		jpS.setLayout(new GridLayout(2, 1));
		jpS.add(jlabel1);
		jpS.add(jlabel2);
		
		con.add(jpN, BorderLayout.NORTH);
		con.add(jpS, BorderLayout.SOUTH);
	}
	// 버튼 2개에 Event 다는 것
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