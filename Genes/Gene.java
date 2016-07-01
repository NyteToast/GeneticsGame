package Genes;

public abstract class Gene {
	
	private String slot;   //Slot for gene (e.g. body type)
	private int dominance;
	private String geneForm; //Modifier/Feature/Socket etc...
	//See Structure File 1 - Gene Section(Section 1) 
	private int modifiers[] = new int[3];
	
	//GET
	public String getSlot(){return slot;}
	public int getDominance(){return dominance;}
	public String getGeneForm(){return geneForm;}
	
	public int getMinMods(){return modifiers[0];}
	public int getMaxMods(){return modifiers[1];}
	public int getMods(){return modifiers[2];}
	
	//SET
	public void setSlot(String slot){this.slot = slot;}
	public void setDominance(int dominance){this.dominance = dominance;}
	public void setGeneForm(String geneForm){this.geneForm = geneForm;}
	
	public void setMinMods(int modifiers){this.modifiers[0] = modifiers;}
	public void setMaxMods(int modifiers){this.modifiers[1] = modifiers;}
	public void setMods(int modifiers){this.modifiers[2] = modifiers;}
	//Constructors
	/**
	 * 
	 * @param slot
	 */
	public Gene(String slot){//For Gender
		setSlot(slot);
	}
	/**
	 * 
	 * @param geneForm
	 * @param slot
	 * @param dominance
	 * @param mods
	 */
	public Gene(String geneForm, String slot, int dominance, int mods[]){//For any gene other than gender
		setGeneForm(geneForm);
		setSlot(slot);
		setDominance(dominance);
		setMinMods(mods[0]);
		setMaxMods(mods[1]);
		setMods(mods[2]);
	}
	public Gene(String geneForm, String slot, int dominance, int mods){
		setGeneForm(geneForm);
		setSlot(slot);
		setDominance(dominance);
		setMinMods(mods);
		setMaxMods(mods);
		setMods(mods);
	}
}
