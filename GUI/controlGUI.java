package GUI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Creatures.Creature;
import Creatures.CreatureStorage;

public class controlGUI {
	//GUI Elements
	 JFrame mainWindow = new JFrame("Genetics Game");
	 GridBagConstraints gbc = new GridBagConstraints();
	 btnSHandler handlerS = new btnSHandler();
	 PnlActivity pnlActivity = new PnlActivity(); 
	 PnlSelection pnlSelection = new PnlSelection();
	 //Create Data Class?
	 CreatureStorage animals = new CreatureStorage();
	 
	 public void setupMain(){
			mainWindow.setLayout(new GridBagLayout());
			mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainWindow.setResizable(false);
			mainWindow.setSize(1000,600);
			pnlSelection.addHandler(handlerS);
			
			
			//Add Components
			addSAPanels();

			//Pack and Show
			mainWindow.pack();
			mainWindow.setVisible(true);
	 }
	 public void addSAPanels(){
		 gbc.gridx = 0;
		 gbc.gridy = 0;
		 gbc.anchor = GridBagConstraints.LINE_START;
		 mainWindow.getContentPane().add(pnlSelection, gbc);
		 gbc.gridx = 1;
		 gbc.gridy = 0;
		 gbc.gridwidth = 4;
		 gbc.fill = GridBagConstraints.BOTH;
		 gbc.anchor = GridBagConstraints.LINE_END;
		 mainWindow.getContentPane().add(pnlActivity, gbc);
	 }

	/* public static void main(String args[]){
			controlGUI GUI = new GUI.controlGUI();
			//GeneticCode a = new GeneticCode();
			
			Creature adam = new Creature("Adam", 0);
			Creature eve = new Creature("Eve", 1); 
			
			GUI.animals.addCreature(adam);
			GUI.animals.addCreature(eve);
			
			
			GUI.setupMain();
			
	}*/
	
	
	 private class btnSHandler implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			if (arg0.getSource() == pnlSelection.btnCreatures){
				pnlActivity.updateCreatureList(animals.listCreatures(), animals.getCreatures());
				pnlActivity.updatePnlActivity(0);
			}else if (arg0.getSource() == pnlSelection.btnBreeding){
				pnlActivity.updatePnlActivity(1);
			}else if (arg0.getSource() == pnlSelection.btnBuildings){
				pnlActivity.updatePnlActivity(2);
			}
	}

	 }
}


