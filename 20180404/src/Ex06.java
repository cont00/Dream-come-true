import java.util.Scanner;

public class Ex06
{
	public static void main(String[] args)
	{
		System.out.println("ȭ���µ� ��ȯ�ҷ�?(1) �����µ� ��ȯ�ҷ�?(2)");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int int_input = Integer.parseInt(input);
		
		// String �� �� �����ڴ� equals �Լ��Դϴ�.
		// API <- �Լ� �������
		// Application Programming Interface ���ø����̼� ���α׷��� ����
		
		if(int_input == 1)
		{
			System.out.println("ȭ���µ��� �����ϼ̱���.");
			System.out.println("ȭ���µ� �Է� : ");
			String haw = scan.nextLine();
//			double doublehaw = Double.parseDouble(haw); 
//			System.out.println((doublehaw - 32)/1.8);
			System.out.println("�����µ� : " + (Double.parseDouble(haw) - 32)/1.8);
		}		
		else
		{
			System.out.println("�����µ��� �����ϼ̱���.");
			System.out.println("�����µ� �Է� : ");
			String sub = scan.nextLine();
//			double doublehaw = Double.parseDouble(sub); 
//			System.out.println((doublesub * 1.8) + 32);
			System.out.println("ȭ���µ� : " + (Double.parseDouble(sub) * 1.8) + 32);
		}
	}
}
