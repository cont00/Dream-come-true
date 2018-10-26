public class Student
{
	private String name;
	private int math;
	private int eng;
	private int kor;
	private String comment;
	
	public Student(String name, int math, int eng, int kor, String comment)
	{
		this.name = name;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
		this.comment = comment;
	}
	public String toString()
	{
		return "Student [name = " + name + ", math = " + math + ", eng = " +
					eng + ", kor = " + kor + ", comment = " + comment + " ]";
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}