interface AAA {
	void doA();
}
interface BBB {
	void doB();
}
interface CCC {
	void doC();
}
// interface 간에 상속을 할때에는 extends 사용 (잘 사용하지는 않음)
interface DDD extends AAA {
	
}
public class Ex02 implements AAA, BBB, CCC {
	Ex02() {
		doA();
		doB();
		doC();
	}
	public void doA() {
		System.out.println("doA");
	}
	public void doB() {
		System.out.println("doB");
	}
	public void doC() {
		System.out.println("doC");
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
