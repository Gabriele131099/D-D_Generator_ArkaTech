/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class HandCrossbow implements Wieldable
{
	private String damageDie = "1d6";
	private String damageType = "Piercing";
	private int weight = 3;
	private String properties = "Ammunition (range 30/120), light, loading";
	
	public HandCrossbow()
	{
		
	}
	
	public String getDamageDie()
	{
		return this.damageDie;
	}
	
	public String getDamageType()
	{
		return this.damageType;
	}
	
	public int getWeight()
	{
		return this.weight;
	}
	
	public String getProperties()
	{
		return this.properties;
	}
}