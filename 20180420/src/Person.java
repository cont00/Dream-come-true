public class Person
{
	public String name;
	public String sex;
	public int height;
	
	public Person()
	{
		name = "������";
		sex = "����";
		height = 175;
	}
	public Person(String name)
	{
		this();
		this.name = name;
	}
	public Person(String name, String sex, int height)
	{
		this.name = name;
		this.sex = sex;
		this.height = height;
	}
	public String toString()
	{
		return "name = " + this.name +
				"sex = " + this.sex +
				"height = " + this.height;
	}
	//	alt + shift + s + s toString �ڵ�����
}