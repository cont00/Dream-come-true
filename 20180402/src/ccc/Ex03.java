/*
 * ����ȯ
 * �ڵ�����ȯ = ����Ÿ�� -> ū Ÿ������ �ٲ� �� ����� �ȴ�.
 * ��������ȯ = ū Ÿ�� -> ����Ÿ������ �ٲ� �� �� ����� �ȴ�.
 */

package ccc;

public class Ex03
{
	public static void main(String[] args)
	{
		// byte = 1����Ʈ, int = 4����Ʈ
		// �ڵ�����ȯ
		byte a = 10;
		int b = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// ��������ȯ
		int c = 20;
		byte d = (byte)c;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		// 0001      0000	 	 0000
		// 256   128,64,32,16   8,4,2,1
		int e = 256;
		byte f = (byte)e;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		float g = 1.14f;
		int h = (int)g;
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		double pia = 3.1415d;
		System.out.println("pia = " + pia);
		pia = pia*100;
		int temp = (int)pia;
		pia = (double)temp/100;
		System.out.println("pia = " + pia);
	}
}
