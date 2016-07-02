package buildings;

public class BuildingScience extends Building{
	
	//Have access to different abilities based off how much science they have? might need some balancing
	private int science;
	private int scienceGrowth;
	
	//GET
	public int getScience(){return science;}
	public int getScienceGrowth(){return scienceGrowth;}
	
	//SET
	public void setScience(int science){this.science = science;}
	public void setScienceGrowth(int scienceGrowth){this.scienceGrowth = scienceGrowth;}
	
	//Constructors
	public BuildingScience(int maxlevel, int width, int height, int science, int scienceGrowth){
		super(maxlevel, width, height);
		setScience(science);	
		setScienceGrowth(scienceGrowth);
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
		
}
