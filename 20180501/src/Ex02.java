class Car
{
	public String name = "�ڵ���";
	public void doDrive()
	{
		System.out.println(this.name + " �� �޸�");
	}
}

class Sonata extends Car
{
	public String name = "�ҳ�Ÿ �ڵ���";
	public void doDrive()
	{
		System.out.println(this.name + " �� �� �޸�");
	}
}

class K5 extends Car
{
	public String name = "K5 �ڵ���";
	@Override
	public void doDrive()
	{
		super.doDrive();
		System.out.println(this.name + " ���� �� �޸�");
	}
	@Override
	public String toString()
	{
		return super.toString();
	}
}

public class Ex02
{
	public static void main(String[] args)
	{
		Car[] cars = new Car[100];
		cars[0] = new Sonata();
		cars[1] = new K5();
		cars[2] = new Sonata();
		
		for (int i = 0; i < cars.length; i++)
		{
			if (cars[i] instanceof Sonata)
			{
				((Sonata)cars[i]).doDrive();
			}
			else if (cars[i] instanceof K5)
			{
				((K5)cars[i]).doDrive();
			}
		}
	}
}