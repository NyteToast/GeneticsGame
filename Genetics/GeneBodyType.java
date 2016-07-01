package Genetics;

public class GeneBodyType extends GeneFeature{
	
	private String form; //Biped, Quadruped etc.
	
	private int heads, legs, arms, tails, wings; 
	//[0] - distance from left, [1] - distance from top, [2] - rotation of image degrees
	private int[][] neckJoint = new int[3][];
	private int[][] tailJoint = new int[3][];
	private int[][][] legJoint = new int [3][][]; //[][X][] - leg number (1 or 2) // [][][X] - set of legs
	private int[][][] armJoint = new int [3][][];
	private int[][][] wingJoint = new int [3][][];
	
	//GET
	public String getForm(){return form;}
	
	public int getHeads(){return heads;}
	public int getLegs(){return legs;}
	public int getArms(){return arms;}
	public int getTails(){return tails;}
	public int getWings(){return wings;}
	
	//SET
	public void setForm(String form){this.form = form;}
	
	public void setHeads(int heads){this.heads = heads;}
	public void setLegs(int legs){this.legs = legs;}
	public void setArms(int arms){this.arms = arms;}
	public void setTails(int tails){this.tails = tails;}
	public void setWings(int wings){this.wings = wings;}
	
	
	//Constructors
	/**
	 * Creates a Body Type Gene Using the given Parameters
	 * Sets all attachments min/max/actual to given integers
	 * 
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
	public GeneBodyType(String name, int dominance, int legs, int heads, int arms, int tails, int wings){
		super(name, dominance);
		setForm(form);
		
		setHeads(heads);
		setLegs(legs);
		setArms(arms);
		setTails(tails);
		setWings(wings);
	}
}
