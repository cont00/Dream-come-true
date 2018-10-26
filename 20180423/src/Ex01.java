/*
 * 1. static -> 변수에 메서드
 * 	공유되는 전역변수
 * 
 * 2. class
 * 	객체, 어떤 사물이나 사람이나 설계 new 라는 예약어 메모리에 할당 사용
 * 
 * 3. 생성자
 * 	new 사용할 때 메모리에 초기 값 넣고 싶었을 때 this 라는 예약어 this.변수명, this(); 생성자 안에서 생성자 호출할 때
 * 
 * 4. 참조에의한복사 call by reference
 * 	객체, 배열변수를 메서드에 매개변수 보낼 때 참조에 의한 복사
 * 
 * 5. 값에의한복사 call by value
 * 	기본형 타입에 매개변수를 메서드에 보낼 때
 */
public class Ex01
{
	Ex01()
	{
		this(10);
		System.out.println("기본생성자");
	}
	Ex01(int a)
	{
		this(a, "안녕?");
		System.out.println("int a 생성자");
	}
	Ex01(int a, String b)
	{
		System.out.println("int a 생성자, String b 생성자");
	}
	public static void main(String[] args)
	{
		new Ex01(); // 메모리에 할당 되자마자 필요가 없기 때문에 참조변수가 없다.
					// 쓰레드 우선순위가 제일 낮은 순서이기 때문에 참조하는지 안하는지 검색해서 null삭제
//		new Ex01(10);
//		new Ex01(10, "안녕?");
	}
}