/*
 * �������� ���� �� �ְ�, static �޼��忡�� ���� �� �ִ�.
 * �����Ǵ� ���������� ���α׷� ���� �� �޸� �Ҵ�ǰ�, ���α׷� ���� �� �Ҵ� �� �޸𸮰� �����ȴ�.
 * 
 * �޼��带 ���� �Ű������� ������
 * �⺻�� Ÿ�� char int double float ���� ���簡 �Ͼ��,
 * ������ Ÿ�� String ��ü �迭 �ּҿ� ���� ���簡 �Ͼ��.
 * 
 * new ��� ����� ��ü�� �޸𸮿� �Ҵ�
 * 	JVM �ڵ����� ���������� null
 * 	�����ϰ� ������ �޸𸮿��� �ڵ����� ����
 * 
 * �޼��� �����ε�
 * 
 * ������
 */
public class Ex03
{
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.a);
		a.doA();
		
		System.out.println(A.a);
		A.doA();
	}
}

class A
{
	public static int a = 10;
	public static void doA()
	{
		System.out.println("This is a doA method");
	}
}