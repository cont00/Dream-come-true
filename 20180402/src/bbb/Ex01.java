/*
 * package 는 소스를 관히라는 폴더
 * ctrl + 1 빠른 에러 처리 단축키
 * 대문자로 클래스명을 지정해야 한다.
 * 
 * 변수란? - 변하는 숫자를 넣는 기억공간
 * primitive 기본타입
 * 정수형 char, byte, int, long
 * 실수형 float double
 * 
 * reference 참조타입
 * String, Byte, Short, Integer, Long
 * Float, Double
 */

package bbb;

public class Ex01
{
	public static void main(String[] args)
	{
		String aaa = "문자열 참조형 타입 변수 선언";
		System.out.println(aaa);
		
		int a = 10;
		int b = 20;
		System.out.println("a + b = " + a + b);
		System.out.printf("%d + %d = %d", a, b, a + b);
	}
}