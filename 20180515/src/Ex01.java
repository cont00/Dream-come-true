/*
 * Thread ��������� �� ����
 * 
 * extends Thread ��ӹ޾Ƽ� ����ϴ� ���
 * implements Runnable �������̽��� ��ӹ޾Ƽ� ����ϴ� ���
 * 
 * run �޼��带 ������ �ؼ� start() �Լ��� �����Ѵ�.
 */
public class Ex01 {
	public static void main(String[] args) {
		System.out.println("main Thread start");
		myThread mt1 = new myThread("K");
		mt1.start();
		myThread mt2 = new myThread("H");
		mt2.start();
		myThread mt3 = new myThread("N");
		mt3.start();
		for ( int i = 0; i < 100; i++) {
			System.out.println("main " + i);
		}
		System.out.println("main Thread end");
	}
}

class myThread extends Thread {
	private String name;
	public myThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("my Thread start");
		for ( int i = 0; i < 100; i++) {
			System.out.println(name + " Thread " + i);
		}
		System.out.println("my Thread end");
	}
	
}