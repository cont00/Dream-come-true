import java.util.Scanner;

/*
 * �Ǽ� ���ڿ��� �Է��ؼ� double ���� ��Ƽ� �Ҽ��� �߶� ���.
 */

public class Ex04
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("str1 ���ڿ� �Է� : ");
		String str1 = scan.nextLine();
		
		double a = Double.parseDouble(str1);
		
		System.out.println("�Ҽ����� �߶� ��� : " + (int)a);
	}
}