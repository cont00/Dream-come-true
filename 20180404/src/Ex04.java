import java.util.Scanner;

/*
 * 실수 문자열을 입력해서 double 형에 담아서 소수점 잘라서 출력.
 */

public class Ex04
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("str1 문자열 입력 : ");
		String str1 = scan.nextLine();
		
		double a = Double.parseDouble(str1);
		
		System.out.println("소수점을 잘라서 출력 : " + (int)a);
	}
}