package com.springDeD.createPg.armor;

public class Hide implements Wearable
{
	private int armorClass = 12;
	private int strengthRequirement = 0;
	private String stealth = null;
	private int weight = 12;
	
	public Hide()
	{
		
	}
	
	public int getArmorClass()
	{
		return this.armorClass;
	}
	
	public int getStrengthRequirement()
	{
		return this.strengthRequirement;
	}
	
	public String getStealth()
	{
		return this.stealth;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
}