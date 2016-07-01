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
import Genetics.GeneticCode;

public class Breeding {
	
	GeneLibrary genes = new GeneLibrary();
	Random r = new Random();
	
	public boolean canBreed(Creature creature1, Creature creature2){
		if (!creature1.getGender().equals(creature2.getGender())){
			return true;
		}
		return false;
	}
	public Creature breed(Creature creature1, Creature creature2){
		if (canBreed(creature1, creature2)){
			
			GeneGender[] tempGender = new GeneGender[2];
			tempGender[0] = creature1.getGeneGender(r.nextInt(2));
			tempGender[1] = creature2.getGeneGender(r.nextInt(2));
			
			GeneBodyType[] tempBodyType = new GeneBodyType[2];
			tempBodyType[0] = creature1.getGeneBodyType(r.nextInt(2));
			tempBodyType[1] = creature2.getGeneBodyType(r.nextInt(2));
			
			GeneModSize[] tempBodySize = new GeneModSize[2];
			tempBodySize[0] = creature1.getGeneBodySize(r.nextInt(2));
			tempBodySize[1] = creature2.getGeneBodySize(r.nextInt(2));
			
			GeneModCoat[] tempBodyCoat = new GeneModCoat[2];
			tempBodyCoat[0] = creature1.getGeneBodyCoat(r.nextInt(2));
			tempBodyCoat[1] = creature2.getGeneBodyCoat(r.nextInt(2));
			
			GeneModNum[] tempBodyModNum = new GeneModNum[2];
			tempBodyModNum[0] = creature1.getGeneBodyModNum(r.nextInt(2));
			tempBodyModNum[1] = creature2.getGeneBodyModNum(r.nextInt(2));
			
			
			GeneModInvis[][] tempBodyMod;
			if (tempBodyModNum[0].getDominance() < tempBodyModNum[1].getDominance()){
				tempBodyMod = new GeneModInvis[2][tempBodyModNum[1].getModNum()];
			}else{
				tempBodyMod = new GeneModInvis[2][tempBodyModNum[0].getModNum()];
			}
			for (int i = 0; i < tempBodyMod[0].length; i++){
				int tempInt = r.nextInt(2);
				if (!creature1.getGeneBodyMod(tempInt,i).equals(null)){
					tempBodyMod[0][i] = creature1.getGeneBodyMod(tempInt, i);
				}
				if (!creature2.getGeneBodyMod(tempInt,i).equals(null)){
					tempBodyMod[1][i] = creature1.getGeneBodyMod(tempInt, i);
				}
			}
			
			GeneticCode temp = new GeneticCode(tempGender, tempBodyType, tempBodySize, tempBodyCoat, tempBodyModNum, tempBodyMod);
			
			Creature child = new Creature("CHILD"/*GET USER INPUT HERE-ISH*/, temp);
			
			return child;
			
		}
		return null;
	}
	
	
}
