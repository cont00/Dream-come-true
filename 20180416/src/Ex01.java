/*
 * java -> 클래스, 객체, 인스턴스
 */
public class Ex01
{
	public static void main(String[] args)
	{
		/*
		 * Debug mode
		 * 멈추는 곳에 break point 지정 (더블클릭)
		 * F5 - 함수 안으로 진행
		 * F6 - 한 줄 진행
		 * F8 - 다음 break point 진행 or break point 없으면 끝까지 진행
		 */
		System.out.println("----------프로그램 시작----------");
		
		AA aa1 = new AA();
		System.out.println(aa1.a);
		aa1.doA();
		System.out.println();
		
		BB bb1 = new BB();
		System.out.println(bb1.b);
		bb1.doB();
		System.out.println();
		
		CC cc1 = new CC();
		System.out.println(cc1.c);
		cc1.doC();
		
		System.out.println("----------프로그램 종료----------");
	}
}

class AA
{
	public int a = 10; // class 변수
	public void doA()
	{
		System.out.println("doA 함수 입니다.");
	}
}
class BB
{
	public int b = 20;
	public void doB()
	{
		System.out.println("doB 함수 입니다.");
	}
}
class CC
{
	public int c = 30;
	public void doC()
	{
		System.out.println("doC 함수 입니다.");
	}
}