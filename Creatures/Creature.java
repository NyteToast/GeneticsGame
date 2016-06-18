package Creatures;

import Genes.GeneticCode;
import Items.Item;

public abstract class Creature {
	private GeneticCode DNA;
	
	private String name;
	
	private int gender;
	//Production -- Determined at Creation
	private Item[] Slaughter;
	private Item[] Daily;
	//State
	private boolean pregnant;
	private int tillBirth; //Number of days till not pregnant
	
	public String getGender(){
		if (gender == 0){return "MALE";}
		else {return "FEMALE";}
	}
}
