/*
 * java -> Ŭ����, ��ü, �ν��Ͻ�
 */
public class Ex01
{
	public static void main(String[] args)
	{
		/*
		 * Debug mode
		 * ���ߴ� ���� break point ���� (����Ŭ��)
		 * F5 - �Լ� ������ ����
		 * F6 - �� �� ����
		 * F8 - ���� break point ���� or break point ������ ������ ����
		 */
		System.out.println("----------���α׷� ����----------");
		
		AA aa1 = new AA();
		System.out.println(aa1.a);
		aa1.doA();
		System.out.println();
		
		BB bb1 = new BB();
		System.out.println(bb1.b);
		bb1.doB();
		System.out.println();
		
		CC cc1 = new CC();
		System.out.println(cc1.c);
		cc1.doC();
		
		System.out.println("----------���α׷� ����----------");
	}
}

class AA
{
	public int a = 10; // class ����
	public void doA()
	{
		System.out.println("doA �Լ� �Դϴ�.");
	}
}
class BB
{
	public int b = 20;
	public void doB()
	{
		System.out.println("doB �Լ� �Դϴ�.");
	}
}
class CC
{
	public int c = 30;
	public void doC()
	{
		System.out.println("doC �Լ� �Դϴ�.");
	}
}