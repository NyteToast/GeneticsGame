package buildings;

public class BuildingLibrary {
	
	
	//Creature Storage Buildings
	public BuildingCreatureStorage smallHouse = new BuildingCreatureStorage(10, 2, 2, 5, 5); 
	public BuildingCreatureStorage mediumHouse = new BuildingCreatureStorage(10, 3, 3, 15, 12); 
	public BuildingCreatureStorage largeHouse = new BuildingCreatureStorage(10, 4, 4, 25, 28); 
	
	//Creature Food Storage or Food Production Facility
	public BuildingFoodStorage smallStorage = new BuildingFoodStorage(10, 2, 2, 10, 8, 2, 4);
	public BuildingFoodStorage mediumStorage = new BuildingFoodStorage(10, 3, 3, 30, 18, 4, 8);
	public BuildingFoodStorage largeStorage = new BuildingFoodStorage(10, 4, 4, 50, 47, 6, 16);
}
