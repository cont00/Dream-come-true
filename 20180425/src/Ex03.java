/*
 * ������ ȣ���� �Ͼ�� �޸𸮿� �� Ŭ���� ũ�� �Ҵ�
 * class ��ü ����� ������ : �޸��� ���� ������ �߻�
 * super ����� : ������ �ִ� �����ڸ� ȣ�� 
 */
class AAA
{
	AAA()
	{
		System.out.println("super ������ ȣ���� �����Ǿ��� �ִ�.");
		System.out.println("AAA ������");
	}
	AAA(int a)
	{
		System.out.println("AAA ���� ������ int a");
	}
}
class BBB extends AAA
{
	BBB()
	{
		super();
		System.out.println("BBB ������");
	}
	BBB(int a)
	{
		super(a);
		System.out.println("a = " + a);
	}
}
public class Ex03
{
	public static void main(String[] args)
	{
//		new BBB();
		new BBB(20);
	}
}