import java.util.*;

public class Ex04 {
	Ex04() {
		HashSet<String> hs = new HashSet<>();
		hs.add("KHN");
		hs.add("KHN");
		hs.add("KHN");
		hs.add("K-H-N");
		hs.add("K_H_N");
		
		Object[] ary = hs.toArray();
		
		System.out.println("ary[ 0 ] = " + ary[0]);
		System.out.println("ary[ 1 ] = " + ary[1]);
		System.out.println("ary[ 2 ] = " + ary[2]);
//		System.out.println("ary[ 3 ] = " + ary[3]);
		
		Iterator<String> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void main(String[] args) {
		new Ex04();
	}
}