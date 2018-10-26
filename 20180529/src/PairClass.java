class Pair<T1 /*extends Number*/, T2, T3> {
	T1 id;
	T2 pw;
	T3 remark;
	public Pair(T1 id, T2 pw, T3 remark) {
		super();
		this.id = id;
		this.pw = pw;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Pair [id = " + id + ", pw = " + pw + ", remark = " + remark + "]";
	}
	
}
public class PairClass {
	public static void main(String[] args) {
		Pair<String, String, String> p1 = 
				new Pair("cont00", "****************", "�α��ο� �����Ͽ����ϴ�.");
		System.out.println(p1);
		
		Pair<Integer, Integer, String> p2 = 
				new Pair("bdg99466", "***************", "�α��ο� �����Ͽ����ϴ�.");
		System.out.println(p2);
	}
}
