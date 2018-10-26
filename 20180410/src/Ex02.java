import java.util.Calendar;

public class Ex02
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		
		//	년도
		int year = cal.get(Calendar.YEAR);
		int mon = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
		
		System.out.println("년도 " + year + " 년");
		System.out.println("월 " + mon + " 월");
		System.out.println("날짜 " + date + " 일");
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(hour + " 시간");
		System.out.println(min + " 분");
		System.out.println(sec + " 초");
		
		System.out.println();
		
		cal.set(2016, 2, 10);
		
		year = cal.get(Calendar.YEAR);
		mon = cal.get(Calendar.MONTH);
		date = cal.get(Calendar.DATE);
		
		System.out.println("년도 " + year + " 년");
		System.out.println("월 " + mon + " 월");
		System.out.println("날짜 " + date + " 일");
	}
}
