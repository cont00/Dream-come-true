/*
 * 1. public
 * 		-> 대중적인 , 모든곳에서 접근가능
 * 2. protected
 * 		-> 상속했을때만 접근가능
 * 3. default
 * 		-> 자기 패키지 내에서만 접근가능
 * 4. pribate
 * 		-> 개인적인, 자기자신만 접근 가능
 */
public class Ex02
{
	public static void main(String[] args)
	{
		AA aa = new AA();
		System.out.println("aa.a = " + aa.a);
//		System.out.println("aa.b = " + aa.b);
		
		BB bb = new BB();
		System.out.println("bb.b = " + bb.b);
		System.out.println("bb.c = " + bb.c);
	}
}

class AA
{
	public int a = 10;
	private int b = 20;
}