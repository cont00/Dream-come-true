public class Person
{
	public String name = "Aps";
	public int hp = 100;
	public int at = (int)(Math.random()*5);
	
	public void doAmon(Monster mon)
	{
		mon.hp = mon.hp - at;
		System.out.println("�ΰ��� ���Դϴ�.");
		System.out.println("���Ϳ��� �Ϲ� �����߽��ϴ�.");
		System.out.println("���Ϳ��� " + at + "�� �������� �־����ϴ�.");
		System.out.println("���� �� : " + mon.hp + "\n");
	}
}
