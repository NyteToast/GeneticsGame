package buildings;

public class BuildingCreatureStorage extends Building {
	
	private int capacity;
	private int expansion;
	private boolean isFull = false;
	
	//GET 
	public int getCapacity(){return capacity;}
	public int getExpansion(){return expansion;}
	public boolean getIsFull(){return isFull;}
	
	//SET
	public void setCapacity(int capacity){this.capacity = capacity;}
	public void setExpansion(int expansion){this.expansion = expansion;}
	public void setIsFull(boolean isFull){this.isFull = isFull;}
	
	//Constructors
	public BuildingCreatureStorage(int maxlevel, int width, int height, int capacity, int expansion) {
		super(maxlevel, width, height);
		setCapacity(capacity);
		setExpansion(expansion);
		// TODO Auto-generated constructor stub
	}

	//Methods
	public void levelUp(){
		if(getLevel() < getMaxLevel()){
			  setLevel(getLevel() + 1);
			  incrementCapacity();
		  }else{
			  //Have a class that returns information for the error
		  }
	}
	
	//Increments the capacity of the food storage
	public void incrementCapacity(){
		setCapacity((getCapacity() + getExpansion()));
	}
	
	//Checks if the building is full
	public boolean isFull(){
		//have a variable that keeps track of the number of item in the building
		return getIsFull();
	}
}
