import java.util.ArrayList;

public class Ex02 {
	Ex02() {
		ArrayList<AA> al = new ArrayList<>();
		AA a = new AA("java");
		AA b = new AA("개발자");
		AA c = new AA("할 수 있어요 힘내세요!");
		
		al.add(a);
		al.add(b);
		al.add(c);
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("al.get(" + i + ").name = " + al.get(i).name);
		}
	}
	public static void main(String[] args) {
		new Ex02();
	}
}
class AA {
	String name;
	AA(String name) {
		this.name = name;
	}
}