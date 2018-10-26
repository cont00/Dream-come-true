public class Person
{
	public String name = "Aps";
	public int hp = 100;
	public int at = (int)(Math.random()*5);
	
	public void doAmon(Monster mon)
	{
		mon.hp = mon.hp - at;
		System.out.println("인간의 턴입니다.");
		System.out.println("몬스터에게 일반 공격했습니다.");
		System.out.println("몬스터에게 " + at + "의 데미지를 주었습니다.");
		System.out.println("몬스터 피 : " + mon.hp + "\n");
	}
}
