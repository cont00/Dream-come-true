import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� : ");
		int rows_size = scan.nextInt();
		
		System.out.println("���� ���� : ");
		int cols_size = scan.nextInt();
		
		int a[][] = new int[rows_size][cols_size];
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.println("a["+i+"]["+j+"]" + a[i][j]);
			}
		}
	}
}
