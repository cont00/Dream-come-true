public class K5 extends Car
{
	Engine eng;
	K5()
	{
		this(new Engine(),4,4,"K5");
	}
	K5(Engine eng, int tire, int door, String carname)
	{
		this.eng = eng;
		this.tire = tire;
		this.door = door;
		this.carname = carname;
	}
	public void info()
	{
		System.out.println("tire = " + tire);
		System.out.println("door = " + door);
		System.out.println("carname = " + carname);
		System.out.println("eng.name = " + eng.name);
	}
}