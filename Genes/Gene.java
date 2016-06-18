package Genes;

public abstract class Gene {
	
	private int dominance; //1-10 higher = more dominant
	private String type;   //Slot for gene (e.g. body type)
	private int tier;	   //Tier of Gene
	private String[] itemProduce;
	private String[] itemSlaughter;
	
	public Gene(String type,int dominance,  int tier){
		this.type = type;
		this.dominance = dominance;
		this.tier = tier;
	}

	
}
