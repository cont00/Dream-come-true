public class Ex02
{
	public static void main(String[] args)
	{
		int sum = 0;
		for ( int i = 1; i < 21; i++)
		{
			if (i % 2 != 0)
			{
				if(i % 3 != 0)
					sum = sum + i;
			}
		}
		System.out.println("sum = " + sum);
	}
}
