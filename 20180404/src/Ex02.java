/*
 * 	����ȯ
 * 
 * 	primitive �ڷ��� ����ȯ
 * 
 * 	javascript ���ڿ� -> ���� Number();
 * 	java ���ڿ� -> int Integer.parseInt();
 * 		  ���ڿ� -> double Double.parseDouble();
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