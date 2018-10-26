import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ex01 extends JFrame {
	private JButton jbtn_add = new JButton("���߰�");
	private JButton jbtn_remove = new JButton("�����");
	private DefaultTableModel dtm;
	private JTable jta;
	private String[] alhpa = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};
	
	public void makeEvent() {
		jbtn_add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("add ��ư�� �������ϴ�.");
				String[] value = new String[] {
						alhpa[ (int)(Math.random() * 8) ],
						alhpa[ (int)(Math.random() * 8) ],
						alhpa[ (int)(Math.random() * 8) ]
				};
				dtm.addRow(value);
			}
		});
		jbtn_remove.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("remove ��ư�� �������ϴ�.");
				try {
					int select_row = jta.getSelectedRow();
					dtm.removeRow(select_row);
				}	catch (Exception e) {
					JOptionPane.showMessageDialog(null, "������ ���� �����ϴ�.");
				}
			}
		});
	}
	Ex01() {
		makeEvent();
		String[] str = new String[] {"�̸�", "����", "����"};
		dtm = new DefaultTableModel(str, 0);
		
		getContentPane().setLayout(null);
		
		jta = new JTable(dtm);
		
		JScrollPane jsp = new JScrollPane(jta);
		jsp.setBounds(0, 0, 300, 250);
		
		jbtn_add.setBounds(0, 270, 90, 30);
		jbtn_remove.setBounds(100, 270, 90, 30);
		
		getContentPane().add(jsp);
		getContentPane().add(jbtn_add);
		getContentPane().add(jbtn_remove);
		
		setSize(320, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex01();
	}
}