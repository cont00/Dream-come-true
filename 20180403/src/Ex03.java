/*
 * �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��Դϴ�.
 * ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10�� ����� ���� �� �ִٸ�,
 * 13���� �ٱ��ϰ� �ʿ��� ���̴�. (1)�� �˸��� �ڵ带 �����ÿ�.
 */
public class Ex03
{
	public static void main(String[] args)
	{
		int numOfApple = 123;
		int sizeOfbuket = 10;
		int numOfbuket = numOfApple / sizeOfbuket + 1;
		
		System.out.println("�ʿ��� �ٱ����� �� : "+ numOfbuket);
	}
}
