/**
 * @author Brandon Campbell
 * @version 1.0
 */
package com.springDeD.createPg.races;

import java.util.ArrayList;
import java.util.Arrays;

public class Dragonborn extends NoRace {
	private String racesName = "Dragonborn";
	private int speed = 30;
	private String size = "Medium";
	private String[] languages = { "Common", "Draconic" };
	private String[] racialBonus = { "Breath Weapon", "Damage Resistance Based on Draconic Ancestry" };

	public Dragonborn(int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) {
		// +2 strength and +1 charisma bonus from racial modifier.
		super(strength + 2, dexterity, constitution, intelligence, wisdom, charisma + 1);
	}

	public int getSpeed() {
		return speed;
	}

	public String[] getRacialBonus() {
		return racialBonus;
	}

	public String[] getSubRacialBonus() {
		return null;
	}

	public String[] getLanguages() {
		return languages;
	}

	public String getSize() {
		return size;
	}

	public ArrayList<String> getAllAttributes() {
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

	@Override
	public String getRacesName() {
		return racesName;
	}
}