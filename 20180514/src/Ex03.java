import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex03 {
	Ex03() {
//		String dir = "src";
//		File folder = new File(dir);
//		String fileName = "bbb.txt";
//		File file = new File(folder, fileName);
		
		String file_str = "src" + File.separator + "bbb.txt";
		File file = new File(file_str);
		
		try {
			byte[] str = new byte[64];
			FileInputStream fis = new FileInputStream(file);
			fis.read(str);
			
			for (int i = 0; i < str.length; i++) {
				System.out.println("str[" + i + "] = " + str[i]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
}