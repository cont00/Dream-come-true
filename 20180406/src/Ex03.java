import java.util.Scanner;

/*
 * ����1 : �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�
 * 		int arr = {10,20,30,44,55};
 * 
 * ����2 : 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
 * 		int[][] arr = {
 * 		{ 5, 5, 5, 5, 5},
 * 		{10,10,10,10,10},
 * 		{20,20,20,20,20},
 * 		{30,30,30,30,30}};
 * 
 * ����3 : 1�� 45������ �ߺ����� ���� ���ڷ� �̷���� 6�ڸ� ���ڸ� ������ ���α׷��� �ϼ��Ͻÿ�.(�ζǹ�ȣ ��õ��)
 */
public class Ex03
{
	//	����1 : �迭 arr�� ��� ��� ���� ���ϴ� ���α׷��� �ϼ��Ͻÿ�
//	public static void main(String[] args)
//	{
//		int arr[] = {10,20,30,44,55};
//		int sum = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		int arry_size = scan.nextInt();
//		arr = new int[arry_size];
//		
//		System.out.println("�迭�� ũ�⸦ �Է� : ");
//		
//		for(int i=0; i < arr.length; i++)
//		{
//			System.out.println(i + "��° �Է� : ");
//			arr[i] = scan.nextInt();
//			sum = sum + arr[i];
//		}
//		System.out.println("arr�� ���� : " + sum);
//	}
	
	//	����2 : 2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
//	public static void main(String[] args)
//	{
//		int arr[][];
//		int sum1 = 0;
//		double sum2 = 0;
//		int i = 0;
//		int j = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		int arr1_size = scan.nextInt();
//		int arr2_size = scan.nextInt();
//		arr = new int[arr1_size][arr2_size];
//		
//		for(i = 0; i < arr.length; i++)
//		{
//			for(j = 0; j < arr[i].length; j++)
//			{
//				arr[i][j] = scan.nextInt();
//			}
//		}
//		
//		for(i = 0; i < arr.length; i++)
//		{
//			for(j = 0; j < arr[i].length; j++)
//			{
//				System.out.println(arr[i][j]);
//			}
//		}
//		
//		for(i = 0; i < arr.length; i++)
//		{
//			for(j = 0; j < arr[i].length; j++)
//			{
//				sum1 = sum1 + arr[i][j];
//			}
//		}
//		
//		sum2 = i * j;
//		
//		System.out.println("arr�� ���� : " + sum1);
//		System.out.println("arr�� ��� : " + sum1 / sum2);
//	}
	
	//	����3 : 1�� 45������ �ߺ����� ���� ���ڷ� �̷���� 6�ڸ� ���ڸ� ������ ���α׷��� �ϼ��Ͻÿ�.(�ζǹ�ȣ ��õ��)
	public static void main(String[] args)
	{
		int number[] = new int[6];
		
		for(int i = 0; i < 6; i++)
		{
			number[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++)
			{
				while(number[i] == number[j])
				{
					number[i] = (int)(Math.random() * 45) + 1;
					j=0;
				}
			}
		}
		for(int i = 0; i < number.length; i++)
			System.out.println("number["+ i +"] = " + number[i]);
	}
}