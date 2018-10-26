/*
 * 생성자 호출이 일어나면 메모리에 그 클래스 크기 할당
 * class 객체 기반의 문제점 : 메모리의 누수 현상이 발생
 * super 예약어 : 상위에 있는 생성자를 호출 
 */
class AAA
{
	AAA()
	{
		System.out.println("super 생성자 호출이 생략되어져 있다.");
		System.out.println("AAA 생성자");
	}
	AAA(int a)
	{
		System.out.println("AAA 상위 생성자 int a");
	}
}
class BBB extends AAA
{
	BBB()
	{
		super();
		System.out.println("BBB 생성자");
	}
	BBB(int a)
	{
		super(a);
		System.out.println("a = " + a);
	}
}
public class Ex03
{
	public static void main(String[] args)
	{
//		new BBB();
		new BBB(20);
	}
}