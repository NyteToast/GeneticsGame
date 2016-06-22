package Genes;

public abstract class Gene {
	
	private String slot;   //Slot for gene (e.g. body type)
	private int dominance;
	
	//GET
	public String getSlot(){return slot;}
	public int getDominance(){return dominance;}
	
	//SET
	public void setSlot(String slot){this.slot = slot;}
	public void setDominance(int dominance){this.dominance = dominance;}
	
	//Constructors
	public Gene(String slot){//For Gender
		this.slot = slot;
	}
	public Gene(String slot, int dominance){//For any gene other than gender
		setSlot(slot);
		setDominance(dominance);
	}
	
}
