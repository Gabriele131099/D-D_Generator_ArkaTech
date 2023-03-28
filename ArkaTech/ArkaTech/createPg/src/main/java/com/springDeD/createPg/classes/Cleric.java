/**
 * @author Giacomo Germinario, Nicolò Tola, Gabriele Sanna
 * @version 1.0
 */

 package com.springDeD.createPg.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Cleric implements Class
{
	String className = "Cleric";
	private int numHitDie = 1;
	private String hitDice = "d8";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Wisdom", "Charisma"};
	private String[] skills = {"History", "Insight", "Medicine", "Persuasion", "Religion"};
	private String[] features = {"Spellcasting", "Divine Domain"};
	private String[] proficiencies = {"Light Armor", "Medium Armor", "Shields", "All Simple Weapons"};
	private String[] firstEquipmentChoice = {"Mace", "Warhammer"};
	private String[] secondEquipmentChoice = {"Scale Mail", "Leather Armor", "Chain Mail"};
	private String[] thirdEquipmentChoice = {"Light Crossbow and 20 Bolts", "Any Simple Weapon"};
	private String[] fourthEquipmentChoice = {"Priest's Pack", "Explorer's Pack"};
	private String[] guaranteedEquipment = {"Shield", "Holy Symbol"};
	
	public Cleric()
	{
		
	}

	@Override
	public String getClassName() {
		return className;
	}

	public int getNumHitDie()
	{
		return numHitDie;
	}
	
	public String getHitDice()
	{
		return hitDice;
	}

	public int getHitPoints(int constitution)
	{
		return 8 + constitution;
	}

	public int getProficiencyBonus()
	{
		return proficiencyBonus;
	}

	public String[] getSavingThrows() 
	{
		return savingThrows;
	}

	public String[] getSkills() {
		return skills;
	}

	public String[] getFeatures()
	{
		return features;
	}

	public String[] getProficiencies()
	{
		return proficiencies;
	}

	public String[] getFirstEquipmentChoice()
	{
		return firstEquipmentChoice;
	}

	public String[] getSecondEquipmentChoice()
	{
		return secondEquipmentChoice;
	}

	public String[] getThirdEquipmentChoice()
	{
		return thirdEquipmentChoice;
	}

	public String[] getFourthEquipmentChoice()
	{
		return fourthEquipmentChoice;
	}

	public String[] getGuaranteedEquipment()
	{
		return guaranteedEquipment;
	}
	
	public ArrayList<String> getAllFeatures(int constitution)
	{
		ArrayList<String> features = new ArrayList<String>();
		features.add(String.valueOf(getNumHitDie()));
		features.add(getHitDice());
		features.add(String.valueOf(getHitPoints(constitution)));
		features.add(String.valueOf(getProficiencyBonus()));
		features.add(Arrays.toString(getSavingThrows()));
		features.add(Arrays.toString(getSkills()));
		features.add(Arrays.toString(getFeatures()));
		features.add(Arrays.toString(getProficiencies()));
		features.add(Arrays.toString(getGuaranteedEquipment()));
		return features;
	}
}