package GUI;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

import Creatures.Creature;

public class PnlActivity extends JPanel{
	
	 PnlACreatures pnlACreatures = new PnlACreatures();
	 PnlABreeding pnlABreeding = new PnlABreeding();
	 PnlABuildings pnlABuildings = new PnlABuildings();
	
	public PnlActivity(){
		super();
		setLayout(new CardLayout());
		setPreferredSize(new Dimension(800,600));
		add(pnlACreatures, "Creatures");
		add(pnlABreeding, "Breeding");
		add(pnlABuildings, "Buildings");
	}
	public void updatePnlActivity(int stateIn){
		 CardLayout cl = (CardLayout)(this.getLayout());
		 switch (stateIn){
		 	case 0: cl.show(this, "Creatures");
		 		break;
		 	case 1: cl.show(this, "Breeding");
			 	break;
		 	case 2: cl.show(this, "Buildings");
			 	break;
		 }
	}
	public void updateCreatureList(String[] list, Creature[] list2) {
		pnlACreatures.updateCreatureList(list, list2);
		
	}
}
