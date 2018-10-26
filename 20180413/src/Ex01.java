import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex01
{
	/*
	 * �Է� �޴� ����� ���ؼ�
	 * 1. Scanner Ŭ����
	 * 	nextLine()	->	String ������ ���ڿ�, ���������� ���
	 * 		Integer.parseInt(); - ���������� ����
	 * 		���ڿ� �� ���� equals, == ����
	 * 	nextInt()	->	int �� �Է� (����)
	 * 		int -> double = (double)
	 * 	nextFloat()	->	float �� �Է� (�Ǽ�)
	 * 2. BufferedReader	->	Java 1.0����
	 * 		->	String ��
	 * 3. JOptionPane
	 * 		->	String ��
	 * 
	 * awt -> swing -> fx	-> jsp �����α׷��� Spring	php	asp	jsp
	 * �ΰ����	->	C# window form, wpf
	 * �������	->	�ػ�ũ��, miplatform, xplatform
	 * 
	 * ����ϴ� ����� ���ؼ�
	 * System.out.println() - ��¹�(�ڵ��ٹٲ�)
	 * System.out.print() - ��¹�
	 * System.out.printf() - ��¹�
	 */
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("scan �Է� : ");
		String a = scan.nextLine();
		int e = scan.nextInt();	//	���� �Է�
		System.out.println("a = " + a);
		System.out.println("e = " + e);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Buff �Է� : ");
		String b = br.readLine();
//		br.readLine();
		int f = br.read();
		System.out.println("b = " + b);
		System.out.println("f = " + f);
		System.out.println();
		
		String c = JOptionPane.showInputDialog("�Է��ϼ���");
		int j = JOptionPane.showConfirmDialog(null, "Ȯ��");
		int g = Integer.parseInt(c); // ���������� �Է�, ���� ��� �� ���α׷� �ڵ�����
		System.out.println("c = " + c);
		System.out.println("j = " + j);
	}
}

//{
//	public static final double PI = 3.1415;
//	public static int a = 10;
//	public static void doA(){System.out.println("doA");}
//}