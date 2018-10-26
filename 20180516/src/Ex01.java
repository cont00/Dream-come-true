import java.util.*;
/*
 * collections
 * generics
 * 람다
 * 네트워크 연결 DB설치
 * DB연결
 * 
 * Collections : 배열의 확장판, 배열은 선언할 때 크기를 정해야하지만 Collections 는 정해줄 필요가 없다.
 * 
 * List -> ArrayList
 * Set
 * Map
 */
public class Ex01 {
	Ex01() {
		ArrayList<String> al = new ArrayList<>();
		al.add("java");
		al.add("개발자");
		al.add("쉽지 않습니다.");
		
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
//		System.out.println("al.get(2) = " + al.get(2)); // 데러가 뜨게 IndexOut
		
		al.clear();
		System.out.println("al.size = " + al.size());
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}