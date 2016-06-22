package Creatures;

import Genes.GeneBodyType;
import Genes.GeneGender;
import Genes.GeneticCode;
import Items.Item;

public class Creature {
	private GeneticCode DNA;
	
	private String name;
	
	//Production -- Determined at Creation
	private String[] Slaughter = {"Meat"};
	private String[] Daily = {"Milk"};
	//State
	private boolean pregnant = false;
	private int tillBirth = 0; //Number of days till not pregnant
	
	//GET
	public String getGender(){
		if (DNA.getGender() == 0){return "MALE";}
		else {return "FEMALE";}
	}
	public String getName() {return name;}
	public String getBodyType(){return DNA.getBodyType();}
	public String getDetails(){return "Name: " + getName() + " Gender: " + getGender() + " Body Type: " + getBodyType();}
	public GeneGender getGeneGender(int index){
		return DNA.getGeneGender(index);
	}
	public GeneBodyType getGeneBodyType(int index){
		return DNA.getGeneBodyType(index);
	}
	//SET
	public void setName(String name){this.name = name;}
	//Constructor
	public Creature(String name, GeneticCode DNA){
		this.name = name;
		this.DNA = DNA;
	}
}
