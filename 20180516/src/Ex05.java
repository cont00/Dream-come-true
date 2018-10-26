import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class Ex05 extends JFrame implements ActionListener, MouseListener {

	private JButton regBtn = new JButton();
	private JButton updBtn = new JButton();
	private JButton delBtn = new JButton();
	private JButton serBtn = new JButton();
	private JButton exit_btn = new JButton();
	
	private JLabel name_label = new JLabel();
	private JLabel kor_label = new JLabel();
	private JLabel eng_label = new JLabel();
	private JLabel math_label = new JLabel();
	private JLabel gender_label = new JLabel();
	private JLabel remark_label = new JLabel();
	private JLabel menubar = new JLabel();
	
	private JTextArea remark_txt = new JTextArea();
	private JTextField name_txt = new JTextField();
	private JTextField kor_txt = new JTextField();
	private JTextField eng_txt = new JTextField();
	private JTextField math_txt = new JTextField();
	private JTextField gender_txt = new JTextField();

	private Image backgroundImage = null;
	private Image screenImage = null;
	private ImageIcon exitImage = null;
	private ImageIcon menuImage = null;

	private ImageIcon nameImage = null;
	private ImageIcon korImage = null;
	private ImageIcon engImage = null;
	private ImageIcon mathImage = null;
	private ImageIcon genderImage = null;
	private ImageIcon remarkImage = null;

	private ImageIcon regBtnImage = null;
	private ImageIcon updBtnImage = null;
	private ImageIcon delBtnImage = null;
	private ImageIcon serBtnImage = null;

	private Graphics screenGraphics = null;

	private int mouseX, mouseY;
	
	private String user = "hr";
	private String pw = "123456";
	private String url = "jdbc:oracle:thin:@192.168.0.15:1521:xe";

	String[] col_names = new String[] { "�̸�", "����", "����", "����", "����", "����" };

	private DefaultTableModel dtm = new DefaultTableModel(col_names, 0);
	private JTable jtable = new JTable(dtm);
	private JScrollPane scrollPane = new JScrollPane(jtable);

	Ex05() {
		setUndecorated(true); // ���� �׸� �����
		setBackground(new Color(0, 0, 0, 0));

		getContentPane().setLayout(null);

		setSize(582, 364);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		backgroundImage = new ImageIcon(Ex05.class.getResource("kano19.jpg")).getImage();
		exitImage = new ImageIcon(Ex05.class.getResource("exit.jpg"));
		menuImage = new ImageIcon(Ex05.class.getResource("menubar.png"));

		nameImage = new ImageIcon(Ex05.class.getResource("name.png"));
		korImage = new ImageIcon(Ex05.class.getResource("kor.png"));
		engImage = new ImageIcon(Ex05.class.getResource("eng.png"));
		mathImage = new ImageIcon(Ex05.class.getResource("math.png"));
		genderImage = new ImageIcon(Ex05.class.getResource("gender.png"));
		remarkImage = new ImageIcon(Ex05.class.getResource("remark.png"));

		regBtnImage = new ImageIcon(Ex05.class.getResource("insert.png"));
		updBtnImage = new ImageIcon(Ex05.class.getResource("update.png"));
		delBtnImage = new ImageIcon(Ex05.class.getResource("delete.png"));
		serBtnImage = new ImageIcon(Ex05.class.getResource("search.png"));

		name_txt.setBounds(65, 41, 92, 23);
		getContentPane().add(name_txt);
		name_txt.setColumns(10);

		name_label.setBounds(12, 40, 50, 19);
		name_label.setIcon(nameImage);
		getContentPane().add(name_label);

		kor_label.setBounds(12, 76, 50, 19);
		kor_label.setIcon(korImage);
		getContentPane().add(kor_label);

		kor_txt.setColumns(10);
		kor_txt.setBounds(65, 74, 92, 23);
		getContentPane().add(kor_txt);

		eng_label.setBounds(12, 109, 50, 19);
		eng_label.setIcon(engImage);
		getContentPane().add(eng_label);

		eng_txt.setColumns(10);
		eng_txt.setBounds(65, 107, 92, 23);
		getContentPane().add(eng_txt);

		math_label.setBounds(12, 142, 50, 19);
		math_label.setIcon(mathImage);
		getContentPane().add(math_label);

		math_txt.setColumns(10);
		math_txt.setBounds(65, 140, 92, 23);
		getContentPane().add(math_txt);

		gender_label.setBounds(12, 175, 50, 19);
		gender_label.setIcon(genderImage);
		getContentPane().add(gender_label);

		gender_txt.setColumns(10);
		gender_txt.setBounds(65, 173, 92, 23);
		getContentPane().add(gender_txt);

		remark_label.setBounds(12, 211, 50, 19);
		remark_label.setIcon(remarkImage);
		getContentPane().add(remark_label);

		remark_txt.setBounds(65, 209, 92, 103);
		getContentPane().add(remark_txt);

		
		exit_btn.setBounds(543, 0, 39, 33);
		exit_btn.setIcon(exitImage); // ���� ��ư �̹���
		exit_btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		getContentPane().add(exit_btn);
		
		menubar.setIcon(menuImage); // �޴��� �̹���
		menubar.setBounds(0, 0, 544, 32);
		getContentPane().add(menubar);

		updBtn.setBounds(154, 340, 132, 23);
		updBtn.setIcon(updBtnImage);
		getContentPane().add(updBtn);

		delBtn.setBounds(294, 340, 132, 23);
		delBtn.setIcon(delBtnImage);
		getContentPane().add(delBtn);

		serBtn.setBounds(438, 340, 132, 23);
		serBtn.setIcon(serBtnImage);
		getContentPane().add(serBtn);

		regBtn.setBounds(12, 340, 132, 23);
		regBtn.setIcon(regBtnImage);
		getContentPane().add(regBtn);
		
		scrollPane.setBounds(169, 41, 401, 271);
		getContentPane().add(scrollPane);
		
		regBtn.addActionListener(this);
		updBtn.addActionListener(this);
		delBtn.addActionListener(this);
		serBtn.addActionListener(this);
		
		jtable.addMouseListener(this);

		menubar.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		});
		menubar.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - mouseX, y - mouseY);
			}
		});
	}
	@Override
	public void paint(Graphics g) {
		screenImage = createImage(582, 364);
		screenGraphics = screenImage.getGraphics();
		screenDraw(screenGraphics);
		g.drawImage(screenImage, 0, 0, null);
	}
	public void screenDraw(Graphics g) {
		g.drawImage(backgroundImage, 0, 0, null);
		paintComponents(g);
		this.repaint();
		try {
			Thread.sleep(5);
		} catch (Exception e) {
		}
	}
	/*
	 * textField �̸� textField_1 ���� textField_2 ���� textField_3 ���� textField_4 ����
	 * textArea ���
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// ��Ϲ�ư �θ�
		if (e.getSource().equals(regBtn)) {
			doInsert();
			doSelect();
		}
		else if (e.getSource().equals(serBtn)) {
			doSelect();
		}
		else if (e.getSource().equals(updBtn)) {
			doUpdate();
			doSelect();
		}
		else if (e.getSource().equals(delBtn)) {
			doDelete();
			doSelect();
		}
	}
	public void doInsert(){
		Student stu = new Student();
		stu.setName(name_txt.getText());
		stu.setKor(Integer.parseInt(kor_txt.getText()));
		stu.setEng(Integer.parseInt(eng_txt.getText()));
		stu.setMath(Integer.parseInt(math_txt.getText()));
		stu.setGender(gender_txt.getText());
		stu.setRemark(remark_txt.getText());
//		System.out.println(stu.toString());

		// DB���� ��ü
		Connection conn = null;
		// sql ���� ��Ÿ���� ��ü
		PreparedStatement pstmt = null;

		try {
			String insertSQL = 
			"INSERT INTO STUDENT_INFO "+
			" (STU_INDEX,NAME,KOR,ENG,MATH,GENDER,REMARK) "+
			" VALUES "+
			" (STUDENT_INFO_KEY.NEXTVAL,?,?,?,?,?,?)";
			// class ���� �߰� Ȯ��
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
			pstmt = conn.prepareStatement(insertSQL);
			pstmt.setString(1, stu.getName());
			pstmt.setInt(2, stu.getKor());
			pstmt.setInt(3, stu.getEng());
			pstmt.setInt(4, stu.getMath());
			pstmt.setString(5, stu.getGender());
			pstmt.setString(6, stu.getRemark());
			pstmt.executeUpdate();
			// System.out.println("DB ���Ἲ��");
			JOptionPane.showMessageDialog(this, "�л��� ��ϵǾ����ϴ�.");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					pstmt.close();
					conn.close();
				} catch (Exception e11) {
					e11.printStackTrace();
				}
			}
		}
	}
	public void doSelect() {
//		System.out.println("��ȸ��ư ����");
		dtm.setRowCount(0);

		Connection conn = null; // DB�� �����ϴ� ��ü
		PreparedStatement pstmt = null; // SQL �� �����ϴ� ��ü
		ResultSet rs = null; // ��ȸ�� ���̺� ���� ������ �ִ� ��ü
		// DB ������ �õ��մϴ�...
		try {
			/*
			 * Insert Update Delete -> EsxecuteUpdate();
			 * Select -> ExecuteQuery();
			 */
			conn = DriverManager.getConnection(url, user, pw);
			pstmt = conn.prepareStatement("SELECT * FROM STUDENT_INFO ORDER BY STU_INDEX ASC");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String[] stu_ary = new String[7];
				stu_ary[0] = rs.getString("STU_INDEX");
				stu_ary[1] = rs.getString("NAME");
				stu_ary[2] = String.valueOf(rs.getInt("KOR"));
				stu_ary[3] = String.valueOf(rs.getInt("ENG"));
				stu_ary[4] = String.valueOf(rs.getInt("MATH"));
				stu_ary[5] = rs.getString("GENDER");
				stu_ary[6] = rs.getString("REMARK");
				dtm.addRow(stu_ary);
			}
		}
		// DB ������ ��ġ ���� ������ ���� �ϸ� ���ܷ� �����ϴ�.
		catch (Exception e1) {
			e1.printStackTrace();
		}
		// DB ����� ��ȸ�� �Ϸ�Ǹ� DB ������ ������ �̴ϴ�.
		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		}
	}
	public void doUpdate(){
//		System.out.println("����");
//		 DB ���� ���� �ؾߵ�
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try{
			conn = DriverManager.getConnection(url, user, pw);
			pstmt = conn.prepareStatement(
					    " UPDATE STUDENT_INFO "+
						" SET NAME=?, KOR =? , ENG=?, MATH=?, "+ 
						" 	     GENDER=? , REMARK=? "+
						" 	WHERE STU_INDEX=? ");
			pstmt.setString(1, name_txt.getText());
			pstmt.setInt(2, Integer.parseInt(kor_txt.getText()));
			pstmt.setInt(3, Integer.parseInt(eng_txt.getText()));
			pstmt.setInt(4, Integer.parseInt(math_txt.getText()));
			pstmt.setString(5, gender_txt.getText());
			pstmt.setString(6, remark_txt.getText());
			pstmt.setInt(7, Integer.parseInt(
				(String) jtable.getValueAt(jtable.getSelectedRow(), 0) 
			)  );
//			System.out.println("������");
			pstmt.executeUpdate();	// insert update delete
									// select executeQuery();
//			System.out.println("������");
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(this, "���ڷ� ����ȯ");
		}catch(Exception e){
			
		}finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void doDelete() {
//		System.out.println("����");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(url, user, pw);
			pstmt = con.prepareStatement("DELETE STUDENT_INFO " + "WHERE STU_INDEX = ?");
			pstmt.setInt(1, Integer.parseInt( (String) jtable.getValueAt(jtable.getSelectedRow(), 0)));
			pstmt.executeUpdate();
			JOptionPane.showMessageDialog(this, "�л��� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				con.close();
			} catch (Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		new Ex05();
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {
//		System.out.println("�������ϴ�.");
//		System.out.println("�� : " + jtable.getSelectedRow());
//		System.out.println("�� : " + jtable.getSelectedColumn());
//		System.out.println("�࿭ �� : " +
//				jtable.getValueAt(jtable.getSelectedRow(), jtable.getSelectedColumn()) );
		int select_row = jtable.getSelectedRow();
		name_txt.setText( (String) jtable.getValueAt(select_row, 1));
		kor_txt.setText( (String) jtable.getValueAt(select_row, 2));
		eng_txt.setText( (String) jtable.getValueAt(select_row, 3));
		math_txt.setText( (String) jtable.getValueAt(select_row, 4));
		gender_txt.setText( (String) jtable.getValueAt(select_row, 5));
		remark_txt.setText( (String) jtable.getValueAt(select_row, 6));
	}
	@Override
	public void mouseReleased(MouseEvent e) {}
}