package Genetics;

public class GeneticCode {

	private GeneLibrary genes = new GeneLibrary();
	
	private GeneGender[] gender = new GeneGender[2];
	private GeneBodyType[] bodyType = new GeneBodyType[2];
		private GeneModNum[] bodyModNum = new GeneModNum[2];
		private GeneModCoat[] bodyCoat = new GeneModCoat[2];
		private GeneModInvis[][] bodyMod = new GeneModInvis[2][];
		private GeneModSize[] bodySize = new GeneModSize[2];
	
	
	//GET
	//GENDER
	public int getGender(){
		if (!gender[0].getType().equals(gender[1].getType())){return 0;}
		else{return 1;}
	}
	//BODY	
	public String getDominantBodyType(){
		if (bodyType[0].getDominance() > bodyType[1].getDominance()){return bodyType[0].getForm();}
		else if(bodyType[0].getDominance() == bodyType[1].getDominance()){return bodyType[0].getForm();}
		else{return bodyType[1].getForm();}
	}
		public String getDominantBodySize(){
			if (bodySize[0].getDominance() > bodySize[1].getDominance()){return bodySize[0].getName();}
			else if(bodySize[0].getDominance() == bodySize[1].getDominance()){return bodySize[0].getName();}
			else{return bodySize[1].getName();}
		}
		public String getDominantBodyCoat(){
			if (bodyCoat[0].getDominance() > bodyCoat[1].getDominance()){return bodyCoat[0].getName();}
			else if(bodyCoat[0].getDominance() == bodyCoat[1].getDominance()){return bodyCoat[0].getName();}
			else{return bodyCoat[1].getName();}
		}
		public int getDominantBodyModNum(){
			if (bodyModNum[0].getDominance() > bodyModNum[1].getDominance()){return bodyModNum[0].getModNum();}
			else if(bodyModNum[0].getDominance() == bodyModNum[1].getDominance()){return bodyModNum[0].getModNum();}
			else{return bodyModNum[1].getModNum();}
		}
	
	public String[] getGenetics(){
		String output[] = new String [1];
		output[0] = gender[0].getType() + "||" + gender[1].getType();
		output[1] = bodyType[0].getForm() + "||" + bodyType[1].getForm();
		output[2] = bodySize[0].getName() + "||" + bodySize[1].getName();
		return output;
	}
	
	
	public GeneGender getGeneGender(int index){
		return gender[index];
	}
	public GeneBodyType getGeneBodyType(int index){
		return bodyType[index];
	}
	public GeneModSize getGeneBodySize(int index){
		return bodySize[index];
	}
	public GeneModCoat getGeneBodyCoat(int index){
		return bodyCoat[index];
	}
	public GeneModNum getGeneBodyModNum(int index){
		return bodyModNum[index];
	}
	public GeneModInvis getGeneBodyMod(int index, int mod){
		return bodyMod[index][mod];
	}
	
	//SET
	public void setGender(int index, GeneGender gene){this.gender[index] = gene;}
	public void setBodyType(int index, GeneBodyType gene){this.bodyType[index] = gene;}
	public void setBodySize(int index, GeneModSize gene){this.bodySize[index] = gene;}
	public void setBodyCoat(int index, GeneModCoat gene){this.bodyCoat[index] = gene;}
	public void setBodyModNum(int index, GeneModNum gene){this.bodyModNum[index] = gene;}
	public void setBodyMod(int index, GeneModInvis[] gene){this.bodyMod[index] = gene;}
	
	//Constructors
	public GeneticCode(GeneGender[] gender, GeneBodyType[] bodytype, GeneModSize[] bodysize, GeneModCoat[] bodycoat, GeneModNum[] bodymodnum, GeneModInvis[][] bodymod){
		setGender(0, gender[0]);
		setGender(1, gender[1]);
		setBodyType(0, bodytype[0]);
		setBodyType(1, bodytype[1]);
		setBodySize(0, bodysize[0]);
		setBodySize(1, bodysize[1]);
		setBodyCoat(0, bodycoat[0]);
		setBodyCoat(1, bodycoat[1]);
		setBodyModNum(0, bodymodnum[0]);
		setBodyModNum(1, bodymodnum[1]);
		bodyMod[0] = new GeneModInvis[bodymodnum[0].getModNum()];
		bodyMod[1] = new GeneModInvis[bodymodnum[1].getModNum()];
		setBodyMod(0, bodymod[0]);
		setBodyMod(0, bodymod[1]);
	}
	public GeneticCode(GeneGender gender1, GeneGender gender2, GeneBodyType bodytype1, GeneBodyType bodytype2, GeneModSize bodysize1, GeneModSize bodysize2
	){
		setGender(0, gender1);
		setGender(1, gender2);
		setBodyType(0, bodytype1);
		setBodyType(1, bodytype2);
		setBodySize(0, bodysize1);
		setBodySize(1, bodysize2);
	}
}
