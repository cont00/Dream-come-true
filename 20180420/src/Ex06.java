/*
 * ������ -> ������ �����ε�
 * 	������ �Ű������� ���� �����ڸ� ������ ������ �� �ִ�.
 * 
 * this �����
 * 	this.a -> �ڱ� �ڽ��� Ŭ���� ������ ������ �� �ִ�.
 * 	this.b
 * 
 * this() -> �⺻�����ڸ� ȣ���� �� �ִ�.
 * this(10) -> �ٸ� ������ ȣ���� �� �ִ�.
 * 
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�.
 * �޼���� : abs
 *  ��  ��   : �־��� ���� ���밪�� ��ȯ�Ѵ�.
 * ��ȯŸ�� : int
 * �Ű����� : int Value
 */
public class Ex06
{
	public int abs(int value)
	{
		return value > 0 ? value : -value;
	}
	
	Ex06()
	{
		int value = 5;
		System.out.println(value + "�� ���밪 : " + abs(value));
		value = -10;
		System.out.println(value + "�� ���밪 : " + abs(value));
	}
	
	public static void main(String[] args)
	{
		new Ex06();
	}
}