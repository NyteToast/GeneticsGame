package Genetics;

public class GeneModNum extends GeneModifier{
	
	private int mods;
	
	//GET
	public int getModNum(){return mods;}
	//SET
	public void setModNum(int mods){this.mods = mods;}
	
	//CONSTRUCTORS
	public GeneModNum(String name, int dominance, int mods) {
		super(name, dominance, new int[] {0,0,0,0,0});
		setModNum(mods);
		
	}

}
