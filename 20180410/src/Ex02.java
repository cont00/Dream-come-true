import java.util.Calendar;

public class Ex02
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		
		//	�⵵
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		System.out.println("�⵵ " + year + " ��");
		System.out.println("�� " + mon + " ��");
		System.out.println("��¥ " + date + " ��");
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(hour + " �ð�");
		System.out.println(min + " ��");
		System.out.println(sec + " ��");
		
		System.out.println();
		
		cal.set(2016, 2, 10);
		
		year = cal.get(Calendar.YEAR);
		mon = cal.get(Calendar.MONTH);
		date = cal.get(Calendar.DATE);
		
		System.out.println("�⵵ " + year + " ��");
		System.out.println("�� " + mon + " ��");
		System.out.println("��¥ " + date + " ��");
	}
}
