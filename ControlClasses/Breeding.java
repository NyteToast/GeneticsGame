package ControlClasses;

import Creatures.Creature;

public class Breeding {
	
	
	
	
	
	public boolean canBreed(Creature male, Creature female){
		if (male.getGender() == "MALE" && female.getGender() == "FEMALE"){
			return true;
		}
		return false;
	}
	
}
