import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex01
{
	/*
	 * 입력 받는 방법에 관해서
	 * 1. Scanner 클래스
	 * 	nextLine()	->	String 형으로 문자열, 숫자형으로 사용
	 * 		Integer.parseInt(); - 정수형으로 변경
	 * 		문자열 비교 연상 equals, == 동일
	 * 	nextInt()	->	int 형 입력 (정수)
	 * 		int -> double = (double)
	 * 	nextFloat()	->	float 형 입력 (실수)
	 * 2. BufferedReader	->	Java 1.0버전
	 * 		->	String 형
	 * 3. JOptionPane
	 * 		->	String 형
	 * 
	 * awt -> swing -> fx	-> jsp 웹프로그래밍 Spring	php	asp	jsp
	 * 민관기관	->	C# window form, wpf
	 * 공공기관	->	넥사크로, miplatform, xplatform
	 * 
	 * 출력하는 방법에 관해서
	 * System.out.println() - 출력문(자동줄바꿈)
	 * System.out.print() - 출력문
	 * System.out.printf() - 출력문
	 */
	
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("scan 입력 : ");
		String a = scan.nextLine();
		int e = scan.nextInt();	//	숫자 입력
		System.out.println("a = " + a);
		System.out.println("e = " + e);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Buff 입력 : ");
		String b = br.readLine();
//		br.readLine();
		int f = br.read();
		System.out.println("b = " + b);
		System.out.println("f = " + f);
		System.out.println();
		
		String c = JOptionPane.showInputDialog("입력하세요");
		int j = JOptionPane.showConfirmDialog(null, "확인");
		int g = Integer.parseInt(c); // 숫자형으로 입력, 에러 방생 시 프로그램 자동종료
		System.out.println("c = " + c);
		System.out.println("j = " + j);
	}
}

//{
//	public static final double PI = 3.1415;
//	public static int a = 10;
//	public static void doA(){System.out.println("doA");}
//}