package Creatures;

public class CreatureStorage {
	Creature store[] = new Creature[64];
	public int nxtEmpty(){
		for (int count = 0; count < store.length; count++){
				if (store[count] == null){return count;}
		}
		return Integer.MAX_VALUE;
		
	}
	public boolean isFull(){
		for (int count = 0; count < store.length; count++){
			if (store[count] == null){return false;}
		}
		return true;
	}
	public void countTaken(){}
	public void addCreature(Creature newCreature){
		if(!isFull()){
			store[nxtEmpty()] = newCreature;
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
