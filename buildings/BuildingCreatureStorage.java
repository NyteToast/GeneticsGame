package buildings;

public class BuildingCreatureStorage extends Building {
	
	private int capacity;
	private int expansion;
	//GET 
	public int getCapacity(){return capacity;}
	public int getExpansion(){return expansion;}
	
	//SET
	public void setCapacity(int capacity){this.capacity = capacity;}
	public void setExpansion(int expansion){this.expansion = expansion;}
	
	//Constructors
	public BuildingCreatureStorage(int level, int width, int height, int capacity, int expansion) {
		super(level, width, height);
		setCapacity(capacity);
		setExpansion(expansion);
		// TODO Auto-generated constructor stub
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
