package Genetics;

public class GeneLifespan extends GeneModifier{

	private int lifeMin;
	private int lifeMax;
	
	//GET
	public int getLifeMin(){return lifeMin;}
	public int getLifeMax(){return lifeMax;}
	
	//SET
	public void setLifeMin(int lifeMin){this.lifeMin = lifeMin;}
	public void setLifeMax(int lifeMax){this.lifeMax = lifeMax;}
	
	//CONSTRUCTOR
	public GeneLifespan(String name, int dominance, int lifeMin, int lifeMax) {
		super(name, dominance);
		// TODO Auto-generated constructor stub
	}

}
