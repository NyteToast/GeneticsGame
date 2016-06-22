package Creatures;

public class CreatureStorage {
	Creature store[] = new Creature[64];
	
	//GET
	public String getCreatureName(int index){
		return store[index].getName();
	}
	public String getCreatureGender(int index){
		return store[index].getGender();
	}
	public String getCreatureDetails(int index){
		String output = "";
		
		output = "Name: " + getCreatureName(index) + " Gender: " + getCreatureGender(index);
		
		return output;
	}
	public String[] getListCreatureName(){
		String[] output = new String[getNextEmpty()];
		
		for (int i = 0; i < getNextEmpty(); i++){
			output[i] = "" + store[i].getName();
		}
		
		return output;
	}
	public String[] getListCreatureDetails(){
String[] output = new String[getNextEmpty()];
		
		for (int i = 0; i < getNextEmpty(); i++){
			output[i] = store[i].getDetails();
		}
		
		return output;
	}
	public int getStoreMax(){
		return store.length;
	}
	public int getStoreCurrent(){
		if (getNextEmpty() == Integer.MAX_VALUE){return store.length;}
		else{return getNextEmpty();}
	}
	public int getNextEmpty(){
		for (int count = 0; count < store.length; count++){
			if (store[count] == null){return count;}
		}
		return Integer.MAX_VALUE;
	}
	
	public Creature getCreature(int index){
		return store[index];
	}
	public Creature[] getListCreature(){
		return store;
	}
	//SET
	
	//Constructors
	public CreatureStorage(){
		
	}
	//Methods
	public boolean isFull(){
		for (int count = 0; count < store.length; count++){
			if (store[count] == null){return false;}
		}
		return true;
	}
	
	public void addCreature(Creature newCreature){
		if(!isFull()){
			store[getNextEmpty()] = newCreature;
		}
	}
	public void addSpace(int slots){
		Creature tempStore[] = new Creature[store.length];
		for (int count = 0; count < store.length; count++){
			tempStore[count] = store[count];
		}
		store = new Creature[store.length + slots];
		for (int count = 0; count < tempStore.length; count++){
			store[count] = tempStore[count];
		}
	}
}
