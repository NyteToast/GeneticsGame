package ControlClasses;

import java.util.Random;

import Creatures.Creature;
import Genes.GeneBodyType;
import Genes.GeneGender;
import Genes.GeneLibrary;
import Genes.GeneSize;
import Genes.GeneticCode;

public class Breeding {
	
	GeneLibrary genes = new GeneLibrary();
	Random r = new Random();
	
	public Creature breed(Creature male, Creature female){
		if (canBreed(male, female)){
			GeneGender gender[] = new GeneGender[2];
			GeneBodyType bodytype[] = new GeneBodyType[2];
			GeneSize bodysize[] = new GeneSize[2];
			
			gender[0] = male.getGeneGender(r.nextInt(2));
			gender[1] = female.getGeneGender(r.nextInt(2));
			
			//bodytype = mutateBodyType(male, female);
			
			bodysize = mutateSize(male, female);
			
			GeneticCode dna = new GeneticCode(gender, bodytype, bodysize);
			Creature baby = new Creature("Baby", dna);//Get user input
			return baby;
		}else{return null;}
	}
	
	
	public boolean canBreed(Creature male, Creature female){
		if (male.getGender().equals("MALE") && female.getGender().equals("FEMALE")){
			return true;
		}
		return false;
	}
	
	/*
	public GeneBodyType[] mutateBodyType(Creature male, Creature female){
		GeneBodyType output[] = new GeneBodyType[2];
		Random r = new Random();
		int geneToMutate = r.nextInt(2);
		int genderToMutate = r.nextInt(2);
		if(r.nextInt(100) < 2){
				Node<GeneBodyType> temp;
				if (genderToMutate == 0){
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
	*/
	public GeneSize[] mutateSize(Creature male, Creature female){
		GeneSize[] output = new GeneSize[2];
		Random r = new Random();
		int geneToMutate = r.nextInt(2);
		int genderToMutate = r.nextInt(2);
		if(r.nextInt(100)<2){
			Node<GeneSize> temp;
			if (genderToMutate == 0){
				temp = genes.nNormal.findByData(male.getGeneBodySize(geneToMutate));
				output[0] = temp.getChild().getData();
				output[1] = female.getGeneBodySize(r.nextInt(2));
			}else{
				temp = genes.nNormal.findByData(female.getGeneBodySize(geneToMutate));
				output[0] = male.getGeneBodySize(r.nextInt(2));
				output[1] = temp.getChild().getData();
			}
		 }else{
			 output[0] = male.getGeneBodySize(r.nextInt(2));
			 output[1] = female.getGeneBodySize(r.nextInt(2));
		 }
		
		
		return output;
	}
}
