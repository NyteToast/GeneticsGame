package ControlClasses;

import java.util.Random;

import Creatures.Creature;
import Genetics.GeneBodyType;
import Genetics.GeneGender;
import Genetics.GeneLibrary;
import Genetics.GeneModCoat;
import Genetics.GeneModInvis;
import Genetics.GeneModNum;
import Genetics.GeneModSize;
import Genetics.GeneModifier;
import Genetics.GeneticCode;

public class Breeding {
	
	GeneLibrary genes = new GeneLibrary();
	Random r = new Random();
	
	public boolean canBreed(Creature creature1, Creature creature2){
		if (!creature1.getDNA().getGeneGender().equals(creature2.getGender())){
			return true;
		}
		return false;
	}
	public Creature breed(Creature creature1, Creature creature2){
		if (canBreed(creature1, creature2)){
			//INHERITANCE
			GeneGender[] tempGender = new GeneGender[2];
			tempGender[0] = creature1.getDNA().getGeneGender(r.nextInt(2));
			tempGender[1] = creature2.getDNA().getGeneGender(r.nextInt(2));
			
			GeneBodyType[] tempBodyType = new GeneBodyType[2];
			tempBodyType[0] = creature1.getDNA().getGeneBodyType(r.nextInt(2));
			tempBodyType[1] = creature2.getDNA().getGeneBodyType(r.nextInt(2));
			
			GeneModSize[] tempBodySize = new GeneModSize[2];
			tempBodySize[0] = creature1.getDNA().getGeneBodySize(r.nextInt(2));
			tempBodySize[1] = creature2.getDNA().getGeneBodySize(r.nextInt(2));
			
			GeneModCoat[] tempBodyCoat = new GeneModCoat[2];
			tempBodyCoat[0] = creature1.getDNA().getGeneBodyCoat(r.nextInt(2));
			tempBodyCoat[1] = creature2.getDNA().getGeneBodyCoat(r.nextInt(2));
			
			GeneModNum[] tempBodyModNum = new GeneModNum[2];
			tempBodyModNum[0] = creature1.getDNA().getGeneBodyModNum(r.nextInt(2));
			tempBodyModNum[1] = creature2.getDNA().getGeneBodyModNum(r.nextInt(2));
			
			GeneModifier[][] tempBodyMod = new GeneModifier[2][10];
			for (int i = 0; i < 10; i++){
				int tempInt = r.nextInt(2);
				if (!creature1.getDNA().getGeneBodyMod(tempInt,i).equals(null)){
					tempBodyMod[0][i] = creature1.getDNA().getGeneBodyMod(tempInt, i);
				}
				if (!creature2.getDNA().getGeneBodyMod(tempInt,i).equals(null)){
					tempBodyMod[1][i] = creature1.getDNA().getGeneBodyMod(tempInt, i);
				}
			}
			
			//CONSTRUCTION OF GENETIC CODE
			
			GeneticCode temp = new GeneticCode(tempGender, tempBodyType, tempBodySize, tempBodyCoat, tempBodyModNum, tempBodyMod);
			
			//MUTATATION OF GENETIC CODE
		
			temp = mutate(temp);
			
			Creature child = new Creature("CHILD"/*GET USER INPUT HERE-ISH*/, temp);
			
			return child;
			
		}
		return null;
	}
	/**
	 * 
	 * @param toMutate Genetic Code to Attempt Mutation 
	 * @return Mutated Genetic Code
	 */
	private GeneticCode mutate(GeneticCode toMutate) {
		GeneticCode output = toMutate;
		if(r.nextInt(100) > 98){
			int mutations = getMutations();
			int currentMutations = 0;
			
			while(currentMutations < mutations){
				int side = r.nextInt(2);
				switch(geneToMutate()){
				case 0 : //BodyType Tree Jump
					output.setGeneBodyType(side, mutateBodyType(0, output.getGeneBodyType(side)));
					break;
				case 1:  //BodyType Node Jump
					output.setGeneBodyType(side, mutateBodyType(1, output.getGeneBodyType(side)));
					break;
				case 2 : //BodySize
					output.setGeneBodySize(side, mutateModSize(output.getGeneBodySize(side)));
					break;
				case 3 : //BodyCoat
					output.setGeneBodyCoat(side, mutateModCoat(output.getGeneBodyCoat(side)));
					break;
				case 4 : //BodyModNum
					output.setGeneBodyModNum(side, mutateModNum(output.getGeneBodyModNum(side)));
					break;
				case 5 : //BodyMod
					int mod = r.nextInt(10);
					output.setGeneBodyMod(side, mod, mutateModifier(output.getGeneBodyMod(side, mod)));
					break;
				}
				
				
				
				
				
				
			}
		}
		return output;
	}
	
	private int geneToMutate() {
		int random = r.nextInt(100);
		if(random < 2){return 0;}
		else if(random < 7){return 1;}
		else if(random < 20){return 2;}
		else if(random < 30){return 3;}
		else if(random < 40){return 4;}
		else if(random < 100){return 5;}
		return 0;
	}
	private int getMutations(){
		int output, random;
		random = r.nextInt(100);
		if(random < 75){
			output = 1;
		}else if(random < 90){
			output = 2;
		}else{
			output = 3;
		}
		return output;
	}
	
	private GeneBodyType mutateBodyType(int index, GeneBodyType geneBodyType){
		return null;
	}
	private GeneModSize mutateModSize(GeneModSize geneBodySize) {
		// TODO Auto-generated method stub
		return null;
	}
	private GeneModCoat mutateModCoat(GeneModCoat geneBodyCoat) {
		// TODO Auto-generated method stub
		return null;
	}
	private GeneModNum mutateModNum(GeneModNum geneBodyModNum) {
		// TODO Auto-generated method stub
		return null;
	}
	private GeneModifier mutateModifier(GeneModifier geneBodyMod) {
		// TODO Auto-generated method stub
		return null;
	}
}
