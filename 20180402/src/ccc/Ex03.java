/*
 * 형변환
 * 자동형변환 = 작은타입 -> 큰 타입으로 바꿀 때 안적어도 된다.
 * 수동형변환 = 큰 타입 -> 작은타입으로 바꿀 때 꼭 적어야 된다.
 */

package ccc;

public class Ex03
{
	public static void main(String[] args)
	{
		// byte = 1바이트, int = 4바이트
		// 자동형변환
		byte a = 10;
		int b = a;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// 수동형변환
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
