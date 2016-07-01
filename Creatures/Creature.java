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
	private String[] slaughter = {"Meat"};
	private String[] daily = {"Milk"};
	//State
	private boolean pregnant = false;
	private int tillBirth = 0; //Number of days till not pregnant
	
	//GET
	public String getGender(){if (DNA.getGender() == 0){return "MALE";}else {return "FEMALE";}}
	public String getName() {return name;}
	public String getBodyType(){return DNA.getDominantBodyType();}
	public String getBodySize(){return DNA.getDominantBodySize();}
	public String getDetails(){return "Name: " + getName() + " Gender: " + getGender() + " Body Type: " + getBodySize() +" " + getBodyType();}
	
	public int getStrength(){return strength;}
	public int getToughness(){return toughness;}
	public int getInteligence(){return inteligence;}
	public int getWillPower(){return willpower;}
	public int getSpeed(){return speed;}
	
	public GeneGender getGeneGender(int index){return DNA.getGeneGender(index);}
	public GeneBodyType getGeneBodyType(int index){return DNA.getGeneBodyType(index);}
	public GeneModSize getGeneBodySize(int index){return DNA.getGeneBodySize(index);}
	public GeneModCoat getGeneBodyCoat(int index){return DNA.getGeneBodyCoat(index);}
	public GeneModNum getGeneBodyModNum(int index){return DNA.getGeneBodyModNum(index);}
	public GeneModInvis getGeneBodyMod(int index, int mod){return DNA.getGeneBodyMod(index, mod);}
	//SET
	public void setName(String name){this.name = name;}
	public void setGeneticCode(GeneticCode DNA){this.DNA = DNA;}
	
	public void setStrength(int strength){this.strength = strength;}
	public void setToughness(int toughness){this.toughness = toughness;}
	public void setInteligence(int inteligence){this.inteligence = inteligence;}
	public void setWillpower(int willpower){this.willpower = willpower;}
	public void setSpeed(int speed){this.speed = speed;}
		
	//Constructor
	public Creature(String name, GeneticCode DNA){
		setName(name);
		setGeneticCode(DNA);
	}
}
