class Tv
{
	public String name;
	public int channel;
	public void upchannel()
	{
		channel ++ ;
	}
	public void downchannel()
	{
		channel -- ;
	}
}
public class Ex02
{
	public static void main(String[] args)
	{
		Tv tv1 = new Tv();
		tv1.name = "삼성TV";
		tv1.channel = 30;
		tv1.upchannel();
		
		Tv tv2 = new Tv();
		tv2.name = "LGTV";
		tv2.channel = 20;
		tv2.upchannel();
		
		System.out.println("현재 tv1 의 name : " + tv1.name);
		System.out.println("현재 tv1 의 channel : " + tv1.channel);
		
		System.out.println("현재 tv2 의 name : " + tv2.name);
		System.out.println("현재 tv2 의 channel : " + tv2.channel);
	}
}