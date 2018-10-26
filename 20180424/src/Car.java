public class Car
{
	public int tire;
	public int door;
	public String carname;
	
	Car()
	{
		
	}
	@Override
	public String toString()
	{
		return "Car [tire = " + tire +
				", door = " + door +
				", carname = " + carname +
				"]";
	}
}