/*
 * 클래스 생성자
 * 		-> new 라는 예약어 heap 영역에 메모리를 할당 할 때 호출되는 함수
 * 		-> 클래스명이랑 동일해야 하며, 반환값이 없는 함수 형태
 * 		
 */
public class Ex01
{
	public static void main(String[] args)
	{
		Ex02 ex02 = new Ex02();
		System.out.println(ex02.a);
		ex02.doA();
		
		Ex02 ex02_a = new Ex02(30);
		System.out.println(ex02_a.a);
		
		Ex02 ex02_b = new Ex02(10,20);
		System.out.println(ex02_b.a);
	}
}