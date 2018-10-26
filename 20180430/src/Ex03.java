public class Ex03 extends Object
{
	//재정의 Override
	@Override
	public String toString()
	{
		return "Ex03 클래스이고 2018년 4월 30일 날 만듬";
	}
	
	Ex03()
	{
		String temp = toString();
		System.out.println(temp);
	}
	public static void main(String[] args)
	{
		new Ex03();
	}
}