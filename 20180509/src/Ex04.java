import java.io.File;
import java.io.IOException;

public class Ex04 {
	Ex04(){
		try{
			// �Ư����Ȳ.. ���ܸ� ó���� ���ϰԲ�...
//			throw new Exception("img ������ ����.");
			throw new MyException("����");
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
	// alt shift s s  ����Ű toString() �޼��� ����
	@Override
	public String toString() {
		return "MyException [������ ����]";
	}
}



