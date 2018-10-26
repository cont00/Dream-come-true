public class Ex04
{
	public static void main(String[] args)
	{
		B b = new B();
		
		System.out.println(b.a);
		b.doA();
	}
}
class A
{
	public int a = 10;
	public void doA()
	{
		System.out.println("class A의 doA 입니다.");
	}
}

class B extends A
{
	public int a = 20;
	public void doA()
	{
		System.out.println("class B의 doA 입니다");
	}
}