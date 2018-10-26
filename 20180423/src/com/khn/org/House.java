package com.khn.org;
/*
 * 母蕉拳
 */
public class House
{
	private String name;
	private int area;
	private int deposit;
	private int rent;
	
//	getter 巩过
//	setter 巩过
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	
	public void setArea(int area)
	{
		this.area = area;
	}
	public int getArea()
	{
		return this.area;
	}
	
	public void setDeposit(int deposit)
	{
		this.deposit = deposit;
	}
	public int getDeposit()
	{
		return this.deposit;
	}
	
	public void setRent(int rent)
	{
		this.rent = rent;
	}
	public int getRent()
	{
		return this.rent;
	}
	
	public House() {} // 积帆等 积己磊
	public House(String name, int area, int deposit, int rent)
	{
		this.name = name;
		this.area = area;
		this.deposit = deposit;
		this.rent = rent;
	}
	
	public String toString()
	{
		return "House[name = " + this.name + "]" +
				"[area = " + this.area + "]" +
				"[deposit = " + this.deposit + "]" +
				"[rent = " + this.rent + "]";
	}
}