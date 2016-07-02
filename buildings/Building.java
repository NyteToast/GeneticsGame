package buildings;

public abstract class Building {
	
	private int level;
	private int width;
	private int height;
	private int maxLevel; 
	private int durability;
	
	//GET
	public int getLevel(){return level;}
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	public int getMaxLevel(){return maxLevel;}
	public int getDurability(){return durability;}
	
	//SET
	public void setLevel(int level){this.level = level;}
	public void setWidth(int width){this.width = width;}
	public void setHeight(int height){this.height = height;}
	public void setMaxLevel(int maxLevel){this.maxLevel = maxLevel;}
	public void setDurability(int durability){this.durability = durability;}
	
	//Constructors
	public Building(int maxlevel, int width, int height, int durability){
		setMaxLevel(maxlevel);
		setWidth(width);
		setHeight(height);
		setLevel(1);
		setDurability(durability);
	}
	
	//Methods
	
	public void levelUp(){
		if(getLevel() < getMaxLevel()){
			  setLevel(getLevel() + 1);
		  }else{
			  //Have a class that returns information for the error
		  }
	}
	
	//Repairing building
	public void repairBuilding(){
		setDurability(100);
	}
	
	
	
}
