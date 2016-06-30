package Genes;

public class GeneFeetType extends Gene{
	
	private String form;
	
	//GET
	public String getForm(){return form;}
	
	//SET
	public void setForm(String form){this.form = form;}
	
	//Constructors
	public GeneFeetType(String geneForm, String form, int dominance, int[] mods){
		super(geneForm, "FEET", dominance, mods);
		setForm(form);
	}
}
