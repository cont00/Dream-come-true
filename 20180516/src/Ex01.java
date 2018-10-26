import java.util.*;
/*
 * collections
 * generics
 * ����
 * ��Ʈ��ũ ���� DB��ġ
 * DB����
 * 
 * Collections : �迭�� Ȯ����, �迭�� ������ �� ũ�⸦ ���ؾ������� Collections �� ������ �ʿ䰡 ����.
 * 
 * List -> ArrayList
 * Set
 * Map
 */
public class Ex01 {
	Ex01() {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("������");
		al.add("���� �ʽ��ϴ�.");
		
		System.out.println("al.get(0) = " + al.get(0));
		System.out.println("al.get(1) = " + al.get(1));
		System.out.println("al.get(2) = " + al.get(2));
		System.out.println("al.size = " + al.size());
		
		String a = al.get(0);
		String b = al.get(1);
		String c = al.get(2);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		al.remove(1);
		System.out.println("al.get(0) = " + al.get(0));
		System.out.println("al.get(1) = " + al.get(1));
//		System.out.println("al.get(2) = " + al.get(2)); // ������ �߰� IndexOut
		
		al.clear();
		System.out.println("al.size = " + al.size());
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}