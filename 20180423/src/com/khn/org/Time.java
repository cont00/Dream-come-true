package com.khn.org;

public class Time
{
	private int hour;
	private int min;
	private int second;
	
	public int getHour()
	{
		return hour;
	}
	public void setHour(int hour)
	{
		if(hour > 23)
		{
			System.out.println(hour + "0~23 ������ �ð��� �Է����ּ���");
			return;
		}
		this.hour = hour;
	}
	
	public int getMin()
	{
		return min;
	}
	public void setMin(int min)
	{
		if(min > 59)
		{
			System.out.println(hour + "0~59 ������ ���� �Է����ּ���");
			return;
		}
		this.min = min;
	}
	
	public int getSecond()
	{
		return second;
	}
	public void setSecond(int second)
	{
		if(second > 59)
		{
			System.out.println(hour + "0~59 ������ �ʸ� �Է����ּ���");
			return;
		}
		this.second = second;
	}
}