/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */

 package com.springDeD.createPg.weapons;

public class Warhammer implements Wieldable
{
	public String getName() {
		return name;
	}

	private String  name="Warhammer";
	private String damageDie = "1d8";
	private String damageType = "Bludgeoning";
	private int weight = 2;
	private String properties = "Versatile (1d10)";
	
	public Warhammer()
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