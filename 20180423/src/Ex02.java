/*
 * 1. public
 * 		-> �������� , �������� ���ٰ���
 * 2. protected
 * 		-> ����������� ���ٰ���
 * 3. default
 * 		-> �ڱ� ��Ű�� �������� ���ٰ���
 * 4. pribate
 * 		-> ��������, �ڱ��ڽŸ� ���� ����
 */
public class Ex02
{
	public static void main(String[] args)
	{
		AA aa = new AA();
		System.out.println("aa.a = " + aa.a);
//		System.out.println("aa.b = " + aa.b);
		
		BB bb = new BB();
		System.out.println("bb.b = " + bb.b);
		System.out.println("bb.c = " + bb.c);
	}
}

class AA
{
	public int a = 10;
	private int b = 20;
}