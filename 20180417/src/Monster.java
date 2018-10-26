public class Monster
{
	public String name = "Amon";
	public int hp = 150;
	public int at = (int)(Math.random()*4);
	
	public void doAps(Person per)
	{
		per.hp = per.hp - at;
		System.out.println("몬스터의 턴입니다.");
		System.out.println("인간에게 일반 공격했습니다.");
		System.out.println("인간에게 " + at + "의 데미지를 주었습니다.");
		System.out.println("인간 피 : " + per.hp + "\n");
	}
}