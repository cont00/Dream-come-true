import javax.swing.JOptionPane;

public class Ex01
{
	public static void main(String[] args)
	{
		int temp[] = new int[100];
		
		for(int i = 0; i < temp.length; i++)
		{
			String input = JOptionPane.showInputDialog("1~100 사이의 숫자를 입력 : ");
			System.out.println("input = " + input);
			if(input.equals("-1"))
			{
				break;
			}
			temp[i] = Integer.parseInt(input);
		}
		/*
		 * primitive type의 경우
		 * int -> double = (double)
		 * double -> int = (int)
		 * reference trpe의 경우
		 * int = Integer.parseInt();
		 * double = Double.parseDouble();
		 */
		
		for(int i = 0; i < temp.length; i++)
		{
			System.out.println("temp[" + i + "] = " + temp[i]);
		}
	}
}