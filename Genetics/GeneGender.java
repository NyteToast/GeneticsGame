package Genetics;

public class GeneGender extends GeneFeature{
	
	private String type; //X or Y
	
	public String getType(){return type;}
	
	public void setType(String type){this.type = type;}
	
	public GeneGender(String type, int dominance){
		super("GENDER", dominance);
		setType(type);
	}
	
}
