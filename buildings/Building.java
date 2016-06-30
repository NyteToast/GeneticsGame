package buildings;

public abstract class Building {
	
	private int level;
	private int width;
	private int height;
	private int maxLevel; 
	
	//GET
	public int getLevel(){return level;}
	public int getWidth(){return width;}
	public int getHeight(){return height;}
	public int getMaxLevel(){return maxLevel;}
	//SET
	public void setLevel(int level){this.level = level;}
	public void setWidth(int width){this.width = width;}
	public void setHeight(int height){this.height = height;}
	public void setMaxLevel(int maxLevel){this.maxLevel = maxLevel;}
	//Constructors
	public Building(int maxlevel, int width, int height){
		setMaxLevel(maxlevel);
		setWidth(width);
		setHeight(height);
		setLevel(1);
	}
	
	//Methods
	
	public void levelUp(){
		if(getLevel() < getMaxLevel()){
			  setLevel(getLevel() + 1);
		  }else{
			  //Have a class that returns information for the error
		  }
	}
	
	
	
}
