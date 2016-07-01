package Genes;

public class GeneBodyType extends Gene{
	
	private String form; //Biped, Quadruped etc.
	
	private int heads[] = new int[3]; //MIN-MAX-ACTUAL
	private int legs[] = new int[3];
	private int arms[] = new int[3];
	private int tails[] = new int[3];
	private int wings[] = new int[3];
	
	
	//GET
	public String getForm(){return form;}
	
	public int getMinHeads(){return heads[0];}
	public int getMaxHeads(){return heads[1];}
	//public int getHeads(){return heads[2];}
	
	public int getMinLegs(){return legs[0];}
	public int getMaxLegs(){return legs[1];}
	//public int getLegs(){return legs[2];}
	
	public int getMinArms(){return arms[0];}
	public int getMaxArms(){return arms[1];}
	//public int getArms(){return arms[2];}
	
	public int getMinTails(){return tails[0];}
	public int getMaxTails(){return tails[1];}
	//public int getTails(){return tails[2];}
	
	public int getMinWings(){return wings[0];}
	public int getMaxWings(){return wings[1];}
	//public int getWings(){return wings[2];}
	
	//SET
	public void setForm(String form){this.form = form;}
	
	public void setMinHeads(int heads){this.heads[0] = heads;}
	public void setMaxHeads(int heads){this.heads[1] = heads;}
	//public void setHeads(int heads){this.heads[2] = heads;}
	
	public void setMinLegs(int legs){this.legs[0] = legs;}
	public void setMaxLegs(int legs){this.legs[1] = legs;}
	// void setLegs(int legs){this.legs[2] = legs;}
	
	public void setMinArms(int arms){this.arms[0] = arms;}
	public void setMaxArms(int arms){this.arms[1] = arms;}
	//public void setArms(int arms){this.arms[2] = arms;}
	//
	public void setMinTails(int tails){this.tails[0] = tails;}
	public void setMaxTails(int tails){this.tails[1] = tails;}
	//public void setTails(int tails){this.tails[2] = tails;}
	
	public void setMinWings(int wings){this.wings[0] = wings;}
	public void setMaxWings(int wings){this.wings[1] = wings;}
	//public void setWings(int wings){this.wings[2] = wings;}
	
	//Constructors
	/**
	 * Creates a Body Type Gene Using the given Parameters
	 * Sets min/max/actual individually
	 * @param geneForm A String with the type of gene that this is (FEATURE/MODIFIER).
	 * @param form A String detailing the body form e.g. biped.
	 * @param dominance An Integer between 1 and 10 higher is more dominant.
	 * @param mods An Integer array sets the max/min/actual number of modifiers that the body may have
	 * @param legs An Integer array sets the max/min/actual of legs
	 * @param heads An Integer array sets the max/min/actual of heads
	 * @param arms An Integer array sets the max/min/actual of arms
	 * @param tails An Integer array sets the max/min/actual of tails
	 * @param wings An Integer array sets the max/min/actual of wings
	 */
	public GeneBodyType(String geneForm, String form, int dominance,int mods[], int legs[], int heads[], int arms[], int tails[], int wings[]){
		super(geneForm, "BODY TYPE", dominance, mods);
		setForm(form);
		
		setMinHeads(heads[0]);
		setMaxHeads(heads[1]);
		
		setMinLegs(legs[0]);
		setMaxLegs(legs[1]);
		
		setMinArms(arms[0]);
		setMaxArms(arms[1]);
		
		setMinTails(tails[0]);
		setMaxTails(tails[1]);
		
		setMinWings(wings[0]);
		setMaxWings(wings[1]);
	}
	/**
	 * Creates a Body Type Gene Using the given Parameters
	 * Sets all attachments min/max/actual to given integers
	 * @param geneForm A String with the type of gene that this is (FEATURE/MODIFIER).
	 * @param form A String detailing the body form e.g. biped.
	 * @param dominance An Integer between 1 and 10 higher is more dominant.
	 * @param mods An Integer array sets the max/min/actual number of modifiers that the body may have
	 * @param legs An Integer sets the number of legs
	 * @param heads An Integer sets the number of heads
	 * @param arms An Integer sets the number of arms
	 * @param tails An Integer sets the number of tails
	 * @param wings An Integer sets the number of wings
	 */
	public GeneBodyType(String geneForm, String form, int dominance,int mods, int legs, int heads, int arms, int tails, int wings){
		super(geneForm, "BODY TYPE", dominance, mods);
		setForm(form);
		
		setMinHeads(heads);
		setMaxHeads(heads);
		
		setMinLegs(legs);
		setMaxLegs(legs);
		
		setMinArms(arms);
		setMaxArms(arms);
		
		setMinTails(tails);
		setMaxTails(tails);
		
		setMinWings(wings);
		setMaxWings(wings);
	}
}
