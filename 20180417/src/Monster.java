public class Monster
{
	public String name = "Amon";
	public int hp = 150;
	public int at = (int)(Math.random()*4);
	
	public void doAps(Person per)
	{
		per.hp = per.hp - at;
		System.out.println("������ ���Դϴ�.");
		System.out.println("�ΰ����� �Ϲ� �����߽��ϴ�.");
		System.out.println("�ΰ����� " + at + "�� �������� �־����ϴ�.");
		System.out.println("�ΰ� �� : " + per.hp + "\n");
	}
}