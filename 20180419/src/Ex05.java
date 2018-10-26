/*
 * static : 바로참조 가능
 * non-static : new 예약어를 이용해서 참조 가능
 */
public class Ex05
{
	public static void main(String[] args)
	{
		System.out.println(Ex04.a);
		Ex04.doA();
		Ex04.doB();
		
		Ex04 ex04 = new Ex04();
		
		System.out.println(ex04.b);
		ex04.doC();
	}
}