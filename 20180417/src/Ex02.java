public class Ex02
{
	public static void main(String[] args)
	{
		A a = new A();
		a.doA();
		a.doB("김현노");	//	javascript 매개변수가 맞지 않아도 실행 undefined
		int rtnValue1 = a.doC();
		int rtnValue2 = a.doD(20);
		
		System.out.println("rtnValue1 : " + rtnValue1);
		System.out.println("rtnValue2 : " + rtnValue2);
	}
}
class A
{
	public void doA()
	{
		System.out.println("doA 함수입니다.");
	}
	public void doB(String name)	//	값에 의한 복사인지, 참조에 의한 복사인지 생각해 볼 필요가 있다.
	{
		System.out.println(name + "씨 오늘도 게임하는군요!");
		return;	//	함수 종료 및 호출한 곳으로 돌아간다.
	}
	public int doC()
	{
		return 10; // 함수 종료 및 호출한 곳으로 10을 가지고 돌아간다.
	}
	public int doD(int num)	//	값에 의한 복사인지, 참조에 의한 복사인지 생각해 볼 필요가 있다.
	{
		return num * num;	//	함수 종료 및 호출한 곳으로 num의 곱한 값을 가지고 돌아간다.
	}
}