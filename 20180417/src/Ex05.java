/*
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 
 * 메서드명 : isNumber
 * 기능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
 * 	모두 숫자로만 이루어져 있으면 true를 반환하고,
 * 그렇지 않으면 false를 반환한다.
 * 만일 주어진 문자열이 null이거나 빈문자열""이라면 false를 반환한다.
 * 반환타입 : boolean
 * 매개변수 : String str - 검사할 문자열
 */

public class Ex05
{
	public static void main(String[] args)
	{
		Number isNumber = new Number();
		
		String str1 = "12345";
		System.out.println("str 은 숫자 입니까? " + isNumber(str1));
		
		String str2 = "dream come true";
		System.out.println("str 은 숫자 입니까? " + isNumber(str2));
		
		
		if (Integer.parseInt(str1) == 숫자)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}	
	}
}

class Number
{
	
}