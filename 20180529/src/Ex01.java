/*
 * Generic ¹®¹ý
 * enum
 * 
 * ¶÷´Ù½Ä
 * PMD
 */
class KeyValue {
	int key;
	String value;
	KeyValue(int key, String value) {
		this.key = key;
		this.value = value;
	}
	public String getValue(int key) {
		return value;
	}
	@Override
	public String toString() {
		return "KeyValue [key = " + key + ", value = " + value + "]";
	}
}
class DoubleKeyValue {
	double key;
	String value;
	DoubleKeyValue(double key, String value) {
		this.key = key;
		this.value = value;
	}
	public String getValue(double key) {
		return value;
	}
	@Override
	public String toString() {
		return "KeyValue [key = " + key + ", value = " + value + "]";
	}
}
class ObjectKeyValue {
	Object key;
	Object value;
	public ObjectKeyValue (Object key, Object value) {
		this.key = key;
		value = value;
	}
	@Override
	public String toString() {
		return "ObjectKeyValue [key = " + key + ", value = " + value + "]";
	}
}
class GenericKeyValue<K,V> {
	K Key;
	V Value;
	public GenericKeyValue(K key, V value) {
		super();
		Key = key;
		Value = value;
	}
}
public class Ex01 {
	public static void main(String[] args) {
		KeyValue kv = new KeyValue(1, "±èÇö³ë");
		System.out.println(kv);
		System.out.println(kv.getValue(1));
		
		DoubleKeyValue dkv = new DoubleKeyValue(1.0, "±èÇö³ë");
		System.out.println(dkv);
		System.out.println(dkv.getValue(1.0));
		
		ObjectKeyValue okv1 = new ObjectKeyValue(1, "±èÇö³ë");
		System.out.println(okv1);
		ObjectKeyValue okv2 = new ObjectKeyValue(1.0, "±èÇö³ë");
		System.out.println(okv2);
		
		GenericKeyValue<Integer,String> gkv1 = new GenericKeyValue<>(1, "±èÇö³ë");
		System.out.println(gkv1);
		GenericKeyValue<Double,String> gkv2 = new GenericKeyValue<>(1.0, "±èÇö³ë");
		System.out.println(gkv2);
	}
}
