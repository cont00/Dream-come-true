interface AAA {
	void doA();
}
interface BBB {
	void doB();
}
interface CCC {
	void doC();
}
// interface ���� ����� �Ҷ����� extends ��� (�� ��������� ����)
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
