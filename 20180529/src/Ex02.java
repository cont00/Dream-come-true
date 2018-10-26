class AA {
	public void doDisplay() {
		System.out.println("AA");
	}
}
class BB {
	public void doDisplay() {
		System.out.println("BB");
	}
}
public class Ex02 {
	public static void main(String[] args) {
		Object[] obj = new Object[4];
		obj[0] = new AA();
		obj[1] = new BB();
		obj[2] = new AA();
		obj[3] = new BB();
		
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] instanceof AA)
				((AA)obj[i]).doDisplay();
			else if (obj[i] instanceof BB)
				((BB)obj[i]).doDisplay();
		}
	}
}
