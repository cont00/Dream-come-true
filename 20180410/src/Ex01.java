import javax.swing.JOptionPane;

public class Ex01
{
	public static String seat[][] = new String[3][7];
	
	public static void input_seat()
	{
		String name = JOptionPane.showInputDialog("이름을 입력해주세요");
//		System.out.println("name = " + name);
		String row = JOptionPane.showInputDialog("A행,B행,C행 선택해주세요");
//		System.out.println("row = " + row);
		String col = JOptionPane.showInputDialog("좌석번호를 입력해주세요");
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
		 * Int 배열 값을 안 넣을 시 0
		 * String 배열 값을 안 넣을 시 null
		 */
		String seat[][] = new String[3][7];
		String seat_line[] = {"A","B","C"};
		
		
		while(true)
		{
			String select = JOptionPane.showInputDialog("1번 좌석입력\n2번 좌석 출력\n3번 수정\n4번 종료");
			System.out.println("select = " + select);
			
			if (select.equals("1"))			// 입력하는 로직
			{
				input_seat();
			}
			else if (select.equals("2"))	// 출력하는 로직
			{
				// 출력하는 부분 start
				for (int i = 0; i < seat.length; i++)
				{
					System.out.print(seat_line[i] + "\t");
					for (int j = 0; j < seat[i].length; j++)
					{
						System.out.print(+ j + " 번\t");
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
				// 출력하는 부분 end
			}
			else if (select.equals("3"))
			{
				String name;
				String row = JOptionPane.showInputDialog("이전에 입력했던 A행,B행,C행 선택해주세요");
				String col = JOptionPane.showInputDialog("이전에 입력했던 좌석번호를 입력해주세요");
				
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
			else							// 종료
			{
				System.exit(1);
			}
		}
	}
}