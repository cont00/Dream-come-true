public class Ex01
{
	Ex01()
	{
		Student student = new Student("������", 100, 100, 100, "��ǻ�Ͱ��� ������");
		System.out.println(student);
		student.setName("KimHyunNo");
		System.out.println(student);
	}
	public static void main(String[] args)
	{
		new Ex01();
	}
}