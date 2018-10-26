/*
 * this
 * 	-> �ڱ��ڽ� Ŭ����
 * 	this.������ Ŭ�������� ����
 * 	this(); �ڱ��ڽ� Ŭ���� ������ ȣ��
 * 	ĸ��ȭ -> private ��������������
 * 	setter, getter ������ Ŭ�������� �ʱ�ȭ
 * 
 * super -> extends Ŭ������
 * 	-> �θ�Ŭ����
 * 	super.������ �θ�Ŭ���� ������ ����
 * 	super(); �θ�Ŭ���� ������ ȣ��
 * 	�������̵� -> ����, �޼��带 ������ �Ѵ�.
 * 		-> toString �޼��带 ������ �Ѵ�.
 */

class A
{
//	protected int a = 10;
	private int a = 10;
	
	public int b = 20;
	
	protected void doA()
//	private void doA()
	{
		System.out.println("doA �޼��� �Դϴ�.");
	}
	public void doB()
	{
		System.out.println("doB �޼��� �Դϴ�.");
	}
}
// Ex01�� �θ�Ŭ������ A Ŭ�����̴�.
public class Ex01 extends A
{
	// ��ӹ��� ������ �޼����� ������ ������ �ߴ�. (Override, Overriding)
	private int b = 30;
	protected void doA()
	{
		System.out.println("Ex01 doA �޼��� �Դϴ�.");
	}
	Ex01()
	{
//		System.out.println(super.a);
		System.out.println(this.b);
		System.out.println(super.b);
		this.doA();
		super.doA();
		doB();
	}
	public static void main(String[] args)
	{
		new Ex01();
	}
}