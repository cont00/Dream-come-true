import javax.swing.JOptionPane;
import com.cont00.org.Student;

public class ManagerStudent
{
	public static void main(String[] args)
	{
		Student[] student = new Student[20];
		for (int i = 1; i < student.length; i++)
		{
			student[i] = new Student();
		}
		
		int cnt = 1;
		while(true)
		{
			String num = JOptionPane.showInputDialog
					("1�� �л������Է�\n2�� �л��������\n3�� �л���������\n"
							+ "4�� �л���������\n5�� ���α׷� ����\n\n������ ��ȣ�� �Է����ּ���");
			
			if (Integer.parseInt(num) == 1)
			{
				String name = JOptionPane.showInputDialog("�̸��� �Է����ּ���");
				String kor = JOptionPane.showInputDialog("������� �Է����ּ���");
				String math = JOptionPane.showInputDialog("���м����� �Է����ּ���");
				String eng = JOptionPane.showInputDialog("������� �Է����ּ���");
				
				student[cnt].name = name;
				student[cnt].kor = Integer.parseInt(kor);
				student[cnt].math = Integer.parseInt(math);
				student[cnt].eng = Integer.parseInt(eng);
				student[cnt].avg = (student[cnt].kor + student[cnt].math + student[cnt].eng) / 3;
				cnt++;
			}
			else if (Integer.parseInt(num) == 2)
			{
				for (int i = 1; i < student.length; i++)
				{
					System.out.print(i + "��° " + "�л��̸� : " + student[i].name + "  ");
					System.out.print("�������� : " + student[i].kor + "  ");
					System.out.print("�������� : " + student[i].math + "  ");
					System.out.print("�������� : " + student[i].eng + "  ");
					System.out.print("��� : " + student[i].avg + "\n");
				}
			}
			else if (Integer.parseInt(num) == 3)
			{
				String attendance = JOptionPane.showInputDialog("�����ؾ� �� �л��� ��ȣ�� �Է����ּ���");
				String name = JOptionPane.showInputDialog("�����ؾ� �� �л��� �̸��� �Է����ּ���");
				String kor = JOptionPane.showInputDialog("�����ؾ� �� ������� �Է����ּ���");
				String math = JOptionPane.showInputDialog("�����ؾ� �� ���м����� �Է����ּ���");
				String eng = JOptionPane.showInputDialog("�����ؾ� �� ������� �Է����ּ���");
				
				int num1 = Integer.parseInt(attendance);
				
				for (int i = 1; i < student.length; i++)
				{
					student[num1].name = name;
					student[num1].kor = Integer.parseInt(kor);
					student[num1].math = Integer.parseInt(math);
					student[num1].eng = Integer.parseInt(eng);
					student[num1].avg = 
							(student[num1].kor + student[num1].math + student[num1].eng) / 3;
				}
			}
			else if (Integer.parseInt(num) == 4)
			{
				String name = JOptionPane.showInputDialog("���������� �ؾ� �� �л��� �⼮��ȣ�� �Է����ּ���");
				int num1 = Integer.parseInt(name);
				
				for (int i = 1; i < student.length; i++)
				{
					if (i == num1)
					student[num1].name = null;
					student[num1].kor = 0;
					student[num1].math = 0;
					student[num1].eng = 0;
					student[num1].avg =
							(student[num1].kor + student[num1].math + student[num1].eng) / 3;
				}
			}
			else
			{
				System.exit(1);
			}
		}
	}
}