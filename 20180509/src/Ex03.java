public class Ex03 {
	Ex03() throws Exception {
		doA();
	}
	
	public void doA() throws Exception {
		System.out.println("doA method");
		doB();
	}
	
	public void doB() throws Exception {
		System.out.println("doB method");
		doC();
	}
	
	public void doC() throws Exception {
		// 에러가 발생
		System.out.println("doC method");
	}
	
	public static void main(String[] args) throws Exception {
		new Ex03();
	}
}