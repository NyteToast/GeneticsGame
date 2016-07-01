package Genetics;

public class GeneModSize extends GeneModifier{
	
	private double sizeMultiplier;
	
	//GET
	public double getMultiplier(){return sizeMultiplier;}
	
	//SET
	public void setMultiplier(double multiplier){this.sizeMultiplier = multiplier;}
	
	//Constructors
	public GeneModSize(String name, int dominance, double multiplier) {
		super(name, dominance, new int[] {0,0,0,0,0});
		setMultiplier(multiplier);
	}
}
