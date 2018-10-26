import java.util.Scanner;

public class Ex01
{
	public static void main(String[] args)
	{
		int a[] = new int[10];
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		int c[];
		
		for(int i=0; i < a.length; i++)
			System.out.println("a ["+i+"] = " + a[i]);
		
		for(int i=0; i < b.length; i++)
			System.out.println("b ["+i+"] = " + b[i]);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력 : ");
		int arry_size = scan.nextInt();
		c = new int[arry_size];
		
		for(int i=0; i < c.length; i++)
		{
			System.out.println(i + "번째 입력 : ");
			c[i] = scan.nextInt();			
		}
		for(int i=0; i < b.length; i++)
			System.out.println("c ["+i+"] = " + c[i]);
	}
}