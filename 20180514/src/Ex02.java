import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex02 {
	Ex02() {
		try {
			String dir = "src";
			File file = new File(dir);
			String[] temp = file.list();
//			for (String filename : temp) {
//				System.out.println(filename);
//			}
			
			File bbb = new File(dir, "bbb.txt");
			bbb.createNewFile();
			String str = "안녕하세요 KHN입니다.";
			FileOutputStream out = new FileOutputStream(bbb);
			out.write(str.getBytes());
			out.flush();
			out.close();
//			FileInputStream in = new FileInputStream(bbb);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new Ex02();
	}
}