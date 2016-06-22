package Items;

public abstract class Item {
	
	private String name;
	private int priceSell;
	private int priceBuy;
	
	//GET
	public String getName(){return name;}
	public int getSellPrice(){return priceSell;}
	public int getBuyPrice(){return priceBuy;}
	//SET
	public void setName(String name){this.name = name;}
	public void setSellPrice(int price){this.priceSell = price;}
	public void setBuyPrice(int price){this.priceBuy = price;}
	//Constructors
	public Item(String name, int sellPrice, int buyPrice){
		this.name = name;
		this.priceSell = sellPrice;
		this.priceBuy = buyPrice;
	}

}
