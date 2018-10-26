public class Ex04 {
	public static void main(String[] args) {
		Ex04.<String, String>doDisplay("1번", "남자");
		Ex04.<String, Integer>doDisplay2("1번", 1);
	}
	
	private static <K, V> void doDisplay(K k, V v) {
		System.out.println("K = " + k);
		System.out.println("V = " + v);
	}
	private static <K, V extends Number> void doDisplay2(K k, V v) {
		System.out.println("K = " + k);
		System.out.println("V = " + v);
	}
}
