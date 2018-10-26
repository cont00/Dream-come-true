import java.util.Scanner;
/*
 * 화씨, 섭씨
 * 변환공식 : (화씨온도 - 32) / 1.8 = 섭씨온도
 * 변환공식 : (섭씨온도 * 1.8) + 32 = 화씨온도
 * 
 * 화씨온도 입력 시 섭씨온도 출력
 * 섭씨온도 입력 시 화씨온도 출력
 * 
 * 출력결과물
 * 화씨온도 입력 : 
 * 섭씨온도 입력 :
 * 1번 입력 시 화씨온도 입력, 2번 입력 시 섭씨온도 입력
 */
public class Ex05
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("1. 화씨온도	2. 섭씨온도");
		System.out.println("어떤 온도를 변환할 것인지 선택해주세요 : ");
		String num = scan.nextLine();
		
		int a = Integer.parseInt(num);
		
		if(a == 1)
		{
		System.out.println("화씨온도 입력 : ");
		String f = scan.nextLine();
		double fa = Double.parseDouble(f);
		System.out.println("섭씨온도 : " + (fa - 32) / 1.8);
		}
		else if(a == 2)
		{
		System.out.println("섭씨온도 입력 : ");
		String c = scan.nextLine();
		double ca = Double.parseDouble(c);
		System.out.println("섭씨온도 : " + (ca * 1.8) + 32);
		}
		else
		{
			System.out.println("잘못된 번호를 입력하셨습니다.");
			System.out.println("프로그램을 종료합니다.");
		}
	}
}