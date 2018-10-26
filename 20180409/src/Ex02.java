public class Ex02
{
	public static void main(String[] args)
	{
		int a[] = new int[] {1,2,3,4,5};
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		for ( int element :a)
		{
			System.out.println("element = " + element);
		}
	}
}