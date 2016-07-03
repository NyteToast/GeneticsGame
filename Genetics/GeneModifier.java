package Genetics;

import Items.Item;

public class GeneModifier extends Gene{
	
	private int statBonus[] = new int[5];
	//private Item[] slaughter;
	//private Item[] daily;
	
	//GET
	public int getStrBonus(){return statBonus[0];}
	public int getDefBonus(){return statBonus[1];}
	public int getIntBonus(){return statBonus[2];}
	public int getWillBonus(){return statBonus[3];}
	public int getSpdBonus(){return statBonus[4];}
	//SET
	public void setBonus(int bonus[]){this.statBonus = bonus;}
	public void setStrBonus(int bonus){this.statBonus[0] = bonus;}
	public void setDefBonus(int bonus){this.statBonus[1] = bonus;}
	public void setIntBonus(int bonus){this.statBonus[2] = bonus;}
	public void setWillBonus(int bonus){this.statBonus[3] = bonus;}
	public void setSpdBonus(int bonus){this.statBonus[4] = bonus;}
	
	//CONSTRUCTORS
	public GeneModifier(String name, int dominance){
		super(name, dominance);
		setBonus(new int[] {0,0,0,0,0});
	}
	public GeneModifier(String name, int dominance, int bonus[]) {
		super(name, dominance);
		setBonus(bonus);
	}
	//METHODS

}
