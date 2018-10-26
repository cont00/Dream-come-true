import java.util.Arrays;

/*
 * try catch ~ Exception Throw new Exception
 * 예외처리
 */
public class Ex01 {
	public static int[] shuffle(int[] arr) {
		int[] result = new int[arr.length];
		Arrays.copyOf(arr, arr.length);
		
		for (int i = 0; i < (result.length / 2); i++) {
			swap(arr[i], result[(int)(Math.random() * 4 + 5)]);
		}
		return result;
	}
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}
}