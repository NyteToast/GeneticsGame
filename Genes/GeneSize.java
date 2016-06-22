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
	public GeneSize(String size, double multiplier, int dominance){
		super("SIZE", dominance);
		setMultiplier(multiplier);
		setSize(size);
	}
}
