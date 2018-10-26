/*
 * 변수에도 붙일 수 있고, static 메서드에도 붙일 수 있다.
 * 공유되는 전역변수로 프로그램 시작 시 메모리 할당되고, 프로그램 종료 시 할당 된 메모리가 삭제된다.
 * 
 * 메서드를 만들어서 매개변수를 보낼때
 * 기본형 타입 char int double float 값의 복사가 일어나고,
 * 참조형 타입 String 객체 배열 주소에 의한 복사가 일어난다.
 * 
 * new 라는 예약어 객체를 메모리에 할당
 * 	JVM 자동으로 참조변수가 null
 * 	참조하고 있으면 메모리에서 자동으로 삭제
 * 
 * 메서드 오버로딩
 * 
 * 생성자
 */
public class Ex03
{
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.a);
		a.doA();
		
		System.out.println(A.a);
		A.doA();
	}
}

class A
{
	public static int a = 10;
	public static void doA()
	{
		System.out.println("This is a doA method");
	}
}