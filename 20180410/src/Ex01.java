import javax.swing.JOptionPane;

public class Ex01
{
	public static String seat[][] = new String[3][7];
	
	public static void input_seat()
	{
		String name = JOptionPane.showInputDialog("�̸��� �Է����ּ���");
//		System.out.println("name = " + name);
		String row = JOptionPane.showInputDialog("A��,B��,C�� �������ּ���");
//		System.out.println("row = " + row);
		String col = JOptionPane.showInputDialog("�¼���ȣ�� �Է����ּ���");
//		System.out.println("col = " + col);
		
		if (row.equals("A"))
		{
			seat[0][Integer.parseInt(col)] = name;
		}
		else if(row.equals("B"))
		{
			seat[1][Integer.parseInt(col)] = name;	
		}
		else
		{
			seat[2][Integer.parseInt(col)] = name;
		}
	}
	public static void main(String[] args)
	{
		/*
		 * Int �迭 ���� �� ���� �� 0
		 * String �迭 ���� �� ���� �� null
		 */
		String seat[][] = new String[3][7];
		String seat_line[] = {"A","B","C"};
		
		
		while(true)
		{
			String select = JOptionPane.showInputDialog("1�� �¼��Է�\n2�� �¼� ���\n3�� ����\n4�� ����");
			System.out.println("select = " + select);
			
			if (select.equals("1"))			// �Է��ϴ� ����
			{
				input_seat();
			}
			else if (select.equals("2"))	// ����ϴ� ����
			{
				// ����ϴ� �κ� start
				for (int i = 0; i < seat.length; i++)
				{
					System.out.print(seat_line[i] + "\t");
					for (int j = 0; j < seat[i].length; j++)
					{
						System.out.print(+ j + " ��\t");
					}
					System.out.println();
					System.out.print("\t");
					for (int j = 0; j < seat[i].length; j++)
					{
						if (seat[i][j] == null)
							System.out.print("OOO\t");
						else
							System.out.print(seat[i][j] + "\t");
					}
					System.out.println();
				}
				// ����ϴ� �κ� end
			}
			else if (select.equals("3"))
			{
				String name;
				String row = JOptionPane.showInputDialog("������ �Է��ߴ� A��,B��,C�� �������ּ���");
				String col = JOptionPane.showInputDialog("������ �Է��ߴ� �¼���ȣ�� �Է����ּ���");
				
				if (row.equals("A"))
				{
					seat[0][Integer.parseInt(col)] = "OOO";
				}
				else if(row.equals("B"))
				{
					seat[1][Integer.parseInt(col)] = "OOO";	
				}
				else
				{
					seat[2][Integer.parseInt(col)] = "OOO";
				}
				
				input_seat();
			}
			else							// ����
			{
				System.exit(1);
			}
		}
	}
}