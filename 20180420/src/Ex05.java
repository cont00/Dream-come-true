public class Ex05
{
	Ex05()
	{
		Person p1 = new Person();
		System.out.println(p1);
		Person p2 = new Person("����");
		System.out.println(p2);
		Person p3 = new Person("���Ǹ���", "����", 155);
		System.out.println(p3);
	}
	
	public static void main(String[] args)
	{
		new Ex05();
	}
}