/*
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * 
 * �޼���� : isNumber
 * ��� : �־��� ���ڿ��� ��� ���ڷθ� �̷�����ִ��� Ȯ���Ѵ�.
 * 	��� ���ڷθ� �̷���� ������ true�� ��ȯ�ϰ�,
 * �׷��� ������ false�� ��ȯ�Ѵ�.
 * ���� �־��� ���ڿ��� null�̰ų� ���ڿ�""�̶�� false�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : boolean
 * �Ű����� : String str - �˻��� ���ڿ�
 */

public class Ex05
{
	public static void main(String[] args)
	{
		Number isNumber = new Number();
		
		String str1 = "12345";
		System.out.println("str �� ���� �Դϱ�? " + isNumber(str1));
		
		String str2 = "dream come true";
		System.out.println("str �� ���� �Դϱ�? " + isNumber(str2));
		
		
		if (Integer.parseInt(str1) == ����)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}	
	}
}

class Number
{
	
}