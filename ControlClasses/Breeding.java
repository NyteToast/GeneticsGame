package ControlClasses;

import java.util.Random;

import Creatures.Creature;
import Genes.GeneBodyType;
import Genes.GeneGender;
import Genes.GeneLibrary;
import Genes.GeneticCode;

public class Breeding {
	
	GeneLibrary genes = new GeneLibrary();
	Random r = new Random();
	
	public Creature breed(Creature male, Creature female){
		if (canBreed(male, female)){
			GeneGender a[] = new GeneGender[2];
			GeneBodyType b[] = new GeneBodyType[2];
			
			a[0] = male.getGeneGender(r.nextInt(2));
			a[1] = female.getGeneGender(r.nextInt(2));
			
			b = mutateBodyType(male, female);
			
			GeneticCode dna = new GeneticCode(a,b);
			Creature baby = new Creature("Baby", dna);
			return baby;
		}else{return null;}
	}
	
	
	public boolean canBreed(Creature male, Creature female){
		if (male.getGender().equals("MALE") && female.getGender().equals("FEMALE")){
			return true;
		}
		return false;
	}
	
	
	public GeneBodyType[] mutateBodyType(Creature male, Creature female){
		GeneBodyType output[] = new GeneBodyType[2];
		Random r = new Random();
		int geneToMutate = r.nextInt(2);
		int genderToMutate = r.nextInt(2);
		if(r.nextInt(100) < 2){
			Node<GeneBodyType> temp;
			
				if (geneToMutate == 0){
					temp = genes.nQuadruped.findByData(male.getGeneBodyType(geneToMutate));
					output[0] = temp.getChild().getData();
					output[1] = female.getGeneBodyType(r.nextInt(2));
				}else{
					temp = genes.nQuadruped.findByData(female.getGeneBodyType(geneToMutate));
					output[0] = male.getGeneBodyType(r.nextInt(2));
					output[1] = temp.getChild().getData();
				}
			
			
		}else{
			output[0] = male.getGeneBodyType(r.nextInt(2));
			output[1] = female.getGeneBodyType(r.nextInt(2));
		}
		
		
		return output;
	}
	
}
