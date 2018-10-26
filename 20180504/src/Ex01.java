/*
 * java
 * 	abstract class	-	추상적인 클래스 라고 추상메서드 재정의
 * 	interface 구문	-	더 추상적이고 설계, 다중상속
 * 
 * jframe 그림	-	상속받아서 하는게 아닌 안에서 사용
 * 
 * javascript
 * 	Bom 브라우저객체들
 * 
 * extents	클래스 상속
 * implements 인터페이스 상속
 */
interface AA {
	void doA();	//	public 생략가능
	public void doB();
	
	public static final int a = 10;
	int b = 20;	//	public static final 숨겨져있음
}

public class Ex01 implements AA {
	public static void main(String[] args) {
		Ex01 ex01 = new Ex01();
		ex01.doA();
		ex01.doB();
		
		System.out.println("ex01.a = " + ex01.a);
		System.out.println("ex01.b = " + ex01.b);
//		AA.a++;
		System.out.println("AA.a = " + AA.a);
		System.out.println("AA.b = " + AA.b);
	}
	
	@Override
	public void doA() {
		System.out.println("doA의 재정의된 메서드");
	}
	@Override
	public void doB() {
		System.out.println("doB의 재정의된 메서드");
	}
}