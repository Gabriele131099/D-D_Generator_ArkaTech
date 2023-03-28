/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

import java.util.ArrayList;

public class HalfElf extends NoRace
{
	private String racesName = "HalfElf";
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = {"Common", "Elvish", "Additional Language"};
	private String[] racialBonus = {"Choose +1 for two ability scores", "Darkvision", "Fey Ancestry",
			"Skill Versatility"};
	private String[] subRacialBonus = {""};
	
	public HalfElf(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +2 constitution bonus from racial modifier.
		super(strength, dexterity, constitution, intelligence, wisdom, charisma + 2);
	}
	
	public int getSpeed()
	{
		return speed;
	}

	public String[] getRacialBonus()
	{
		return racialBonus;
	}
	
	public String[] getSubRacialBonus()
	{
		return subRacialBonus;
	}

	public String[] getLanguages()
	{
		return languages;
	}

	public String getSize()
	{
		return size;
	}
	
	public String getRacesName(){
		return racesName;
	}
	public ArrayList<String> getAllAttributes()
	{
		ArrayList<String> attributes = new ArrayList<String>();
		attributes.add(getRacesName());
		attributes.add(String.valueOf(getStrength()));
		attributes.add(String.valueOf(getDexterity()));
		attributes.add(String.valueOf(getConstitution()));
		attributes.add(String.valueOf(getIntelligence()));
		attributes.add(String.valueOf(getWisdom()));
		attributes.add(String.valueOf(getCharisma()));
		attributes.add(String.valueOf(getSpeed()));
		attributes.add(String.valueOf(getRacialBonus()));
		attributes.add(String.valueOf(getSubRacialBonus()));
		attributes.add(String.valueOf(getLanguages()));
		attributes.add(String.valueOf(getSize()));
		return attributes;
	}
}