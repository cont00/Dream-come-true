public class Ex02
{
	private int a;
	Ex02()
	{
		this("Arisia");	//	다른생성자 생성자 제일 첫 번째 줄 그 외에는 Error
		this.a = 30;
	}
	Ex02(String str)
	{
		System.out.println(str);
	}
	
	public static void main(String[] args)
	{
		Ex02 ex02 = new Ex02();
		
		System.out.println("ex02.a = " + ex02.a);
	}
}