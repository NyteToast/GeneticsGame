package Genes;

public class GeneHeadType extends Gene{

	private String form;
	
	//GET
	public String getForm(){return form;}
	
	//SET
	public void setForm(String form){this.form = form;}
	
	//Constructors
	public GeneHeadType(String geneForm, String form, String slot, int dominance, int[] mods) {
		super(geneForm, slot, dominance, mods);
	}
	
}
