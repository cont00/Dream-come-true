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
		String str = JOptionPane.showInputDialog("입력하세요");
		System.out.println("입력받은 문자는 숫자입니다. " + isNumber(str));
	}
}