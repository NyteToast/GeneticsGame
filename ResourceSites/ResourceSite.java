package ResourceSites;

import Items.Item;

public class ResourceSite {

	private String name;
	private String description;
	private Item primary, secondary;
	private int slots, expansion;
	private int level, levelMax;
	
	//GET
	public String getName(){return name;}
	public String getDescription(){return description;}
	public Item getPrimaryResource(){return primary;}
	public Item getSecondaryResource(){return secondary;}
	public int getSlots(){return slots;}
	public int getExpansion(){return expansion;}
	public int getLevel(){return level;}
	public int getLevelMax(){return levelMax;}
	
	//SET
	public void setName(String name){this.name = name;}
	public void setDescription(String description){this.description = description;}
	public void setPrimaryResource(Item item){this.primary = item;}
	public void setSecondaryResource(Item item){this.secondary = item;}
	public void setSlots(int slots){this.slots = slots;}
	public void setExpansion(int expansion){this.expansion = expansion;}
	public void setLevel(int level){this.level = level;}
	public void setLevelMax(int level){this.levelMax = level;}
	
	//CONSTRUCTORS
	public ResourceSite(String name, String description, Item resource1, Item resource2, int slots, int expansion, int levelMax){
		setName(name);
		setDescription(description);
		setPrimaryResource(resource1);
		setSecondaryResource(resource2);
		setSlots(slots);
		setExpansion(expansion);
		setLevelMax(levelMax);
		setLevel(1);
	}
	
	//METHODS
	public void levelUp(){
		if (getLevel() < getLevelMax() /*AND CHECK RESOURCES*/){
			setLevel(getLevel() + 1);
			setSlots(getSlots() + getExpansion());
		}
	}
}
