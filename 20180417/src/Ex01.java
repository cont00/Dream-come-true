/*
 * 변수에다가 static 선언
 * static - 프로그램 시작 시 메모리 상주, 프로그램 종료 시 메모리 제거 : 공유되는 전역변수
 * 
 * 메서드 - 함수
 * java 메서드 구현
 * return 값 메개변수
 * 
 * static 메서드
 * 
 * 메서드 오버로딩 (이름이 같은 메서드 선언 시 작동되는 방법)
 */
public class Ex01
{
	public static void main(String[] args)
	{
		HomeWork khnA = new HomeWork();
		khnA.doWork();
		HomeWork kdyB = new HomeWork();
		kdyB.doWork();
		
		System.out.println("khnA 개인과제 한 횟수 : " + khnA.private_subject_cnt);
		System.out.println("khnA 공통과제 한 횟수 : " + HomeWork.common_subject_cnt);
		
		System.out.println("kdyB 개인과제 한 횟수 : " + kdyB.private_subject_cnt);
		System.out.println("kdyB 공통과제 한 횟수 : " + HomeWork.common_subject_cnt);
	}
}
class HomeWork
{
	public int private_subject_cnt = 0;
	public static int common_subject_cnt = 0;
	public void doWork()
	{
		private_subject_cnt++;
		common_subject_cnt++;
	}
}