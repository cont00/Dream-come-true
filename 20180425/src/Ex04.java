class AA
{
	public int a = 10;
	public int b = 20;
}
class BB extends AA
{
	public int a = 30;
	public int b = 40;
	
	BB()
	{
		System.out.println("a = " + a);	//	this �����Ǿ� ����
		System.out.println("b = " + b);	//	this �����Ǿ� ����
		System.out.println("a = " + super.a);
		System.out.println("b = " + super.b);
	}
}
public class Ex04
{
	public static void main(String[] args)
	{
		new BB();
	}
}