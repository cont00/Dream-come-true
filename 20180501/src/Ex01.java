class Parent
{
	public int a = 10;
}

class ChildA extends Parent
{
	public int b = 20;
}

class ChildB extends Parent
{
	public int c = 30;
}

public class Ex01
{
	public static void main(String[] args)
	{
		Parent ch1 = new ChildA();
		Parent ch2 = new ChildB();
		
		System.out.println("ch1.a : " + ch1.a);
//		System.out.println("ch1.b : " + ch1.b);
		System.out.println("((ChildA)ch1).b : " + ((ChildA)ch1).b);
		
		System.out.println("ch2.a : " + ch2.a);
//		System.out.println("ch2.c : " + ch2.c);
//		System.out.println("((ChildB)ch2).c : " + ((ChildB)ch2).c);
		
		if (ch2 instanceof ChildA)
		{
			System.out.println("((ChildA)ch2).b : " + ((ChildA)ch2).b);
		}
		else if (ch2 instanceof ChildB)
		{
			System.out.println("((ChildB)ch2).c : " + ((ChildB)ch2).c);
		}
	}
}