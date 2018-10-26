public class Ex01
{
	public static void main(String[] args)
	{
		B b = new B();
		System.out.println(b.a);
		b.doA();
		b.doB();
		
		A a = new A();
		System.out.println(a.a);
		a.doA();
		
		System.out.println("b.toString() = " + b.toString());
		System.out.println("b = " + b);
	}
}

class A extends Object
{
	public int a = 10;
	public void doA()
	{
		System.out.println("A Ŭ���� doA �޼����Դϴ�.");
	}
}
class B extends A
{
	public int a = 30;
	public int b = 20;
	public void doA()
	{
		System.out.println("B Ŭ���� ���� A Ŭ���� doA �޼����Դϴ�.");
	}
	public void doB()
	{
		System.out.println("B Ŭ���� doB �޼����Դϴ�.");
	}
	@Override
	public String toString()
	{
		return "B [a = " + a + ", b = " + b + "]";
	}
//	@Override
//	public String toString()
//	{
//		return "B Ŭ���� Ÿ���̰� ���� a�� b �� �ְ� doA�� doB �Լ��� �ִ�.";
//	}
}