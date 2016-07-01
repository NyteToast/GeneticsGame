package Genetics;

public abstract class Gene {
	
	private String name;
	private int dominance;
	
	//GET
	public String getName(){return name;}
	public int getDominance(){return dominance;}
	
	//SET
	public void setName(String name){this.name = name;}
	public void setDominance(int dominance){this.dominance = dominance;}
	
	//Constructors
	/**
	 * 
	 * @param name This is the name that will show up to users
	 * @param dominance This determines which gene is the active gene
	 */
	public Gene(String name, int dominance){
		setName(name);
		setDominance(dominance);
	}
	/**
	 * This constructor is only for GeneGender as it works differently to other genes
	 * @param name This is the name that will show up to users
	 */
	public Gene(String name) {//For Gender
		setName(name);
	}
	
	
}
