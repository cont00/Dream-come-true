import java.util.*;
/*
 * ArrayList 0, 1, 2, 3, 4 키 값	java, 개발자
 * 	자동으로 정해지는 숫자
 * 
 * set -> Hashset 보따리
 * 	값들의 중복을 허용하지 않는 자료형
 * 
 * map -> Hashmap 키 값이 쌍으로 이루어진 자료형
 * 	키 이름을 프래그래머가 직접 정할 수 있는 것
 * 		멍구 -> 선생
 * 		KHN -> 학생
 */
public class Ex03 {
	Ex03() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("멍구", "선생");
		hm.put("KHN", "학생");
		
		String value1 = hm.get("멍구");
		String value2 = hm.get("KHN");
		
		System.out.println("value1 = " + value1);
		System.out.println("value2 = " + value2);
		
		System.out.println("hm.size() = " + hm.size());
		
		Set<String> keys = hm.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.print("key = " + key);
			System.out.println(", value = " + hm.get(key));
		}
	}
	public static void main(String[] args) {
		new Ex03();
	}
}