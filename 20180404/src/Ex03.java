import java.util.Scanner;

/*
 * String -> 숫자
 */
public class Ex03
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("str1 문자열 입력 : ");
		String str1 = scan.nextLine();
		int str1a = Integer.parseInt(str1);
		
		System.out.println("str2 문자열 입력 : ");
		String str2 = scan.nextLine();
		int str2b = Integer.parseInt(str2);
		
		System.out.println("str1 : " +str1 );
		System.out.println("str2 : " +str2 );
		
		System.out.println("str1 + str2 : " + (str1a + str2b) );
		
		scan.close();
	}
}