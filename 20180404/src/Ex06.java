import java.util.Scanner;

public class Ex06
{
	public static void main(String[] args)
	{
		System.out.println("화씨온도 변환할래?(1) 섭씨온도 변환할래?(2)");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int int_input = Integer.parseInt(input);
		
		// String 형 비교 연산자는 equals 함수입니다.
		// API <- 함수 묶음용어
		// Application Programming Interface 어플리케이션 프로그래밍 도구
		
		if(int_input == 1)
		{
			System.out.println("화씨온도를 선택하셨군요.");
			System.out.println("화씨온도 입력 : ");
			String haw = scan.nextLine();
//			double doublehaw = Double.parseDouble(haw); 
//			System.out.println((doublehaw - 32)/1.8);
			System.out.println("섭씨온도 : " + (Double.parseDouble(haw) - 32)/1.8);
		}		
		else
		{
			System.out.println("섭씨온도를 선택하셨군요.");
			System.out.println("섭씨온도 입력 : ");
			String sub = scan.nextLine();
//			double doublehaw = Double.parseDouble(sub); 
//			System.out.println((doublesub * 1.8) + 32);
			System.out.println("화씨온도 : " + (Double.parseDouble(sub) * 1.8) + 32);
		}
	}
}
