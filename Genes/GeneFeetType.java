package Genes;

public class GeneFeetType extends Gene{
	
	private String form;
	
	//GET
	public String getForm(){return form;}
	
	//SET
	public void setForm(String form){this.form = form;}
	
	//Constructors
	public GeneFeetType(String form, int dominance){
		super("FEET", dominance);
		setForm(form);
	}
}
