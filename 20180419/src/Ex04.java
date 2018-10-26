public class Ex04
{
	public static int a = 10;
	public int b = 20;
	public static void main(String[] args)
	{
		System.out.println(a);
		System.out.println(Ex04.a);
		
		doA();
		doB();
		
		Ex04.doA();
		Ex04.doB();
	}
	public static void doA()
	{
		System.out.println("do A");
	}
	public static void doB()
	{
		System.out.println("do B");
	}
	public void doC()
	{
		System.out.println("doC is not static");
	}
}