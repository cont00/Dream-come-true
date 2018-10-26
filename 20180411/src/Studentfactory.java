public class Studentfactory
{
	public static void main(String[] args)
	{
		Student student1 = new Student();
		student1.name = "±èÇö³ë";
		student1.kor = 100;
		student1.math = 100;
		student1.eng = 100;
		System.out.println(student1.name);
		System.out.println(student1.kor);
		System.out.println(student1.math);
		System.out.println(student1.eng + "\n");
		
		Student student2 = new Student();
		student2.name = "±èµ¿¿í";
		student2.kor = 90;
		student2.math = 90;
		student2.eng = 90;
		System.out.println(student2.name);
		System.out.println(student2.kor);
		System.out.println(student2.math);
		System.out.println(student2.eng + "\n");
		
		Student student3 = new Student();
		student3.name = "È«±æµ¿";
		student3.kor = 80;
		student3.math = 80;
		student3.eng = 80;
		System.out.println(student3.name);
		System.out.println(student3.kor);
		System.out.println(student3.math);
		System.out.println(student3.eng);
	}
}