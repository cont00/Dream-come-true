/*
 * 연산자란?	+	-	/	*
 * 연산자 운선순위 () 가 제일 우선순위가 높다.
 * ++( --
 */
public class Ex01
{
	public static void main(String[] args)
	{
		int a = 10;
		System.out.println(a++); // a 값 10을 출력 한 뒤에 1증가 출력값 : 10 / 결과값 : 11
		System.out.println(++a); // a 값 11을 출력하기전에 1증가하고 난 뒤에 출력 출력값 : 12 / 결과값 : 12
		
		System.out.println(a--); // a 값 10을 출력 한 뒤에 1감소 출력값 12 / 결과값 : 11
		System.out.println(--a); // a 값 10을 출력하기전에 1감소하고 난 뒤에 출력 출력값 : 10 / 결과값 : 10	}
	}
}
