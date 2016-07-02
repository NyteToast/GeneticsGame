package buildings;

public class BuildingScience extends Building{
	
	//Have access to different abilities based off how much science they have? might need some balancing
	private int science;
	private int scienceGrowth;
	private int durability;
	
	//GET
	public int getScience(){return science;}
	public int getScienceGrowth(){return scienceGrowth;}
	public int getDurability(){return durability;}
	
	//SET
	public void setScience(int science){this.science = science;}
	public void setScienceGrowth(int scienceGrowth){this.scienceGrowth = scienceGrowth;}
	public void setDurability(int durability){this.durability = durability;}
	
	//Constructors
	public BuildingScience(int maxlevel, int width, int height, int durability, int science, int scienceGrowth){
		super(maxlevel, width, height, durability);
		setScience(science);	
		setScienceGrowth(scienceGrowth);
		setDurability(durability);
		// TODO Auto-generated constructor stub
	}
		
	//Methods
	
	//Levels up building
	public void levelUp(){
		if(getLevel() < getMaxLevel()){
			  setLevel(getLevel() + 1);
			  incrementScience();
		  }else{
			  //Have a class that returns information for the error
		  }
	}
		
	//Increments Science stat of the building
	public void incrementScience(){
		setScience((getScience() + getScienceGrowth()));
	}
	
	//Repairing building
	public void repairBuilding(){
		setDurability(100);
	}
		
}
