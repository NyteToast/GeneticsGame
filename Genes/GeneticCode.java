package Genes;



public class GeneticCode {
	/*
	 	Gender
	 	Body Type
	 	Jaw Type
	 		-Jaw Modifier
	 		-Teeth Modifier
	 	Feet Type
	 	Leg Type
	 	Number of Legs
	 	Life span
	 	Resources
	 	
	*/
	private GeneLibrary genes = new GeneLibrary();
	
	private GeneGender[] Gender = new GeneGender[2];
	private GeneBodyType[] BodyType = new GeneBodyType[2];
	private GeneSize[] BodySize = new GeneSize[2];
	
	
	//GET
	public String getBodyType(){
		if (BodyType[0].getDominance() > BodyType[1].getDominance()){return BodyType[0].getForm();}
		else if(BodyType[0].getDominance() == BodyType[1].getDominance()){return BodyType[0].getForm();}
		else{return BodyType[1].getForm();}
	}
	public String getBodySize(){
		if (BodySize[0].getDominance() > BodySize[1].getDominance()){return BodySize[0].getSize();}
		else if(BodySize[0].getDominance() == BodySize[1].getDominance()){return BodySize[0].getSize();}
		else{return BodySize[1].getSize();}
	}
	public String[] getGenetics(){
		String output[] = new String [1];
		output[0] = Gender[0].getType() + "||" + Gender[1].getType();
		output[1] = BodyType[0].getForm() + "||" + BodyType[1].getForm();
		output[2] = BodySize[0].getSize() + "||" + BodySize[1].getSize();
		return output;
	}
	public int getGender(){
		if (!Gender[0].getType().equals(Gender[1].getType())){return 0;}
		else{return 1;}
	}
	
	public GeneGender getGeneGender(int index){
		return Gender[index];
	}
	public GeneBodyType getGeneBodyType(int index){
		return BodyType[index];
	}
	public GeneSize getGeneBodySize(int index){
		return BodySize[index];
	}
	
	//SET
	public void setGender(int index, GeneGender gene){this.Gender[index] = gene;}
	public void setBodyType(int index, GeneBodyType gene){this.BodyType[index] = gene;}
	public void setBodySize(int index, GeneSize gene){this.BodySize[index] = gene;}
	
	//Constructors
	public GeneticCode(int gender){
		setGender(0, genes.X);
		if (gender == 0){setGender(1, genes.Y);}
		else {setGender(1, genes.X);}
	}
	public GeneticCode(GeneGender[] gender, GeneBodyType[] bodytype, GeneSize[] bodysize){
		setGender(0, gender[0]);
		setGender(1, gender[1]);
		setBodyType(0, bodytype[0]);
		setBodyType(1, bodytype[1]);
		setBodySize(0, bodysize[0]);
		setBodySize(1, bodysize[1]);
	}
	public GeneticCode(GeneGender gender1, GeneGender gender2, GeneBodyType bodytype1, GeneBodyType bodytype2, GeneSize bodysize1, GeneSize bodysize2
	){
		setGender(0, gender1);
		setGender(1, gender2);
		setBodyType(0, bodytype1);
		setBodyType(1, bodytype2);
		setBodySize(0, bodysize1);
		setBodySize(1, bodysize2);
	}
}
