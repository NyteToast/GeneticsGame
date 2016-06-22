package GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import Creatures.Creature;

public class PnlACreatures extends JPanel{
	JScrollPane pnlACList = new JScrollPane();
	PnlACInfo pnlACInfo = new PnlACInfo();
	JList<String> creatureList = new JList<String>();
	
	Creature cList[];
	
	public PnlACreatures(){
		super();
		setLayout(new GridLayout(1,2));
		setBackground(Color.gray);
		
		pnlACInfo.setBackground(Color.cyan);
		pnlACList.setBackground(Color.black);
		
		creatureList.setVisibleRowCount(10);
		creatureList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		creatureList.addListSelectionListener(new ListSelectionListener(){public void valueChanged(ListSelectionEvent event){pnlACInfo.update(cList[creatureList.getSelectedIndex()]);}});
		
		add(pnlACList);
		add(pnlACInfo);
		pnlACList.add(creatureList);
	}

	public void updateCreatureList(String[] list, Creature[] list2) {
		DefaultListModel<String> model = new DefaultListModel<String>();
		for (int i = 0; i < list.length; i++){
			model.addElement(list[i]);
		}
		creatureList = new JList<String>(model);
		//creatureList.
		cList = list2;
	}
	
}
