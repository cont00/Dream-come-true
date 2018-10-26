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
		System.out.println("A 클래스 doA 메서드입니다.");
	}
}
class B extends A
{
	public int a = 30;
	public int b = 20;
	public void doA()
	{
		System.out.println("B 클래스 안의 A 클래스 doA 메서드입니다.");
	}
	public void doB()
	{
		System.out.println("B 클래스 doB 메서드입니다.");
	}
	@Override
	public String toString()
	{
		return "B [a = " + a + ", b = " + b + "]";
	}
//	@Override
//	public String toString()
//	{
//		return "B 클래스 타입이고 변수 a와 b 가 있고 doA와 doB 함수가 있다.";
//	}
}