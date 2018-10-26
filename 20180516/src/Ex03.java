import java.util.*;
/*
 * ArrayList 0, 1, 2, 3, 4 Ű ��	java, ������
 * 	�ڵ����� �������� ����
 * 
 * set -> Hashset ������
 * 	������ �ߺ��� ������� �ʴ� �ڷ���
 * 
 * map -> Hashmap Ű ���� ������ �̷���� �ڷ���
 * 	Ű �̸��� �����׷��Ӱ� ���� ���� �� �ִ� ��
 * 		�۱� -> ����
 * 		KHN -> �л�
 */
public class Ex03 {
	Ex03() {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("�۱�", "����");
		hm.put("KHN", "�л�");
		
		String value1 = hm.get("�۱�");
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