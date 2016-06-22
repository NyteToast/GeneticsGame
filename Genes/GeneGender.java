package Genes;

public class GeneGender extends Gene{
	
	private String type;
	
	public String getType(){return type;}
	
	public void setType(String type){this.type = type;}
	
	public GeneGender(String type){
		super("GENDER");
		setType(type);
	}
	
}
