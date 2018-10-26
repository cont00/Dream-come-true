import java.lang.*;
// 이미 존재하고 있기 때문에 생략해도되는 것.

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
		boolean a = true;	//	기본자료형
		System.out.println("a = " + a);
		
		boolean b = new Boolean(true);	//	클래스 자료형
		System.out.println("b = " + b);
		
//		String c = b.toString();
//		System.out.println("c = " + c);
		
		Boolean d = new Boolean("false");
		System.out.println("d = " + d);
		
//		boolean e = "true";
		
		if(!d)
		{
			System.out.println("출력이 됨");
		}
	}
}