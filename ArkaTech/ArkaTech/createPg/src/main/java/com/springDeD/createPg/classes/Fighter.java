/**
 * @author Giacomo Germinario, Nicolò Tola, Gabriele Sanna
 * @version 1.0
 */

 package com.springDeD.createPg.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Fighter implements Class
{
	private String className = "Fighter";
	private int numHitDie = 1;
	private String hitDice = "d10";
	private int proficiencyBonus = 2;
	private String[] savingThrows = {"Strength", "Constitution"};
	private String[] skills = {"Acrobatics", "Animal Handling", "Athletics", "History", "Insight",
			"Intimidation", "Perception", "Survival"};
	private String[] features = {"Fighting Style", "Second Wind"};
	private String[] proficiencies = {"All Armor", "Shields", "Simple Weapons", "Martial Weapons"};
	private String[] firstEquipmentChoice = {"Chain Mail", "Leather, Longbow, and 20 Arrows"};
	private String[] secondEquipmentChoice = {"Martial Weapon and a Shield", "Two Martial Weapons"};
	private String[] thirdEquipmentChoice = {"Light Crossbow and 20 Bolts", "Two Handaxes"};
	private String[] fourthEquipmentChoice = {"Dungeoneer's Pack", "Explorer's Pack"};

	public Fighter()
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
		return 10 + constitution;
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
		return null;
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