/*
 * public -> ��� ������ ���� ����
 * protected -> ��ӵ� ������ ���� ����
 * default -> ���� ��Ű������ ���� ����
 * private -> �ڱ� �ڽ� Ŭ������ ���� ����
 * 
 * private���� ����Ǿ��� ������ �ʱ�ȭ �� ��
 * 	�����
 * 		-	������ �Լ����� this.������ = ���������� �ʱ�ȭ �� �� �ִ�.
 * 		-	getter setter ������� private ������ �ʱ�ȭ �� �� �ִ�.
 * 
 * ����
 * �޼���
 * 	public private default protected �� ����� �� �ִ�.
 */

public class Ex06
{
	public static void main(String[] args)
	{
		AAA aaa = new AAA();
		
		aaa.doA();
//		aaa.doB();
		aaa.doC();
		aaa.doD();
	}
}

class AAA
{
	public void doA()
	{
		System.out.println("doA");
	}
	
	private void doB()
	{
		System.out.println("doB");
	}
	
	void doC()
	{
		System.out.println("doC");
	}
	
	protected void doD()
	{
		System.out.println("doD");
	}
}