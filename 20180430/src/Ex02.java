import java.lang.*;
// �̹� �����ϰ� �ֱ� ������ �����ص��Ǵ� ��.

//#include<stdio.h>

/*
 * Object
 * 	->	toString
 * 
 * String
 * 	->	
 */
public class Ex02
{
	public static void main(String[] args)
	{
		boolean a = true;	//	�⺻�ڷ���
		System.out.println("a = " + a);
		
		boolean b = new Boolean(true);	//	Ŭ���� �ڷ���
		System.out.println("b = " + b);
		
//		String c = b.toString();
//		System.out.println("c = " + c);
		
		Boolean d = new Boolean("false");
		System.out.println("d = " + d);
		
//		boolean e = "true";
		
		if(!d)
		{
			System.out.println("����� ��");
		}
	}
}