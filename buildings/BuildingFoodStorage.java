package buildings;

public class BuildingFoodStorage extends Building {
	
	private int capacity;
	private int expansion;
	private int productionRate;
	private int productionLevelUp;

	//GET 
	public int getCapacity(){return capacity;}
	public int getExpansion(){return expansion;}
	public int getProductionRate(){return productionRate;}
	public int getProductionLevelUp(){return productionLevelUp;}
	
	//SET
	public void setCapacity(int capacity){this.capacity = capacity;}
	public void setExpansion(int expansion){this.expansion = expansion;}
	public void setProductionRate(int productionRate){this.productionRate = productionRate;}
	public void setProductionLevelUp(int productionLevelUp){this.productionLevelUp = productionLevelUp;}
	
	//Constructors
	public BuildingFoodStorage(int maxlevel, int width, int height, int capacity, int expansion, int productionRate, int productionLevelUp) {
		super(maxlevel, width, height);
		setCapacity(capacity);
		setExpansion(expansion);
		setProductionRate(productionRate);
		setProductionLevelUp(productionLevelUp);
		// TODO Auto-generated constructor stub
	}

	//Methods
	public void levelUp(){
		if(getLevel() < getMaxLevel()){
			  setLevel(getLevel() + 1);
			  incrementCapacity();
			  incrementProduction();
		  }else{
			  //Have a class that returns information for the error
		  }
	}
	
	//Increments the capacity of the food storage
	public void incrementCapacity(){
		setCapacity((getCapacity() + getExpansion()));
	}
	
	//Increments the production of the food storage
	public void incrementProduction(){
		setProductionRate((getProductionRate() + getProductionLevelUp()));
	}
	
	//have the food production be called based on time intervals or event based(when the player ends turn or something)
	public void foodProduction(){
		
	}

}

