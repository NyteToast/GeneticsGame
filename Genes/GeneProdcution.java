package Genes;

import Items.Item;

public class GeneProdcution extends Gene{
	
	private Item produce;
	private String name;
	
	//GET
	public Item getProduce(){return produce;}
	public String getName(){return name;}
	
	//SET
	public void setProduce(Item produce){this.produce = produce;}
	public void setName(String name){this.name = name;}
	
	//Constructors
	public GeneProdcution(String geneForm, String name, String slot, int dominance, int[] mods) {
		super(geneForm, slot, dominance, mods);
		setName(name);
	}
}
