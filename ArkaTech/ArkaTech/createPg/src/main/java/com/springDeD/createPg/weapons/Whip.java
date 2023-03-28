/**
 * @authors Giacomo Germinario, Gabriele Sanna, Nicolò Tola
 * @version 1.0
 */
package com.springDeD.createPg.weapons;

public class Whip implements Wieldable
{
	private String damageDie = "1d4";
	private String damageType = "Slashing";
	private int weight = 3;
	private String properties = "Finesse, reach";
	
	public Whip()
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