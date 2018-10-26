/*
 * public -> 모든 곳에서 접근 가능
 * protected -> 상속된 곳에서 접근 가능
 * default -> 같은 패키지에서 접근 가능
 * private -> 자기 자신 클래스만 접근 가능
 * 
 * private으로 선언되어진 변수를 초기화 할 때
 * 	사용방법
 * 		-	생성자 함수에서 this.변수명 = 변수명으로 초기화 할 수 있다.
 * 		-	getter setter 기법으로 private 변수를 초기화 할 수 있다.
 * 
 * 변수
 * 메서드
 * 	public private default protected 를 사용할 수 있다.
 */

public class Ex06
{
	public static void main(String[] args)
	{
		AAA aaa = new AAA();
		
		aaa.doA();
//		aaa.doB();
		aaa.doC();
		aaa.doD();
	}
}

class AAA
{
	public void doA()
	{
		System.out.println("doA");
	}
	
	private void doB()
	{
		System.out.println("doB");
	}
	
	void doC()
	{
		System.out.println("doC");
	}
	
	protected void doD()
	{
		System.out.println("doD");
	}
}