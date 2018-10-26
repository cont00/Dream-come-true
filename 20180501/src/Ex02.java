class Car
{
	public String name = "자동차";
	public void doDrive()
	{
		System.out.println(this.name + " 잘 달림");
	}
}

class Sonata extends Car
{
	public String name = "소나타 자동차";
	public void doDrive()
	{
		System.out.println(this.name + " 더 잘 달림");
	}
}

class K5 extends Car
{
	public String name = "K5 자동차";
	@Override
	public void doDrive()
	{
		super.doDrive();
		System.out.println(this.name + " 더욱 잘 달림");
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