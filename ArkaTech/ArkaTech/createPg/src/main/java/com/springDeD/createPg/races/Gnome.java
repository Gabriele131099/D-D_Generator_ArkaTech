/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

import java.util.ArrayList;
import java.util.Arrays;

public class Gnome extends NoRace
{
	private String racesName = "Gnome";
	private int speed = 25;
	private String size = "Small";
	private String[] languages = {"Common", "Gnomish"};
	private String[] racialBonus = {"Darkvision", "Gnome Cunning"};
	private String[] subRacialBonus = {""};
	
	public Gnome(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) 
	{
		// +2 intelligence bonus from racial modifier.
		super(strength, dexterity, constitution, intelligence + 2, wisdom, charisma);
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
	
	@Override
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