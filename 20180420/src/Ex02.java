public class Ex02
{
	public int a = 10;
	
	Ex02()
	{
		System.out.println("Ex02 ������");
	}
	Ex02(int a)
	{
		this.a = a;
		System.out.println("Ex02 int a ������");
	}
	Ex02(int a, int b)
	{
		System.out.println("Ex02 int a, int b ������");
	}
	
	public void doA()
	{
		System.out.println("doA");
	}
	
}