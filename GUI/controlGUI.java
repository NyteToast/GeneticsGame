package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class controlGUI {
	//card layout for right panel?
	 JFrame mainWindow = new JFrame("Genetics Game");
	 
	 GridBagConstraints gbc = new GridBagConstraints();
		
	 JButton btnCreatures = new JButton("Creatures");
	 JButton btnBreeding = new JButton("Breeding");
	 JButton btnBuildings = new JButton("Buidings");
	 
	 JLabel Creature1 = new JLabel("Creature 1");
	 JLabel Creature2 = new JLabel("Creature 2");
	
	 JComboBox test = new JComboBox();
	
	 JPanel pnlSelection = new JPanel();
	 JPanel pnlActivity = new JPanel(); 
	 
	 JPanel pnlACreatures = new JPanel();
	 JPanel pnlABreeding = new JPanel();
	 JPanel pnlABuildings = new JPanel();
	 
	 btnSHandler handlerS = new btnSHandler();
	 
	 public void setupMain(){
			setupBtnMain();
			mainWindow.setLayout(new GridBagLayout());
			mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			mainWindow.setResizable(false);
			mainWindow.setSize(1000,600);
			//Panels
			pnlSelection.setLayout(new GridLayout(6,1, 5, 20));//Change First Number To Number of Buttons
			pnlActivity.setLayout(new CardLayout());
			
			pnlSelection.setPreferredSize(new Dimension(200,600));
			pnlActivity.setPreferredSize(new Dimension(800,600));
			
			pnlACreatures.setBackground(Color.gray);
			pnlABreeding.setBackground(Color.pink);
			pnlABuildings.setBackground(Color.green);
			//Buttons
			btnCreatures.addActionListener(handlerS);
			btnBreeding.addActionListener(handlerS);
			btnBuildings.addActionListener(handlerS);
			//Add Components
			addSAPanels();
			addSComponents();
			addAComponents();
			
			//Pack and Show
			mainWindow.pack();
			mainWindow.setVisible(true);
	 }
	 public void setupBtnMain(){
		btnCreatures.setPreferredSize(new Dimension(200,50)); 
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
	 public void addSComponents(){
		 pnlSelection.add(btnCreatures);
		 pnlSelection.add(btnBreeding);
		 pnlSelection.add(btnBuildings);
	 }
	 public void addAComponents(){
		 pnlActivity.add(pnlACreatures, "Creatures");
		 pnlActivity.add(pnlABreeding, "Breeding");
		 pnlActivity.add(pnlABuildings, "Buildings");
		 
		 //CREATURES
		 pnlACreatures.setLayout(new GridLayout(2,2));
		 pnlACreatures.add(Creature1);
		 pnlACreatures.add(Creature2);
		 //BREEDING
		 
		 //BUILDINGS
	 }
	 public void updatePnlActivity(int stateIn){
		 CardLayout cl = (CardLayout)(pnlActivity.getLayout());
		 switch (stateIn){
		 case 0: cl.show(pnlActivity, "Creatures");
			 break;
		 case 1: cl.show(pnlActivity, "Breeding");
			 break;
		 case 2: cl.show(pnlActivity, "Buildings");
			 break;
		 }
	 }
	 private class btnSHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			if (arg0.getSource() == btnCreatures){
				updatePnlActivity(0);
			}else if (arg0.getSource() == btnBreeding){
				updatePnlActivity(1);
			}else if (arg0.getSource() == btnBuildings){
				updatePnlActivity(2);
			}
		}
		 
	 }
}


