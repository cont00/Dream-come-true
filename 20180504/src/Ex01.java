/*
 * java
 * 	abstract class	-	�߻����� Ŭ���� ��� �߻�޼��� ������
 * 	interface ����	-	�� �߻����̰� ����, ���߻��
 * 
 * jframe �׸�	-	��ӹ޾Ƽ� �ϴ°� �ƴ� �ȿ��� ���
 * 
 * javascript
 * 	Bom ��������ü��
 * 
 * extents	Ŭ���� ���
 * implements �������̽� ���
 */
interface AA {
	void doA();	//	public ��������
	public void doB();
	
	public static final int a = 10;
	int b = 20;	//	public static final ����������
}

public class Ex01 implements AA {
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		ex01.doA();
		ex01.doB();
		
		System.out.println("ex01.a = " + ex01.a);
		System.out.println("ex01.b = " + ex01.b);
//		AA.a++;
		System.out.println("AA.a = " + AA.a);
		System.out.println("AA.b = " + AA.b);
	}
	
	@Override
	public void doA() {
		System.out.println("doA�� �����ǵ� �޼���");
	}
	@Override
	public void doB() {
		System.out.println("doB�� �����ǵ� �޼���");
	}
}