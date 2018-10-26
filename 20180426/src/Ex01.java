class A
{
	public int a = 10;
	public int b = 20;
	A()
	{
		this(30);
		System.out.println("A class 기본생성자");
	}
	A(int a)
	{
		this.a = a;
		System.out.println("A class int a 생성자");
	}
}
class B extends A
{
	public int a = 50;
	public int b = 60;
	B()
	{
		System.out.println("B class 기본생성자");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("super.a = " + super.a);
		System.out.println("this.b = " + this.a);
		System.out.println("super.b = " + super.b);
	}
}
public class Ex01
{
	public static void main(String[] args)
	{
		new B();
	}
}