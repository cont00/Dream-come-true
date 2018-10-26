/*
 * String str = "Reverse this Strings"
 * 다음과 같이 선언 된 str에 str1 이라는 변수를 이용해서 거꾸로 저장해서 출력해보도록 하자.
 * sgnirtS siht esreveR
 * 
 */
public class Ex05
{
	Ex05()
	{
		String str = "Reverse this Strings";
		char[] b = new char[str.length()];
		int k = 0;
		for (int i = str.length()-1; i > -1; i--)
		{
			b[i] = str.charAt(k);
			k++;
		}
		String str1 = new String(b);
		System.out.println("str = " + str);
		System.out.println("str1 = " + str1);
	}
	public static void main(String[] args)
	{
		new Ex05();
	}
}