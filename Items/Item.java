package Items;

public class Item {
	
	private String name;
	private String description;
	private String image;
	private int priceSell;
	private int priceBuy;
	private int tier;
	//Tier - 0_Colourless - 1_White - 2_Green - 3_Blue - 4_Pink - 5_Purple - 6_Orange - 7_Red
	
	//GET
	public String getName(){return name;}
	public String getDescription(){return description;}
	public String getImage(){return image;}
	public int getSellPrice(){return priceSell;}
	public int getBuyPrice(){return priceBuy;}
	public int getTier(){return tier;}
	//SET
	public void setName(String name){this.name = name;}
	public void setDescription(String description){this.description = description;}
	public void setImage(String image){this.image = "" + image;}
	public void setSellPrice(int price){this.priceSell = price;}
	public void setBuyPrice(int price){this.priceBuy = price;}
	public void setTier(int tier){this.tier = tier;}
	//Constructors
	public Item(String name,String description,String image, int sellPrice, int buyPrice, int tier){
		setName(name);
		setDescription(description);
		setImage(image);
		setSellPrice(sellPrice);
		setBuyPrice(buyPrice);
		setTier(tier);
	}

}
