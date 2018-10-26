import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex04 {
	Ex04() {
		File file = new File("src" + File.separator + "ccc.txt");
		
		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));
			pw.flush();
			pw.close();
			
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line = br.readLine();
			System.out.println("line = " + line);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Ex04();
	}
}