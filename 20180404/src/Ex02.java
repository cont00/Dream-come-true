/*
 * 	형변환
 * 
 * 	primitive 자료형 형변환
 * 
 * 	javascript 문자열 -> 숫자 Number();
 * 	java 문자열 -> int Integer.parseInt();
 * 		  문자열 -> double Double.parseDouble();
 */		
public class Ex02
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		
		double c = 3.14d;
		float d = 4.12f;
		
		String e = "11";
		
		a = (int)c;
		System.out.println(a);
		
		b = (int)d;
		System.out.println(b);
	}
}