public class Ex03
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5};
		AAA aa = new AAA();
		BBB bb = new BBB();
		
		bb.doA(aa);
		
		System.out.println("aa.a = " + aa.a);
		System.out.println("aa.b = " + aa.b);
		bb.doB(a);
		System.out.println("a[0] = " + a[0]);
		int b = 20;
		bb.doC(b);
		System.out.println("b = " + b);
	}
}
class AAA
{
	public int a = 10;
	public int b = 20;
}
class BBB
{
	public void doA(AAA object)
	{
		object.a = 30;
		System.out.println("objcet.a = " + object.a);
	}
	public void doB(int a[])
	{
		a[0] = 3;
		System.out.println("a[0] = " + a[0]);
	}
	public void doC(int temp)
	{
		temp = 30;
		System.out.println("doC 함수 내에서 temp = " + temp);
	}
}