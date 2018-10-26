public class Ex05 {
	Ex05() {
		try {
//			System.out.println("정상실행");
			throw new Exception("예외");
			// DB 연결 Connection 읽기 속성
			// File 연결 그 파일은 읽기 속성
			
//			System.out.println("예외가 발생되어서 실행이 안됩니다.");
		}	catch (Exception e) {
//			e.printStackTrace();
			System.out.println("catch 부분");
		}
		finally {
			// File 연결 끊어야 됨
			// DB 연결 끊어야 됨
			System.out.println("예외가 발생하거나 발생하지 않거나 무시하고 무조건 실행");
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}