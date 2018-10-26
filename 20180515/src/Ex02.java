public class Ex02 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new AA("H Thread"));
		th1.start();
		Thread th2 = new Thread(new AA("N Thread"));
		th2.start();
		System.out.println("main 작업 시작");
		for (int i = 0; i < 1000; i++) {
			System.out.println("main " + i);
		}
		System.out.println("main 작업 종료");
	}
}
class AA implements Runnable {
	private String name;
	AA(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("Runnable" + name + "start");
		for (int i = 0; i < 1000; i++) {
			System.out.println("Runnable " + name + " " + i);
		}
		System.out.println("Runnable" + name + "end");
	}
	
}