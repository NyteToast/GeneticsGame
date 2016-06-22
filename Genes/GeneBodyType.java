package Genes;

public class GeneBodyType extends Gene{
	
	private String form; //Biped, Quadruped etc.
	private int legs;
	
	//GET
	public String getForm(){return form;}
	public int getLegs(){return legs;}
	
	//SET
	public void setForm(String form){this.form = form;}
	public void setLegs(int legs){this.legs = legs;}
	
	//Constructors
	public GeneBodyType(String form, int dominance, int legs){
		super("BODY TYPE", dominance);
		setForm(form);
		setLegs(legs);
	}
}
