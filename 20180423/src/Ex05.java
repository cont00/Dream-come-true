import com.khn.org.Time;

public class Ex05
{
	public static void main(String[] args)
	{
		Time t1 = new Time();
		
		t1.setHour(60);
		t1.setMin(100);
		t1.setSecond(100);
		
		System.out.println("t1. getHour : " + t1.getHour());
		System.out.println("t1. getMin : " + t1.getMin());
		System.out.println("t1. getSecond : " + t1.getSecond());
	}
}