public class Ex02
{
	private int a;
	Ex02()
	{
		this("Arisia");	//	�ٸ������� ������ ���� ù ��° �� �� �ܿ��� Error
		this.a = 30;
	}
	Ex02(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args)
	{
		Ex02 ex02 = new Ex02();
		
		System.out.println("ex02.a = " + ex02.a);
	}
}