import java.util.Calendar;

import javax.swing.JOptionPane;

public class Ex01
{
	public static void main(String[] args)
	{
		int cnt = 0;
		int year = Integer.parseInt(JOptionPane.showInputDialog("년도를 입력하세요"));
		int mon = Integer.parseInt(JOptionPane.showInputDialog("월을 입력하세요"));
		
		System.out.println(year + "년\t" + mon + "월\t");
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, mon - 1, 1);
		
		int end_date = cal.getActualMaximum(Calendar.DATE);
		int yoil = cal.get(Calendar.DAY_OF_WEEK);
		
//		System.out.println("목요일 : " + yoil);
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
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