package Shops;

import java.util.Random;

import Items.Item;
import Items.ItemLibrary;

public class ItemShop extends Shop{
	
	@SuppressWarnings("unused")
	private ItemLibrary items;
	private Item[] contents = new Item[10];
	
	//GET
	public Item getItem(int index){return contents[index];}
	
	//SET
	public void setItem(int index, Item item){this.contents[index] = item;}
	
	//Constructors
	public ItemShop(String name, String description) {
		super(name, description);
	}
	
	//Methods
	public void resetShopContents(){
		Random r = new Random();
		for(int i = 0; i < contents.length; i++){
			int temp = r.nextInt(100);
			if (temp < 50){}
			else if (temp < 70){}
			//contents[i] = items.getItem(tier);
		}
	}
}
