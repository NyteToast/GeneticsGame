package Genetics;

public class GeneFeature extends Gene{
	
	private String image;
	private String description;
	
	//GET
	public String getImage(){return image;}
	public String getDescription(){return description;}
	
	//SET
	public void setImage(String image){this.image = image;}
	public void setDescription(String description){this.description = description;}
	
	//CONSTRUCTORS
	public GeneFeature(String name, int dominance) {
		super(name, dominance);
	}
	
	//METHODS

}
