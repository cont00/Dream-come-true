import java.io.File;
import java.io.IOException;

public class Ex01 {
	Ex01() {
		try {
			File file = new File("src/aaa.txt");
			file.createNewFile();
		}	catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("정상종료");
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}