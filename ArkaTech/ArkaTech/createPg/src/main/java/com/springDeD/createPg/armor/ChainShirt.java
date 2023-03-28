package com.springDeD.createPg.armor;

public class ChainShirt implements Wearable
{
	private int armorClass = 13;
	private int strengthRequirement = 0;
	private String stealth = null;
	private int weight = 20;
	
	public ChainShirt()
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