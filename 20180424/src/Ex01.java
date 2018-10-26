public class Ex01
{
	Ex01()
	{
		Student student = new Student("김현노", 100, 100, 100, "컴퓨터게임 좋아함");
		System.out.println(student);
		student.setName("KimHyunNo");
		System.out.println(student);
	}
	public static void main(String[] args)
	{
		new Ex01();
	}
}