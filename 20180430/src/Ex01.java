/*
 * this
 * 	-> 자기자신 클래스
 * 	this.변수명 클래스변수 참조
 * 	this(); 자기자신 클래스 생성자 호출
 * 	캡슐화 -> private 접근제어지시자
 * 	setter, getter 생성자 클래스변수 초기화
 * 
 * super -> extends 클래스명
 * 	-> 부모클래스
 * 	super.변수명 부모클래스 변수를 참조
 * 	super(); 부모클래스 생성자 호출
 * 	오버라이딩 -> 변수, 메서드를 재정의 한다.
 * 		-> toString 메서드를 재정의 한다.
 */

class A
{
//	protected int a = 10;
	private int a = 10;
	
	public int b = 20;
	
	protected void doA()
//	private void doA()
	{
		System.out.println("doA 메서드 입니다.");
	}
	public void doB()
	{
		System.out.println("doB 메서드 입니다.");
	}
}
// Ex01의 부모클래스는 A 클래스이다.
public class Ex01 extends A
{
	// 상속받은 변수와 메서드의 내용을 재정의 했다. (Override, Overriding)
	private int b = 30;
	protected void doA()
	{
		System.out.println("Ex01 doA 메서드 입니다.");
	}
	Ex01()
	{
//		System.out.println(super.a);
		System.out.println(this.b);
		System.out.println(super.b);
		this.doA();
		super.doA();
		doB();
	}
	public static void main(String[] args)
	{
		new Ex01();
	}
}