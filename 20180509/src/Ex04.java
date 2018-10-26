import java.io.File;
import java.io.IOException;

public class Ex04 {
	Ex04(){
		try{
			// 어떤특정상황.. 예외를 처리를 못하게끔...
//			throw new Exception("img 파일이 음따.");
			throw new MyException("예외");
		}catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.toString());
		}
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}
class MyException extends Exception{
	MyException(String exc){
		super(exc);
		File file = new File("./abc.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
//		file.canWrite(qcwerkljnqwcerjkn);
	}
	// alt shift s s  단축키 toString() 메서드 정의
	@Override
	public String toString() {
		return "MyException [나만의 예외]";
	}
}



