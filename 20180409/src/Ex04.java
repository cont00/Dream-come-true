public class Ex04
{
	public static void main(String[] args)
	{
		/*
		 * k = 0�϶� i = 0�϶� j = 0~4
		 * k = 0�϶� i = 1�϶� j = 0~4
		 * k = 0�϶� i = 2�϶� j = 0~4
		 * k = 0�϶� i = 3�϶� j = 0~4
		 * k = 0�϶� i = 4�϶� j = 0~4
		 * 
		 * k = 1�϶� i = 0�϶� j = 0~4
		 * k = 1�϶� i = 1�϶� j = 0~4
		 * k = 1�϶� i = 2�϶� j = 0~4
		 * k = 1�϶� i = 3�϶� j = 0~4
		 * k = 1�϶� i = 4�϶� j = 0~4
		 * 
		 * z = 0�϶� z = 0~4
		 * z = 2�϶� z = 0~4
		 * z = 3�϶� z = 0~4
		 * z = 4�϶� z = 0~4
		 */
		a:for(int k = 0; k < 5; k++)
		{
			b:for(int i = 0; i < 5; i++)
			{
				for(int j = 0; j < 5; j++)
				{
					if(j == 1 || j ==3)
					{
						continue;
					}
					else if(j==4)
					{
						break b;
					}
					else if(k == 3 && i == 0 && j == 2)
					{
						break a;
					}
					else
					{
						System.out.println("k = " + k + " i = " + i + " j = " + j);
					}
				}
			}
			System.out.println();
		}
		
//		for(int z = 0; z < 5; z++)
//		{
//			
//		}
	}
}