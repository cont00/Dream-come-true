import java.util.Calendar;

import javax.swing.JOptionPane;

public class Ex01
{
	public static void main(String[] args)
	{
		int cnt = 0;
		int year = Integer.parseInt(JOptionPane.showInputDialog("�⵵�� �Է��ϼ���"));
		int mon = Integer.parseInt(JOptionPane.showInputDialog("���� �Է��ϼ���"));
		
		System.out.println(year + "��\t" + mon + "��\t");
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, mon - 1, 1);
		
		int end_date = cal.getActualMaximum(Calendar.DATE);
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		
//		System.out.println("����� : " + yoil);
		
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		for (int i = 1; i < yoil; i++)
		{
			System.out.print("\t");
			cnt++;
		}
		
		for (int i = 1; i <= end_date; i++)
		{
			System.out.print(i + "\t");
			cnt++;
			if (cnt % 7 == 0)
			{
				System.out.println();
			}
		}
	}
}