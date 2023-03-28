/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

import java.util.ArrayList;
import java.util.Arrays;

public class Halfling extends NoRace
{
	private String racesName = "Halfling";
	private int speed = 25;
	private String size = "Medium";
	private String[] languages = {"Common", "Halfling"};
	private String[] racialBonus = {"Lucky", "Brave", "Halfling Nimbleness"};
	private String[] subRacialBonus = {""};

	public Halfling(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +2 dexterity bonus from racial modifier.
		super(strength, dexterity + 2, constitution, intelligence, wisdom, charisma);
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
		attributes.add(Arrays.toString(getRacialBonus()));
		attributes.add(Arrays.toString(getSubRacialBonus()));
		attributes.add(Arrays.toString(getLanguages()));
		attributes.add(String.valueOf(getSize()));
		return attributes;
	}
}