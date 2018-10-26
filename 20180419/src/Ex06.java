/*
 * method overloading
 */
public class Ex06
{
	public static void doA()
	{
		System.out.println("do A");
	}
	public static void doA(int a)
	{
		System.out.println("do A int a");
	}
	public static void doA(int a, int b)
	{
		System.out.println("do A int a, int b");
	}
	
	public static void main(String[] args)
	{
		doA();
		doA(10);
		doA(10,20);
	}
}