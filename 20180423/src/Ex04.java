import com.khn.org.House;

public class Ex04
{
	public static void main(String[] args)
	{
		House h1 = new House("ġŲ��",32,1000000,300000);
		System.out.println(h1.toString());
		
		House h2 = new House("������",36,1300000,340000);
		System.out.println(h2.toString());
		
		House h3 = new House("����", 52,3200000,820000);
		System.out.println(h3.toString());
	}
}