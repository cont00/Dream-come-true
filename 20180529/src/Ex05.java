enum Date {
	Monday(1, "������"), Tuesday(2, "ȭ����"), Wednesday(3, "������");
	
	private int position;
	private String name;
	
	Date (int position, String name) {
		this.position = position;
		this.name= name;
	}
	public int getPosition() {
		return position;
	}
	public String getName() {
		return name;
	}
}
class ClassDate {
	public static String Monday = "Monday";
	public static String Tuesday = "Tuesday";
	public static String Wednesday = "Wednesday";
}
public class Ex05 {
	public static void main(String[] args) {
		System.out.println(Date.Monday);
		System.out.println(ClassDate.Monday);
		
		System.out.println(Date.Tuesday);
		System.out.println(ClassDate.Tuesday);
		
		System.out.println(Date.Wednesday);
		System.out.println(ClassDate.Wednesday);
		
		System.out.println(Date.Monday.getPosition());
		System.out.println(Date.Tuesday.getPosition());
		System.out.println(Date.Wednesday.getPosition());
		
		System.out.println(Date.Monday.getName());
		System.out.println(Date.Tuesday.getName());
		System.out.println(Date.Wednesday.getName());
	}
}
