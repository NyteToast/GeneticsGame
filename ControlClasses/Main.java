package ControlClasses;

import Creatures.Creature;
import Creatures.CreatureStorage;
import Genetics.GeneLibrary;
import Genetics.GeneticCode;

public class Main {
	
	CreatureStorage animals = new CreatureStorage();
	GeneLibrary genes = new GeneLibrary();
	
	public static void main(String args[]){
		Main m = new Main();
		
		int male1 = 0;
		int female1 = 0;
		
		Breeding breeder = new Breeding();
		
		
	}
	
	private void printCreatures(){
		for (int i = 0; i < animals.getListCreatureDetails().length; i++){
			System.out.println(animals.getListCreatureDetails()[i]);
		}
	}
	private void gameLoop(){
		while(true){
			checkLevelUps();
			
		}
	}

	private void checkLevelUps() {
		// TODO Auto-generated method stub
		
	}
	
}
