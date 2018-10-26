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
		System.out.println("공부를 잘 하고 있습니다.");
	}
	public void doPlay()
	{
		System.out.println("쉬는시간");
	}
	public void doOut()
	{
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
	}
}
