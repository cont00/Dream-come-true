package com.cont00.org;
public class Student
{
	public int num;
	public String name;
	public int math;
	public int kor;
	public int eng;
	public int tot;
	public double avg;
	
	public void doStudy()
	{
		System.out.println("���θ� �� �ϰ� �ֽ��ϴ�.");
	}
	public void doPlay()
	{
		System.out.println("���½ð�");
	}
	public void doOut()
	{
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + math);
		System.out.println("���� : " + eng);
	}
}
