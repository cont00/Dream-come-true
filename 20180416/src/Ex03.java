/*
 * static
 * ���α׷� ���� �� �޸𸮿� ���� �÷�����, ���α׷� ���� �� �޸𸮿��� ����
 * �����ϴ� ��������
 */
public class Ex03
{
	public static void main(String[] args)
	{
		AAA a1 = new AAA();
		a1.doUp();
		System.out.println("a1.a : " + a1.a);
		System.out.println("a1.MAX : " + a1.MAX);
		
		AAA a2 = new AAA();
		a2.doUp();
		System.out.println("a2.a : " + a2.a);
		System.out.println("a2.MAX : " + a2.MAX);
		
		AAA a3 = new AAA();
		a3.doUp();
		System.out.println("a3.a : " + a3.a);
		System.out.println("a3.MAX : " + a3.MAX);
		
//		System.out.println("AAA.a : " + AAA.a);
		System.out.println("AAA.MAX : " + AAA.MAX);
	}
}
class AAA
{
	public int a = 10;
	public static int MAX = 10;
	public void doUp()
	{
		a++;
		MAX++;
	}
}