import javax.swing.JOptionPane;

public class Ex02
{
	public static void main(String[] args)
	{
		int count = 0;
		int computer_number = (int)(Math.random()*100)+1;
		
		while(true)
		{
			String User_number = JOptionPane.showInputDialog("1~100������ ���ڸ� �Է����ּ���");
			int num = Integer.parseInt(User_number);
			System.out.println("User_number = " + User_number);
			count++;
			
			if (num < computer_number)
			{
				System.out.println("UP.");
			}
			else if (num > computer_number)
			{
				System.out.println("Down");
			}
			
			if (computer_number == num)
			{
				System.out.println("computer_number = " + computer_number);
				System.out.println("�����Դϴ�.");
				System.out.println("������ Ƚ�� : " + count + "ȸ");
				System.exit(1);
			}
		}
	}
}