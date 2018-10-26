public class Ex02 {
	
	public String temp = null;
	
	Ex02() {
		int a = 10;
		int b = 0;
		
		try {
			String str = "10";
			int c = Integer.parseInt(str);	//	NumberFormatException 숫자형 변환 에러
			
			System.out.println("여기까지 실행");
			
			if (a/b == 0) {
				System.out.println("정상실행");
			}	else {
				System.out.println("에러");
			}
			if (temp.equals("")) {
				System.out.println("null 은 빈 공백인지 확인");
			}	//	프로그램 강제 종료
		}	catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
//			e.printStackTrace();
		}	catch (NumberFormatException e) {
			System.out.println("숫자형 변환 에러");
		}	catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("여기까지 실행 되고있음");
	}
	public static void main(String[] args) {
		new Ex02();
	}
}