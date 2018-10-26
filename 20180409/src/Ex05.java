/*
 * int a[] = {33,22,11,55,44};
 * b라는 배열에다가 넣어서 순서대로 출력하시오
 * Ex 55,44,33,22,11
 */
public class Ex05
{
	public static void main(String[] args)
	{
		int a[] = {33,22,11,55,44};
		int b[] = a;
		int temp = 0;
		
		for (int i = 0; i < b.length; i++)
		{
			for (int j = i + 1; j < b.length; j++)
			{
				if(b[i] > b[j])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		for (int i = 0; i < b.length; i++)
		{
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}
}