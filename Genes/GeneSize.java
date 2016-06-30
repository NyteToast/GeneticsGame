package Genes;

public class GeneSize extends Gene{
	
	private String size;
	private double sizeMultiplier;
	
	//GET
	public String getSize(){return size;}
	public double getMultiplier(){return sizeMultiplier;}
	
	//SET
	public void setSize(String size){this.size = size;}
	public void setMultiplier(double multiplier){this.sizeMultiplier = multiplier;}
	
	//Constructors
	public GeneSize(String geneForm, String size, double multiplier, int dominance, int[] mods){
		super(geneForm, "SIZE", dominance, mods);
		setMultiplier(multiplier);
		setSize(size);
	}
}
