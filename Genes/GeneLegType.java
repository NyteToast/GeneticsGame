package Genes;

public class GeneLegType extends Gene{
	
	private String form;
	
	//GET
	public String getForm(){return form;}
	
	//SET
	public void setForm(String form){this.form = form;}
	
	//Constructors
	public GeneLegType(String geneForm, String slot, int dominance, int[] mods) {
		super(geneForm, slot, dominance, mods);
		// TODO Auto-generated constructor stub
	}

}
