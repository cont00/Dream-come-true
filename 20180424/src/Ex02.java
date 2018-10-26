public class Ex02
{
	public static void main(String[] args)
	{
		BB bb = new BB();
		System.out.println(bb.a);
		bb.doA();
		
		CC cc = new CC();
		System.out.println(cc.a);
		cc.doB();
		
		Object obj = new Object();
		System.out.println("obj = " + obj);
		System.out.println("obj.toString() = " + obj.toString());
		
		Object obj1 = new Object();
		System.out.println("obj1 = " + obj1);
		System.out.println("obj1.toString() = " + obj1.toString());
		
		if(obj.equals(obj1))
		{
			System.out.println("같다");
		}
		else
		{
			System.out.println("다르다");
		}
	}
}

class AA
{
	public int a;
	public void doA()
	{
		System.out.println("doA method");
	}
}

class BB extends AA
{
	public int b;
	public void doB()
	{
		System.out.println("doB method");
	}
}

class CC extends BB
{
	
}