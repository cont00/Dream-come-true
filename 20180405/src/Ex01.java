import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * ���ڸ� �Է¹޴´�.
 * ������ �Է¹����� "���� �Դϴ�." ���
 * ����Է¹����� "���� �Դϴ�." ���
 */
public class Ex01
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		System.out.println("���� �Է� : ");
		
		String number = br.readLine();
		
		int int_number = Integer.parseInt(number);
		
		if (int_number > 0)
			System.out.println("��� �Դϴ�.");
		else if (int_number <0)
			System.out.println("���� �Դϴ�.");
		else
			System.out.println("0 �Դϴ�.");
	}
}