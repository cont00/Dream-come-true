import java.util.Scanner;
/*
 * ȭ��, ����
 * ��ȯ���� : (ȭ���µ� - 32) / 1.8 = �����µ�
 * ��ȯ���� : (�����µ� * 1.8) + 32 = ȭ���µ�
 * 
 * ȭ���µ� �Է� �� �����µ� ���
 * �����µ� �Է� �� ȭ���µ� ���
 * 
 * ��°����
 * ȭ���µ� �Է� : 
 * �����µ� �Է� :
 * 1�� �Է� �� ȭ���µ� �Է�, 2�� �Է� �� �����µ� �Է�
 */
public class Ex05
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1. ȭ���µ�	2. �����µ�");
		System.out.println("� �µ��� ��ȯ�� ������ �������ּ��� : ");
		String num = scan.nextLine();
		
		int a = Integer.parseInt(num);
		
		if(a == 1)
		{
		System.out.println("ȭ���µ� �Է� : ");
		String f = scan.nextLine();
		double fa = Double.parseDouble(f);
		System.out.println("�����µ� : " + (fa - 32) / 1.8);
		}
		else if(a == 2)
		{
		System.out.println("�����µ� �Է� : ");
		String c = scan.nextLine();
		double ca = Double.parseDouble(c);
		System.out.println("�����µ� : " + (ca * 1.8) + 32);
		}
		else
		{
			System.out.println("�߸��� ��ȣ�� �Է��ϼ̽��ϴ�.");
			System.out.println("���α׷��� �����մϴ�.");
		}
	}
}