package Creatures;

import Genetics.GeneBodyType;
import Genetics.GeneGender;
import Genetics.GeneModCoat;
import Genetics.GeneModInvis;
import Genetics.GeneModNum;
import Genetics.GeneModSize;
import Genetics.GeneticCode;
import Items.Item;

public class Creature {
	//Basics
	private String name;
	private GeneticCode DNA;
	//Statistics
	private int strength, toughness, inteligence, willpower, speed;
	
	//Production -- Determined at Creation
	private Item[] slaughter;
	private Item[] daily;
	
	//GET
	public String getName() {return name;}
	public int getStrength(){return strength;}
	public int getToughness(){return toughness;}
	public int getInteligence(){return inteligence;}
	public int getWillPower(){return willpower;}
	public int getSpeed(){return speed;}
	
	public GeneticCode getDNA(){return DNA;}
	
	//SET
	public void setName(String name){this.name = name;}
	public void setStrength(int strength){this.strength = strength;}
	public void setToughness(int toughness){this.toughness = toughness;}
	public void setInteligence(int inteligence){this.inteligence = inteligence;}
	public void setWillpower(int willpower){this.willpower = willpower;}
	public void setSpeed(int speed){this.speed = speed;}
	
	public void setGeneticCode(GeneticCode DNA){this.DNA = DNA;}
		
	//Constructor
	public Creature(String name, GeneticCode DNA){
		setName(name);
		setGeneticCode(DNA);
	}
}
