public class Ex07
{
	public int a = 10;
	// void 입력 시 생성자가 아니라 메서드가 된다.
	Ex07(int temp)	// class 명이랑 동일하면서 반환 값이 없는게 생성자입니다. (반환 값 : void int String float double)
	{
		System.out.println("생성자 입니다.");
		a = temp;
	}
	public static void main(String[] args)
	{
//		Ex07 ex07 = new Ex07();	//	메모리상에 올리는 것 (인스턴스화 = 객체화)
		new Ex07(30); // 메모리 초기화
	}
}