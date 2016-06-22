package buildings;

public abstract class Building {
	
	private int level;
	
	//GET
	public int getLevel(){return level;}
	//SET
	public void setLevel(int level){this.level = level;}
	//Constructors
	public Building(int level){
		setLevel(level);
	}
}
