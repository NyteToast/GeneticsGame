package Genetics;

public class GeneticCode {

	
	private GeneGender[] gender = new GeneGender[2];
	private GeneBodyType[] bodyType = new GeneBodyType[2];
		private GeneModNum[] bodyModNum = new GeneModNum[2];
		private GeneModCoat[] bodyCoat = new GeneModCoat[2];
		private GeneModSize[] bodySize = new GeneModSize[2];
		private GeneModifier[][] bodyMod = new GeneModifier[2][10];
		
	
	//GET
	public GeneGender getGeneGender(int index){return gender[index];}
	public GeneGender getGeneDominantGender(){
		if (gender[0].getDominance() > gender[1].getDominance()){return gender[0];}
		else{return gender[1];}
	}
	public GeneGender getGeneRecessiveGender(){
		if (gender[0].getDominance() > gender[1].getDominance()){return gender[1];}
		else{return gender[0];}
	}
	
	public GeneBodyType getGeneBodyType(int index){return bodyType[index];}
	public GeneBodyType getGeneDominantBodyType(){
		if (bodyType[0].getDominance() > bodyType[1].getDominance()){return bodyType[0];}
		else{return bodyType[1];}
	}
	public GeneBodyType getGeneRecessiveBodyType(){
		if (bodyType[0].getDominance() > bodyType[1].getDominance()){return bodyType[1];}
		else{return bodyType[0];}
	}
	
	public GeneModNum getGeneBodyModNum(int index){return bodyModNum[index];}
	public GeneModNum getGeneDominantBodyModNum(){
		if (bodyModNum[0].getDominance() > bodyModNum[1].getDominance()){return bodyModNum[0];}
		else{return bodyModNum[1];}
	}
	public GeneModNum getGeneRecessiveBodyModNum(){
		if (bodyModNum[0].getDominance() > bodyModNum[1].getDominance()){return bodyModNum[1];}
		else{return bodyModNum[0];}
	}
	
	public GeneModCoat getGeneBodyCoat(int index){return bodyCoat[index];}
	public GeneModCoat getGeneDominantBodyCoat(){
		if (bodyCoat[0].getDominance() > bodyCoat[1].getDominance()){return bodyCoat[0];}
		else{return bodyCoat[1];}
	}
	public GeneModCoat getGeneRecessiveBodyCoat(){
		if (bodyCoat[0].getDominance() > bodyCoat[1].getDominance()){return bodyCoat[1];}
		else{return bodyCoat[0];}
	}
	
	public GeneModSize getGeneBodySize(int index){return bodySize[index];}
	public GeneModSize getGeneDominantBodySize(){
		if (bodyCoat[0].getDominance() > bodyCoat[1].getDominance()){return bodySize[0];}
		else{return bodySize[1];}
	}
	public GeneModSize getGeneRecessiveBodySize(){
		if (bodyCoat[0].getDominance() > bodyCoat[1].getDominance()){return bodySize[1];}
		else{return bodySize[0];}
	}
	
	public GeneModifier getGeneBodyMod(int index, int mod){return bodyMod[index][mod];}
	public GeneModifier getGeneDominantBodyMod(int mod){
		if (bodyMod[0][mod].getDominance() > bodyMod[1][mod].getDominance()){return bodyMod[0][mod];}
		else{return bodyMod[1][mod];}
	}
	public GeneModifier getGeneRecessiveBodyMod(int mod){
		if (bodyMod[0][mod].getDominance() > bodyMod[1][mod].getDominance()){return bodyMod[1][mod];}
		else{return bodyMod[0][mod];}
	}
	
	//SET
	public void setGeneGender(int index, GeneGender gene){this.gender[index] = gene;}
	public void setGeneBodyType(int index, GeneBodyType gene){this.bodyType[index] = gene;}
	public void setGeneBodyModNum(int index, GeneModNum gene){this.bodyModNum[index] = gene;}
	public void setGeneBodyCoat(int index, GeneModCoat gene){this.bodyCoat[index] = gene;}
	public void setGeneBodySize(int index, GeneModSize gene){this.bodySize[index] = gene;}
	public void setGeneBodyMod(int index, GeneModifier[] gene){this.bodyMod[index] = gene;}
	public void setGeneBodyMod(int index, int mod, GeneModifier gene){this.bodyMod[index][mod] = gene;}
	
	//CONSTRUCTOR
	public GeneticCode(GeneGender[] gender, GeneBodyType[] bodytype, GeneModSize[] bodysize, GeneModCoat[] bodycoat, GeneModNum[] bodymodnum, GeneModifier[][] bodymod){
		setGeneGender(0, gender[0]);
		setGeneGender(1, gender[1]);
		setGeneBodyType(0, bodytype[0]);
		setGeneBodyType(1, bodytype[1]);
		setGeneBodySize(0, bodysize[0]);
		setGeneBodySize(1, bodysize[1]);
		setGeneBodyCoat(0, bodycoat[0]);
		setGeneBodyCoat(1, bodycoat[1]);
		setGeneBodyModNum(0, bodymodnum[0]);
		setGeneBodyModNum(1, bodymodnum[1]);
		setGeneBodyMod(0, bodymod[0]);
		setGeneBodyMod(1, bodymod[1]);
	}
	
	//METHODS
	
	
}
