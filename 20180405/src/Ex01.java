import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/*
 * 숫자를 입력받는다.
 * 음수를 입력받으면 "음수 입니다." 출력
 * 양수입력받으면 "음수 입니다." 출력
 */
public class Ex01
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		System.out.println("숫자 입력 : ");
		
		String number = br.readLine();
		
		int int_number = Integer.parseInt(number);
		
		if (int_number > 0)
			System.out.println("양수 입니다.");
		else if (int_number <0)
			System.out.println("음수 입니다.");
		else
			System.out.println("0 입니다.");
	}
}