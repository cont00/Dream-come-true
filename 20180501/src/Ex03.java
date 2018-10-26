import java.util.Vector;

public class Ex03
{
	public static void main(String[] args)
	{
		Vector<Object> vec = new Vector<>();
		
		String a = new String("¹®ÀÚ¿­");
		Integer b = new Integer(10);
		Boolean c = new Boolean(true);
		boolean d = true;
		
		vec.add(a);
		vec.add(b);
		vec.add(c);
		vec.add(d);
		
		vec.remove(a);
		
		System.out.println("vec.size() = " + vec.size());
		System.out.println("vec.get(0) = " + vec.get(0));
	}
}