package Genes;

public class GeneBodyType extends Gene{
	
	private String form; //Biped, Quadruped etc.
	
	//GET
	public String getForm(){return form;}
	//SET
	public void setForm(String form){this.form = form;}
	//Constructors
	public GeneBodyType(String form, int dominance){
		super("BODY TYPE", dominance);
		setForm(form);
	}
}
