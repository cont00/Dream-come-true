import java.util.Scanner;

public class Ex02
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("세로 길이 : ");
		int rows_size = scan.nextInt();
		
		System.out.println("가로 길이 : ");
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
