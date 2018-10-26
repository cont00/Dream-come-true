/*
 * �������ٰ� static ����
 * static - ���α׷� ���� �� �޸� ����, ���α׷� ���� �� �޸� ���� : �����Ǵ� ��������
 * 
 * �޼��� - �Լ�
 * java �޼��� ����
 * return �� �ް�����
 * 
 * static �޼���
 * 
 * �޼��� �����ε� (�̸��� ���� �޼��� ���� �� �۵��Ǵ� ���)
 */
public class Ex01
{
	public static void main(String[] args)
	{
		HomeWork khnA = new HomeWork();
		khnA.doWork();
		HomeWork kdyB = new HomeWork();
		kdyB.doWork();
		
		System.out.println("khnA ���ΰ��� �� Ƚ�� : " + khnA.private_subject_cnt);
		System.out.println("khnA ������� �� Ƚ�� : " + HomeWork.common_subject_cnt);
		
		System.out.println("kdyB ���ΰ��� �� Ƚ�� : " + kdyB.private_subject_cnt);
		System.out.println("kdyB ������� �� Ƚ�� : " + HomeWork.common_subject_cnt);
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