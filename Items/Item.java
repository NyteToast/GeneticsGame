package Items;

public class Item {
	
	private String name;
	private String description;
	private int priceSell;
	private int priceBuy;
	private int tier;
	
	//GET
	public String getName(){return name;}
	public String getDescription(){return description;}
	public int getSellPrice(){return priceSell;}
	public int getBuyPrice(){return priceBuy;}
	public int getTier(){return tier;}
	//SET
	public void setName(String name){this.name = name;}
	public void setDescription(String description){this.description = description;}
	public void setSellPrice(int price){this.priceSell = price;}
	public void setBuyPrice(int price){this.priceBuy = price;}
	public void setTier(int tier){this.tier = tier;}
	//Constructors
	public Item(String name,String description, int sellPrice, int buyPrice){
		setName(name);
		setDescription(description);
		setSellPrice(sellPrice);
		setBuyPrice(buyPrice);
	}

}
