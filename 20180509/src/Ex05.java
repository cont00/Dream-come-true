public class Ex05 {
	Ex05() {
		try {
//			System.out.println("�������");
			throw new Exception("����");
			// DB ���� Connection �б� �Ӽ�
			// File ���� �� ������ �б� �Ӽ�
			
//			System.out.println("���ܰ� �߻��Ǿ ������ �ȵ˴ϴ�.");
		}	catch (Exception e) {
//			e.printStackTrace();
			System.out.println("catch �κ�");
		}
		finally {
			// File ���� ����� ��
			// DB ���� ����� ��
			System.out.println("���ܰ� �߻��ϰų� �߻����� �ʰų� �����ϰ� ������ ����");
		}
	}
	
	public static void main(String[] args) {
		new Ex05();
	}
}