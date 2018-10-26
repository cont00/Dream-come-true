import java.util.Scanner;

/*
 * 문제1 : 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오
 * 		int arr = {10,20,30,44,55};
 * 
 * 문제2 : 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
 * 		int[][] arr = {
 * 		{ 5, 5, 5, 5, 5},
 * 		{10,10,10,10,10},
 * 		{20,20,20,20,20},
 * 		{30,30,30,30,30}};
 * 
 * 문제3 : 1과 45사이의 중복되지 않은 숫자로 이루어진 6자리 숫자를 만들어내는 프로그램을 완성하시오.(로또번호 추천기)
 */
public class Ex03
{
	//	문제1 : 배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오
//	public static void main(String[] args)
//	{
//		int arr[] = {10,20,30,44,55};
//		int sum = 0;
//		
//		Scanner scan = new Scanner(System.in);
//		int arry_size = scan.nextInt();
//		arr = new int[arry_size];
//		
//		System.out.println("배열의 크기를 입력 : ");
//		
//		for(int i=0; i < arr.length; i++)
//		{
//			System.out.println(i + "번째 입력 : ");
//			arr[i] = scan.nextInt();
//			sum = sum + arr[i];
//		}
//		System.out.println("arr의 총합 : " + sum);
//	}
	
	//	문제2 : 2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
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
//		System.out.println("arr의 총합 : " + sum1);
//		System.out.println("arr의 평균 : " + sum1 / sum2);
//	}
	
	//	문제3 : 1과 45사이의 중복되지 않은 숫자로 이루어진 6자리 숫자를 만들어내는 프로그램을 완성하시오.(로또번호 추천기)
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