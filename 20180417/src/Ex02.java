public class Ex02
{
	public static void main(String[] args)
	{
		A a = new A();
		a.doA();
		a.doB("������");	//	javascript �Ű������� ���� �ʾƵ� ���� undefined
		int rtnValue1 = a.doC();
		int rtnValue2 = a.doD(20);
		
		System.out.println("rtnValue1 : " + rtnValue1);
		System.out.println("rtnValue2 : " + rtnValue2);
	}
}
class A
{
	public void doA()
	{
		System.out.println("doA �Լ��Դϴ�.");
	}
	public void doB(String name)	//	���� ���� ��������, ������ ���� �������� ������ �� �ʿ䰡 �ִ�.
	{
		System.out.println(name + "�� ���õ� �����ϴ±���!");
		return;	//	�Լ� ���� �� ȣ���� ������ ���ư���.
	}
	public int doC()
	{
		return 10; // �Լ� ���� �� ȣ���� ������ 10�� ������ ���ư���.
	}
	public int doD(int num)	//	���� ���� ��������, ������ ���� �������� ������ �� �ʿ䰡 �ִ�.
	{
		return num * num;	//	�Լ� ���� �� ȣ���� ������ num�� ���� ���� ������ ���ư���.
	}
}