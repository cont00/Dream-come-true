/*
 * Ŭ���� ������
 * 		-> new ��� ����� heap ������ �޸𸮸� �Ҵ� �� �� ȣ��Ǵ� �Լ�
 * 		-> Ŭ�������̶� �����ؾ� �ϸ�, ��ȯ���� ���� �Լ� ����
 * 		
 */
public class Ex01
{
	public static void main(String[] args)
	{
		Ex02 ex02 = new Ex02();
		System.out.println(ex02.a);
		ex02.doA();
		
		Ex02 ex02_a = new Ex02(30);
		System.out.println(ex02_a.a);
		
		Ex02 ex02_b = new Ex02(10,20);
		System.out.println(ex02_b.a);
	}
}