public class Ex07
{
	public int a = 10;
	// void �Է� �� �����ڰ� �ƴ϶� �޼��尡 �ȴ�.
	Ex07(int temp)	// class ���̶� �����ϸ鼭 ��ȯ ���� ���°� �������Դϴ�. (��ȯ �� : void int String float double)
	{
		System.out.println("������ �Դϴ�.");
		a = temp;
	}
	public static void main(String[] args)
	{
//		Ex07 ex07 = new Ex07();	//	�޸𸮻� �ø��� �� (�ν��Ͻ�ȭ = ��üȭ)
		new Ex07(30); // �޸� �ʱ�ȭ
	}
}