import javax.swing.JOptionPane;

public class ManagerStudent
{
	public static void main(String[] args)
	{
		Student stu_ary[] = new Student[19];
		Student student = new Student();

		while(true)
		{
			String num = JOptionPane.showInputDialog
					("1�� �л������Է�\n2�� �л��������\n3�� �л���������\n4�� ���α׷� ����\n\n������ ��ȣ�� �Է����ּ���");
			
			if (Integer.parseInt(num) == 1)
			{
				String name = JOptionPane.showInputDialog("�̸��� �Է����ּ���");
				String kor = JOptionPane.showInputDialog("���� ������ �Է����ּ���");
				String math = JOptionPane.showInputDialog("���� ������ �Է����ּ���");
				String eng = JOptionPane.showInputDialog("���� ������ �Է����ּ���");
				
				student.name = name;
				student.kor = Integer.parseInt(kor);
				student.math = Integer.parseInt(math);
				student.eng = Integer.parseInt(eng);
				student.avg = (student.kor + student.math + student.eng) / 3;
			}
			else if (Integer.parseInt(num) == 2)
			{
				System.out.println("�̸� : " + student.name);
				System.out.print("�������� : " + student.kor + 
								"\t�������� : " + student.math +
								"\t�������� : " + student.eng + "\n");
				System.out.println("��� : " + student.avg);
			}
			else if (Integer.parseInt(num) == 3)
			{
				String name = JOptionPane.showInputDialog("�̸��� �Է����ּ���");
				
				student.name = name;
				student.kor = 0;
				student.math = 0;
				student.eng = 0;
				student.avg = (student.kor + student.math + student.eng) / 3;
			}
			else
			{
				System.exit(1);
			}
		}
	}
}