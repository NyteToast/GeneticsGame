package Shops;



public abstract class Shop {
	
	
	private String name;
	private String description;
	private int maxContents = 10;
	private int[] stock = new int[10];
	
	//GET
	public String getName(){return name;}
	public String getDescription(){return description;}
	public int getMaxContents(){return maxContents;}
	public int getStock(int index){return stock[index];}
	
	
	//SET
	public void setName(String name){this.name = name;}
	public void setDescription(String description){this.description = description;}
	public void setMaxContents(int maxContents){this.maxContents = maxContents;}
	public void setStock(int index, int stock){this.stock[index] = stock;}
	
	
	//Constructors
	public Shop(String name, String description){
		setName(name);
		setDescription(description);
	}
	
	//Methods
	
}
