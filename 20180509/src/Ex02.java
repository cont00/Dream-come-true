public class Ex02 {
	
	public String temp = null;
	
	Ex02() {
		int a = 10;
		int b = 0;
		
		try {
			String str = "10";
			int c = Integer.parseInt(str);	//	NumberFormatException ������ ��ȯ ����
			
			System.out.println("������� ����");
			
			if (a/b == 0) {
				System.out.println("�������");
			}	else {
				System.out.println("����");
			}
			if (temp.equals("")) {
				System.out.println("null �� �� �������� Ȯ��");
			}	//	���α׷� ���� ����
		}	catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
//			e.printStackTrace();
		}	catch (NumberFormatException e) {
			System.out.println("������ ��ȯ ����");
		}	catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("������� ���� �ǰ�����");
	}
	public static void main(String[] args) {
		new Ex02();
	}
}