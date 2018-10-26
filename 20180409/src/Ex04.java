public class Ex04
{
	public static void main(String[] args)
	{
		/*
		 * k = 0老锭 i = 0老锭 j = 0~4
		 * k = 0老锭 i = 1老锭 j = 0~4
		 * k = 0老锭 i = 2老锭 j = 0~4
		 * k = 0老锭 i = 3老锭 j = 0~4
		 * k = 0老锭 i = 4老锭 j = 0~4
		 * 
		 * k = 1老锭 i = 0老锭 j = 0~4
		 * k = 1老锭 i = 1老锭 j = 0~4
		 * k = 1老锭 i = 2老锭 j = 0~4
		 * k = 1老锭 i = 3老锭 j = 0~4
		 * k = 1老锭 i = 4老锭 j = 0~4
		 * 
		 * z = 0老锭 z = 0~4
		 * z = 2老锭 z = 0~4
		 * z = 3老锭 z = 0~4
		 * z = 4老锭 z = 0~4
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