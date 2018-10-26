public class Ex03
{
	public static void main(String[] args)
	{
		BBB bbb = new BBB();
		System.out.println(bbb.a);
//		System.out.println(bbb.b);
		System.out.println(bbb.c);
		System.out.println(bbb.d);
	}
}
	
class AAA
{
	public int a = 10;
	private int b = 20;
	int c = 30;
	protected int d = 40;
}

class BBB extends AAA
{
	BBB()
	{
		System.out.println(a);
//			System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}