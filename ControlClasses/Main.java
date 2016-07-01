package ControlClasses;

import Creatures.Creature;
import Creatures.CreatureStorage;
import Genes.GeneLibrary;
import Genes.GeneticCode;

public class Main {
	
	CreatureStorage animals = new CreatureStorage();
	GeneLibrary genes = new GeneLibrary();
	
	public static void main(String args[]){
		Main m = new Main();
		
		int male1 = 0;
		int female1 = 0;
		
		Breeding breeder = new Breeding();
		
		//GeneticCode a = new GeneticCode(m.genes.X, m.genes.Y, m.genes.octopod, m.genes.quadruped, m.genes.normal, m.genes.normal);
		//GeneticCode b = new GeneticCode(m.genes.X, m.genes.X, m.genes.quadruped, m.genes.biped, m.genes.normal, m.genes.small);
		
		//Creature adam = new Creature("Adam", a);
		//Creature eve = new Creature("Eve", b); 
		
		//m.animals.addCreature(adam);
		//m.animals.addCreature(eve);
		
		//System.out.println(m.animals.getStoreCurrent() + "/" + m.animals.getStoreMax());
		//m.printCreatures();
		//for (int i = 0; i < 1000; i++){
		//	Creature temp = breeder.breed(adam, eve);
		//	System.out.println(temp.getDetails());
		//	if (temp.getGender().equals("MALE")){male1+=1;}else{female1+=1;}
		//}
		//System.out.println("MALE: " + male1 + " FEMALE: " + female1);
	}
	
	private void printCreatures(){
		for (int i = 0; i < animals.getListCreatureDetails().length; i++){
			System.out.println(animals.getListCreatureDetails()[i]);
		}
	}
	
}
