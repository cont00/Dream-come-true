import javax.swing.JOptionPane;

public class Ex01
{
	public static boolean isNumber(String str)
	{
		boolean rtnValue = true;
		for (int i = 0; i < str.length();i++)
		{
			str.charAt(i);
			if (str.charAt(i) < '0' || str.charAt(i) > '9')
			{
				rtnValue = false;
			}
//			System.out.println("str.charAt(" + i + ")" + str.charAt(i));
		}
		return rtnValue;
	}
	
	public static void main(String[] args)
	{
		String str = JOptionPane.showInputDialog("�Է��ϼ���");
		System.out.println("�Է¹��� ���ڴ� �����Դϴ�. " + isNumber(str));
	}
}